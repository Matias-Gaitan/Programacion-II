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
        super(nombre, apellido, numeroIdentificacion, edad, direccion, telefono);
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
        if(cargo != null && !cargo.isEmpty()){
            this.cargo = cargo;
        }
        else{
            System.out.println("Error, el cargo no puede estar vacío.");
            this.cargo = "Desconocido";
        }
    }
    public void setHorarioTrabajo(String horarioTrabajo){
        if(horarioTrabajo != null && !horarioTrabajo.isEmpty()){
            this.horarioTrabajo = horarioTrabajo;
        }
        else{
            System.out.println("Error, el horario de trabajo no puede estar vacío.");
        }
    }
    public void setSalario(double salario){
        if(salario >0){
            this.salario = salario;
        }
        else{
            System.out.println("Error, el salario no puede ser 0 o negativo.");
            this.salario = 0;
        }
    }

    public void administrar(){
        System.out.println("El empleado "+getNombre()+" "+getApellido()+" está realizando tareas adminisrativas.");
    }
    @Override public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Cargo :"+this.getCargo());
        System.out.println("Horario de trabajo :"+this.getHorarioTrabajo());
        System.out.println("Salario : $"+this.getSalario());
    }
}
