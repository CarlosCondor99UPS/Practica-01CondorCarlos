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
public class PlatoComida {

    //Variables Declaradas
    private String nombre;
    private double precio;
    private String contenido;

    //Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    //Metodo toString para imprimir los datos
    @Override
    public String toString() {
        return "PlatoComida: " + "\nNombre: " + nombre + "\nPrecio: " + precio + "\nContenido: " + contenido;
    }

    //Metodos del diagrama de clase 
    public boolean anadirPlatoComida(String nombre, double precio, String contenido) {
        return true;
    }

    public boolean eliminarPlatoComida(String nombre) {
        return true;
    }

    public void cambiarPrecio(String nombre, double precio) {

    }
}
