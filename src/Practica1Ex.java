import java.util.Random;
import java.util.Scanner;
/*
* Crea un programa en el que el usuario pueda jugar a "Adivina el número". El programa debe seguir estos pasos:

El programa generará un número secreto al azar entre 1 y 50.
Pedirá al usuario que adivine el número.
Si el número ingresado por el usuario es menor que el número secreto, el programa debe mostrar el mensaje: "El número secreto es mayor".
Si el número ingresado es mayor que el número secreto, el programa debe mostrar el mensaje: "El número secreto es menor".
Si el usuario acierta, el programa debe felicitarlo con un mensaje como: "¡Felicidades, adivinaste el número en X intentos!", donde X es el número de intentos realizados.
El programa debe seguir pidiendo intentos hasta que el usuario adivine correctamente.
Condiciones adicionales:

Debes usar bucles para repetir la solicitud al usuario.
Utiliza condicionales para comparar el número ingresado con el número secreto.
Asegúrate de manejar errores comunes, como si el usuario ingresa un valor fuera del rango permitido (1 a 50) o un dato no válido, mostrando mensajes adecuados y pidiendo que lo intente de nuevo.*/
public class Practica1Ex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int numUser,numAleatorio,intentos=0;
        numAleatorio=rand.nextInt(50)+1;//Entre 1 y 50, sin el +1 es entre 0 y 49
        boolean cond=true;
        System.out.println("¡Bienvenido al juego ADIVINA EL NUMERO!");
        while (cond){
            System.out.println("Adivina el numero(entre 1 y 50): ");
            //System.out.println("Numero secreto es(prueba para adivinar) "+numAleatorio);
            numUser=sc.nextInt();
            if (numUser>=1 && numUser<=50) {
                if (numUser == numAleatorio) {
                    intentos++;
                    System.out.println("Adivinaste el numero en " + intentos + " intentos");
                    cond=false;
                } else if (numUser > numAleatorio) {
                    System.out.println("El numero es menor");
                    intentos++;
                } else {
                    System.out.println("El numero es mayor");
                    intentos++;
                }
            }else {
                System.err.println("ERROR: ESE NUMERO NO ENTRA EN EL RANGO ENTRE 1 Y 50.¡VUELVA A INTRODUCIR!");
            }

        }
        sc.close();
    }
}