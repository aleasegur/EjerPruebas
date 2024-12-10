package BUCLEScondicionales;

import java.util.Random;
import java.util.Scanner;
/*
* Crea un programa que permita al usuario jugar al juego "Número Mágico". El programa debe realizar las siguientes acciones:

Generar un número "mágico" secreto que sea múltiplo de 3, comprendido entre 1 y 100.
Pedir al usuario que adivine el número mágico.
Si el número ingresado no es múltiplo de 3, mostrar un mensaje: "El número debe ser múltiplo de 3. Inténtalo de nuevo." y pedir otro intento.
Si el número es válido pero menor que el número mágico, mostrar el mensaje: "El número mágico es mayor."
Si el número es válido pero mayor que el número mágico, mostrar el mensaje: "El número mágico es menor."
Si el usuario adivina el número, felicitarlo con el mensaje: "¡Felicidades! Has encontrado el número mágico en X intentos.", donde X es el número de intentos.
El juego debe seguir pidiendo intentos hasta que el usuario acierte.
Condiciones adicionales:

Utiliza condicionales para las verificaciones (múltiplo de 3, mayor o menor, etc.).
Usa bucles para permitir múltiples intentos.
Si el usuario ingresa un valor fuera del rango (1 a 100), muestra un mensaje: "El número debe estar entre 1 y 100. Vuelve a intentarlo."*/
public class Practica2Ex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        boolean cond=true;
        int numAleatorio,numAleaMultiploTres,numUser,intentos=0;
        numAleatorio= rand.nextInt(33)+1;//opcion alternativo (rand.nextInt(33)+1)*3;
        numAleaMultiploTres=numAleatorio*3;
        System.out.println("Bienvenidp aljuego de adivinar el NUMERO MAGICO");
        while (cond){
            System.out.println("Adivina el numero magico(entre 1 y 100)");
           //System.out.println("Numero aleatorio es "+numAleaMultiploTres);//Comprobar el nuemro aleatorio para el programador
            numUser=sc.nextInt();
            if (numUser>=1 && numUser<=100){
                if (numUser%3==0){
                    if (numUser==numAleaMultiploTres){
                        intentos++;
                        System.out.println("Has adivinado el numero magico en "+intentos+" intentos");
                        cond=false;
                    }else if (numUser>numAleaMultiploTres){
                        System.out.println("El numero magico es menor");
                        intentos++;
                    }else {
                        System.out.println("El numero magico es mayor");
                        intentos++;
                    }
                }else {
                    System.out.println("El numero debe ser multiplo de 3.¡Intentalo de nuevo!");
                    intentos++;
                }
            }else {
                System.err.println("ERROR: EL NUMERO HA DE ESTAR EN EL RANGO ENTRE 1 Y 100");
            }
        }
        sc.close();
    }
}
