import { createGlobalStyle } from 'styled-components'
import theme from './theme'

export const GlobalStyles = createGlobalStyle`

  * {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
  }
  
  body {
    background-color: ${theme.colors.black};
    color: white;
    display: flex;
    align-items: center;
    justify-content: center;
    width: 100%;
    height: 100vh;
    font-family: ${theme.fonts.family.poppins};
  }

  input, button {
    font-family: ${theme.fonts.family.poppins};
  }

`
