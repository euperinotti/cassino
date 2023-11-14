import { ButtonComprar } from '../ButtonComprar'
import { StatusField } from '../StatusField'
import * as S from './styles'

interface AsideMenuProps {
  ganho: number
  perda: number
  ficha: number
  comprarFicha: React.MouseEventHandler
}

export const AsideMenu = ({
  ganho,
  perda,
  ficha,
  comprarFicha
}: AsideMenuProps) => {
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
      <StatusField
        value={ficha + ''}
        title="Quantidade de Fichas"
        hoverText="Cada ficha tem o valor de R$ 5,00"
      />
      <ButtonComprar onClick={comprarFicha} value="Comprar ficha" />
    </S.Container>
  )
}
