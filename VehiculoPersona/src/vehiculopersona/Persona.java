/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculopersona;

import java.util.Scanner;

/**
 *
 * @author Grego
 */
public class Persona {
    
    private int dni;
    private String nombre;
    private String apellido;
    private Vehiculo auto;
    Scanner Ingreso = new Scanner(System.in);
    //constructor 
     public Persona(){
     dni=0;
     nombre="";
     apellido="";
     auto=null;
    }
    


    public Persona(int dni, String nombre, String apellido, Vehiculo auto) {
        //es el constructor
        
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.auto = auto;
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Vehiculo getAuto() {
        return auto;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setAuto(Vehiculo auto) {
        this.auto = auto;
    }
    
    
    
    
    public void leerDatos() {
       /* System.out.println("ingrese");
        setDni(ingreso.nextInt());
        auto = new Vehiculo(); 
        auto.leerDatos();
        */
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, ingrese los datos del dueño");
        System.out.print("DNI:");
        setDni(entrada.nextInt());
        System.out.print("Nombre:");
        setNombre(entrada.next());
        System.out.print("Apellido:");
        setApellido(entrada.next());
        setAuto(new Vehiculo());
        getAuto().leerDatos();
        
        
    }
    
    
    public void mostrarDatos() {
        System.out.println("Persona :"+getDni()+" marca de su auto es :"+auto.getMarca()  );
    }
    public void mostrarImpuestoVehiculo() {
        double impuesto = auto.calcularImpuesto() ;
        System.out.println("Impuesto anual del vehículo: " + impuesto);
    }
}

