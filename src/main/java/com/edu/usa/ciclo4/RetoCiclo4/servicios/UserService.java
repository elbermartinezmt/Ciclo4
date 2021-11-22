/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.usa.ciclo4.RetoCiclo4.servicios;

import com.edu.usa.ciclo4.RetoCiclo4.modelo.User;
import com.edu.usa.ciclo4.RetoCiclo4.repositorios.UserRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author elber
 */
@Service
public class UserService {
    /**
     * Atributo de relación
     * Definir metodos de la capa userRepository
     */
    @Autowired
    private UserRepository userRepository;
    
    public List<User> getAll() {
        return userRepository.getAll();
    }

    public User getById(int id) {
        Optional<User> user = userRepository.getById(id);
        return user.orElse(new User());
    }
    /**
     * 
     * @param user
     * @return 
     */
    public User save(User user) {
        if (user.getId() == null) {
            if (emailExist (user.getEmail ()) == false) {
                return userRepository.save(user);
            } else {
                return user;
            }
        } else {
            return user;
        }
    }

    public boolean delete(int id) {
        Boolean d = userRepository.getById(id).map(user -> {
            userRepository.delete(user);
            return true;
        }).orElse(false);
        return d;
    }

    public User update(User user) {
        if (user.getId() != null) {
            Optional<User> usuario = userRepository.getById(user.getId());
            if (usuario.isPresent()) {
                System.out.println("si encontro el producto con el codigo " + user.getId());
                if (user.getEmail() != null) {
                    usuario.get().setEmail(user.getEmail());
                }
                if (user.getName() != null) {
                    usuario.get().setName(user.getName());
                }
                if (user.getPassword() != null) {
                    usuario.get().setPassword(user.getPassword());
                }

                return userRepository.save(usuario.get());
            }
        }
        return user;
    }

    public boolean emailExist(String email){
        return userRepository.emailExist(email);
    }
    
    public User autenticarUsuario(String email, String password) {
        Optional<User> usuario = userRepository.autenticarUsuario(email, password);

        if (usuario.isEmpty()) {
            return new User(email, password, "NO DEFINIDO");
        } else {
            return usuario.get();
        }
    }
}
