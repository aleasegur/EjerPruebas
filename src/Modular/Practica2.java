package Modular;

import java.util.Scanner;

/* ALEJANDRO ASENCIO GURAU
* Actividad 2: Gestor de tareas diarias Crea un programa que pida al usuario ingresar
* la cantidad de horas dedicadas
* a tres actividades diferentes (trabajo, ejercicio y ocio)
* y calcule el porcentaje de tiempo dedicado a cada una respecto al total.
* Funciones sugeridas: boolean validHours(hours) para validar que las horas sean positivas.
* double calculatePercentage(part, total) para obtener el porcentaje.*/
public class Practica2 {
    public static boolean validHours(double hours){
        boolean  res=hours>0;
        return res;
    }

    public static double calculatePorcentage(double part,double total){
        double res=0;
        res=(part/total)*100;
        return res;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double horasTrabajo,horasEjercicio,horasOcio,totalHoras=0;
        double resultPorcentageTrabajo,resultPorcentageEjercicio,resultPorcentageOcio;
        do {
            System.out.println("Introduce las horas de trabajo: ");
            horasTrabajo=sc.nextDouble();
            if (!validHours(horasTrabajo)){
                System.out.println("El numero no dee ser negativo.VUELVA A INTRODUCIRLO");
            }
        }while (!validHours(horasTrabajo));

        do {
            System.out.println("Introduce las horas de EJercicio: ");
            horasEjercicio=sc.nextDouble();
            if (!validHours(horasEjercicio)){
                System.out.println("El numero no dee ser negativo.VUELVA A INTRODUCIRLO");
            }
        }while (!validHours(horasEjercicio));

        do {
            System.out.println("Introduce las horas de Ocio: ");
            horasOcio=sc.nextDouble();
            if (!validHours(horasOcio)){
                System.out.println("El numero no dee ser negativo.VUELVA A INTRODUCIRLO");
            }
        }while (!validHours(horasOcio));
        totalHoras+=horasEjercicio+horasOcio+horasTrabajo;
        resultPorcentageTrabajo=calculatePorcentage(horasTrabajo,totalHoras);
        resultPorcentageEjercicio=calculatePorcentage(horasEjercicio,totalHoras);
        resultPorcentageOcio=calculatePorcentage(horasOcio,totalHoras);
        System.out.println("Trabajo: "+resultPorcentageTrabajo);
        System.out.println("Ejercicio: "+resultPorcentageEjercicio);
        System.out.println("Ocio: "+resultPorcentageOcio);
        sc.close();
    }
}
