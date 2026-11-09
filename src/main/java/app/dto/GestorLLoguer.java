/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dto;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Alumne
 */
public class GestorLloguer {
    private ArrayList<User> llistaUser = new ArrayList<>();
    private ArrayList<Joc> llistaJoc = new ArrayList<>();
    private ArrayList<Lloguer> llistaLloguer = new ArrayList<>();
    private int comptadorNRegistre = 1;

    public GestorLloguer() {
        this.comptadorNRegistre = comptadorNRegistre;
    }
    
    public void afegirUsuari(User usuari){
        llistaUser.add(usuari); 
    }
    
    public void afegirJoc(Joc joc){
        llistaJoc.add(joc); 
    }
    
    public Lloguer crearLloguer(User usuari, Joc joc, Plataforma plataforma, Date dataInici) {
        Lloguer lloguer = new Lloguer(comptadorNRegistre, usuari, joc, plataforma, dataInici);
        comptadorNRegistre++;
        llistaLloguer.add(lloguer);
        return lloguer;
    }

    public ArrayList<User> getUsuaris(){
        return llistaUser;
    }
    
    public ArrayList<Joc> getJocs(){
        return llistaJoc; 
    }
    
    public ArrayList<Lloguer> getLloguers(){
        return llistaLloguer; 
    }
    
    public User buscarUsuariPerDni(String dni){
        for (User u : llistaUser) {
        if (u.getDni().equals(dni)) {
            return u;
        }
    }
    return null;
    }
    
    public Joc buscarJocPerTitol(String titol) {
        for (Joc j : llistaJoc) {
            if (j.getTitol().equalsIgnoreCase(titol)) {
                return j;
            }
        }
        return null;
    }
}
