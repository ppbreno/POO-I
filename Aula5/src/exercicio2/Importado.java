/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio2;

/**
 *
 * @author alunos
 */
public class Importado extends Produto{
    protected float taxa = 0.05f;
    private float taxaImportacao = 0.05f;

    public Importado() {
        super();
    }

    public Importado(String desc, float valor) {
        super(desc, valor);
    }

    public float getTaxa() {
        return taxa;
    }

    public float getTaxaImportacao() {
        return taxaImportacao;
    }

    @Override
    public float preco(){
        return valor + (valor * imposto) + (valor * taxa) + (valor * taxaImportacao);
    }
    
    @Override
    public void relatorio(){
        System.out.println("Descricao: "+desc);
        System.out.println("Valor: "+valor);
        System.out.println("Imposto: "+imposto);
        System.out.println("Taxa: "+taxa);
        System.out.println("Taxa Importacao: "+taxaImportacao);
        System.out.println("Preco final: "+preco());
    }   
}
