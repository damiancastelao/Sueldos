package dam23.datos;

/**
 * Clase para los datos de los trabajadores
 */
public class Trabajador {
    /**
     * Nombre del trabajador
     */
    private String nombre;
    /**
     * Sueldo del trabajador
     */
    private Double sueldo;

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
