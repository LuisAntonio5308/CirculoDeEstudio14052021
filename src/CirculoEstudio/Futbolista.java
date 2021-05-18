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
public class Futbolista extends Atleta{
    private boolean Saludable;

    public Futbolista(){
        
    }
    public Futbolista(boolean Saludable, boolean Capacitado, String Nombre, String Genero, int Edad, double Peso) {
        super(Capacitado, Nombre, Genero, Edad, Peso);
        this.Saludable = Saludable;
    }

    
    
    
    public void GolpearBalon(){
        System.out.println("Golpear Balon");
        
    }
    
    public void EntrenarPiernas(){
        System.out.println("Entrenar las piernas");
    }
    
    public void CorrerRapido(){
        System.out.println("Accion de correr rapido");
    }

    @Override
    public String Dormir() {
        return "Dormir Futbolista"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String Comer() {
        return "Comer Futbolistra"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String Respirar() {
        
        return "Respirar Futbolista"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String Caminar() {
        return "Caminar Futbolista"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String Entrenar() {
        return "Entrenar futbolista"; //To change body of generated methods, choose Tools | Templates.
    }
    
}
