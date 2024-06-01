public class EmpleadoTiempoCompleto extends Empleado{

    private double salarioAnual;

    public EmpleadoTiempoCompleto(String nombre, String numeroDeIdentificacion, double salarioAnual){
        super(nombre, numeroDeIdentificacion);
        this.salarioAnual = salarioAnual;
    }

    @Override
    public double calcularSalario(){
        return salarioAnual/12;

        // este es el salario mensual
    }

}
