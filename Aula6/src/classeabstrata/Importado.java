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
public class Importado extends Produto{
    private double taxaImportacao;

    public Importado(double taxaImportacao) {
        this.taxaImportacao = taxaImportacao;
    }

    public Importado(String descricao, double valor, double taxaImportacao) {
        super(descricao, valor);
        this.taxaImportacao = taxaImportacao;
    }

    public double getTaxaImportacao() {
        return taxaImportacao;
    }

    public void setTaxaImportacao(double taxaImportacao) {
        this.taxaImportacao = taxaImportacao;
    }

    @Override
    public double valorFinal() {
        return valor + valor * taxaImportacao / 100.0f;
    }
    
}
