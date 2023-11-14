import { useEffect, useState } from 'react'
import { StatusField } from '../StatusField'
import * as S from './styles'
import * as axios from '../../axios/axios-provider'

export const AsideMenu = () => {
  const [ganho, setGanho] = useState<number>()
  const [perda, setPerda] = useState<number>()
  const [ficha, setFicha] = useState<number>()

  useEffect(() => {
    async function fetchData() {
      const usuario = await axios.buscarPorId(
        sessionStorage.getItem('idUsuario') as string
      )
      setGanho(usuario.data?.conta.saldoDeGanho)
      setPerda(usuario.data?.conta.saldoDePerda)
      setFicha(usuario.data?.conta.saldoDeFicha)
    }

    fetchData()
  }, [])

  console.log(perda)

  return (
    <S.Container>
      <StatusField
        value={'R$ ' + ganho}
        title="Saldo de Ganho"
        statusType="GANHOU"
      />
      <StatusField
        value={'R$ ' + perda}
        title="Saldo de Perda"
        statusType="PERDEU"
      />
      <StatusField value={'R$ ' + ficha} title="Quantidade de Fichas" />
    </S.Container>
  )
}
