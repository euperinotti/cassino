import { BrowserRouter, Route, Routes } from 'react-router-dom'
import Login from './Login'
import Jogo from './Jogo'

function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Login />}></Route>
        <Route path="/jogo" element={<Jogo />}></Route>
      </Routes>
    </BrowserRouter>
  )
}

export default App
