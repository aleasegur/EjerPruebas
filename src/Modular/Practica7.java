package Modular;

import java.util.Scanner;

/*ALEJANDRO ASENCIO GURAU
* Crea un programa que solicite la hora de entrada y salida de un trabajador en formato de 24 horas y calcule las horas trabajadas,
*  considerando validaciones para entradas erróneas.
Funciones sugeridas:
boolean validateTime(hour) para validar las horas introducidas.
int calculateHoursWorked(start, end) para calcular las horas trabajadas.*/
public class Practica7 {
    public static boolean validateTime(int hour){
        boolean res=hour>0;
        return res;
    }

    public static int calaculateHoursWorked(int entrada,int salida){
        int res=0;
        if (salida>=entrada){
            res=salida-entrada;
        }else {
            res=(24-entrada)+salida;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int horaEntrada,horaSalida,resultHora;
        do {
            System.out.println("Introduce la hora de entrada: ");
            horaEntrada=sc.nextInt();
            if (!validateTime(horaEntrada)){
                System.err.println("El valor introducido no puede ser negativo");
            }
        }while (!validateTime(horaEntrada));

        do {
            System.out.println("Introduce la hora de salida: ");
            horaSalida=sc.nextInt();
            if (!validateTime(horaSalida)){
                System.err.println("El valor introducido no puede ser negativo");
            }
        }while (!validateTime(horaSalida));
        resultHora=calaculateHoursWorked(horaEntrada,horaSalida);
        System.out.println("La hora trabajadas es "+resultHora);

    }
}
