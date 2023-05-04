/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classeabstrata;


/**
 *
 * @author Danilo Medeiros Eler (FCT-UNESP) - https://daniloeler.github.io/
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
       //Produto p1 = new Produto();
       Produto p = new Estadual("Produto1",100);
       p.exibir();
    }
}
