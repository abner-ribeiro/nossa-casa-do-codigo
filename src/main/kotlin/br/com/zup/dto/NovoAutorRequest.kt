package br.com.zup.dto

data class NovoAutorRequest(
    val nome: String,
    val email: String,
    val livros: List<LivroRequest>
)