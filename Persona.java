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
        this.edad = edad;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
}
