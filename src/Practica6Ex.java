import java.util.Scanner;

/*
* Eres el encargado de gestionar el inventario de una tienda. Se te pide desarrollar un programa en el cual puedas:

Registrar la cantidad inicial de un producto en inventario.
Permitir al usuario realizar las siguientes operaciones:
Registrar una venta: Reduce el inventario de un producto.
Registrar una reposición: Aumenta el inventario de un producto.
Mostrar el estado actual del inventario después de cada operación.
Finalizar el programa cuando el usuario lo desee.
El programa debe validar que:

El inventario nunca puede ser negativo.
La cantidad ingresada (para venta o reposición) debe ser mayor a 0.*/
public class Practica6Ex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int inventario,venta,reposicion,opcion;
        boolean salir=true;
        System.out.println("Bienvenido al sistema de gestion de inventario");
        do {
            System.out.println("Ingrese la cantidad incial en inventario: ");
            inventario=sc.nextInt();
            if (inventario<=0){
                System.out.println("ERROR: EL INVENTARIO NO DEBE SER 0 O MENOR");
            }
        }while (inventario<=0);

        while (salir){
            System.out.println("Opciones: ");
            System.out.println("1.Registrar una venta"+"\n2.Registrar una reposicion"+"\n3.Ver estado del inventario"+"\n4.Salir");
            opcion=sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese la cantidad vendida: ");
                    venta=sc.nextInt();
                    if (venta<=0){
                        System.out.println("ERROR: LA VENTA NO PUEDE SER 0 O MENOR");
                    }else if (venta>inventario){
                        System.out.println("ERROR: NO PUEDES VENDER MAS COSAS QUE HAY EN EL INVENTARIO DISPONIBLE");
                    }else {
                        inventario-=venta;
                        System.out.println("Venta registrada. El inventario actual es "+inventario);
                    }
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad a reponer: ");
                    reposicion=sc.nextInt();
                    if (reposicion<=0){
                        System.out.println("ERROR: LA REPOSICION NO PUEDE SER 0 O NEGATIVO");
                    }else {
                        inventario+=reposicion;
                        System.out.println("Reposicion registrada. El inventario actual es: "+inventario);
                    }
                    break;
                case 3:
                    System.out.println("El inventario actual es "+inventario);
                    break;
                case 4:
                    System.out.println("Gracias por usar el sistema de gestion de inventario");
                    salir=false;
                    break;
                default:
                    System.out.println("ERROR: VALOR INTRODUCIDO NO RECONOCIDO");
            }
        }
        sc.close();
    }
}
