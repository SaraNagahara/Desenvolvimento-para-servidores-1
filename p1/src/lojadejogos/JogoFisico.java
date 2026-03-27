/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lojadejogos;

/**
 *
 * @author saras
 */
public class JogoFisico extends Jogo{
    private int qtdEstoque;

    public int getQtdEstoque() {
        return qtdEstoque;
    }
    
    public void setQtdEstoque(int qtdEstoque) {
    this.qtdEstoque = qtdEstoque;
    }
    
   public void vender(int quantidade) {
    if (quantidade <= qtdEstoque) {
        qtdEstoque -= quantidade;
        System.out.println("Venda realizada com sucesso!");
    } else {
        System.out.println("Estoque insuficiente!");
    }
}
    
    
   @Override
public void mostrarDados() {
    super.mostrarDados();
    System.out.println("Estoque: " + qtdEstoque);
}
}
