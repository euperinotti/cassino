import * as S from './styles'

type StatusType = 'GANHOU' | 'PERDEU'

interface StatusFieldProps extends React.HTMLAttributes<HTMLDivElement> {
  title: string
  value: string
  statusType?: StatusType
}

export const StatusField = ({ title, value, statusType }: StatusFieldProps) => {
  return (
    <S.Container className={statusType}>
      <S.H2>{title}</S.H2>
      <S.Content>{value}</S.Content>
    </S.Container>
  )
}
