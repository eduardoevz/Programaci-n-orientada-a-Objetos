public class App {
    public static void main(String[] args) throws Exception {
     Empleado [] empleados = new Empleado[2];
        empleados[0] = new EmpleadoTiempoCompleto("juan", "00123", 48000);
        empleados[1] = new EmpleadoMedioTiempo("pedro", "00456", 10, 20);


        for (Empleado empleado : empleados){
            System.out.println("Empleado: " + empleado.getnombre() + ",salarioMensual $ " +empleado.calcularSalario());        }
     }

    }

