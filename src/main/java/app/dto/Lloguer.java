/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dto;

import java.util.Date;

/**
 *
 * @author Alumne
 */
public class Lloguer {
    private int numLloguer; 
    private User usuari; 
    private Joc joc; 
    private Plataforma plataforma; 
    private Date dataInici; 
    private Date dataTornada; 

    public Lloguer(int numLloguer, User usuari, Joc joc, Plataforma plataforma, Date dataInici) {
        this.numLloguer = numLloguer;
        this.usuari = usuari;
        this.joc = joc;
        this.plataforma = plataforma;
        this.dataInici = dataInici;
    }

    public int getNumLloguer() {
        return numLloguer;
    }

    public User getUsuari() {
        return usuari;
    }

    public Joc getJoc() {
        return joc;
    }

    public Plataforma getPlataforma() {
        return plataforma;
    }

    public Date getDataInici() {
        return dataInici;
    }

    public Date getDataTornada() {
        return dataTornada;
    }
}
