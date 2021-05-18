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
public class Atleta extends Persona{
    protected boolean Capacitado;
    public Atleta(){
    
    }

    public Atleta(boolean Capacitado, String Nombre, String Genero, int Edad, double Peso) {
        super(Nombre, Genero, Edad, Peso);
        this.Capacitado = Capacitado;
    }
    
    
    public String Entrenar(){
        
    return "Accion de entrenar";
    }
    
    

    @Override
    public String Caminar() {
        return "Accion de Caminar";
    }

    @Override
    public String Respirar() {
       return "Accion de Respirar";
    }

    @Override
    public String Comer() {
        return "Accion de Ingerir Alimentos Saludable";
    }

    @Override
    public String Dormir() {
        return "A mimir";
    }
    
}
