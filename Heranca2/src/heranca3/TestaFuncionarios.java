/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package heranca3;

/**
 *
 * @author PC
 */
public class TestaFuncionarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Gerente g = new Gerente();
        
        g.setNome("Gumball");
        g.setSalario(32450.22);
        
        g.setUsuario("Tubalhona");
        g.setSenha("batatinha");
        
        Telefonista t = new Telefonista();
        
        t.setNome("Mariana Nagahara");
        t.setSalario(10780.23);
        
        t.setEstacaoDeTrabalho(12);
        
        Secretaria s = new Secretaria();
        
        s.setNome("Sara Romoli");
        s.setSalario(6550.99);
        
        s.setRamal(6677);
        
        g.mostraDados();
        t.mostraDados();
        s.mostraDados();
        
       
        
        
    }
    
}
