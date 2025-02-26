package POO.Practica1;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class PruebaVehiculos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<String,Vehiculo> lista=new HashMap<>();
        boolean buclePrincipal=true;
        char opcion;
        String[] movimiento=new String[100];
        int cont=0;
        while (buclePrincipal){
            try {
                showMenu();
                opcion=sc.next().toLowerCase().charAt(0);
                switch (opcion){
                    case 'a':
                        registrarVehiculo(sc,lista);
                        break;
                    case 'b':
                        mostrarVehiculoMatricula(sc,lista);
                        break;
                    case 'c':
                        cambiarEstadoDeUnVehiculo(sc,lista);
                        break;
                    case 'd':
                        mostrarMovimientosVehiculo(sc,lista);
                        break;
                    case 'e':
                        System.out.println("Saliendo...");
                        buclePrincipal=false;
                        break;
                    default:
                        System.err.println("Opcion incorrecta");
                }
            }catch (IndexOutOfBoundsException e){
                System.err.println(e.getMessage());
            }catch (Exception e){
                System.err.println(e.getMessage());
            }
        }
        sc.close();
    }

    public static void registrarVehiculo(Scanner sc,Map<String,Vehiculo> lista){
        int opcion;
        boolean bucleReg=true;
        String marca = "",modelo = "",matricula = "";
        int year = 0;
        Estado estado = null;
        boolean enUso = false;
        while (bucleReg){
            try {
                showSubMenu();
                opcion = sc.nextInt();
                sc.nextLine();
                if (opcion==1 || opcion==2 || opcion==3){
                    marca=introducirCadena(sc,"la marca del vehiculo");
                    modelo=introducirCadena(sc,"el modelo del vehiculo");
                    do {
                        matricula = introducirCadena(sc, "la matricula del vehiculo");
                    }while (!Vehiculo.checkMatricula(matricula));
                    year=introduceEntero(sc,"el año del vehiculo");
                    estado=introducirEstado(sc,"el estado del vehiculo");
                    enUso=introducirBooleano(sc,"el uso uso del vehiculo,esta usado?");
                }
                switch (opcion){
                    case 1:
                        int ruedas=introduceEntero(sc,"el numero de ruedas del coche")
                                ,plazas=introduceEntero(sc,"el numero de plazas deñ coche");
                        Coche coche=new Coche(marca,modelo,matricula,year,estado,enUso,ruedas,plazas);
                        coche.registroMov("Registrado un coche con matricula "+matricula);
                        lista.put(matricula,coche);
                        bucleReg=false;
                        break;
                    case 2:
                        int cilindrada=introduceEntero(sc,"la cilindrada de la moto");
                        Moto moto=new Moto(marca,modelo,matricula,year,estado,enUso,cilindrada);
                        moto.registroMov("Registrado una moto con matricula "+matricula);
                        lista.put(matricula,moto);
                        bucleReg=false;
                        break;
                    case 3:
                        double peso=introducirNumReal(sc,"el peso del camion");
                        Camion camion=new Camion(marca,modelo,matricula,year,estado,enUso,peso);
                        camion.registroMov("Registrado un camion con matricula "+matricula);
                        lista.put(matricula,camion);
                        bucleReg=false;
                        break;
                    default:
                        System.err.println("Opcion invalida");
                }
            }catch (InputMismatchException | StringIndexOutOfBoundsException | ArithmeticException e){
                System.err.println(e.getMessage());
            }catch (Exception e){
                System.err.println(e.getMessage());
            }
        }
    }

    public static void mostrarVehiculoMatricula(Scanner sc,Map<String,Vehiculo> lista){
        if (lista.isEmpty()){
            System.out.println("La lista de vehiculos esta vacia");
        } else {
            try {
                sc.nextLine();
                String matricula = introducirCadena(sc, "la matricula del vehiculo que quieres mostrar");
                Vehiculo vehiculo = lista.get(matricula);
                if (vehiculo != null) {
                    System.out.println(vehiculo);
                    vehiculo.registroMov("Se ha mostrado un vehicula con su matricula " + matricula);
                } else {
                    System.out.println("No se encontro el vehiculo con esa matricula");
                }
            }catch (StringIndexOutOfBoundsException e){
                System.err.println(e.getMessage());
            }catch (Exception e){
                System.err.println(e.getMessage());
            }
        }
    }

    public static void cambiarEstadoDeUnVehiculo(Scanner sc,Map<String,Vehiculo> lista){
        if (lista.isEmpty()){
            System.out.println("La lista de vehiculos esta vacia");
        }else{
            sc.nextLine();
            String matricula=introducirCadena(sc,"la matricula del vehiculo que quieres cambiar el estado de uso");
            Vehiculo vehiculo=lista.get(matricula);
            if (vehiculo!=null){
                boolean cambiarUso=introducirBooleano(sc,"introduce el nuevo estado de uso del vehiculo");
                vehiculo.setEnUso(cambiarUso);
                vehiculo.registroMov("Se ha cambiado el estado de un vehiculo su matricula "+matricula);
                System.out.println("Dato actualizado de vehiculo");
            }else{
                System.out.println("No se enontro el vehiculo con esa matricula");
            }
        }
    }

    public static void mostrarMovimientosVehiculo(Scanner sc, Map<String, Vehiculo> lista) {
        if (lista.isEmpty()) {
            System.out.println("La lista de vehículos está vacía.");
        }else {
            try {
                sc.nextLine(); // Evitar problemas con Scanner
                String matricula = introducirCadena(sc, "la matrícula del vehículo cuyos movimientos quieres ver");
                Vehiculo vehiculo = lista.get(matricula);
                if (vehiculo != null) {
                    System.out.println("Movimientos del vehículo con matrícula " + matricula + ":");
                    String[] movimientos = vehiculo.getMovimientos(); // Obtener los movimientos registrados

                    boolean hayMovimientos = false;
                    for (String mov : movimientos) {
                        if (mov != null) {
                            System.out.println("- " + mov);
                            hayMovimientos = true;
                        }
                    }

                    if (!hayMovimientos) {
                        System.out.println("No hay movimientos registrados para este vehículo.");
                    }
                } else {
                    System.out.println("No se encontró un vehículo con esa matrícula.");
                }
            }catch (StringIndexOutOfBoundsException e){
                System.err.println(e.getMessage());
            }catch (Exception e){
                System.err.println(e.getMessage());
            }
        }
    }


    public static String introducirCadena(Scanner sc,String atributo){
        String cadena="";
        try {
            System.out.print("Introduce "+atributo+" :");
            cadena=sc.nextLine();
        }catch (StringIndexOutOfBoundsException e){
            System.err.println(e.getMessage());
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
        return cadena;
    }

    public static int introduceEntero(Scanner sc,String atributo) throws Exception {
        int num=0;
        do {
            try {
                System.out.print("Introduce " + atributo + " :");
                num = sc.nextInt();
            } catch (InputMismatchException | ArithmeticException e) {
                System.err.println(e.getMessage());
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }while (!Vehiculo.checkNum(num));
        return num;
    }

    public static double introducirNumReal(Scanner sc,String atributo) throws Exception {
        double num=0;
        do {
            try {
                System.out.print("Introduce " + atributo + " :");
                num = sc.nextDouble();
            } catch (InputMismatchException | ArithmeticException e) {
                System.err.println(e.getMessage());
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }while (!Vehiculo.checkNum(num));
        return num;
    }

    public static boolean introducirBooleano(Scanner sc,String atributo){
       boolean res = false;
       int opcion;
       boolean bucle=true;
       while (bucle) {
           try {
               showOpcion();
               System.out.print("Introduce " + atributo + " :");
               opcion=sc.nextInt();
               switch (opcion){
                   case 1:
                       res=true;
                       bucle=false;
                       break;
                   case 2:
                       res=false;
                       bucle=false;
                       break;
                   default:
                       System.err.println("Opcion incorrecta");
               }
           } catch (InputMismatchException | ArithmeticException e) {
               System.err.println(e.getMessage());
           } catch (Exception e) {
               System.err.println(e.getMessage());
           }
       }
        return res;
    }

    public static Estado introducirEstado(Scanner sc,String atributo){
        Estado estado = null;
        int num;
        boolean bucle=true;
        while (bucle){
            try {
                showOpcionEstado();
                System.out.println("Introduce "+atributo+" :");
                num= sc.nextInt();
                switch (num){
                    case 1:
                        estado=Estado.DISPONIBLE;
                        bucle=false;
                        break;
                    case 2:
                        estado=Estado.OCUPADO;
                        bucle=false;
                        break;
                    default:
                        System.err.println("Opcion incorrecta");
                }
            }catch (InputMismatchException | ArithmeticException e){
                System.err.println(e.getMessage());
            }catch (Exception e){
                System.err.println(e.getMessage());
            }
        }
        return estado;
    }

    public static void showSubMenu(){
        System.out.println("1.Coche");
        System.out.println("2.Moto");
        System.out.println("3.Camion");
        System.out.print("Elegir opcion:");
    }

    public static void showOpcion(){
        System.out.println("1.True");
        System.out.println("2.False");
    }

    public static void showOpcionEstado(){
        System.out.println("1.Disponible");
        System.out.println("2.Ocupado");
    }

    public static void showMenu(){
        System.out.println("a).Registrar Vehiculo");
        System.out.println("b).Buscar vehiculo por matricula");
        System.out.println("c).Cambiar estado del vehiculo");
        System.out.println("d).Mostrar movimientos de vehiculos");
        System.out.println("e).Salir");
        System.out.print("Elegir opcion: ");
    }
}
