import * as S from './styles'

interface ButtonComprarProps {
  value: string
  onClick: React.MouseEventHandler<HTMLButtonElement>
}

export const ButtonComprar = ({ onClick, value }: ButtonComprarProps) => {
  return <S.Button onClick={onClick}>{value}</S.Button>
}
