/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lojadejogos;

/**
 *
 * @author saras
 */
public class Jogo {
    private int codigo;
    private String nome;
    private String genero;
    private double preco;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public void aplicarDesconto(double percentual) {
    double desconto = preco * (percentual / 100);
    preco -= desconto;
}
    
    public void aplicarDesconto(double percentual, double valorMinimo) {
    double desconto = preco * (percentual / 100);

    if (desconto >= valorMinimo) {
        preco -= desconto;
    } else {
        System.out.println("Desconto não aplicado (abaixo do mínimo)");
    }
}

    
    public void mostrarDados(){
        System.out.println("=========== Dados do jogo ============");
        System.out.println("Código: " + getCodigo());
        System.out.println("Nome: " + getNome());
        System.out.println("Gênero: " + getGenero());
        System.out.println("Preço: " + getPreco());
      
    }
   
}

