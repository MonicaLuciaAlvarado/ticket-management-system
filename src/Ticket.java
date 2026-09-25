import java.util.Date;

public class Ticket {

    // Atributos
    private static int cantidad = 0;
    private int id;
    private String descripcion;
    private String nombreCompleto;
    private Date fechaCreacion;
    private Date fechaResolucion;

    // Constructor
    public Ticket(String descripcion, String nombreCompleto) {
        cantidad++;
        id = cantidad;
        this.descripcion = descripcion;
        this.nombreCompleto = nombreCompleto;
        fechaCreacion = new Date();
        fechaResolucion = null;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public Date getFechaResolucion() {
        return fechaResolucion;
    }

    //Operaciones

    public void resolver() {
        fechaResolucion = new Date();
    }

    @Override
    public String toString() {
        return "\nID: " + id +
                "\nDescripción: " + descripcion +
                "\nNombre completo: " + nombreCompleto +
                "\nFecha de creación: " + fechaCreacion +
                "\nFecha de resolución: " + fechaResolucion + "\n";
    }

}
