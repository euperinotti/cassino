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
          id: null,
          saldoDePerda: 0.0,
          saldoDeGanho: 0.0,
          quantidadeDeFichas: 0
        }
      }

      const response = await axios.cadastrar(data)
      if (response.status == 200) {
        window.sessionStorage.setItem('idUsuario', response.data?.id)
        window.location.href = '/jogo'
      } else {
        alert(response.status + ' - ' + response.data)
      }
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
