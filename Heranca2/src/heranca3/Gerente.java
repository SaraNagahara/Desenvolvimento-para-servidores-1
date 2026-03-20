/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca3;

/**
 *
 * @author PC
 */
public class Gerente extends Funcionario{
    
    private String usuario;
    private String senha;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    @Override
    public double calculaBonificacao(){
        return this.getSalario() + 0.6 + 100;
    }
    
    @Override
    public void mostraDados(){
        System.out.println("=================");
        System.out.println("GERENTE: ");
      super.mostraDados();
       System.out.println("Usuário: " + this.getUsuario());
       System.out.println("Senha: " + this.getSenha());
    }

    
}
