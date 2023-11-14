import * as S from './styles'

interface AlertTextProps {
  title: string
  text: string
}

export const AlertText = ({ title, text }: AlertTextProps) => {
  return (
    <S.Container>
      <S.H1>{title}</S.H1>
      <S.Paragraph>{text}</S.Paragraph>
    </S.Container>
  )
}
