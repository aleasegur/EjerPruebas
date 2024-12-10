import java.util.Scanner;

/*
magina que trabajas en una tienda y necesitas crear un programa para calcular el precio final de los productos después de aplicar un descuento. El programa debe permitir al usuario realizar varias simulaciones de precios con diferentes descuentos.

Requisitos del programa:

Solicita al usuario el precio del producto (en dólares o euros) y valida que sea un número positivo.
Solicita el porcentaje de descuento a aplicar (entre 0 y 100) y valida que sea correcto.
Calcula el precio final después de aplicar el descuento.
Muestra el desglose: el precio original, el descuento aplicado (en dinero) y el precio final.
Permite al usuario calcular descuentos para varios productos o salir del programa cuando lo desee.
 */
public class Practica4Ex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double precioProducto,precioApliDescuento,descuento,precioFinal;
        boolean cond=true;
        char opcionSal;
        System.out.println("Bienvenido a la calculadora de descuentos");
        while (cond){
            do {
                System.out.println("Ingresa el precio del producto: ");
                precioProducto = sc.nextDouble();
                if (precioProducto<=0){//Considero que 0 es positivo, pero no valido para calcular el descuento
                    System.err.println("ERROR: EL PRECIO NO DEBE SER NEGATIVO O MENOR A 0");
                }
            }while (precioProducto<=0);

            do {
                System.out.println("Ingrese el porcentaje de descuento");
                descuento = sc.nextDouble();
                if (descuento < 0 || descuento > 100) {
                    System.err.println("ERROR: EL DESCUENTO HA DE SER ENTRE 0 Y 100");
                }
            }while (descuento<0 || descuento>100);
            precioApliDescuento=precioProducto*(descuento/100);
            precioFinal=precioProducto-precioApliDescuento;

            System.out.println("Precio original: "+precioProducto+" €");
            System.out.println("Descuento aplicado "+precioApliDescuento+" €");
            System.out.println("Precio final: "+precioFinal+" €");
            System.out.println("\nQuieres calcular el descuento para otro producto?(s/n)");
            opcionSal=sc.next().toLowerCase().charAt(0);
            switch (opcionSal){
                case 's':
                    cond=true;
                    break;
                case 'n':
                    System.out.println("¡Gracias por usar la calculadora de descuentos!");
                    cond=false;
                    break;
                default:
                    System.out.println("ERROR: CARACTER NO RECONOCIDO(VUELVE HA HACER LA CALCULADORA)");
            }

        }
        sc.close();
    }
}
