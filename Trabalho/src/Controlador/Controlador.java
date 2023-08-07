/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Departamento;
import Modelo.Efetivo;
import Modelo.Funcionario;
import Modelo.Substituto;
import Modelo.Tecnico;
import Modelo.Universidade;

/**
 *
 * @author alunos
 */
public class Controlador {
    private Universidade universidade = Universidade.getInstancia("Unesp");
    
    public void addDepartamento(String codigo, String nome){
        universidade.addDepartamento(codigo, nome);
    }
    
    public void addTecnico(String codigo, String nome, double salario, String nivel, String departamento, String funcao){
        universidade.addTecnico(codigo, nome, salario, nivel, departamento, funcao);
    }
    
    public void addEfetivo(String codigo, String nome, double salario, String nivel, String departamento, String titulacao, String area){
        universidade.addEfetivo(codigo, nome, salario, nivel, departamento, titulacao, area);
    }
    
    public void addSubstituto(String codigo, String nome, double salario, String nivel, String departamento, String titulacao, int cargaHoraria){
        universidade.addSubstituto(codigo, nome, salario, nivel, departamento, titulacao, cargaHoraria);
    }
    
    public String dadosTecnicos(){
        return universidade.dadosTecnicos();
    }
    
    public String dadosEfetivos(){
        return universidade.dadosEfetivos();
    }
    
    public String dadosSubstitutos(){
        return universidade.dadosSubstitutos();
    }
    
    public String dadosDocentes(){
        return universidade.dadosDocentes();
    }
    
    public String dadosFuncionarios(){
        return universidade.dadosFuncionarios();
    }
    
    public String dadosDepartamentos(){
        return universidade.dadosDepartamentos();
    }
    
    public String dadosGeral(){
        return universidade.dadosGeral();
    }
    
    public String buscarFuncionario(String campo){
        return universidade.buscarFuncionario(campo);
    }
    
    public String buscarFaixa(double campo1, double campo2){
        return universidade.buscarFaixa(campo1, campo2);
    }
    
    public String buscarDepartamento(double campo1, double campo2){
        return universidade.buscarDepartamento(campo1, campo2);
    }
    
    public Departamento buscaDep(String codigo){
        return universidade.buscaDep(codigo);
    }
    
    public Funcionario buscaFun(String codigo){
        return universidade.buscaFun(codigo);
    }
}
