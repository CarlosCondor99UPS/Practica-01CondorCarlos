/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.main;

import ec.edu.ups.clases.Bebida;
import ec.edu.ups.clases.Cliente;
import ec.edu.ups.clases.Empleado;
import ec.edu.ups.clases.Mesa;
import ec.edu.ups.clases.PlatoComida;
import java.util.Scanner;

/**
 *
 * @author Carlos Condor
 * @version 8.2
 */
public class Principal {

    public static void main(String[] args) {
        //Instancia de la clase scanner para leer datos del teclado
        Scanner sc = new Scanner(System.in);
        //Declaracion de una variable para las opciones del menu
        int opcion = 0;
        //Bucle para que se repita el Menu
        do {
            //Salida del menu
            System.out.println("******************MENU*******************");
            System.out.println("* 1. Crear un objeto de tipo Bebida");
            System.out.println("* 2. Crear un objeto de tipo Cliente");
            System.out.println("* 3. Crear un objeto de tipo Empleado");
            System.out.println("* 4. Crear un objeto de tipo Mesa");
            System.out.println("* 5. Crear un objeto de tipo PlatoComida");
            System.out.println("* 6. SALIR");
            System.out.println("******************************************");
            //Lectura de la opcion del usuario
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    //Ingreso de datos del teclado 
                    System.out.println("** OBJETO BEBIDA **");
                    System.out.println("* Ingrese el nombre de la Bebida");
                    String nombreBebida = sc.next();
                    System.out.println("* Ingrese el tipo de Bebida");
                    String tipoBebida = sc.next();
                    System.out.println("* Ingrese el valor de la bebida");
                    double precioBebida = sc.nextDouble();

                    //Setear los datos ingresados
                    Bebida bebida1 = new Bebida();
                    bebida1.setNombre(nombreBebida);
                    bebida1.setPrecio(precioBebida);
                    bebida1.setTipo(tipoBebida);

                    //Mostrar los datos ingresados y ya seteados
                    System.out.println("** Objeto CREADO **");
                    System.out.println("Nombre: " + bebida1.getNombre());
                    System.out.println("Tipo: " + bebida1.getTipo());
                    System.out.println("Valor: " + bebida1.getPrecio());
                    System.out.println(bebida1.toString());
                    break;
                case 2:
                    //Ingreso de datos del teclado 
                    System.out.println("** OBJETO CLIENTE **");
                    System.out.println("* Ingrese el nombre del Cliente");
                    String nombreCliente = sc.next();
                    System.out.println("* Ingrese el numero de Cedula del Cliente");
                    String cedulaCliente = sc.next();
                    System.out.println("* Ingrese la membresia SI/NO");
                    String membresia = sc.next();
                    boolean membresiaCliente;
                    //If para definir variable boolean como true o false
                    if (membresia.equalsIgnoreCase("si")) {
                        membresiaCliente = true;
                    } else {
                        membresiaCliente = false;
                    }

                    //Setear los datos ingresados
                    Cliente cliente1 = new Cliente();
                    cliente1.setCedula(cedulaCliente);
                    cliente1.setMembresia(membresiaCliente);
                    cliente1.setNombre(nombreCliente);

                    //Mostrar los datos ingresados y ya seteados
                    System.out.println("** Objeto CREADO **");
                    System.out.println("Nombre: " + cliente1.getNombre());
                    System.out.println("Cedula: " + cliente1.getCedula());
                    System.out.println("Membresia: " + cliente1.isMembresia());
                    System.out.println(cliente1.toString());
                    break;
                case 3:
                    //Ingreso de datos del teclado 
                    System.out.println("** OBJETO EMPLEADO **");
                    System.out.println("* Ingrese el nombre del Empleado");
                    String nombreEmpleado = sc.next();
                    System.out.println("* Ingrese el numero de Cedula del Empleado");
                    String cedulaEmpleado = sc.next();
                    System.out.println("* Ingrese el cargo");
                    String cargoEmpleado = sc.next();

                    //Setear los datos ingresados
                    Empleado empleado1 = new Empleado();
                    empleado1.setCargo(cargoEmpleado);
                    empleado1.setCedula(cedulaEmpleado);
                    empleado1.setNombre(nombreEmpleado);

                    //Mostrar los datos ingresados y ya seteados
                    System.out.println("** Objeto CREADO **");
                    System.out.println("Nombre: " + empleado1.getNombre());
                    System.out.println("Cedula: " + empleado1.getCedula());
                    System.out.println("Cargo: " + empleado1.getCargo());
                    System.out.println(empleado1.toString());
                    break;
                case 4:
                    //Ingreso de datos del teclado 
                    System.out.println("** Objeto MESA **");
                    System.out.println("* Ingrese el numero de la mesa");
                    int numeroMesa = sc.nextInt();
                    System.out.println("* Ingrese el tamano GRANDE/PEQUENA");
                    String tamanoMesa = sc.next();
                    System.out.println("* Ingrese si esta ocupado SI/NO");
                    String ocupado = sc.next();
                    boolean ocupadoMesa;
                    //If para definir variable boolean como true o false
                    if (ocupado.equalsIgnoreCase("si")) {
                        ocupadoMesa = true;
                    } else {
                        ocupadoMesa = false;
                    }

                    //Setear los datos ingresados
                    Mesa mesa1 = new Mesa();
                    mesa1.setNumero(numeroMesa);
                    mesa1.setOcupado(ocupadoMesa);
                    mesa1.setTamano(tamanoMesa);

                    //Mostrar los datos ingresados y ya seteados
                    System.out.println("** Objeto CREADO **");
                    System.out.println("Numero: " + mesa1.getNumero());
                    System.out.println("Tamano: " + mesa1.getTamano());
                    System.out.println("Ocupada: " + mesa1.isOcupado());
                    System.out.println(mesa1.toString());

                    break;
                case 5:
                    //Ingreso de datos del teclado 
                    System.out.println("** Objeto PlatoComida");
                    System.out.println("* Ingrese el nombre del plato de comida");
                    String nombrePlato = sc.next();
                    System.out.println("* Ingrese el contenido del plato de comida");
                    String contenidoPlato = sc.next();
                    System.out.println("* Ingrese el precio del plato de comida");
                    double precioPlato = sc.nextDouble();

                    //Setear los datos ingresados
                    PlatoComida plato1 = new PlatoComida();
                    plato1.setNombre(nombrePlato);
                    plato1.setPrecio(precioPlato);
                    plato1.setContenido(contenidoPlato);

                    //Mostrar los datos ingresados y ya seteados
                    System.out.println("** Objeto CREADO **");
                    System.out.println("Nombre: " + plato1.getNombre());
                    System.out.println("Contenido: " + plato1.getPrecio());
                    System.out.println("Precio: " + plato1.getPrecio());
                    System.out.println(plato1.toString());
                    break;
                case 6:
                    //Finaliza el programa
                    System.exit(0);
                    break;
            }
            //Final del bucle
        } while (opcion != 7);
    }
}
