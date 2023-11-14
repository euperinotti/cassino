import styled from 'styled-components'
import theme from '../../styles/theme'

export const Button = styled.button`
  border: none;
  background-color: ${theme.colors.green};
  color: ${theme.colors.white};
  height: 40px;
  padding: 0px 30px;
  border-radius: 5px;
  font-weight: ${theme.fonts.weight.bold};
  cursor: pointer;

  &:active {
    background-color: ${theme.colors.lightGreen};
  }

  transition: ease-in-out 100ms;
`
