import axios from 'axios'
import { User } from '../models/User'

const URL = 'http://localhost:8080'

export const cadastrar = async (data: User) => {
  console.log(data)

  try {
    const json = await axios.post(`${URL}/user`, JSON.stringify(data), {
      headers: {
        'Content-Type': 'application/json'
      }
    })

    return {
      status: json.status,
      data: json.data
    }
  } catch (error) {
    return {
      status: 400,
      data: 'Não foi possível cadastrar'
    }
  }
}

export const buscarPorId = async (idUsuario: string) => {
  try {
    const json = await axios.get(`${URL}/user/${idUsuario}`)

    return {
      status: json.status,
      data: json.data
    }
  } catch (error) {
    return {
      status: 400,
      data: 'Não foi possível cadastrar'
    }
  }
}

export const comprarFicha = async (idConta: number) => {
  try {
    const json = await axios.put(
      `${URL}/ficha`,
      JSON.stringify({
        idConta: idConta,
        quantidade: 1
      }),
      {
        headers: {
          'Content-Type': 'application/json'
        }
      }
    )

    return {
      status: json.status,
      data: json.data
    }
  } catch (error) {
    return {
      status: 400,
      data: 'Não foi possível comprar ficha'
    }
  }
}
