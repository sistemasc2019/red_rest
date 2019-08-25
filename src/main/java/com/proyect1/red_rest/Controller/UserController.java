package com.proyect1.red_rest.Controller;

import com.proyect1.red_rest.Model.User;
import com.proyect1.red_rest.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.EmitterProcessor;
import reactor.core.publisher.Mono;

import javax.annotation.PostConstruct;

@RestController
@RequestMapping("/login")
public class UserController {

    @Autowired
    private final UserRepository userRepository;

    private EmitterProcessor<User> userEmitterProcessor;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostConstruct
    private void createProcessor() {
        userEmitterProcessor = EmitterProcessor.<User>create();
    }

}
