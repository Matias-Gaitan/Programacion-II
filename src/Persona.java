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
        if(nombre != null && !nombre.isEmpty()){
            this.nombre = nombre;
        }
        else{
            System.out.println("Error, el nombre no puede estar vacío.");
            this.nombre = "Descnocido";
        }
    }
    public void setApellido(String apellido){
        if(apellido != null && !apellido.isEmpty()){
            this.apellido = apellido;
        }
        else{
            System.out.println("Error, el apellido no puede estar vacío.");
            this.apellido = "Desconocido";
        }
    }
    public void setNumeroIdentificacion(String numeroIdentificacion){
        if(numeroIdentificacion != null && !numeroIdentificacion.trim().isEmpty()){
            this.numeroIdentificacion = numeroIdentificacion;
        }
        else{
            System.out.println("Error, el número de identificacion no puede estar vacío.");
            this.numeroIdentificacion = "Desconocido";
        }
    }
    public void setEdad(int edad){
        if(edad > 0){
            this.edad = edad;
        }
        else{
            System.out.println("Error, la edad no puede ser 0 o negativa.");
            this.edad = 0;
        }

    }
    public void setDireccion(String direccion){
        if(direccion != null && !direccion.trim().isEmpty()){
            this.direccion = direccion;
        }
        else{
            System.out.println("Error, la dirección no puede estar vacía.");
            this.direccion = "Desconocida";
        }
    }
    public void setTelefono(String telefono){
        if(telefono != null && !telefono.trim().isEmpty()){
            this.telefono = telefono;
        }
        else{
            System.out.println("Error, el teléfono no puede estar vacío.");
            this.telefono = "Desconocido";
        }
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
