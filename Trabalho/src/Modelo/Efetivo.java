/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author alunos
 */
public class Efetivo extends Docente{
    private String area;

    public Efetivo(String codigo, String nome, double salario, String nivel, String departamento, String titulacao, String area) {
        super(codigo, nome, salario, nivel, departamento, titulacao);
        this.area = area;
    }

    @Override
    public double calcularSalario() {
        if(nivel.equals("D1")){
            return salario + (salario * Tabela.D1);
        }else if(nivel.equals("D2")){
            return salario + (salario * Tabela.D2);
        }else{
            return salario + (salario * Tabela.D3);
        }
    }

    @Override
    public String dados() {
        String dados = "DOCENTE EFETIVO" + "\n"
                + "Código: " + codigo + "\n"
                + "Nome: " + nome + "\n"
                + "Salário: R$ " + calcularSalario() + "\n"
                + "Nível: " + nivel + "\n"
                + "Titulação: " + titulacao + "\n"
                + "Departamento: " + departamento + "\n"
                + "Área: " + area + "\n\n";
        return dados;
    }

}
