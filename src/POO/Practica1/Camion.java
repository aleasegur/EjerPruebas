package POO.Practica1;

public class Camion extends Vehiculo{
    private double peso;

    public Camion() {
        super();
        peso=0;
    }

    public Camion(String marca, String modelo, String matricula, int year, Estado estado, boolean enUso, double peso) throws Exception {
        super(marca, modelo, matricula, year, estado, enUso);
        if (checkNum(peso) && checkPeso(peso)){
        this.peso = peso;
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) throws Exception {
        if (checkNum(peso) && checkPeso(peso)) {
            this.peso = peso;
        }
    }

    public boolean checkPeso(double num) throws Exception {
        if (num>3500){
            throw new Exception("El camion no puede ser mayor de 3500 kg");
        }else{
            return true;
        }
    }

    @Override
    public String toString() {
        return "Camion{" +
                "peso=" + peso +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", matricula='" + matricula + '\'' +
                ", año=" + year +
                ", estado=" + estado +
                ", En Uso=" + enUso +
                '}';
    }
}
