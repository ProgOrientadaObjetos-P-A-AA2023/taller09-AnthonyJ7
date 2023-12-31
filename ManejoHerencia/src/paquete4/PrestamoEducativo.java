/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import paquete2.Persona;
import paquete2.Prestamo;

/**
 *
 * @author reroes
 */
public class PrestamoEducativo extends Prestamo {

    private int nivelEstudio;
    private InstitucionEducativa centroEdu;
    private double valorCarrera;
    private double valorMensual;

    public PrestamoEducativo(Persona p1, int tp, String c, int t, InstitucionEducativa m, double p) {

        super(p1, tp, c);

        nivelEstudio = t;
        centroEdu = m;
        valorCarrera = p;

    }


    public void establecerNivelEstudio(int n) {
        nivelEstudio = n;
    }

    public void establecerCentroEdu(InstitucionEducativa c) {
        centroEdu = c;
    }

    public void establecerValorCarrera(double v) {
        valorCarrera = v;
    }

    public void calculoValorMensual() {
        valorMensual = (valorCarrera / tiempoPrestamo) - (0.10 * (valorCarrera / tiempoPrestamo));
    }


    public int obtenerNivelEstudio() {
        return nivelEstudio;
    }

    public InstitucionEducativa obtenerCentroEdu() {
        return centroEdu;
    }

    public double obtenerValorCarrera() {
        return valorCarrera;
    }

    public double obtenerValorMensual() {
        return valorMensual;
    }

    @Override

    public String toString() {

        String cadena = "\nReporte Prestamos Educativos\n";

        cadena = String.format("%sLista de Prestamos Educativos\n", cadena);

            cadena = String.format("%sNivel de Estudio: %d\n"
                    + "Centro educativo:\n"
                    + "Nombre Institucion Educativa: %s\n"
                    + "Siglas Institucion Educativa:%s\n"
                    + "Valor Carrera: %.2f\n"
                    + "Valor Mensual Pago prestamo Educativo: %.2f",
                    cadena,
                    obtenerNivelEstudio(),
                    obtenerCentroEdu().obtenerNombre(),
                    obtenerCentroEdu().obtenerSiglas(),
                    obtenerValorCarrera(),
                    obtenerValorMensual());

        

        return String.format("%s\n%s", super.toString(), cadena);

    }

}
