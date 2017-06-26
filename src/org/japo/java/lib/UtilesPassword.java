/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.lib;

//import java.util.Random;
/**
 *
 * @author - Raúl Granel Blasco - raul.granel@gmail.com
 */
public class UtilesPassword {

    //public static final Random rnd = new Random(System.currentTimeMillis());
    // Obtiene ENTERO ALEATORIO entre un rango.
    public static int obtenerRandomInt(int MIN, int MAX) {
        java.util.Random rnd = new java.util.Random();
        return rnd.nextInt(MAX - MIN + 1) + MIN;
    }

    // GENERA CONTRASEÑA.
    public static String generarPassword(int longitud) {
        String password = "";
        String letrasMay = "ABCDEFGHIJKLMNOPQRSTUVWXYZÇ";
        String letrasMin = "abcdefghijklmnopqrstuvwxyzç";
        String numeros = "1234567890";
        String especiales = "-_#$.:/+*()=?{}[]&¿";
        while (password.length() < longitud) {
            password = password + letrasMay.charAt(obtenerRandomInt(0, letrasMay.length() - 1));
            password = password + letrasMin.charAt(obtenerRandomInt(0, letrasMin.length() - 1));
            password = password + numeros.charAt(obtenerRandomInt(0, numeros.length() - 1));
            password = password + especiales.charAt(obtenerRandomInt(0, especiales.length() - 1));
        }
        return password.substring(0, longitud);
    }

}
