package BUCLEScondicionales;

import java.util.Scanner;
/*
* Enunciado del ejercicio: "Calculadora de números primos"

Escribe un programa que permita al usuario comprobar si un número es primo y llevar un registro de cuántos números primos ha encontrado.
*  El programa debe seguir los siguientes pasos:

Solicitar al usuario que ingrese un número positivo mayor a 1 para verificar si es primo.
Comprobar si el número ingresado es primo utilizando un bucle.
Un número primo es divisible únicamente por 1 y por sí mismo.
Mostrar un mensaje indicando si el número ingresado es primo o no primo.
Llevar un contador de cuántos números primos ha encontrado el usuario durante la ejecución del programa.
Preguntar al usuario si desea ingresar otro número o salir del programa.
Si el usuario elige continuar, repetir el proceso.
Si el usuario elige salir, mostrar un mensaje final indicando cuántos números primos se identificaron en total.
Condiciones adicionales:
*
Solo se deben aceptar números positivos mayores a 1.
Si el usuario ingresa un número inválido (menor o igual a 1, o un carácter no numérico), mostrar un mensaje de error y pedir nuevamente el dato.
El programa debe terminar únicamente cuando el usuario lo indique.*/

public class Practica3Ex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numUser,conPrimos=0;
        boolean cond=true,esPrimo;
        char salir;
        System.out.println("Bienvenido a la calculadora de numeros primos");
        while (cond){
            esPrimo=true;
            System.out.println("Ingresa un numero mayor a 1: ");
            numUser=sc.nextInt();
            if (numUser<=1){
                System.err.println("ERROR INGRESE UN NUMERO MAYOR A 1");
            }else {
                for (int i = 2; i <=Math.sqrt(numUser) ; i++) {
                    if (numUser%i==0){
                        esPrimo=false;
                    }
                }
            }

            if (esPrimo==true){
                System.out.println("El numero "+numUser+" es primo");
                conPrimos++;
            }else {
                System.out.println("El numero "+numUser+" no es primo");
            }

            System.out.println("Quieres probar otro numero?(s/n): ");
            salir=sc.next().toLowerCase().charAt(0);
            switch (salir){
                case 'n':
                    System.out.println("Has identificado "+conPrimos+" numero(s) primo(s) en total. ¡Gracias por usar la calculadora!");
                    cond=false;
                    break;
                case 's':
                    cond=true;
                    break;
                default:
                    System.out.println("ERROR: CARACTER NO RECONOCIDO");
            }
        }
        sc.close();
    }
}
