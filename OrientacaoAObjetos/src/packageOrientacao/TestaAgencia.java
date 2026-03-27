/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package packageOrientacao;

/**
 *
 * @author saras
 */
public class TestaAgencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Agencia a1 = new Agencia();
        a1.numero = 1234;
        
        Agencia a2 = new Agencia();
        a2.numero = 5678;
        
        System.out.println(a1.numero);
        System.out.println(a2.numero);
        
    }
    
}
