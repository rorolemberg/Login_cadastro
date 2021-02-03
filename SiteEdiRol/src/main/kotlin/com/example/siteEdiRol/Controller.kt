package com.example.siteEdiRol

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/home")
class Controller {
    @GetMapping("/teste")
    fun sum(n1: Int, n2: Int) = n1 + n2
}