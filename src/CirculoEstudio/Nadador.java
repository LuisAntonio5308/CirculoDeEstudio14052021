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
public class Nadador extends Atleta{
    private boolean Saludable;
    
    public Nadador(){
    
    }
    
    public Nadador(boolean Capacitado, String Nombre, String Genero, int Edad, double Peso, boolean Saludable) {
        super(Capacitado, Nombre, Genero, Edad, Peso);
      this.Saludable = Saludable;
    }

    @Override
    public String Dormir() {
        return super.Dormir(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String Comer() {
        return super.Comer(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String Respirar() {
        return super.Respirar(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String Caminar() {
        return super.Caminar(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String Entrenar() {
        return super.Entrenar(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
