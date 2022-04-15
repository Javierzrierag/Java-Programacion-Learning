package OperadoresRelacionales;

import java.util.Scanner;

public class OperadoresRelacionales {
    public static void main(String args[]) {

        String nombre = "";
        int clave = 0;
        int antiguedad = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Cual es tu nombre?");
        nombre = in.nextLine();

        System.out.println("Cual es tu clave?");
        clave = in.nextInt();

        System.out.println("Cual es tu antiguedad en la empresa?");
        antiguedad = in.nextInt();

        if (clave == 1) {
            if (antiguedad == 1) {
                System.out.println("Hola " + nombre + " usted tiene 6 dias de vacaciones disponible");
            } else if (antiguedad >= 2 && antiguedad <= 6) {
                System.out.println("Hola " + nombre + " usted tiene 14 dias de vacaciones disponible");

            } else if (antiguedad >= 7) {
                System.out.println("Hola " + nombre + " usted tiene 20 dias de vacaciones disponible");
            }
        }

        if (clave == 2) {
            if (antiguedad == 1) {
                System.out.println("Hola " + nombre + " usted tiene 7 dias de vacaciones disponible");
            } else if (antiguedad >= 2 && antiguedad <= 6) {
                System.out.println("Hola " + nombre + " usted tiene 15 dias de vacaciones disponible");

            } else if (antiguedad >= 7) {
                System.out.println("Hola " + nombre + " usted tiene 22 dias de vacaciones disponible");
            }
        }

        if (clave == 3) {

            if (antiguedad == 1) {
                System.out.println("Hola " + nombre + " usted tiene 10 dias de vacaciones disponible");
            } else if (antiguedad >= 2 && antiguedad <= 6) {
                System.out.println("Hola " + nombre + " usted tiene 20 dias de vacaciones disponible");

            } else if (antiguedad >= 7) {
                System.out.println("Hola " + nombre + " usted tiene 30 dias de vacaciones disponible");
            }
        }

        if(clave == 0 || clave < 1){
            System.out.println("hola " +nombre + " Usted no posee dias de vacaciones en este momento");
        }
    }
}
