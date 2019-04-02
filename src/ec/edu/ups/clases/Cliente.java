package ec.edu.ups.clases;

/**
 *
 * @author tians
 * @version 8.2
 *
 */
public class Cliente {

    private String nombre;
    private String cedula;
    private boolean membresia;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public boolean isMembresia() {
        return membresia;
    }

    public void setMembresia(boolean membresia) {
        this.membresia = membresia;
    }

    @Override
    public String toString() {
        return "Cliente: " + "\nNombre: " + nombre + "\nCedula: " + cedula + "\nMembresia: " + membresia;
    }
    
    public boolean anadirCliente (String nombre, String cedula, boolean membresia){
        return true;
    }
    
    public boolean eliminarCliente (String cedula){
        return true;
    }
    
    public boolean iniciarMembresia (String cedula){
        return true;
    }
    
    public boolean eliminarMembresia(String cedula){
        return true;
    }
}
