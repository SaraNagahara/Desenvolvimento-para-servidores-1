/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package packageOrientacao;

/**
 *
 * @author saras
 */
public class TestaTudo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Agencia a1 = new Agencia();
        Cliente c1 = new Cliente();
        Conta co1 = new Conta();
        CartaoDeCredito cdc1 = new CartaoDeCredito();
        
        c1.codigo = 1;
        c1.nome = "Sara Romoli";
        a1.numero = 1234;
        
        co1.numero = 1234;
        co1.saldo = 1000;
        co1.limite = 500;
        
        cdc1.numero = 1111;
        cdc1.dataDeValidade = "01/01/2025";
        
        System.out.println("Agencia: " + a1.numero);
        System.out.println("Código Do Cliente: " + c1.codigo);
        System.out.println("Nome Do Cliente: " + c1.nome );
        System.out.println("Número da Conta do cliente: " + co1.numero);
        System.out.println("Saldo da conta do cliente: " + co1.saldo);
        System.out.println("Limite da conta do cliente: " + co1.limite);
        System.out.println("Número do cartão de crédito do cliente: " + cdc1.numero);
        System.out.println("Data de validade do cartão de crédito do cliente: " + cdc1.dataDeValidade);
    }
    
}
