/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author alunos
 */
public abstract class Funcionario {
    protected String codigo;
    protected String nome;
    protected double salario;
    protected String nivel;
    protected String departamento;

    public Funcionario(String codigo, String nome, double salario, String nivel, String departamento) {
        this.codigo = codigo;
        this.nome = nome;
        this.salario = salario;
        this.nivel = nivel;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getSalario() {
        return calcularSalario();
    }
    
    public Funcionario(){
        
    }

    abstract public double calcularSalario();
    abstract public String dados();
}
