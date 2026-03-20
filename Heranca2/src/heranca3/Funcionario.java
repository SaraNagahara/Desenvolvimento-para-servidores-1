/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca3;

/**
 *
 * @author PC
 */
public class Funcionario {
    private String nome;
    private double salario;

    public String getNome() {
        return nome;
    }
    
     public void setNome(String nome) {
        this.nome = nome;
    }


    public double getSalario() {
        return salario;
    }

   
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    public double calculaBonificacao(){
        return this.salario * 0.1;
    }
    
    public void mostraDados(){
        
        System.out.println("Nome: " + this.getNome());
        System.out.println("Salário: " + this.getSalario());
        System.out.println("Bonificação: " + this.calculaBonificacao());

    }
    
}
