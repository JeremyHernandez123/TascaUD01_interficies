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
    private static ArrayList<User> llistaUser = new ArrayList<>();
    private static ArrayList<Joc> llistaJoc = new ArrayList<>();
    private static ArrayList<Lloguer> llistaLloguer = new ArrayList<>();
    private static int comptadorNRegistre;

    public GestorLloguer() {
        this.comptadorNRegistre = 1;
    }
    
    public static void afegirUsuari(User usuari){
        llistaUser.add(usuari); 
    }
    
    public static void afegirJoc(Joc joc){
        llistaJoc.add(joc); 
    }
    
    public static Lloguer crearLloguer(User usuari, Joc joc, Plataforma plataforma, Date dataInici) {
        Lloguer lloguer = new Lloguer(comptadorNRegistre, usuari, joc, plataforma, dataInici);
        comptadorNRegistre++;
        llistaLloguer.add(lloguer);
        return lloguer;
    }

    public static ArrayList<User> getUsuaris(){
        return llistaUser;
    }
    
    public static ArrayList<Joc> getJocs(){
        return llistaJoc; 
    }
    
    public static ArrayList<Lloguer> getLloguers(){
        return llistaLloguer; 
    }
    
    public static User buscarUsuariPerDni(String dni){
        for (User u : llistaUser) {
        if (u.getDni().equals(dni)) {
            return u;
        }
    }
    return null;
    }
}
