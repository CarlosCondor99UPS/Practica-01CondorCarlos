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
public class Bebida {

    //Variables Declaradas
    private String nombre;
    private String tipo;
    private double precio;

    //Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //Metodo toString para imprimir los datos
    @Override
    public String toString() {
        return "Bebida: " + "\nNombre: " + nombre + ",\nTipo: " + tipo + ",\nPrecio: " + precio;
    }

    //Metodos del diagrama de clase 
    public boolean anadirBebida(String nombre, String tipo, double precio) {
        return true;
    }

    public boolean eliminarBebida(String nombre) {
        return true;
    }

    public void cambiarPrecio(String nombre, int precio) {

    }
}
