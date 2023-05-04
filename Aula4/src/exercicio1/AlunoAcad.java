/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio1;

/**
 *
 * @author alunos
 */
public class AlunoAcad {
    private int id;
    private String nome;
    private int idade;
    private float peso;
    private float altura;

    public AlunoAcad() {
    }

    public AlunoAcad(int id, String nome, int idade, float peso, float altura) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    
    public float calcularIMC(){
        float imc = peso / (altura * altura);
        return imc;
    }
    public void exibir(){
        System.out.println("ID: "+id);
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Peso: "+peso+" kg");
        System.out.println("Altura: "+altura+" m");
        System.out.println("IMC: "+calcularIMC());
        System.out.println("\n");
    }
}
