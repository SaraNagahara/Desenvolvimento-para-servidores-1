/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciometodos;

/**
 *
 * @author saras
 */
public class funcionario {
    String nome;
    int salario;
    
    void aumentaSalario (double aumentar){
        this.salario += aumentar;
    }
    
    void mostrarDados (){
        System.out.println(this.nome);
        System.out.println(this.salario);
    }
    
    
  
}
