import * as S from './styles'

interface HeadingProps {
  value: string
}

export const Heading = ({ value }: HeadingProps) => {
  return <S.Heading>{value}</S.Heading>
}
