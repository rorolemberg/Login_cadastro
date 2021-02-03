package com.example.siteEdiRol

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/validar")
class Controller {
    @GetMapping("/login")
    fun login(n1: Int, n2: Int) = n1 + n2

    @GetMapping("/login2")
    fun logOut(n1: Int, n2: Int) = n1 + n2
}
