/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio2;

/**
 *
 * @author alunos
 */
public class Produto {
    protected String desc;
    protected float valor;
    protected float imposto = 0.1f;

    public Produto() {
    }

    public Produto(String desc, float valor) {
        this.desc = desc;
        this.valor = valor;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
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
    
    public float preco(){
        return valor + (valor * imposto);
    }
    
    public void relatorio(){
        System.out.println("Descricao: "+desc);
        System.out.println("Valor: "+valor);
        System.out.println("Imposto: "+imposto);
        System.out.println("Preco final: "+preco());
    }
}
