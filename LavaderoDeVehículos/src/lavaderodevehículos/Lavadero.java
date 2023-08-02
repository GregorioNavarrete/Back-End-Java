/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lavaderodevehículos;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Grego
 */
public class Lavadero {
    private List<Cliente> clientes;
    private List<Vehiculo> vehiculos;
    private List<Ticket> tickets;
    
    public Lavadero() {
        clientes = new ArrayList<>();
        vehiculos = new ArrayList<>();
        tickets = new ArrayList<>();
    }    
    public void registrarCliente(String apellido, String nombre, String dni, String patente, String marca, String modelo) {
        Cliente cliente = buscarClientePorDNI(dni);
        
        if (cliente == null) {
            //Si no estaba registrado , lo agrego a la lista clientes
            cliente = new Cliente(apellido, nombre, dni);
            clientes.add(cliente);
            
            Vehiculo vehiculo = buscarVehiculoPorPatente(patente);
            if (vehiculo == null) {
                //Si no estaba registrado , lo agrego a la lista Vehiculos
                vehiculo = new Vehiculo(patente, marca, modelo);
                vehiculos.add(vehiculo);//lo agrego a mi mista de veiculos del lavadero
                cliente.setVehiculo(vehiculo);//Relaciono la persona con su vehiculo !        
            }else{
                //Si la person esta ingresada y el vehiculo no, HACER la actualizacion y mandara la adavertencia 
                //Vehiculo vehiculo = buscarVehiculoPorPatente(nuevaPatente);
                
                
                //Aca no estoy chequeado que el auto exista, pero que sea de otro cliente
            
                System.out.println("Usted ya tenia Otro Aunto registrado, le fue actualizado el Auto oficial");
                vehiculo = new Vehiculo(patente, marca, modelo);
                vehiculos.add(vehiculo);
                cliente.setVehiculo(vehiculo);            
            }            
        }else{
            System.out.println("El Cliente ya esta registrado");
        }
    } 
    
    
    


    
    
    
    
    


    
 
    
    public void UltimaTiketComprobante() {
        
        Scanner entrada=new Scanner(System.in);        
        
        System.out.println("Ingrese DNI");
        String dni= entrada.next();  
        Cliente cliente = buscarClientePorDNI(dni);
        
        if (cliente != null) {
            Ticket ticket = buscarUltimoTicketCliente(dni);
            
            if (ticket != null) {
                System.out.println("Comprobante:");
                System.out.println("Apellido y Nombre: " + ticket.getApellido() + ", " + ticket.getNombre());
                System.out.println("DNI: " + ticket.getDni());
                System.out.println("Fecha de Transacción: " + ticket.getFechaTransaccion());
                System.out.println("Monto Acreditado: " + ticket.getMontoAcreditado());
                System.out.println("Monto Disponible en Cuenta: " + ticket.getMontoDisponible());
                System.out.println("Número de Identificación: " + ticket.getNumeroIdentificacion());
            }
        }
    }
    

    

    
    public Cliente buscarClientePorDNI(String dni) {
        for (Cliente cliente : clientes) {
            if (cliente.getDni().equals(dni)) {
                return cliente;
            }
        }
        return null;
    }
    
    private Vehiculo buscarVehiculoPorPatente(String patente) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getPatente().equals(patente)) {
                return vehiculo;
            }
        }
        return null;
    }
    
    private Ticket buscarUltimoTicketCliente(String dni) {
        for (int i = tickets.size() - 1; i >= 0; i--) {
            Ticket ticket = tickets.get(i);
            if (ticket.getDni().equals(dni)) {
                return ticket;
            }
        }
        return null;
    }
    
    private float CostoDelServicio(String tipoServicio) {
        /*
        supongo 2 servicios "Limpiesa completa" 100p "Limpiesa comun" 50p
        en 2 Periodos  "De dias "100p "de Noche" 200p
        */        
        if(tipoServicio=="1"){
           /* if(periodo=="1"){
                
            }else{
                
            }*/
           return 100;
        }
        if(tipoServicio=="2"){
            /*if(periodo=="2"){
                
            }else{
                
            }*/
            return 50;
        }
        
        
        // Realizar cálculos para determinar el monto acreditado
        // según el tipo de servicio y periodo
        return 0;
    }   

    
    
    
    
    
    //Pongo aca los las funciones del menu para no crear muchos " OBJETOS LAVADERO"
    void CargarSaldo() {
       
        Scanner entrada=new Scanner(System.in);        
        
        System.out.println("Ingrese DNI");
        String Dni= entrada.next();        
        Cliente cliente = buscarClientePorDNI(Dni);
        if(cliente!=null){
            System.out.println("Ingrese saldo");
            float sal= entrada.nextFloat();                               //Funciona ????????????
            cliente.setSaldo(sal);
        }else{
            System.out.println("El DNI no esta registrado, registrese");
        }        
    }

    void registrarCliente() {
        Scanner entrada=new Scanner(System.in);
        //Lavadero Lav = new Lavadero();                                          //creo que creo muchos objetos "lavadero"

        //String apellido, String nombre, String dni, String patente, String marca, String modelo;
        System.out.println("Ingrese Apellido");
        String Ape= entrada.next();
        System.out.println("Ingrese Nombre");
        String Nom= entrada.next();
        System.out.println("Ingrese DNI");
        String Dni= entrada.next();
        System.out.println("Ingrese Patente");
        String Paten= entrada.next();
        System.out.println("Ingrese Marca");
        String Marc= entrada.next();
        System.out.println("Ingrese Modelo");
        String Mod= entrada.next();
        //Crea el cliente y el auto asignado
        //si ingresa con una aunto que no este registrado por el Lavadero, se Re asigna un auto 
        registrarCliente(Ape,Nom,Dni,Paten,Marc,Mod);    
    }
    
    
    public void solicitarServicio() {
        //el cliente puede tener saldo negativo
        //String dni, String tipoServicio, String periodo, float monto
        //La condicion de la hora me complico mucho , no lo puse nada

        
        
        Scanner entrada=new Scanner(System.in);        
        System.out.println("Ingrese DNI");
        String dni= entrada.next();


        //System.out.println("Ingrese monto");             no es necesario ingresar !
        //Float monto= entrada.nextFloat();
        
        System.out.println("Seleccione el tipo Servicio");
            System.out.println("---1)Limpiesa completa");
            System.out.println("---2)Limpiesa comun");        
        String aux = entrada.next();
        LocalDateTime fechaTransaccion = LocalDateTime.now();
        System.out.println("Su periodo ingresado es : " +fechaTransaccion );
 
        
        
        Cliente cliente = buscarClientePorDNI(dni);
        if (cliente != null) {
            //LocalDateTime fechaTransaccion = LocalDateTime.now();
            float montoCosto = CostoDelServicio(aux);
            float montoDisponible = cliente.getSaldo() - montoCosto;
            
            Ticket ticket = new Ticket(cliente.getApellido(), cliente.getNombre(), cliente.getDni(),
                                       fechaTransaccion, montoCosto, montoDisponible);
            tickets.add(ticket);//Lo agrgo al listado de Tikets que tiene el LAVADERO
            
            cliente.setSaldo(montoDisponible);//actualisamos el saldo del
        }
    }
}

    
