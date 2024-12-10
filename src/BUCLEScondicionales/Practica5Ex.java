package BUCLEScondicionales;

import java.util.Scanner;

/*
* Crea un programa que permita a un profesor registrar la asistencia de los estudiantes en una clase. El programa debe funcionar de la siguiente manera:

Solicitar el número total de estudiantes en la clase (validar que sea positivo).
Pedir al profesor que registre si cada estudiante está presente o ausente, introduciendo una 'p' (presente) o una 'a' (ausente).
Al final, el programa debe mostrar:
El número total de estudiantes presentes.
El número total de estudiantes ausentes.
El porcentaje de asistencia.*/
public class Practica5Ex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int totalEstudiantes,presentes=0,ausentes=0;
        double porcentajeAsistencia;
        char asistencia;
        boolean entradaValida;

        System.out.println("Bienvenido al control de asistencia");
        do {
            System.out.println("Ingrese el numero total de estudiante");
            totalEstudiantes=sc.nextInt();
            if (totalEstudiantes<=0){
                System.err.println("ERROR: NO PUEDE HABER 0 O MENOS ESTUDIANTES");
            }
        }while (totalEstudiantes<=0);

        for (int i = 1; i <=totalEstudiantes ; i++) {
            entradaValida=true;
            while (entradaValida) {
                System.out.println("Estudiante " + i + " esta presente o ausente(p/a): ");
                asistencia = sc.next().toLowerCase().charAt(0);
                switch (asistencia) {
                    case 'p':
                        presentes++;
                        entradaValida=false;
                        break;
                    case 'a':
                        ausentes++;
                        entradaValida=false;
                        break;
                    default:
                        System.out.println("ERROR: CARCTER NO RECONOCIDO");
                }
            }
        }
        porcentajeAsistencia=((double)presentes/totalEstudiantes)*100;
        System.out.println("Resumen de asistencia: "+"\n-Estudiantes presentes "+presentes+"\n-Estudiantes ausentes "+ausentes+"\n-Porcentaje de asistencia "+porcentajeAsistencia);
        sc.close();
    }
}
