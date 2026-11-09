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
    private String usuari; 
    private String joc; 
    private String plataforma; 
    private Date dataInici; 
    private Date dataTornada; 

    public Lloguer(int numLloguer, String usuari, String joc, String plataforma, Date dataInici, Date dataTornada) {
        this.numLloguer = numLloguer;
        this.usuari = usuari;
        this.joc = joc;
        this.plataforma = plataforma;
        this.dataInici = dataInici;
        this.dataTornada = dataTornada;
    }

    public int getNumLloguer() {
        return numLloguer;
    }

    public void setNumLloguer(int numLloguer) {
        this.numLloguer = numLloguer;
    }

    public String getUsuari() {
        return usuari;
    }

    public void setUsuari(String usuari) {
        this.usuari = usuari;
    }

    public String getJoc() {
        return joc;
    }

    public void setJoc(String joc) {
        this.joc = joc;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public Date getDataInici() {
        return dataInici;
    }

    public void setDataInici(Date dataInici) {
        this.dataInici = dataInici;
    }

    public Date getDataTornada() {
        return dataTornada;
    }

    public void setDataTornada(Date dataTornada) {
        this.dataTornada = dataTornada;
    }

}
