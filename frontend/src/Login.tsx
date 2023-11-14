import * as axios from './axios/axios-provider'
import { useState, FormEvent } from 'react'
import { ButtonSubmit } from './components/ButtonSubmit'
import { Heading } from './components/Heading'
import { InputText } from './components/InputText'
import { LoginForm } from './components/LoginForm'
import { User } from './models/User'

function Login() {
  const [nome, setNome] = useState<string>('')

  const handleSubmit = async (e: FormEvent) => {
    e.preventDefault()

    if (nome != null) {
      const data: User = {
        id: null,
        nome: nome,
        conta: {
          saldoDePerda: 0.0,
          saldoDeGanho: 0.0,
          saldoDeFichas: 0
        }
      }

      const response = await axios.cadastrar(data)
      console.log(response)
    }
  }

  return (
    <>
      <Heading value="Bem vindo ao cassino!" />
      <LoginForm onSubmit={handleSubmit}>
        <InputText
          name="nome"
          id="nome"
          value={nome}
          onChange={(value) => setNome(value.target.value)}
          placeholder="Insira seu nome"
        />
        <ButtonSubmit value="Entrar" />
      </LoginForm>
    </>
  )
}

export default Login
