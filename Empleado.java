abstract class Empleado {
    private String nombre;
    private String numeroDeIdentificacion;


    public Empleado(String nombre, String numeroDeIdentificacion){
        this.nombre = nombre;
        this.numeroDeIdentificacion = numeroDeIdentificacion;
    }
    public String getnombre (){
        return nombre;
    }

    public String getnumeroDeIdentificacion (){
        return numeroDeIdentificacion;
    }

    public abstract double calcularSalario();

    }




