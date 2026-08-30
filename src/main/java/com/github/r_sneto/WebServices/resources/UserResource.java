package com.github.r_sneto.WebServices.resources;

import com.github.r_sneto.WebServices.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    //RestController permite que o Spring identifique uma classe como sendo um Controller de padrão Rest
    //RequestMapping nomeia o caminho das requisições em uma classe, atribuindo um valor para ele
    //ResponseEntity é um tipo específico que serve para retornar respostas de requisições web

    @GetMapping
    public ResponseEntity<User> findAll() {
        var u = new User(1L, "Maria", "maria@gmail.com", "9999999", "12345");

        return ResponseEntity.ok().body(u);
    }
}
