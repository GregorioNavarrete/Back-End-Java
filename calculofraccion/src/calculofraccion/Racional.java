/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculofraccion;

import java.util.Scanner;

/**
 *
 * @author Grego
 */

public class Racional {
    private int num;
    private int den;
    Scanner ingreso=new Scanner(System.in);

    public Racional(){
        this.num=0;
        this.den=1;
    }
    
    
    public Racional(int num,int den){
        this.num = num;
        this.den =den;
    }

    public int getNum() {
        return num;
    }

    public int getDen() {
        return den;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setDen(int den) {
        this.den = den;
    }
    
    public void simplificar(int numerador,int denominador) {
        int mcd = calcularMCD(numerador, denominador);
        
        //Redusco los numeradores y denominadores 
        numerador = numerador/mcd;
        denominador = denominador/mcd;
        setNum(numerador);
        setDen(denominador);
    }

    private int calcularMCD(int a, int b) {
        //Calcular el maximo comun divisor , es mas facil que el minimo
        while (b != 0) {
            int aux = b;
            //veo si son multiplos 
            b = a % b;
            a = aux;
        }
        return a;
    }    
    public void ingresarFraccion(){
        System.out.println("ingrese numerador: ");
        setNum(ingreso.nextInt());
        System.out.println("ingrese denominador: ");
        setDen(ingreso.nextInt());
        
        //simplifico los racionales 
        simplificar(getNum(),getDen());
        
        System.out.println("La simplificacion es "+getNum() + "/" + getDen());

    }
    
    
    public Racional multiplicacion(Racional g){
        /*
        A=numA/denA
        B=numB/demB
        
        Res=(numA*numB)/(numB*numB)
        */
        Racional prod=new Racional();
        prod.setNum(getNum()*g.getNum());
        prod.setDen(getDen() * g.getDen());
        return prod;
    }


        public Racional divicion(Racional g){
        /*
        A=numA/denA
        B=numB/denB
        
        Res=(numA*denB)/(demB*numB)
        */
    
        Racional prod=new Racional();
        prod.setNum(getNum()*g.getDen());
        prod.setDen(getDen() * g.getNum());
        return prod;
    }


}
