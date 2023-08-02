/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lavaderodevehículos;

import java.time.LocalDateTime;

/**
 *
 * @author Grego
 */
public class Ticket {
    
    private String apellido;
    private String nombre;
    private String dni;
    private LocalDateTime fechaTransaccion;
    private float montoAcreditado;
    private float montoDisponible;
    private int numeroIdentificacion;
    private static int contadorIdentificacion = 1;
    
    //constructor
    public Ticket(String apellido, String nombre, String dni, LocalDateTime fechaTransaccion,float montoAcreditado, float montoDisponible) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.fechaTransaccion = fechaTransaccion;
        this.montoAcreditado = montoAcreditado;
        this.montoDisponible = montoDisponible;
        this.numeroIdentificacion = contadorIdentificacion++; //por defecto ya asigna este numero de identificacion 
    }
    
   public String getApellido() {
        return apellido;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getDni() {
        return dni;
    }
    
    public LocalDateTime getFechaTransaccion() {
        return fechaTransaccion;
    }
    
    public float getMontoAcreditado() {
        return montoAcreditado;
    }
    
    public float getMontoDisponible() {
        return montoDisponible;
    }
    
    public int getNumeroIdentificacion() {
        return numeroIdentificacion;
    }
    
}
