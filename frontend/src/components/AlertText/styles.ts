import styled from 'styled-components'
import theme from '../../styles/theme'

export const Container = styled.div`
  width: 600px;
  height: fit-content;
  background-color: ${theme.colors.lightRed};
  display: flex;
  align-items: center;
  justify-content: center;
  flex-direction: column;
  padding: 30px 0px;
  border: 1px solid ${theme.colors.red};
  border-radius: 10px;
`

export const H1 = styled.h1`
  color: ${theme.colors.red};
`

export const Paragraph = styled.p`
  color: ${theme.colors.white};
`
