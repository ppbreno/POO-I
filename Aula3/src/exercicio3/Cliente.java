/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio3;

/**
 *
 * @author alunos
 */
public class Cliente {
    private String nome;
    private String num_conta;
    private float saldo;

    public Cliente() {
    }

    public Cliente(String nome, String num_conta, float saldo) {
        this.nome = nome;
        this.num_conta = num_conta;
        this.saldo = saldo;
    }

    public float depositar(float valor){
        saldo += valor;
        return saldo;
    }
    
    public float sacar(float valor){
        if(saldo > valor){
            saldo -= valor;
            return saldo;
        }else{
            return saldo; 
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNum_conta() {
        return num_conta;
    }

    public void setNum_conta(String num_conta) {
        this.num_conta = num_conta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    
}
