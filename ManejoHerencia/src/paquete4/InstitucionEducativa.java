/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete4;

/**
 *
 * @author ASUS
 */
public class InstitucionEducativa {

    private String nombre;
    private String siglas;

    public InstitucionEducativa(String n, String s) {

        nombre = n;
        siglas = s;

    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public void establecerSiglas(String siglas) {
        this.siglas = siglas;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerSiglas() {
        return siglas;
    }

}
