/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lavaderodevehículos;

import java.util.Scanner;

/**
 *
 * @author Grego
 */
public class LavaderoDeVehículos {


    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
        
        Lavadero Lav = new Lavadero();
        
        
        int op=9;
        do{
            System.out.println("----------------------------");
            mostrarOpciones();
            System.out.println("ingrese opcion :");
            op=entrada.nextInt();
            switch(op){
                case 1: Lav.registrarCliente();
                break;
                case 2: Lav.CargarSaldo();
                break;
                case 3: Lav.solicitarServicio();
                break;
                case 4: Lav.UltimaTiketComprobante();
                case 0 : break;
            }
        }while(op!=0);
        System.out.println("----------------------------");
        
        
    }

    private static void mostrarOpciones() {
        System.out.println("ingreso al Lavadero de GREGORIO ! ");
        System.out.println("1-Registre nuevo Cliente");
        System.out.println("2-Cargar Saldo en la cuenta");
        System.out.println("3-Usar Servicio");
        System.out.println("4-Mostrar ultimo tiket ");        
        System.out.println("0-Salir");
    }




    
}
