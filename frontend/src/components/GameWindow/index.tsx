import { useEffect, useState } from 'react'
import * as axios from '../../axios/axios-provider'
import { CartaModel } from '../../models/Carta'
import { Carta } from '../Carta'
import * as S from './styles'
import { AlertText } from '../AlertText'

interface GameWindowProps {
  ficha: number
}

export const GameWindow = ({ ficha }: GameWindowProps) => {
  const [cartas, setCartas] = useState<CartaModel[]>([])

  useEffect(() => {
    async function fetchData() {
      const response = await axios.buscarCartas()
      setCartas(response.data)
    }

    fetchData()
  }, [])

  if (ficha <= 0) {
    return (
      <S.Container>
        <AlertText
          text="Você precisa comprar uma ficha para poder jogar"
          title="Atenção"
        />
      </S.Container>
    )
  } else {
    return (
      <S.Container>
        {cartas.map((element, key) => {
          return (
            <Carta
              key={key}
              id={element.id}
              tipo={element.tipo}
              valor={element.valor}
            />
          )
        })}
      </S.Container>
    )
  }
}
