import { FormEventHandler, ReactNode } from 'react'
import * as S from './styles'

interface LoginFormProps {
  children: ReactNode
  onSubmit: FormEventHandler
}

export const LoginForm = ({ onSubmit, children }: LoginFormProps) => {
  return <S.Form onSubmit={onSubmit}>{children}</S.Form>
}
