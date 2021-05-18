/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CirculoEstudio;

/**
 *
 * @author lo397
 */
public abstract class Persona {
    protected String Nombre, Genero;
    protected int Edad;
    protected double Peso;
    public Persona(){
    
    }

    public Persona(String Nombre, String Genero, int Edad, double Peso) {
        this.Nombre = Nombre;
        this.Genero = Genero;
        this.Edad = Edad;
        this.Peso = Peso;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }
    
    //Metodos
    public abstract String Caminar();
    public abstract String Respirar();
    public abstract String Comer();
    public abstract String Dormir();
    
    
    
}
