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
public class Mesa {

    private int numero;
    private boolean ocupado;
    private String tamano;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "Mesa: " + "\nNumero: " + numero + "\nOcupado: " + ocupado + "\nTamano: " + tamano;
    }
    
    public boolean anadirMesa (int numero, boolean ocupado, String tamano){
        return true;
    }
    
    public boolean eliminarMesa (int numero){
        return true;
    }
    
    public void ocuparMesa (int numero){
        
    }
    
    public void desocuparMesa (int numero){
        
    }
}
