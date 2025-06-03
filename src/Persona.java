public class Persona {
    private String nombre;
    private String apellido;
    private String numeroIdentificacion;
    private int edad;
    private String direccion;
    private String telefono;

    public Persona(){
        this.nombre="Desconodido";
        this.apellido="Desconocido";
        this.numeroIdentificacion="Desconocido";
        this.edad=0;
        this.direccion="Desconocida";
        this.telefono="Desconocido";
    }
    public Persona(String nombre, String apellido, String numeroIdentificacion, int edad, String direccion, String telefono){
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setNumeroIdentificacion(numeroIdentificacion);
        this.setEdad(edad);
        this.setDireccion(direccion);
        this.setTelefono(telefono);
    }

    //GETTERS
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public String getNumeroIdentificacion(){
        return numeroIdentificacion;
    }
    public int getEdad(){
        return edad;
    }
    public String getDireccion(){
        return direccion;
    }
    public String getTelefono(){
        return telefono;
    }

    //SETTERS
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setNumeroIdentificacion(String numeroIdentificacion){
        this.numeroIdentificacion = numeroIdentificacion;
    }
    public void setEdad(int edad){
        if(edad < 0){
            this.edad = edad;
        }
        else{
            System.out.println("Error, la edad no puede ser genativa");
            this.edad = 0;
        }

    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public void mostrarInformacion(){
        System.out.println("Nombre :"+this.getNombre());
        System.out.println("Apellido :"+this.getApellido());
        System.out.println("Numero de identificación :"+this.getNumeroIdentificacion());
        System.out.println("Edad :"+this.getEdad());
        System.out.println("Dirección :"+this.getDireccion());
        System.out.println("Teléfono :"+this.getTelefono());
    }

    public void saludar(){
        System.out.println("Hola, mi nombre es "+this.getNombre()+" "+this.getApellido());
    }
}
