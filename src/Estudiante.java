public class Estudiante extends Persona{
    private String matricula;
    private String carrera;
    private double promedio;

    public Estudiante(){
        super();
        this.matricula = "Desconocida";
        this.carrera = "Desconocida";
        this.promedio = 0;
    }
    public Estudiante(String nombre, String apellido,
                      String numeroIdentificacion, int edad,
                      String direccion, String telefono,
                      String matricula, String carrera, double promedio){
        super(nombre, apellido, numeroIdentificacion, edad, direccion, telefono);
        this.setMatricula(matricula);
        this.setCarrera(carrera);
        this.setPromedio(promedio);
    }


    public String getMatricula(){
        return matricula;
    }
    public String getCarrera(){
        return carrera;
    }
    public double getPromedio(){
        return promedio;
    }

    public void setMatricula(String matricula){
        if(matricula != null && !matricula.trim().isEmpty()){
            this.matricula = matricula;
        }
        else{
            System.out.println("Error, la matrícula no puede estar vacía.");
            this.matricula = "Desconocida";
        }
    }
    public void setCarrera(String carrera){
        if(carrera != null && !carrera.trim().isEmpty()){
            this.carrera = carrera;
        }
        else{
            System.out.println("Error, la carrera no puede estar vacía.");
            this.carrera = "Desconocida";
        }
    }
    public void setPromedio(double promedio){
        if(promedio > 0){
            this.promedio = promedio;
        }
        else{
            System.out.println("Error, el promedio no puede ser 0 o negativo.");
        }
    }

    public void estudiar(){
        System.out.println("El estudiante "+getNombre()+" "+getApellido()+" está estudiando "+this.getCarrera());
    }

    @Override public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Matrícula :"+this.getMatricula());
        System.out.println("Carrera :"+this.getCarrera());
        System.out.println("Promedio :"+this.getPromedio());
    }

}
