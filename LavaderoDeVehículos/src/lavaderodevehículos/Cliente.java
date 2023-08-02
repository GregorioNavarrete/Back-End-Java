/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lavaderodevehículos;

/**
 *
 * @author Grego
 */
public class Cliente {
    //los atributos de forma encapsulada ? 
    private final String apellido;
    private String nombre;
    private String dni; //como solo es para comparar no afecta q sea estrig 
    private Vehiculo vehiculo;
    private float saldo;
    
    //no inicialiso ningun atributo "no se si es necesario"
    //El contructor del objeto
    public Cliente(String apellido, String nombre, String dni) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.saldo=0; //el saldo siempre comensara en cero, asta ser acreditado
    }    
    
    //lo metodos para modificar los atributos 
    public String getApellido() {
        return apellido;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getDni() {
        return dni;
    }
    public float getSaldo() {
        return saldo;
    }    
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    
    //solo pongo 2 seters , xq son los que voy a utilisar 
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    
    
    
}
