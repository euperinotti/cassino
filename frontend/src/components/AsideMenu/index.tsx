import { useEffect, useState } from 'react'
import { StatusField } from '../StatusField'
import * as S from './styles'
import * as axios from '../../axios/axios-provider'
import { User } from '../../models/User'

export const AsideMenu = () => {
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
      <StatusField value={ficha + ''} title="Quantidade de Fichas" />
      <button onClick={handleComprarFicha} value={'Comprar ficha'}>
        Comprar ficha
      </button>
    </S.Container>
  )
}
