/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.edu.usa.ciclo4.RetoCiclo4.repositorios.crud;

import com.edu.usa.ciclo4.RetoCiclo4.modelo.User;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author elber
 */
public interface UserCrudRepository extends CrudRepository <User, Integer>{
    
    //@Query(value = "SELECT * FROM user WHERE email = ?1", nativeQuery = true)
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email,String password);
    
}
