export interface User {
  id?: number | null
  nome: string | null
  conta: {
    saldoDePerda: number | null
    saldoDeGanho: number | null
    saldoDeFichas: number | null
  }
}
