/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio3;

/**
 *
 * @author alunos
 */
public class Nacional {
    private String descricao;
    private float valor;
    private float imposto = 0.1f;
    private float taxa = 0.05f;

    public Nacional() {
    }

    public Nacional(String descricao, float valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getImposto() {
        return imposto;
    }

    public void setImposto(float imposto) {
        this.imposto = imposto;
    }

    public float getTaxa() {
        return taxa;
    }

    public void setTaxa(float taxa) {
        this.taxa = taxa;
    }
    
    public float valor_final(){
        return valor + (valor * imposto) + (valor * taxa);
    }
    
    public void exibir(){
        System.out.println("Descricao: "+descricao);
        System.out.println("Valor inicial: "+valor);
        System.out.println("Valor final: "+valor_final());
    }
}
