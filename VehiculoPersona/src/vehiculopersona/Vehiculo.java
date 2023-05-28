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
public class Vehiculo {
    private int patente;
    private String marca;
    private String modelo;
    private String color;
    private float valor;
    
    Scanner entrada = new Scanner(System.in);
    
    //constructor
    public Vehiculo(){
        this.patente =0;
        this.marca = "";
        this.modelo = "";
        this.color = "";
        this.valor = 0;
    }
    
    public Vehiculo(int patente, String marca, String modelo, String color, float valor) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.valor = valor;
    }

    public int getPatente() {
        return patente;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public float getValor() {
        return valor;
    }

    public Scanner getEntrada() {
        return entrada;
    }

    public void setPatente(int patente) {
        this.patente = patente;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void setEntrada(Scanner entrada) {
        this.entrada = entrada;
    }
    
    
    
    //Poner los metodos getter y setter del clas caracteristicas d auto 
    
    public void leerDatos() {
        System.out.print("Ingrese la patente: ");
        setPatente(entrada.nextInt());
        
        System.out.print("Ingrese la marca:  ");
        setMarca(entrada.nextLine()); 
        
        System.out.print("Ingrese el modelo:   ");
        setModelo(entrada.nextLine());         
        
        
        System.out.print("Ingrese el color:   ");
        setColor(entrada.nextLine());         

        System.out.print("Ingrese el valor:    ");
        setValor(entrada.nextFloat());         
        
        
       // scanner.nextLine(); // Limpiar el buffer del Scanner
    }
    public void mostrarDatos() {
        System.out.println("Patente: " + getPatente());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Color: " + getColor());
        System.out.println("Valor: " + getValor());        
        
    }
    public float calcularImpuesto() {
        return (float) (getValor() * 0.03);
    }
}
