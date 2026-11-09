/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dto;

import java.util.Date;

/**
 *
 * @author Alumne
 * 
 * 
 */
public class User {
    private String nom; 
    private String llinatge; 

    public User(String nom, String llinatge) {
        this.nom = nom;
        this.llinatge = llinatge;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getLlinatge() {
        return llinatge;
    }

    public void setLlinatge(String llinatge) {
        this.llinatge = llinatge;
    }

    @Override
    public String toString() {
        return nom;
    }
    
}
