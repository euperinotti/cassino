import { ChangeEventHandler } from 'react'
import * as S from './styles'

interface InputTextProps {
  name: string
  id: string
  value: string
  placeholder: string
  onChange: ChangeEventHandler<HTMLInputElement>
}

export const InputText = (props: InputTextProps) => {
  return <S.Input type="text" {...props}></S.Input>
}
