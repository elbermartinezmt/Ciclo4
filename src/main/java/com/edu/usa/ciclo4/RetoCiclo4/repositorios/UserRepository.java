/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.usa.ciclo4.RetoCiclo4.repositorios;

import com.edu.usa.ciclo4.RetoCiclo4.modelo.User;
import com.edu.usa.ciclo4.RetoCiclo4.repositorios.crud.UserCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author elber
 */
@Repository
public class UserRepository {
    
    @Autowired //Cuando arranque la app se encargue de crear una implementacion de esta interfaz e instanciarla
    private UserCrudRepository repo;
    /**
     * metodo para listar todos los usuarios creados
     * @return Lista de usuarios
     */
    public List<User> getAll() {
        return (List<User>) repo.findAll();
    }
    
    public User save(User user){
        return repo.save(user);
    }
    
    public Optional<User> getById(int id){
        return repo.findById(id);
    }
    
    public void delete(User user){
        repo.delete(user);
    }
    
    public boolean emailExist (String email){
        Optional <User> usuario = repo.findByEmail(email);
        
        return !usuario.isEmpty();
    }
    
    public Optional<User> autenticarUsuario (String email, String password){
        return repo.findByEmailAndPassword(email, password);
    }
}
