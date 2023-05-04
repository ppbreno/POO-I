/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetores;

import exemploconta.Conta;
import exemploconta.ContaEspecial;
import exemploconta.ContaEspecial2;

/**
 *
 * @author Danilo Medeiros Eler (FCT-UNESP) - https://daniloeler.github.io/
 */
public class PrincipalVetores {

    public static void main(String[] args) {
        Conta contas[] = new Conta[10];
        contas[0] = new Conta("123", "Cliente 1");
        contas[1] = new ContaEspecial("456", "Cliente 2");
        contas[2] = new Conta("789", "Cliente 3");
        contas[3] = new ContaEspecial2("999", "Cliente 999");

        for (int i = 0; i < 4; i++) {
            contas[i].depositar(50);
        }

        for (int i = 0; i < 4; i++) {
            contas[i].exibir();
        }

        for (int i = 0; i < 4; i++) {
            if (contas[i] instanceof ContaEspecial) {
                ((ContaEspecial) contas[i]).setLimite(200);                
//                ContaEspecial ce = (ContaEspecial) contas[i];
//                ce.setLimite(200);
            }
        }

        for (int i = 0; i < 4; i++) {
            contas[i].exibir();
        }

    }
}
