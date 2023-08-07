/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo01;

/**
 *
 * @author Danilo Medeiros Eler (FCT-UNESP) - https://daniloeler.github.io/
 */
public class Utilidade {
    public static int max(int n1, int n2){
        if (n1>n2)
            return n1;
        return n2;
    }
    
    public static double max(double n1, double n2){
        if (n1>n2)
            return n1;
        return n2;
    }
    
    public static float media(int[] vetor, int cont){
        float soma =0 ;
        for(int i=0; i<cont; i++){
            soma = soma + vetor[i];
        }
        return soma / cont;
    }
}
