/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author alunos
 */
public class Substituto extends Docente{
    private int cargaHoraria;

    public Substituto(String codigo, String nome, double salario, String nivel, String departamento, String titulacao, int cargaHoraria) {
        super(codigo, nome, salario, nivel, departamento, titulacao);
        this.cargaHoraria = cargaHoraria;
    }
    
    @Override
    public double calcularSalario() {
        if(nivel.equals("S1")){
            return salario + (salario * Tabela.S1);
        }else{
            return salario + (salario * Tabela.S2);
        }
    }

    @Override
    public String dados() {
        String dados = "DOCENTE SUBSTITUTO" + "\n"
                + "Código: " + codigo + "\n"
                + "Nome: " + nome + "\n"
                + "Salário: R$ " + calcularSalario() + "\n"
                + "Nível: " + nivel + "\n"
                + "Titulação: " + titulacao + "\n"
                + "Departamento: " + departamento + "\n"
                + "Carga Horária: " + cargaHoraria + "h\n\n";
        return dados;
    }

}
