/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.validation;

/**
 *
 * @author jerem
 */
public class ValidationAPI {
    
    private ValidationAPI() {
    }

    public static String validarCampObligatori(String valor, String nomCamp) {
        if (valor == null || valor.trim().isEmpty()) {
            return "El camp \"" + nomCamp + "\" és obligatori.";
        }
        return null;
    }

    public static String validarNom(String valor, String nomCamp) {
        String error = validarCampObligatori(valor, nomCamp);
        if (error != null) {
            return error;
        }
        char primera = valor.trim().charAt(0);
        if (!Character.isUpperCase(primera)) {
            return "El camp \"" + nomCamp + "\" ha de començar amb lletra majúscula.";
        }
        return null;
    }

    public static String validarTelefon(String valor) {
        String error = validarCampObligatori(valor, "Telèfon");
        if (error != null) {
            return error;
        }
        if (!valor.trim().matches("\\d{9}")) {
            return "El telèfon ha de tenir 9 xifres, sense espais ni lletres.";
        }
        return null;
    }
}
