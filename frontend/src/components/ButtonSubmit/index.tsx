import * as S from './styles'

interface ButtonSubmitProps {
  value: string
}

export const ButtonSubmit = ({ value }: ButtonSubmitProps) => {
  return <S.Button type="submit">{value}</S.Button>
}
