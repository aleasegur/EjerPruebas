package POO.Practica1;

public class Vehiculo {
    //ESTADO="disponible","ocupado"
    protected String marca,modelo,matricula;
    protected int year;
    protected Estado estado;
    protected boolean enUso;
    protected int numMov;
    protected String[] movimientos;
    public Vehiculo(){
        marca="";
        modelo="";
        matricula="";
        year=0;
        estado=null;
        enUso=true;
    }

    public Vehiculo(String marca, String modelo, String matricula, int year, Estado estado,boolean enUso) throws Exception {
        this.marca = marca;
        this.modelo = modelo;
        if (checkNum(year) && checkMatricula(matricula)) {
            this.matricula = matricula;
            this.year = year;
        }
        this.estado = estado;
        this.enUso=enUso;
        this.numMov=0;
        this.movimientos=new String[100];
    }

    public String[] getMovimientos() {
        return movimientos;
    }

    public void registroMov(String mensaje){
        if (numMov<100){
            movimientos[numMov++]=mensaje;
        }else{
            System.out.println("Movimiento maximos permitidos");
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) throws Exception {
        if (checkMatricula(matricula)) {
            this.matricula = matricula;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) throws Exception {
        if (checkNum(year)) {
            this.year = year;
        }
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public boolean isEnUso() {
        return enUso;
    }

    public void setEnUso(boolean enUso) {
        this.enUso = enUso;
    }

    public static boolean checkMatricula(String matricula)throws Exception{
        if (matricula.length()!=7){
            throw new Exception("La matricuña debe tener 7 caracteres");
        }

        String numero=matricula.substring(0,4);
        if (!numero.matches("\\d{4}")){
            throw new Exception("Los primeros 4 caracteres deben ser numeros");
        }

        String letra=matricula.substring(3).toUpperCase();
        if (letra.matches("[A-Z]{3}")){
            throw new Exception("Los ultimos 3 caracteres deben ser letras");
        }
        return true;
    }

    public static boolean checkNum(int num)throws Exception{
        if (num>0){
            return true;
        }else{
            throw new Exception("El numero no debe ser negativo");
        }
    }

    public static boolean checkNum(double num)throws Exception{
        if (num>0){
            return true;
        }else{
            throw new Exception("El numero no debe ser negativo");
        }
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", matricula='" + matricula + '\'' +
                ", año=" + year +
                ", estado=" + estado +
                ", En Uso=" + enUso +
                '}';
    }
}
