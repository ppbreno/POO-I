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
public abstract class Produto {
    protected String descricao;
    protected double valor;

    public Produto() {
        valor = 0;
    }
    
    public Produto(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }
    
    public abstract double valorFinal();
    
    public void exibir(){
        System.out.println("Descrição: "+descricao);
        System.out.println("Valor: R$ "+valor);
        System.out.println("Valor Final: R$ "+valorFinal());
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
