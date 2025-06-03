public class EmpleadoAdministrativo extends Persona{
    private String cargo;
    private String horarioTrabajo;
    private double salario;

    public EmpleadoAdministrativo(){
        super();
        this.cargo = "Desconocido";
        this.horarioTrabajo = "Desconocido";
        this.salario = 0;
    }
    public EmpleadoAdministrativo(String nombre, String apellido, String numeroIdentificacion,
                                  int edad, String direccion, String telefono,
                                  String cargo, String horarioTrabajo, double salario){
        super();
        this.setCargo(cargo);
        this.setHorarioTrabajo(horarioTrabajo);
        this.setSalario(salario);
    }

    public String getCargo(){
        return cargo;
    }
    public String getHorarioTrabajo(){
        return horarioTrabajo;
    }
    public double getSalario(){
        return salario;
    }

    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    public void setHorarioTrabajo(String horarioTrabajo){
        this.horarioTrabajo = horarioTrabajo;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }

    public void administrar(){
        System.out.println("El empleado "+getNombre()+" "+getApellido()+" está realizando tareas adminisrativas.");
    }
    @Override public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Cargo :"+this.getCargo());
        System.out.println("Horario de trabajo :"+this.getHorarioTrabajo());
        System.out.println("Salario :"+this.getSalario());
    }
}
