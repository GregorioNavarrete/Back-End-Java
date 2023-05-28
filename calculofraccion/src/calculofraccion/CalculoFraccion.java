/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculofraccion;

import java.util.Scanner;


public class CalculoFraccion {
    Racional f,f1;
    Scanner entrada=new Scanner(System.in);
    
    public CalculoFraccion(){
        f=new Racional();
        f1=new Racional();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        CalculoFraccion c=new CalculoFraccion();
        c.menu();
    }
    
    public void menu(){
        //para el ciclo del menu 
        int op=9;
        do{
            mostrarOpciones();
            System.out.println("ingrese opcion :");
            op=entrada.nextInt();
            switch(op){
                case 1: ingresarFraccion();
                break;
                case 2: multiplicacion();
                break;
                case 3: divicion();
                break;
                case 0 : break;
            }
        }while(op!=0);
    }
    
    public void mostrarOpciones(){
        System.out.println("Calculo racional");
        System.out.println("1-ingresar racionales");
        System.out.println("2-Operar multiplicacion");
        System.out.println("3-Operar division");
        System.out.println("0-Salir");

    }
    public void ingresarFraccion() {
        System.out.println("Ingrese la primera fracción:");
        f.ingresarFraccion();

        System.out.println("Ingrese la segunda fracción:");
        f1.ingresarFraccion();
    }
    public void multiplicacion() {
        Racional resultado = f.multiplicacion(f1);
        System.out.println("Resultado de la multiplicación: " + resultado.getNum() + "/" + resultado.getDen());
    }

    public void divicion() {
        Racional resultado = f.divicion(f1);
        System.out.println("Resultado de la división: " + resultado.getNum() + "/" + resultado.getDen());
    }


}
