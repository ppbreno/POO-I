/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author alunos
 */
public class Departamento {
    private String codigo;
    private String nome;
    private Funcionario funcionarios[];
    private int MAX = 100;
    private int cont;

    public Departamento(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        funcionarios = new Funcionario[MAX];
        cont = 0;
    }
    
    public void addTecnico(String codigo, String nome, double salario, String nivel, String departamento, String funcao){
        if (cont < MAX) {            
            funcionarios[cont] = new Tecnico(codigo, nome, salario, nivel, departamento, funcao);
            cont++;
        }
    }
    
    public void addEfetivo(String codigo, String nome, double salario, String nivel, String departamento, String titulacao, String area){
        if (cont < MAX) {            
            funcionarios[cont] = new Efetivo(codigo, nome, salario, nivel, departamento, titulacao, area);
            cont++;
        }
    }
    
    public void addSubstituto(String codigo, String nome, double salario, String nivel, String departamento, String titulacao, int cargaHoraria){
        if (cont < MAX) {            
            funcionarios[cont] = new Substituto(codigo, nome, salario, nivel, departamento, titulacao, cargaHoraria);
            cont++;
        }
    }
    
    public String dadosTecnicos(){
        String relatorio = "";
        for(int i = 0; i < cont; i++){ //adiciona todos os tecnicos no vetor
            if(funcionarios[i] instanceof Tecnico){
                relatorio += funcionarios[i].dados();
            }
        }
        return relatorio;
    }
    
    public String dadosEfetivos(){
        String relatorio = "";
        for(int i = 0; i < cont; i++){ 
            if(funcionarios[i] instanceof Efetivo){
                relatorio += funcionarios[i].dados();
            }
        }
        return relatorio;
    }
    
    public String dadosSubstitutos(){
        String relatorio = "";
        for(int i = 0; i < cont; i++){ //adiciona todos os tecnicos no vetor
            if(funcionarios[i] instanceof Substituto){
                relatorio += funcionarios[i].dados();
            }
        }
        return relatorio;
    }
    
    public String dadosDocentes(){
        String relatorio = "";
        for(int i = 0; i < cont; i++){ //adiciona todos os tecnicos no vetor
            if(funcionarios[i] instanceof Docente){
                relatorio += funcionarios[i].dados();
            }
        }
        return relatorio;
    }
    
    public String dadosFuncionarios(){
        String relatorio = "";
        for(int i = 0; i < cont; i++){
            relatorio += funcionarios[i].dados();
        }
        return relatorio;
    }
    
    public double gastos(){
        double soma = 0;
        for(int i = 0; i < cont; i++){
            soma += funcionarios[i].calcularSalario();
        }
        return soma;
    }
    
    public String dadosDepartamentos(){
        String dados =  "Departamento: " + nome + "\n"
                + "Quantidade de Funcionários: " + cont + "\n"
                + "Total dos salários: " + gastos() + "\n\n";
        return dados;
    }
    
    public String dadosGeral(){
        String dados =  "DEPARTAMENTO: " + nome + "\n"    
                + "Total dos salários: " + gastos() + "\n"
                + dadosFuncionarios() + "\n";
        return dados;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    public int getCont() {
        return cont;
    }
}
