import axios from 'axios'
import { User } from '../models/User'

const URL = 'http://localhost:8080'

export const cadastrar = async (data: User) => {
  try {
    const json = await axios.post(`${URL}/user`, JSON.stringify(data), {
      headers: {
        'Content-Type': 'application/json'
      }
    })

    return json.data
  } catch (error) {
    return console.log('Não foi possível cadastrar')
  }
}

// const api = fetch(`${URL}/user`, {
//   method: 'POST',
//   body: JSON.stringify(data)
// })
