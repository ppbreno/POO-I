/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio2;

/**
 *
 * @author alunos
 */
public class AlunoAcad {
    private String nome;
    private int idade;
    private float peso;
    private float altura;
    
    public AlunoAcad(){
        
    }
    
    public AlunoAcad(String nome, int idade, float peso, float altura){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public void desconto(){
        if(idade < 18){
            System.out.println("Voce recebe desconto!");
        }else{
            System.out.println("Voce nao recebe desconto.");
        }
    }
    
    public float imc(){
        return peso / (altura * altura);
    }
}
