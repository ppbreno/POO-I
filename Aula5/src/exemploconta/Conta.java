/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploconta;

/**
 *
 * @author Danilo Medeiros Eler (FCT-UNESP) - https://daniloeler.github.io/
 */
public class Conta {
    protected String numero;
    protected String cliente;
    protected double saldo;

    public Conta() {
        numero = "não definido";
        cliente = "não definido";
        saldo = 0;
        System.out.println("PASSEI POR AQUI");
    }
    
    public Conta(String numero, String cliente) {
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = 0;
    }
    
    public void sacar(double valor){
        if (saldo - valor >= 0){
            saldo = saldo - valor;
        }
    }
    
    public void depositar(double valor){
        saldo = saldo + valor;
    }    
   
    public void exibir(){
        System.out.println("\n=========================");
        System.out.println("Conta: "+numero);
        System.out.println("Cliente: "+cliente);
        System.out.println("Saldo: R$ "+saldo);
        System.out.println("=========================");
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
}
