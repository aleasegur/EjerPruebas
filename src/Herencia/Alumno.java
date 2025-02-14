package Herencia;

public class Alumno extends Persona{
    private int notas;
    private String clases;

    public Alumno(String name, int edad, int notas, String clases) {
        super(name, edad);
        this.notas = notas;
        this.clases = clases;
    }

    public Alumno(String name, int edad, int notas) {
        super(name, edad);
        this.notas = notas;
    }

    public int getNotas() {
        return notas;
    }

    public void setNotas(int notas) {
        this.notas = notas;
    }

    public String getClases() {
        return clases;
    }

    public void setClases(String clases) {
        this.clases = clases;
    }
}
