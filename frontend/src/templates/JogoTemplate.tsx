import { useEffect, useState } from 'react'
import * as axios from '../axios/axios-provider'
import { AsideMenu } from '../components/AsideMenu'
import { GameWindow } from '../components/GameWindow'
import { User } from '../models/User'
import * as S from './styles'

export const JogoTemplate = () => {
  const [ganho, setGanho] = useState<number>()
  const [perda, setPerda] = useState<number>()
  const [ficha, setFicha] = useState<number>()
  const [usuario, setUsuario] = useState<User>()

  useEffect(() => {
    async function fetchData() {
      const usuario = await axios.buscarPorId(
        sessionStorage.getItem('idUsuario') as string
      )
      setGanho(usuario.data?.conta.saldoDeGanho)
      setPerda(usuario.data?.conta.saldoDePerda)
      setFicha(usuario.data?.conta.quantidadeDeFichas)
      setUsuario(usuario.data)
    }

    fetchData()
  }, [])

  const handleComprarFicha = async () => {
    const response = await axios.comprarFicha(usuario?.conta.id as number)

    if (response.status == 200) {
      setGanho(response.data?.saldoDeGanho)
      setPerda(response.data?.saldoDePerda)
      setFicha(response.data?.quantidadeDeFichas)
    }
  }

  return (
    <S.Container>
      <S.Main>
        <AsideMenu
          ficha={ficha as number}
          ganho={ganho as number}
          perda={perda as number}
          comprarFicha={handleComprarFicha}
        />
        <GameWindow ficha={ficha as number} />
      </S.Main>
    </S.Container>
  )
}
