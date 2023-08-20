package io.mozmani.controller

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces

@Controller("/debug")
class ExternalController {

    @Get
    @Produces(MediaType.APPLICATION_JSON)
    fun index() = "Hello World"
}