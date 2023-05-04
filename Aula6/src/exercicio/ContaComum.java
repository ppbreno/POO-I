/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio;

/**
 *
 * @author alunos
 */
public class ContaComum extends Conta{

    public ContaComum() {
        super();
    }

    public ContaComum(String numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }

    @Override
    public double saque(double valor) {
        if(saldo <= 0){
            System.out.println("Nao foi possivel realizar o saque, saldo insulficiente!");
            return saldo;
        }else{
            return saldo - valor;
        }
    }
    
}
