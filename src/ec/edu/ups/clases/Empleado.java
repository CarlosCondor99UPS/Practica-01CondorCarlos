/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 *
 * @author tians
 */
public class Empleado {

    private String nombre;
    private String cedula;
    private String cargo;

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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Empleado: " + "\nNombre: " + nombre + "\nCedula: " + cedula + "\nCargo: " + cargo;
    }
    
    public boolean anadirEmpleado (String nombre, String cedula, String cargo){
        return true;
    }
    
    public boolean eliminarCliente (String cedula){
        return true;
    }
    
    public boolean cambiarCargo (String nombre, String cargo){
        return true;
    }
     
}
