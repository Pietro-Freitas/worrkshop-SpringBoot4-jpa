package com.educandoweb.webservice.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.webservice.entities.User;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping(value = "/users")
public class UserResources {
    
    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Pietro", "Pietro@gmail.com", "1234", "4321");

        return ResponseEntity.ok().body(u);
    }
}
