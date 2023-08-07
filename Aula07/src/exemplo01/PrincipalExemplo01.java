/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo01;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Danilo Medeiros Eler (FCT-UNESP) - https://daniloeler.github.io/
 */
public class PrincipalExemplo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor=0;
        String aux;
        //System.out.print("Digite um valor: ");
        aux=JOptionPane.showInputDialog("Digite um valor");
        valor = Double.parseDouble(aux);
        System.out.println("Raiz: "+Math.sqrt(valor));
        System.out.println("PI: "+Math.PI);
        
        int n1 = 9, n2 = 27;
        ////fazer Máximo entre dois valores
        Utilidade.max(n1, n2);
        System.out.println("Maior valor: "+Utilidade.max(n1, n2));
        int[] vetor = new int[100];
        int cont = 10;
        for (int i = 0; i < cont; i++) {
            vetor[i] = i;
        }
        //Media dos valores do vetor
        System.out.println("Media: "+Utilidade.media(vetor, cont));
        
    }
}
