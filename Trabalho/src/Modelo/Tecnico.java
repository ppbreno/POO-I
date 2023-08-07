/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author alunos
 */
public class Tecnico extends Funcionario{
    public String funcao;

    public Tecnico(String codigo, String nome, double salario, String nivel, String departamento, String funcao) {
        super(codigo, nome, salario, nivel, departamento);
        this.funcao = funcao;
    }

    @Override
    public double calcularSalario() {
        if(nivel.equals("T1")){
            return salario + (salario * Tabela.T1);
        }else{
            return salario + (salario * Tabela.T2);
        }
    }

    @Override
    public String dados() {
        String dados = "TÉCNICO\n"
                + "Código: " + codigo + "\n"
                + "Nome: " + nome + "\n"
                + "Salário: R$ " + calcularSalario() + "\n"
                + "Nível: " + nivel + "\n"
                + "Departamento: " + departamento + "\n"
                + "Função: " + funcao + "\n\n";
        return dados;
    }

}
