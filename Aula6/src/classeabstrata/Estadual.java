/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classeabstrata;

/**
 *
 * @author Danilo Medeiros Eler (FCT-UNESP) - https://daniloeler.github.io/
 */
public class Estadual extends Produto{

    public Estadual() {
        super();
    }

    public Estadual(String descricao, double valor) {
        super(descricao, valor);
    }
    
    
    
    public double valorFinal(){
        return valor;
    }
    
    public void exibir(){
        System.out.println("Descrição:"+descricao);
        System.out.println("Valor: R$"+valor);        
        System.out.println("Valor Final: R$"+valorFinal());
    }
}
