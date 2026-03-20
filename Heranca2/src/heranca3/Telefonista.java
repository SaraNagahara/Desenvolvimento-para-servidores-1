/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca3;

/**
 *
 * @author PC
 */
public class Telefonista extends Funcionario {
    private int estacaoDeTrabalho;
    
    public int getEstacaoDeTrabalho(){
        return estacaoDeTrabalho;
    }
    
    public void setEstacaoDeTrabalho(int estacaoDeTrabalho){
        this.estacaoDeTrabalho = estacaoDeTrabalho;
    }
    
    @Override
    public void mostraDados(){
        System.out.println("=================");
        System.out.println("TELEFONISTA: ");
      super.mostraDados();
       System.out.println("Estação de trabalho: " + this.getEstacaoDeTrabalho());
    }
    
}
