package logica;


public class Reserva {
    private int idReserva;
    private int idCliente;
    private String fechaReserva;
    private String fechaSalida;
    private int medioDePago;
    private int estadoDePago;
    private int estadoReserva;

    public Reserva(){
        idReserva =  0;
        fechaReserva = "???";
        fechaSalida = "???";
        medioDePago = 0;
        estadoDePago = 0;
        estadoReserva = 0;

    }
    public Reserva(int idReserva, int idCliente, String fechaReserva, String fechaSalida, int medioDePago,
                   int estadoDePago, int estadoReserva){
        setIdReserva(idReserva);
        setIdCliente(idCliente);
        setFechaReserva(fechaReserva);
        setFechaSalida(fechaSalida);
        setMedioDePago(medioDePago);
        setEstadoDePago(estadoDePago);
        setEstadoReserva(estadoReserva);
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }
    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }
    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
    public void setMedioDePago(int medioDePago) {
        this.medioDePago = medioDePago;
    }
    public void setEstadoDePago(int estadoDePago) {
        this.estadoDePago = estadoDePago;
    }
    public void setEstadoReserva(int estadoReserva) {
        this.estadoReserva = estadoReserva;
    }
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    //GETTERS

    public int getIdReserva() {
        return idReserva;
    }
    public String getFechaReserva() {
        return fechaReserva;
    }
    public String getFechaSalida() {
        return fechaSalida;
    }
    public int getMedioDePago() {
        return medioDePago;
    }
    public int getEstadoDePago() {
        return estadoDePago;
    }
    public int getEstadoReserva() {
        return estadoReserva;
    }
    public int getIdCliente() {
        return idCliente;
    }

    public void modificarReserva(int idReserva, String fechaReserva, String fechaSalida, int medioDePago,
                                 int estadoDePago, int estadoReserva){
        setIdReserva(idReserva);
        setFechaReserva(fechaReserva);
        setFechaSalida(fechaSalida);
        setMedioDePago(medioDePago);
        setEstadoDePago(estadoDePago);
        setEstadoReserva(estadoReserva);
    }
    public void cancelarReserva(){
        setEstadoReserva(4);//Suponiendo que un la tabla de estados, "cancelada" corresponde al id 4
    }
}
