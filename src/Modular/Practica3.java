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
        System.out.println("--Cª/Fª--");
        System.out.println("a)Celsius");
        System.out.println("b)Farhewnheit");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    }
}
