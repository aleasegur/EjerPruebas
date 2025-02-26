package POO.Practica1;

public class Coche extends Vehiculo {
    private int ruedas,plazas;

    public Coche() {
        super();
        ruedas=0;
        plazas=0;
    }

    public Coche(String marca, String modelo, String matricula, int year, Estado estado, boolean enUso, int ruedas, int plazas) throws Exception {
        super(marca, modelo, matricula, year, estado, enUso);
        if (checkNum(ruedas) && checkNum(plazas)) {
            this.ruedas = ruedas;
            this.plazas = plazas;
        }
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas)throws Exception {
        if (checkNum(ruedas)) {
            this.ruedas = ruedas;
        }
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas)throws Exception {
        if (checkNum(plazas)){
        this.plazas = plazas;
        }
    }

    @Override
    public String toString() {
        return "Coche{" +
                "ruedas=" + ruedas +
                ", plazas=" + plazas +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", matricula='" + matricula + '\'' +
                ", año=" + year +
                ", estado=" + estado +
                ", En Uso=" + enUso +
                '}';
    }
}
