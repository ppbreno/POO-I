/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author alunos
 */
public abstract class Docente extends Funcionario{
    protected String titulacao;

    public Docente(String codigo, String nome, double salario, String nivel, String departamento, String titulacao) {
        super(codigo, nome, salario, nivel, departamento);
        this.titulacao = titulacao;
    }
    
    abstract public double calcularSalario();
}
