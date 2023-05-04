/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio1;

/**
 *
 * @author alunos
 */
public class PeçaImp extends Peça{
    private float taxa_imp;
    private float taxa_frete;
    
    public PeçaImp(){
        super();
    }

    public PeçaImp(String nome, float custo, float lucro, float taxa_imp, float taxa_frete) {
        super(nome, custo, lucro);
        this.taxa_imp = taxa_imp;
        this.taxa_frete = taxa_frete;
    }

    public float getTaxa_imp() {
        return taxa_imp;
    }

    public void setTaxa_imp(float taxa_imp) {
        this.taxa_imp = taxa_imp;
    }

    public float getTaxa_frete() {
        return taxa_frete;
    }

    public void setTaxa_frete(float taxa_frete) {
        this.taxa_frete = taxa_frete;
    }
    
    @Override
    public float preco(){
        return custo + lucro + taxa_imp + taxa_frete;
    }
    
    @Override
    public void exibir(){
        System.out.println("Nome: "+nome);
        System.out.println("Custo: "+custo);
        System.out.println("Lucro: "+lucro);
        System.out.println("Taxa Importacao: "+taxa_imp);
        System.out.println("Taxa Frete: "+taxa_frete);
    }
}
