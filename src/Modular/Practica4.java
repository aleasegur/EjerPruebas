package Modular;

import java.util.Scanner;

/* ALEJANDRO ASENCIO GURAU
* Crea un programa que reciba un objetivo de ahorro, un saldo inicial y un monto mensual que el usuario planea ahorrar.
* Calcula cuántos meses tomará alcanzar el objetivo.
Funciones sugeridas:
boolean isPositive(amount) para validar las entradas.
int calculateMonths(goal, initial, monthly) para determinar el número de meses.*/
public class Practica4 {
    public static boolean isPositive(double amount){
        boolean res=amount>=0;
        return res;
    }

    public static int calculateMonths(double goal,double initial,double amount){
        int res=0;
        res= (int) ((int)(goal-initial)/amount);
        return res;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double objetivoAhorro,saldoInicial,cantidadMonth;
        int resultCalculoObjetivo=0;
        do {
            System.out.println("Introduce el objetivo de ahorro");
            objetivoAhorro=sc.nextDouble();
            if (!isPositive(objetivoAhorro)){
                System.err.println("El valor no puede ser negativo, vuelva a introducirlo.");
            }
        }while (!isPositive(objetivoAhorro));

        do {
            System.out.println("Introduce el saldo inicial");
            saldoInicial=sc.nextDouble();
            if (!isPositive(saldoInicial)){
                System.err.println("El valor no puede ser negativo, vuelva a introducirlo.");
            }
        }while (!isPositive(saldoInicial));

        do {
            System.out.println("Introduce la cantidad de dinero al mes: ");
            cantidadMonth=sc.nextDouble();
            if (!isPositive(cantidadMonth)){
                System.err.println("El valor no puede ser negativo, vuelva a introducirlo.");
            }
        }while (!isPositive(cantidadMonth));
        resultCalculoObjetivo=calculateMonths(objetivoAhorro,saldoInicial,cantidadMonth);
        System.out.println("La cantidad de meses es "+resultCalculoObjetivo);
        sc.close();
    }
}
