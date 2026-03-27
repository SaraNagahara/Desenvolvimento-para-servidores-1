/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package packageOrientacao;

/**
 *
 * @author saras
 */
public class TestaMetodosConta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta c = new Conta();
        
        c.deposita(1000);
        c.imprimeExtrato();
        
        c.saca(100);
        c.imprimeExtrato();
        
        double saldoDisponivel = c.consultaSaldoDisponivel();
        System.out.println("Saldo Disponível: " + saldoDisponivel);
    }
    
}
