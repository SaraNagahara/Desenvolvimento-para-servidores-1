/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca3;

/**
 *
 * @author PC
 */
public class Secretaria extends Funcionario {
    private int ramal;

    public int getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }
    
    @Override
    public void mostraDados(){
        System.out.println("=================");
        System.out.println("SECRETARIA: ");
      super.mostraDados();
       System.out.println("Ramal: " + this.getRamal());
    }
    
    
}
