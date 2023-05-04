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
public class ContaEspecial extends Conta {

    private double limite;

    public ContaEspecial(){        
        super();
        limite = 0;
    }
    
    public ContaEspecial(String numero, String cliente) {
        super(numero, cliente); //reaproveita o construtor da superclasse conta
        limite = 100;
    }

    @Override
    public void sacar(double valor) {
        if (saldo + limite - valor >= 0) {
            saldo = saldo - valor;
        }
    }
    
    @Override
    public void exibir(){
        System.out.println("\n=========================");
        System.out.println("Conta: "+numero);
        System.out.println("Cliente: "+cliente);
        System.out.println("Limite: R$ "+limite);
        System.out.println("Saldo: R$ "+saldo);        
        System.out.println("=========================");
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    
}
