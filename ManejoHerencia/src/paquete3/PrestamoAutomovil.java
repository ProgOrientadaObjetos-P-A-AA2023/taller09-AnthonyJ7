/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import paquete2.*;

/**
 *
 * @author reroes
 */
public class PrestamoAutomovil extends Prestamo {

    private String tipoAuto;
    private String marcaAuto;
    private Persona garante1;
    private double valorAutomovil;
    private double valorMensualAutomovil;

    public PrestamoAutomovil(Persona p1, int tp, String c, String t, String m, Persona p, double vA) {

        super(p1, tp, c);

        tipoAuto = t;
        marcaAuto = m;
        garante1 = p;
        valorAutomovil = vA;

    }

    public void establecerTipoAuto(String t) {
        tipoAuto = t;
    }

    public void establecerMarcaAuto(String m) {
        marcaAuto = m;
    }

    public void establecerGarante1(Persona p) {
        garante1 = p;
    }

    public void establecerValorAutomovil(double vA) {
        valorAutomovil = vA;
    }

    public void calcularValorMensualAutomovil() {
        valorMensualAutomovil = (valorAutomovil / tiempoPrestamo);
    }

    public String obtenerTipoAuto() {
        return tipoAuto;
    }

    public String obtenerMarcaAuto() {
        return marcaAuto;
    }

    public Persona obtenerGarante1() {
        return garante1;
    }

    public double obtenerValorAutomovil() {
        return valorAutomovil;
    }

    public double obtenerValorMensualAutomovil() {
        return valorMensualAutomovil;
    }

    @Override

    public String toString() {

        String cadena = "\nReporte Prestamos automovil\n";

        cadena = String.format("%sLista de Prestamos Automovil\n", cadena);

        cadena = String.format("%sTipo de Auto: %s\n"
                + "Marca Auto: %s\n"
                + "Datos Garante:\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Username: %s\n"
                + "Automovil:\n"
                + "Valor del automovil: %.2f\n"
                + "Valor Mensual Pago prestamo Automovil: %.2f\n",
                cadena,
                obtenerTipoAuto(),
                obtenerMarcaAuto(),
                obtenerBeneficiario().obtenerNombre(),
                obtenerBeneficiario().obtenerApellido(),
                obtenerBeneficiario().obtenerUsername(),
                obtenerValorAutomovil(),
                obtenerValorMensualAutomovil());

        return String.format("%s\n%s", super.toString(), cadena);

    }
}
