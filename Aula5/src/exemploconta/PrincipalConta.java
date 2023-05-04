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
public class PrincipalConta {
    public static void main(String[] args) {
        Conta c = new Conta("123456", "Cliente 1");        
        c.exibir();
        c.depositar(20);
        c.exibir();
        c.sacar(10);
        c.exibir();
        
        System.out.println("CONTA ESPECIAL");
        ContaEspecial ce = new ContaEspecial("21342","Cliente 2");
        ce.exibir();
        ce.depositar(50);
        ce.exibir();
        ce.sacar(60);
        ce.exibir();          
        
        
        Conta c1 = new ContaEspecial("21342","Cliente 2");
        c1.exibir();
        c1.depositar(50);
        c1.exibir();
        c1.sacar(60);
        c1.exibir();          
    }
}
