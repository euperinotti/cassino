import styled from "styled-components";
import theme from "../../styles/theme";

export const Input = styled.input`
  color: ${theme.colors.white};
  height: 40px;
  width: 300px;
  border: 1px solid ${theme.colors.white};
  border-radius: 5px;
  background-color: unset;
  outline: none;
  padding: 5px 10px;
  font-size: medium;
`