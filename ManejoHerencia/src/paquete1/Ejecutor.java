/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Scanner;
import paquete2.*;
import paquete3.PrestamoAutomovil;
import paquete4.InstitucionEducativa;
import paquete4.PrestamoEducativo;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean bandera = true;
        String cadena = "";

        do {

            System.out.println("Ingrese sus nombres: ");
            String nombreB = sc.nextLine();

            System.out.println("Ingrese sus apellidos: ");
            String apellidosB = sc.nextLine();

            System.out.println("Ingrese su username: ");
            String usernameB = sc.nextLine();

            Persona p = new Persona(nombreB, apellidosB, usernameB);

            System.out.println("\nQue tipo de prestamo desea?: ");
            System.out.println("1) Prestamo Automovil");
            System.out.println("2) Prestamo Educativo");

            int selec = sc.nextInt();

            if (selec == 1) {

                System.out.println("\nCiudad de donde se pide el prestamo: ");
                String ciud = sc.next().toLowerCase();

                sc.nextLine();
                System.out.println("Ingrese el tipo de auto: ");
                String tipoAuto = sc.nextLine();

                System.out.println("Ingrese la marca del auto: ");
                String marcaAuto = sc.nextLine();

                System.out.println("Datos Garante: ");

                System.out.println("Nombres del garante: ");
                String nombresG = sc.nextLine();

                System.out.println("Apellidos del garante: ");
                String apellidosG = sc.nextLine();

                System.out.println("Username del garante: ");
                String usernameG = sc.nextLine();

                System.out.println("Automovil: ");

                System.out.println("Valor Automovil: ");
                double valorAutomovil = sc.nextDouble();

                System.out.println("Tiempo del prestamo(EN MESES): ");
                int meses = sc.nextInt();

                Persona p1 = new Persona(nombresG, apellidosG, usernameG);

                PrestamoAutomovil pA = new PrestamoAutomovil(p, meses, ciud, tipoAuto, marcaAuto, p1, valorAutomovil);

                pA.calcularValorMensualAutomovil();

                cadena = String.format("%s%s\n", cadena, pA);

            } else {

                if (selec == 2) {

                    System.out.println("\nCiudad de donde se pide el prestamo: ");
                    String ciud1 = sc.next().toUpperCase();

                    sc.nextLine();

                    System.out.println("Cual es el nivel de estudio?: ");
                    int nivelE = sc.nextInt();

                    sc.nextLine();

                    System.out.println("Ingrese nombre Inst. Educativa: ");
                    String instEdu = sc.nextLine();

                    System.out.println("Ingrese las siglas de la Inst. Educativa: ");
                    String siglas = sc.nextLine();

                    System.out.println("Valor Carrera: ");
                    double valorCarrera = sc.nextDouble();

                    System.out.println("Tiempo del prestamo(EN MESES): ");
                    int meses1 = sc.nextInt();

                    InstitucionEducativa ed = new InstitucionEducativa(instEdu, siglas);

                    PrestamoEducativo pE = new PrestamoEducativo(p, meses1, ciud1, nivelE, ed, valorCarrera);

                    pE.calculoValorMensual();

                    cadena = String.format("%s%s\n", cadena, pE);

                } else {

                    System.out.println("Opcion Incorrecta!!!");

                }

            }

            sc.nextLine();

            System.out.println("Desea ingresar otro tipo de prestamo?:");

            String res = sc.nextLine();

            if (res.equals("No")) {

                bandera = false;

            }

        } while (bandera == true);

        System.out.printf("%s\n", cadena);

    }

}
