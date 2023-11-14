import { FormEvent, useState } from 'react'
import * as axios from './axios/axios-provider'
import { User } from './models/User'

function App() {
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
      <h1>Hello World</h1>
      <form onSubmit={handleSubmit}>
        <input
          type="text"
          name="nome"
          id="nome"
          value={nome}
          onChange={(value) => setNome(value.target.value)}
          placeholder="Insira seu nome"
        />
        <input type="submit" value="Entrar" />
      </form>
    </>
  )
}

export default App
