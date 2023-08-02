/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lavaderodevehículos;

/**
 *
 * @author Grego
 */
public class Vehiculo {
    private String patente;//no es estricto que sea un numero entero 
    private String marca;
    private String modelo;    
    
    //el constructor 
    public Vehiculo(String patente, String marca, String modelo) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
    }

    
    public String getPatente() {
        return patente;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public String getModelo() {
        return modelo;
    }  
    
}
