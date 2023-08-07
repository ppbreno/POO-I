/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio1;

/**
 *
 * @author alunos
 */
public class Utilidade {
    public static float media(float vet[]){ //calcula a media dos elementos do vetor
        float soma = 0;
        for(int i = 0; i < vet.length; i++){
            soma = soma + vet[i];
        }
        return (float) soma / vet.length;
    }
    public static float soma(float vet[]){ //calcula a soma dos elementos do vetor
        float soma = 0;
        for(int i = 0; i < vet.length; i++){
            soma = soma + vet[i];
        }
        return soma;
    }
    public static float maior(float vet[]){ //encontra o maior dos elementos do vetor
        float maior = vet[0];
        for(int i = 1; i < vet.length; i++){
            if(vet[i] > maior){
                maior = vet[i];
            }
        }
        return maior;
    }
    public static float menor(float vet[]){ //encontra o menor dos elementos do vetor
        float menor = vet[0];
        for(int i = 1; i < vet.length; i++){
            if(vet[i] < menor){
                menor = vet[i];
            }
        }
        return menor;
    }
    public static int max(int A, int B){//retorna o maior elemento da comparação entre A e B
        if(A > B){
            return A;
        }else{
            return B;
        }
    }
}
