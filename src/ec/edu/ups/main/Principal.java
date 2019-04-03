/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.main;

import ec.edu.ups.clases.Bebida;
import ec.edu.ups.clases.Cliente;
import ec.edu.ups.clases.Empleado;
import java.util.Scanner;

/**
 *
 * @author tians
 */
public class Principal {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int opcion=0;
        do {
            System.out.println("******************MENU*******************");
            System.out.println("* 1. Crear un objeto de tipo Bebida");
            System.out.println("* 2. Crear un objeto de tipo Cliente");
            System.out.println("* 3. Crear un objeto de tipo Empleado");
            System.out.println("* 4. Crear un objeto de tipo Mesa");
            System.out.println("* 5. Crear un objeto de tipo PlatoComida");
            System.out.println("* 6. SALIR");
            System.out.println("******************************************");
            opcion=sc.nextInt();
            switch (opcion){
                case 1:
                    
                    System.out.println("** OBJETO BEBIDA **");
                    System.out.println("* Ingrese el nombre de la Bebida");
                    String nombreBebida=sc.next();
                    System.out.println("* Ingrese el tipo de Bebida");
                    String tipoBebida=sc.next();
                    System.out.println("* Ingrese el valir de la bebida");
                    double precioBebida=sc.nextDouble();
                    
                    Bebida bebida1=new Bebida();
                    bebida1.setNombre(nombreBebida);
                    bebida1.setPrecio(precioBebida);
                    bebida1.setTipo(tipoBebida);
                    
                    System.out.println("** Objeto CREADO **");
                    System.out.println(bebida1.toString());
                    break;
                case 2:
                    System.out.println("** OBJETO CLIENTE **");
                    System.out.println("* Ingrese el nombre del Cliente");
                    String nombreCliente=sc.next();
                    System.out.println("* Ingrese el numero de Cedula del Cliente");
                    String cedulaCliente=sc.next();
                    System.out.println("* Ingrese la membresia SI/NO");
                    String membresia=sc.next();
                    boolean membresiaCliente;
                    if (membresia.equalsIgnoreCase("si"))
                        membresiaCliente=true;
                    else
                        membresiaCliente=false;
                    
                    Cliente cliente1=new Cliente();
                    cliente1.setCedula(cedulaCliente);
                    cliente1.setMembresia(membresiaCliente);
                    cliente1.setNombre(nombreCliente);
                    
                    System.out.println("** Objeto CREADO **");
                    System.out.println(cliente1.toString());
                    break;
                case 3:
                    System.out.println("** OBJETO EMPLEADO **");
                    System.out.println("* Ingrese el nombre del Empleado");
                    String nombreEmpleado=sc.next();
                    System.out.println("* Ingrese el numero de Cedula del Empleado");
                    String cedulaEmpleado=sc.next();
                    System.out.println("* Ingrese el cargo");
                    String cargoEmpleado=sc.next();
                    
                    
                    Empleado empleado1=new Empleado();
                    empleado1.setCargo(cargoEmpleado);
                    empleado1.setCedula(cedulaEmpleado);
                    empleado1.setNombre(nombreEmpleado);
                    
                    System.out.println("** Objeto CREADO **");
                    System.out.println(empleado1.toString());
                    break;
                case 4:
                    
                    break;
                    
            }
        }while (opcion!=6);
    }
}
