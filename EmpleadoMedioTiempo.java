public class EmpleadoMedioTiempo extends Empleado {

    private double salarioPorHora;
    private int horasTrabajadasPorSemana;

    public EmpleadoMedioTiempo(String nombre, String numeroDeIdentificacion, double salarioPorHora, int horasTrabajadasPorSemana){
        super(nombre, numeroDeIdentificacion);
        this.salarioPorHora = salarioPorHora;
        this.horasTrabajadasPorSemana = horasTrabajadasPorSemana;
    }

    @Override 
    public double calcularSalario(){
        return salarioPorHora*horasTrabajadasPorSemana*4;
        
        //este es el salario mensual
    }

}
