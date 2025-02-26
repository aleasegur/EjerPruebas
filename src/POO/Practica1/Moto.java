package POO.Practica1;

public class Moto extends Vehiculo{
    private int cilindrada;

    public Moto() {
        super();
        cilindrada=0;
    }

    public Moto(String marca, String modelo, String matricula, int year, Estado estado, boolean enUso, int cilindrada) throws Exception {
        super(marca, modelo, matricula, year, estado, enUso);
        if (checkNum(cilindrada)) {
            this.cilindrada = cilindrada;
        }
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) throws Exception {
        if (checkNum(cilindrada)) {
            this.cilindrada = cilindrada;
        }
    }

    @Override
    public String toString() {
        return "Moto{" +
                "cilindrada=" + cilindrada +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", matricula='" + matricula + '\'' +
                ", año=" + year +
                ", estado=" + estado +
                ", En Uso=" + enUso +
                '}';
    }
}
