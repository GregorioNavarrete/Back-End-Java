/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package creacionobjetos;

/**
 *
 * @author Grego
 */
public class CreacionObjetos {

    public static void main(String[] args) {
        // Crear un objeto de tipo Objeto
        ObjetoJava objeto = new ObjetoJava(42, "Hola mundo");

        // Invocar a sus comportamientos
        
        
        System.out.println("atributo1 original =  " + objeto.getAtributo1());
        objeto.setAtributo1(100);
        System.out.println("atributo1 modificado =  " + objeto.getAtributo1());
        
        
        System.out.println("atributo2 original =  " + objeto.getAtributo2());
        objeto.setAtributo2("cambio");
        System.out.println("atributo2 modificado =  " + objeto.getAtributo2());
    }
}
