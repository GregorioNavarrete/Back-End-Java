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
    
    public void ingresarFraccion(){
        System.out.println("ingrese numerador: ");
        setNum(ingreso.nextInt());
        System.out.println("ingrese denominador: ");
        setDen(ingreso.nextInt());
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
