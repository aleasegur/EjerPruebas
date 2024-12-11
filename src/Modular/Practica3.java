package Modular;

import java.util.Scanner;

/*
* Conversor de temperatura Haz un programa que convierta una temperatura entre Celsius
* y Fahrenheit según la elección del usuario.
* Funciones sugeridas: double celsiusToFahrenheit(celsius) double fahrenheitToCelsius(fahrenheit)
* void showTemperatureMenu() para mostrar las opciones al usuario*/
public class Practica3 {
    public static double celsiusToFahrenheit(double celsius){
        double res=0;
        res=celsius*1.8+32;
        return res;
    }

    public static double fahrenheitToCelsius(double fahrenheit){
        double res=0;
        res=(fahrenheit-32)/1.8;
        return res;
    }

    public static void showTemperatureMenu(){
        System.out.println("--Pasar a Cª/Fª--");
        System.out.println("a)Celsius.");
        System.out.println("b)Farhenheit.");
        System.out.println("c)Salir.");
        System.out.println("-------------");
        System.out.println("Elige una opcion: ");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double temperatura=0,resultCelsius,resultFarhenheint;
        char opcion;
        boolean condicionBuclePrincipal=true;
        while (condicionBuclePrincipal){
            showTemperatureMenu();
            opcion=sc.next().toLowerCase().charAt(0);
            if (opcion=='a' || opcion=='b') {
                System.out.println("Ingrese la tempaeratura para la conversion: ");
                temperatura = sc.nextDouble();
            }
            switch (opcion){
                case 'a':
                    resultCelsius=fahrenheitToCelsius(temperatura);
                    System.out.println(temperatura+" Fª --> "+resultCelsius+" Cª");
                    break;
                case 'b':
                    resultFarhenheint=celsiusToFahrenheit(temperatura);
                    System.out.println(temperatura+" Cª --> "+resultFarhenheint+" Fª");
                    break;
                case 'c':
                    System.out.println("Saliendo...");
                    condicionBuclePrincipal=false;
                    break;
                default:
                    System.err.println("VALOR INTRODUCIDO NO RECONOCIDO.VUELVA A INTRODUCIRLO");
            }
        }
        sc.close();
    }
}
