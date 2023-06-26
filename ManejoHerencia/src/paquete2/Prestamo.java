/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Prestamo {
    
    protected Persona beneficiario;
    protected int tiempoPrestamo;
    protected String ciudPrestamo;
    
    public Prestamo(Persona p, int tp, String c){
    
        beneficiario = p;
        tiempoPrestamo = tp;
        ciudPrestamo = c;
    
    }

    public void establecerBeneficiario(Persona b) {
        beneficiario = b;
    }

    public void establecerTiempoPrestamo(int tp) {
        tiempoPrestamo = tp;
    }

    public void establecerCiudPrestamo(String c) {
        ciudPrestamo = c;
    }

    public Persona obtenerBeneficiario() {
        return beneficiario;
    }

    public int obtenerTiempoPrestamo() {
        return tiempoPrestamo;
    }

    public String obtenerCiudPrestamo() {
        return ciudPrestamo;
    }
    
    @Override
    public String toString(){
        return String.format("\nNombre: %s\n"
                + "Apellido: %s\n"
                + "Username: %s\n"
                + "Tiempo prestamo: %d\n"
                + "Ciudad Prestamo: %s\n", 
                obtenerBeneficiario().obtenerNombre(),
                obtenerBeneficiario().obtenerApellido(),
                obtenerBeneficiario().obtenerUsername(),
                obtenerTiempoPrestamo(),
                obtenerCiudPrestamo());
    }  
}
