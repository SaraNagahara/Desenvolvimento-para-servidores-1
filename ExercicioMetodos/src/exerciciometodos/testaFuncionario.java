/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciometodos;

/**
 *
 * @author saras
 */
public class testaFuncionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        funcionario f1 = new funcionario();
        
        f1.nome = "Mariana";
        f1.salario = 5000;
        f1.aumentaSalario(700);
        
        
        f1.mostrarDados();
        
        
    
        
        
        
    }
    
}
