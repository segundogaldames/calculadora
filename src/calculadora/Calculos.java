/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author danie
 */
public class Calculos {
    
    private int a, b, c;   //declaracion de atributos

    //metodo constructor en java tiene el mismo nombre que la clase
    public Calculos(int a, int b, int c) {
        //asignacion de valores a atributos de la clase
        this.a = a;
        this.b = b;
        this.c = c;
        
    }

    //metodo getter que devuelve un numero entero
    public int getA() {
        return a;
    }

    //metodo setter que no devuelve datos
    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    
    //metodo mixto
    public int sumita(int a, int b){
        c=0;
        c=a+b;
        return c;
    }
    
}
