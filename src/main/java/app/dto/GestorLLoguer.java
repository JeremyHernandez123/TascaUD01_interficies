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
    
    public int getComptadorNRegistre() {
        return comptadorNRegistre;
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
    
     public ArrayList<Lloguer> getLloguersActius() {
        ArrayList<Lloguer> actius = new ArrayList<>();
        for (Lloguer l : llistaLloguer) {
            if (l.isActiu()) {
                actius.add(l);
            }
        }
        return actius;
    }

    public boolean teLloguersActius(User usuari) {
        for (Lloguer l : llistaLloguer) {
            if (l.isActiu() && l.getUsuari() == usuari) {
                return true;
            }
        }
        return false;
    }

    public boolean teLloguersActius(Joc joc) {
        for (Lloguer l : llistaLloguer) {
            if (l.isActiu() && l.getJoc() == joc) {
                return true;
            }
        }
        return false;
    }

    public boolean eliminarUsuari(User usuari) {
        if (teLloguersActius(usuari)) {
            return false;
        }
        return llistaUser.remove(usuari);
    }

    public boolean eliminarJoc(Joc joc) {
        if (teLloguersActius(joc)) {
            return false;
        }
        return llistaJoc.remove(joc);
    }

    public void tornarLloguer(Lloguer lloguer, Date dataTornada) {
        lloguer.marcarTornat(dataTornada);
        Joc joc = lloguer.getJoc();
        Plataforma p = lloguer.getPlataforma();
        joc.setUnitats(p, joc.getUnitats(p) + 1); // la unitat torna a l'estoc
    }
}
