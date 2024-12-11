package Modular;

import java.util.Scanner;

/* ALEJANDRO ASENCIO GURAU
* Actividad 1: Calculadora de propinas Escribe un programa que pida al usuario el total de una cuenta
* y un porcentaje de propina, y calcule el monto de la propina y el total a pagar.
* Funciones sugeridas: double calculateTip(total, percentage) double calculateTotal(total, tip)*/
public class Practica1 {

    public static double calculateTip(double total,int porcentage){
        double res=0;
        res=(total*porcentage)/100;
        return res;
    }

    public static double calculateTotal(double total,double tip){
        double res=0;
        res=total+tip;
        return res;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double totalCuenta,resulTip,resulTotal;
        int porcentageTip;
        do {
            System.out.println("Introduce el total de la cuenta a pagar: ");
            totalCuenta = sc.nextDouble();
            if (totalCuenta<=0){
                System.err.println("El valor introducido no debe ser negativo.VUELVA A INTRODUCIRLO");
            }
        }while (totalCuenta<=0);
        do {
            System.out.println("Introduce el porcentage de propina que va ha dejar: ");
            porcentageTip = sc.nextInt();
            if (porcentageTip<0){
                System.err.println("El valor introducido no debe ser negativo.VUELVA A INTRODUCIRLO");
            }
        }while (porcentageTip<0);
        resulTip=calculateTip(totalCuenta,porcentageTip);
        resulTotal=calculateTotal(totalCuenta,resulTip);
        System.out.println("La propina es "+resulTip);
        System.out.println("El total a pagar es "+resulTotal);
        sc.close();
    }
}
