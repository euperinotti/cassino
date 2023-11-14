import { StatusField } from '../StatusField'
import * as S from './styles'

export const AsideMenu = () => {
  return (
    <S.Container>
      <StatusField
        value="R$ Saldo de Ganho"
        title="Saldo de Ganho"
        statusType="GANHOU"
      />
      <StatusField
        value="R$ Saldo de Perda"
        title="Saldo de Perda"
        statusType="PERDEU"
      />
      <StatusField value="Saldo de Perda" title="Quantidade de Fichas" />
    </S.Container>
  )
}
