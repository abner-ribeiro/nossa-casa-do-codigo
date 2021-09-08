package br.com.zup.dto

import com.fasterxml.jackson.annotation.JsonFormat
import java.time.LocalDate

data class LivroRequest(
    val titulo: String,
    val isbn: String,
    @JsonFormat(pattern = "dd/MM/yyyy")
    val dataPublicacao: LocalDate = LocalDate.now()
)