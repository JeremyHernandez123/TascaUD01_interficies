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
    private String llinatge1;
    private String llinatge2; 
    private String dni; 
    private String telefon; 
    private Date dataRegistre; 

    public User(String nom, String llinatge1, String llinatge2, String dni, String telefon, Date dataRegistre) {
        this.nom = nom;
        this.llinatge1 = llinatge1;
        this.llinatge2 = llinatge2;
        this.dni = dni;
        this.telefon = telefon;
        this.dataRegistre = dataRegistre;
    }

    public String getNom() {
        return nom;
    }

    public String getLlinatge1() {
        return llinatge1;
    }

    public String getLlinatge2() {
        return llinatge2;
    }

    public String getDni() {
        return dni;
    }

    public String getTelefon() {
        return telefon;
    }

    public Date getDataRegistre() {
        return dataRegistre;
    }

    @Override
    public String toString() {
        return nom + " " + llinatge1 + " " + llinatge2 + "(" + dni + ")";
    }
    
    
}
