/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

import java.util.Scanner;

/**
 *
 * @author lo397
 */
public class Operaciones {

    /**
     * @param args the command line arguments
     */
    Scanner sc = new Scanner (System.in);
        double resta, areaRec, areaTra,a,b,suma,c;
    
    public Operaciones(){
        
    
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public double getResta() {
        return resta;
    }

    public void setResta(double resta) {
        this.resta = resta;
    }

    public double getAreaRec() {
        return areaRec;
    }

    public void setAreaRec(double areaRec) {
        this.areaRec = areaRec;
    }

    public double getAreaTra() {
        return areaTra;
    }

    public void setAreaTra(double areaTra) {
        this.areaTra = areaTra;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getSuma() {
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    
    public void Registro(){
        System.out.println("--------- Circulo de estudio --------");
        System.out.println("-----Debes de ingresar dos datos ----");
        System.out.print("Ingresa el Valor de A (Lado A): ");
        a = sc.nextDouble();
        System.out.print("Ingresa el Valor de b (Lado B): ");
        b = sc.nextDouble();
    }
    public void Suma(){
         suma=a+b;
    }
    public void Resta(){
        resta=a-b;
    }
    
    public void AreaRectangulo(){
        areaRec = ((2*a) + (2*b));
    }
    
    public void AreaTrapeccio(){
        System.out.println("---- Area Trapecio ----");
        System.out.print("Ingresa dato C (Altura): ");
        c = sc.nextDouble();
        areaTra= (((a + b)/2) * c);
    }
    public void Impresion(){
        System.out.println("Resultado de la Suma es: "+suma);
        System.out.println("Resultado de la resta es: "+resta);
        System.out.println("");
        System.out.println("Lado a ="+a+ "  Lado b = "+b + "  Lado c = "+c);
        System.out.println("El area del rectangulo es "+areaRec + "u2");
        System.out.println("El Area del trapecio es: "+areaTra + "u2");
    }
    public void Feliz(){
        System.out.println("         \n               ");
        System.out.println("    ------------------      ");
        System.out.println("   ------0-------0-----         ");
        System.out.println("   --------------------            ");
        System.out.println("    ----nnnnnnnnnn----  ");
        System.out.println("     ---nnnnnnnnnn--- ");
        System.out.println("      -------------- ");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Operaciones operaciones = new Operaciones();
        
        operaciones.Registro();
        operaciones.Suma();
        operaciones.Resta();
        operaciones.AreaRectangulo();
        operaciones.AreaTrapeccio();
        operaciones.Impresion();
        operaciones.Feliz();
        
        
    }
    
    
}
