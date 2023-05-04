/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio;

/**
 *
 * @author alunos
 */
public class ContaEspecial extends Conta{
    protected double limite;

    @Override
    public double saque(double valor) {
        if(saldo + limite < valor){
            System.out.println("Nao foi possivel realizar o saque, saldo insulficiente!");
            return saldo;
        }else{
            return saldo - valor;
        }
    }

    public ContaEspecial() {
        super();
    }

    public ContaEspecial(String numero, String titular, double saldo, double limite) {
        super(numero, titular, saldo);
        this.limite = limite;
    }
    
    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
