export interface User {
  id?: number | null
  nome: string | null
  conta: {
    id?: number | null
    saldoDePerda: number | null
    saldoDeGanho: number | null
    quantidadeDeFichas: number | null
  }
}
