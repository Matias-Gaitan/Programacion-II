package logica;

public class Cliente {
    private int idCliente;
    private String nombre;
    private String apellido;
    private int tipoDoc;
    private int numeroDoc;
    private String sexo;
    private boolean activo;

    //CONSTRUCTORES
    public Cliente(){
        idCliente =0;
        nombre = "???";
        apellido = "???";
        tipoDoc = 0;
        numeroDoc = 0;
        sexo = "???";
        activo = true;
    }
    //En el constructor parametrizado no cuento al atributo activo ya que si se registra un nuevo cliente es evidente que dicho valor será true.
    //Por lo mismo de antes tampoco hay un setter de activo.
    public Cliente(int idCliente, String nombre, String apellido, int tipoDoc,
                   int numeroDoc, String sexo){
        setIdCliente(idCliente);
        setNombre(nombre);
        setApellido(apellido);
        setTipoDoc(tipoDoc);
        setNumeroDoc(numeroDoc);
        setSexo(sexo);
    }

    //SETTERS

    //Hago el setter del id porque es un ejercicio sin persistencia, pero supongo que no tendría sentido si el id es autoincremental
    public void setIdCliente(int idCliente){
        this.idCliente = idCliente;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setTipoDoc(int tipoDoc) {
        this.tipoDoc = tipoDoc;
    }
    public void setNumeroDoc(int numeroDoc) {
        this.numeroDoc = numeroDoc;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    //GETTERS
    public int getIdCliente() {
        return idCliente;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public int getTipoDoc() {
        return tipoDoc;
    }
    public int getNumeroDoc() {
        return numeroDoc;
    }
    public String getSexo() {
        return sexo;
    }
    public boolean getActivo(){
        return activo;
    }

    public void darDeBaja(){
        activo = false;
    }
    public void realizarReserva(){

    }
}

