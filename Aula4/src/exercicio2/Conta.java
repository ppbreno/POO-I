/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio2;

/**
 *
 * @author alunos
 */
public class Conta {
    private String numero;
    private String titular;
    private float saldo;
    private float limite;

    public Conta() {
    }

    public Conta(String numero, String titular, float saldo, float limite) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limite = limite;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }
    
    public void depositar(float valor){
            saldo += valor;
    }
    
    public void saque(float valor){
        if(saldo+limite > valor){
            saldo -= valor;
        }else{
            System.out.println("Saldo insuficiente para o saque.");
        }
    }
    
    void exibir(){
        System.out.println("Conta: "+numero);
        System.out.println("Titular: "+titular);
        System.out.println("Saldo: "+saldo);
        System.out.println("Limite: "+limite);
    }
}
