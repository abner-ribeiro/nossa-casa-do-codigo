package br.com.zup.controller

import br.com.zup.dto.NovoAutorRequest
import br.com.zup.dto.NovoAutorResponse
import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpStatus
import io.micronaut.http.MutableHttpResponse
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import org.slf4j.LoggerFactory

@Controller("/autores")
class AutorController {
    var logger= LoggerFactory.getLogger(this.javaClass)

    @Post
    fun cadastraAutor(@Body novoAutor: NovoAutorRequest): HttpResponse<NovoAutorResponse>{
        logger.info("Novo autor cadastrado $novoAutor")
        return HttpResponse.status<NovoAutorResponse>(HttpStatus.CREATED).body(NovoAutorResponse(novoAutor.nome, novoAutor.email))
    }
}