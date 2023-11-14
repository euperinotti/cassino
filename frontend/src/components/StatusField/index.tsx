import * as S from './styles'

type StatusType = 'GANHOU' | 'PERDEU'

interface StatusFieldProps extends React.HTMLAttributes<HTMLDivElement> {
  title: string
  value: string
  statusType?: StatusType
  hoverText?: string
}

export const StatusField = ({
  title,
  value,
  statusType,
  hoverText
}: StatusFieldProps) => {
  return (
    <S.Container className={statusType} title={hoverText ? hoverText : ''}>
      <S.H2>{title}</S.H2>
      <S.Content>{value}</S.Content>
    </S.Container>
  )
}
