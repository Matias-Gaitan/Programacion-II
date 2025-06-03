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
        super();
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
        this.matricula = matricula;
    }
    public void setCarrera(String carrera){
        this.carrera = carrera;
    }
    public void setPromedio(double promedio){
        this.promedio = promedio;
    }

    public void estudiar(){
        System.out.println("El estudiante "+getNombre()+" "+getApellido()+" está estudiando "+this.getCarrera());
    }

    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Matrícula :"+this.getMatricula());
        System.out.println("Carrera :"+this.getCarrera());
        System.out.println("Promedio :"+this.getPromedio());
    }

}
