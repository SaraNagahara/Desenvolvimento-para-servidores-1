/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package packageOrientacao;

/**
 *
 * @author saras
 */
public class TestaConta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.numero = 1234;
        c1.saldo = 1000;
        c1.limite = 500;
        
        Conta c2 = new Conta();
        c2.numero = 5678;
        c2.saldo = 2000;
        c2.limite = 250;
        
        System.out.println(c1.numero);
        System.out.println(c1.saldo);
        System.out.println(c1.limite);
        
        System.out.println(c2.numero);
        System.out.println(c2.saldo);
        System.out.println(c2.limite);
    }
    
}
