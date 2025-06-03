public class Profesor extends Persona{
    private String departamento;
    private double salario;
    private int añosExperiencia;

    public Profesor(){
        this.departamento = "Desconocido";
        this.salario =0;
        this.añosExperiencia =0;
    }
    public Profesor(String nombre, String apellido, String numeroIdentificacion,
                    int edad, String direccion, String telefono,
                    String departamento, double salario, int añosExperiencia){
        super();
        this.setDepartamento(departamento);
        this.setSalario(salario);
        this.setAñosExperiencia(añosExperiencia);
    }

    public String getDepartamento(){
        return departamento;
    }
    public double getSalario(){
        return salario;
    }
    public int getAñosExperiencia(){
        return añosExperiencia;
    }

    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }
    public void setSalario(double salario){
        if(salario > 0){
            this.salario = salario;
        }
        else{
            System.out.println("Error, el salario no puede ser 0 o negativo.");
            this.salario = 0;
        }
    }
    public void setAñosExperiencia(int añosExperiencia){
        this.añosExperiencia = añosExperiencia;
    }


    public void enseñar(){
        System.out.println("El profesor "+getNombre()+" "+getApellido()+"está enseñando en el departamento de "+this.getDepartamento());
    }
    @Override public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Departamento :"+this.getDepartamento());
        System.out.println("Salario :"+this.getSalario());
        System.out.println("Años de experiencia :"+this.getAñosExperiencia());
    }
}
