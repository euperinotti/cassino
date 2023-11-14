import { AsideMenu } from '../components/AsideMenu'
import { Game } from '../components/Game'
import * as S from './styles'

export const JogoTemplate = () => {
  return (
    <S.Container>
      <S.Main>
        <AsideMenu />
        <Game />
      </S.Main>
    </S.Container>
  )
}
