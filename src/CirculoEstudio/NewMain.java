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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Futbolista futbolista = new Futbolista();
        //Los metodos de la clase padre estan definidos con Return
        
        System.out.println(futbolista.Caminar());
        System.out.println(futbolista.Comer());
        futbolista.GolpearBalon();
        
        //Los metodos estan heredados de la clase padre
        Nadador nadador = new Nadador();
        System.out.println(nadador.Caminar());
        System.out.println(nadador.Respirar());
        System.out.println(nadador.Entrenar());
        
        
    }
    
}
