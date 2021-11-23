/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edu.usa.ciclo4.RetoCiclo4.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.lang.NonNull;

/**
 *
 * @author elber
 */
@Entity
@Data
@RequiredArgsConstructor
@NoArgsConstructor
@Table(name = "user", indexes = @Index(name = "indx_email", columnList = "user_email", unique = true))
public class User implements Serializable {
    
    /**
     * Id para usuario
     * Autoincrementable
     * Hola Daniela
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * Comnetario 1
     */
    @NonNull
    @Column(name="user_email", nullable = false, length = 50)
    private String email;
    @NonNull
    @Column(name="user_password", nullable = false, length = 50)
    private String password;
    @NonNull
    @Column(name="user_name", nullable = false, length = 80)
    private String name;
    
/**
 * hola elber 
 */
/*
    Hola Elber
    */    
/**
 * prueba 3000
 */
}
