import { FormEvent, useState } from 'react'
import * as S from './styles'
import * as axios from '../../axios/axios-provider'

interface CartaProps {
  id: number
  valor: number
  tipo: boolean
}

export const Carta = (props: CartaProps) => {
  const [isFlipped, setFlipped] = useState<boolean>(false)

  const handleClick = (e: FormEvent) => {
    e.preventDefault()
    setFlipped(!isFlipped)

    setTimeout(async () => {
      const status = props.tipo ? 'ganhou' : 'perdeu'
      alert(`Você ${status} R$ ` + props.valor)
      await axios.registrarJogo(
        sessionStorage.getItem('idUsuario') as string,
        props.id.toString()
      )
      window.location.reload()
    }, 300)
  }

  return (
    <S.Container isFlipped={isFlipped} flipDirection="horizontal" {...props}>
      <S.Frente onClick={handleClick}>
        <S.Image src="/logo.png" />
      </S.Frente>
      <S.Verso>
        <h3>{props.tipo ? 'GANHOU' : 'PERDEU'}</h3>
        <h2>R$ {props.valor}</h2>
      </S.Verso>
    </S.Container>
  )
}
