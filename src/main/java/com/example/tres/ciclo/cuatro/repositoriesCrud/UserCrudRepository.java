/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.tres.ciclo.cuatro.repositoriesCrud;

import com.example.tres.ciclo.cuatro.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Luis_Mendez
 */
public interface UserCrudRepository extends MongoRepository<User,Integer>{
    
}
