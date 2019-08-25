package com.proyect1.red_rest.Repository;

import com.proyect1.red_rest.Model.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface UserRepository  extends ReactiveMongoRepository<User,String> {

}
