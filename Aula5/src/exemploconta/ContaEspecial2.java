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
public class ContaEspecial2 extends ContaEspecial{

    public ContaEspecial2(String numero, String cliente) {
        super(numero, cliente);
    }
    
    
    
    public void depositar(double valor){
        saldo = saldo + valor *2;
    }
}
