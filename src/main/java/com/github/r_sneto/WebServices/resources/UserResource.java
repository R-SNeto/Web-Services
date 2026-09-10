package com.github.r_sneto.WebServices.resources;

import com.github.r_sneto.WebServices.entities.User;
import com.github.r_sneto.WebServices.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/users/")
public class UserResource {
    //RestController permite que o Spring identifique uma classe como sendo um Controller de padrão Rest
    //RequestMapping nomeia o caminho das requisições em uma classe, atribuindo um valor para ele
    //ResponseEntity é um tipo específico que serve para retornar respostas de requisições web
    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        List<User> userList = userService.findAll();
        return ResponseEntity.ok().body(userList);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        User user = userService.findById(id);
        return ResponseEntity.ok().body(user);
    }
}
