/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package packageOrientacao;

/**
 *
 * @author saras
 */
public class TestaCartaoDeCredito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CartaoDeCredito cdc1 = new CartaoDeCredito();
        
        cdc1.numero = 1111;
        cdc1.dataDeValidade = "01/01/2025";
        
        CartaoDeCredito cdc2 = new CartaoDeCredito();
        
        cdc2.numero = 2222;
        cdc2.dataDeValidade = "01/01/2027";
        
        System.out.println(cdc1.numero);
        System.out.println(cdc2.dataDeValidade);
        
        System.out.println(cdc2.numero);
        System.out.println(cdc2.dataDeValidade);
    }
    
}
