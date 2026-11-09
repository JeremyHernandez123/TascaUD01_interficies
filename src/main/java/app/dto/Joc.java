/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.dto;

/**
 *
 * @author Alumne
 */
public class Joc {
    private String titol; 
    private String genere; 
    private String unitatsPS5; 
    private String unitatsXbox; 
    private String unitatsPC; 
    private String unitatsSwitch2; 

    public Joc(String titol, String genere, String unitatsPS5, String unitatsXbox, String unitatsPC, String unitatsSwitch2) {
        this.titol = titol;
        this.genere = genere;
        this.unitatsPS5 = unitatsPS5;
        this.unitatsXbox = unitatsXbox;
        this.unitatsPC = unitatsPC;
        this.unitatsSwitch2 = unitatsSwitch2;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public String getUnitatsPS5() {
        return unitatsPS5;
    }

    public void setUnitatsPS5(String unitatsPS5) {
        this.unitatsPS5 = unitatsPS5;
    }

    public String getUnitatsXbox() {
        return unitatsXbox;
    }

    public void setUnitatsXbox(String unitatsXbox) {
        this.unitatsXbox = unitatsXbox;
    }

    public String getUnitatsPC() {
        return unitatsPC;
    }

    public void setUnitatsPC(String unitatsPC) {
        this.unitatsPC = unitatsPC;
    }

    public String getUnitatsSwitch2() {
        return unitatsSwitch2;
    }

    public void setUnitatsSwitch2(String unitatsSwitch2) {
        this.unitatsSwitch2 = unitatsSwitch2;
    }

    @Override
    public String toString() {
        return titol;
    }
   
}
