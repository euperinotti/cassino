import styled from 'styled-components'
import theme from '../../styles/theme'
import ReactCardFlip from 'react-card-flip'

export const Container = styled(ReactCardFlip)`
  width: 160px;
  height: 280px;
`

export const Frente = styled.div`
  width: 160px;
  height: 280px;
  background-color: ${theme.colors.black};
  border: 3px solid ${theme.colors.yellow};
  display: flex;
  align-items: center;
  justify-content: center;
  border-radius: 5px;
  cursor: pointer;

  &:hover {
    transform: scale(1.1);
  }

  transition: ease-in-out 200ms;
`

export const Image = styled.img`
  object-fit: contain;
  width: 30%;
`

export const Verso = styled.div`
  width: 160px;
  height: 280px;
  background-color: ${theme.colors.white};
  border: 3px solid ${theme.colors.yellow};
  display: flex;
  align-items: center;
  justify-content: center;
  flex-direction: column;
  border-radius: 5px;
  cursor: pointer;

  h2,
  h3 {
    color: ${theme.colors.black};
  }

  &:hover {
    transform: scale(1.1);
  }

  transition: ease-in-out 200ms;
`
