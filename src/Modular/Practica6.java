package Modular;

import java.util.Scanner;

/*ALEJANDRO ASENCIO GURAU
*Realiza un programa que pida al usuario su peso en kilogramos y su altura en metros, calcule su índice de masa corporal (IMC)
* e indique si está en un rango saludable.
Funciones sugeridas:
boolean validateInput(value) para comprobar que las entradas sean válidas.
double calculateIMC(weight, height) para calcular el IMC.
void displayIMCResult(imc) para mostrar el rango correspondiente. */
public class Practica6 {
    public static boolean validateInput(double value){
        boolean res=value>0;
        return res;
    }

    public static double calculateIMC(double peso,double altura){
        double res=0;
        res=peso/(altura*altura);
        return res;
    }

    public static void displayIMCResult(double imc){
        System.out.print("Clasificación: ");
        if (imc < 18.5) {
            System.out.println("Bajo peso");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Peso normal");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidad");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double peso,altura,resulIMC;
        do {
            System.out.println("Introduce tu peso: ");
            peso=sc.nextDouble();
            if (!validateInput(peso)){
                System.err.println("ERROR; EL VALOR NO DEBE SER NEGATIVO");
            }
        }while (!validateInput(peso));

        do {
            System.out.println("Introduce tu altura: ");
            altura=sc.nextDouble();
            if (!validateInput(altura)){
                System.err.println("ERROR; EL VALOR NO DEBE SER NEGATIVO");
            }
        }while (!validateInput(altura));
        resulIMC=calculateIMC(peso,altura);
        System.out.println("IMC: "+resulIMC);
        displayIMCResult(resulIMC);
    }
}
