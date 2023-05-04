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
public class Nacional extends Produto{
    protected double taxa;
    
    public Nacional(){
        super();
        taxa = 5;
    }

    public Nacional(String descricao, double valor, double imposto, double taxa) {
        super(descricao, valor);
        this.taxa = taxa;
    }
    
    @Override
    public double valorFinal() {        
        return valor + valor * taxa /100;
    }

    @Override
    public void exibir() {
        System.out.println("Descrição: "+descricao);
        System.out.println("Valor: R$ "+valor);
        System.out.println("Taxa: "+taxa+"%");
        System.out.println("Valor Final: R$ "+valorFinal());
    }
    
}
