import styled from 'styled-components'
import theme from '../../styles/theme'

const handleStatusType = (type: string | undefined) => {
  switch (type) {
    case 'GANHOU':
      return `color: ${theme.colors.green}`
    case 'PERDEU':
      return `color: ${theme.colors.red}`
    default:
      return `color: ${theme.colors.white}`
  }
}

export const Container = styled.div`
  width: 100%;
  display: flex;
  flex-direction: column;
  align-items: flex-start;
  justify-content: center;

  h2,
  p {
    ${(props) => handleStatusType(props.className)};
  }
`

export const H2 = styled.h2`
  font-weight: ${theme.fonts.weight.bold};
  color: ${theme.colors.white};
`

export const Content = styled.p`
  color: ${theme.colors.white};
`
