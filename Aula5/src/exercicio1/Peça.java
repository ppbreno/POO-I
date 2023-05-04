/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio1;

/**
 *
 * @author alunos
 */
public class Peça {
    protected String nome;
    protected float custo;
    protected float lucro;

    public Peça() {
    }

    public Peça(String nome, float custo, float lucro) {
        this.nome = nome;
        this.custo = custo;
        this.lucro = lucro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getCusto() {
        return custo;
    }

    public void setCusto(float custo) {
        this.custo = custo;
    }

    public float getLucro() {
        return lucro;
    }

    public void setLucro(float lucro) {
        this.lucro = lucro;
    }
    
    public float preco(){
        return custo + lucro;
    }
    
    public void exibir(){
        System.out.println("Nome: "+nome);
        System.out.println("Custo: "+custo);
        System.out.println("Lucro: "+lucro);
    }
}
