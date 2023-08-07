/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author alunos
 */
public class Universidade {
    private String nome;
    private Departamento departamentos[];
    private int MAX = 20;
    private int cont;
    private static Universidade instancia = null;
    
    public static Universidade getInstancia(String nome){
        if (instancia == null){
            instancia = new Universidade(nome);
        }
        return instancia;
    }

    public Departamento[] getDepartamentos() {
        return departamentos;
    }
    
    public void addDepartamento(String codigo, String nome){
        if (cont < MAX) {            
            departamentos[cont] = new Departamento(codigo, nome);
            cont++;
        }
    }
    
    public void addTecnico(String codigo, String nome, double salario, String nivel, String departamento, String funcao){
        for(int i = 0; i < cont; i++){
            if(departamentos[i].getNome().equals(departamento)){
                departamentos[i].addTecnico(codigo, nome, salario, nivel, departamento, funcao);         
            }
        }
    }
    
    public void addEfetivo(String codigo, String nome, double salario, String nivel, String departamento, String titulacao, String area){
        for(int i = 0; i < cont; i++){
            if(departamentos[i].getNome().equals(departamento)){
                departamentos[i].addEfetivo(codigo, nome, salario, nivel, departamento, titulacao, area);         
            }
        }
    }
    
    public void addSubstituto(String codigo, String nome, double salario, String nivel, String departamento, String titulacao, int cargaHoraria){
        for(int i = 0; i < cont; i++){
            if(departamentos[i].getNome().equals(departamento)){
                departamentos[i].addSubstituto(codigo, nome, salario, nivel, departamento, titulacao, cargaHoraria);         
            }
        }
    }
    
    public String dadosTecnicos(){
        String dados = "";
        for(int i = 0; i < cont; i++){
            dados += departamentos[i].dadosTecnicos();
        }
        return dados;
    }
    
    public String dadosEfetivos(){
        String dados = "";
        for(int i = 0; i < cont; i++){
            dados += departamentos[i].dadosEfetivos();
        }
        return dados;
    }
    
    public String dadosSubstitutos(){
        String dados = "";
        for(int i = 0; i < cont; i++){
            dados += departamentos[i].dadosSubstitutos();
        }
        return dados;
    }
    
    public String dadosDocentes(){
        String dados = "";
        for(int i = 0; i < cont; i++){
            dados += departamentos[i].dadosDocentes();
        }
        return dados;
    }
    
    public String dadosFuncionarios(){
        String dados = "";
        for(int i = 0; i < cont; i++){
            dados += departamentos[i].dadosFuncionarios();
        }
        return dados;
    }
    
    public String dadosDepartamentos(){
        String dados = "";
        for(int i = 0; i < cont; i++){
            dados += departamentos[i].dadosDepartamentos();
        }
        return dados; 
    }
    
    public String dadosGeral(){
        String dados = "";
        for(int i = 0; i < cont; i++){
            dados += departamentos[i].dadosGeral();
        }
        return dados; 
    }
    
    public String buscarFuncionario(String campo){
        String func = "";
        for(int i = 0; i < cont; i++){
            Funcionario auxiliar[] = departamentos[i].getFuncionarios();
            for(int k = 0; k < departamentos[i].getCont(); k++){
                if(auxiliar[k].getNome().equals(campo) || auxiliar[k].getCodigo().equals(campo)){
                    func = auxiliar[k].dados();
                }
            }
        }
        return func;
    }
    
    public String buscarFaixa(double campo1, double campo2){
        String func = "";
        for(int i = 0; i < cont; i++){
            Funcionario auxiliar[] = departamentos[i].getFuncionarios();
            for(int k = 0; k < departamentos[i].getCont(); k++){
                if(auxiliar[k].getSalario() >= campo1 && auxiliar[k].getSalario() <= campo2){
                    func += auxiliar[k].dados();
                }
            }
        }
        return func;
    }
    
    public String buscarDepartamento(double campo1, double campo2){
        String func = "";
        for(int i = 0; i < cont; i++){
            double soma = departamentos[i].gastos();
            if(soma >= campo1 && soma <= campo2){
                func += departamentos[i].dadosDepartamentos();
            }
        }
        return func;
    }
    
    public Departamento buscaDep(String codigo){
        for(int i =0; i < cont; i++){
            if(departamentos[i].getCodigo().equals(codigo)){
                return departamentos[i];
            }
        }
        return null;
    }
    
    public Funcionario buscaFun(String codigo){
        for(int i =0; i < cont; i++){
            Funcionario funcionarios[] = departamentos[i].getFuncionarios();
            for(int k = 0; k < cont; k++){
                if(funcionarios[k].getCodigo().equals(codigo)){
                    return funcionarios[k];
                }
            }
        }
        return null;
    }

    public Universidade(String nome) {
        this.nome = nome;
        departamentos = new Departamento[MAX];
        cont = 0;
    }
    
    public String getNome() {
        return nome;
    }

    public int getCont() {
        return cont;
    }   
}
