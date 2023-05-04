/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio7;

/**
 *
 * @author T-Gamer
 */
public class Lista {
    
    private int vetor[]; //LEMBRETE: esse é somente um ponteiro para um vetor, por isso, é necessário instanciar
    private int cont;
    private int max; //numero maximo de elementos armazenados na lista estática

    public Lista(int max){
        this.max = max;
        inicializar(max);
    }
    
    private void inicializar(int max) {
        cont = 0;
        vetor = new int[max]; //necessário instanciar o vetor, como comentado na aula de sintaxe java        
    }

    public boolean estaVazia() {
        if (cont == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean estaCheia() {
        if (cont == max) {
            return true;
        }
        return false;
    }

    public void add(int elemento) {
        if (!estaCheia()) {
            vetor[cont] = elemento;
            cont++;
        }
    }

    public int buscar(int elemento) { //retorna a posição de um elemento
        for (int i = 0; i < cont; i++) {
            if (vetor[i] == elemento) {
                return i;
            }
        }
        return -1; //retorna -1 quando não encontra
    }

    public void remover(int elemento) {
        //é possível reaproveitar a busca para encontrar a posicao do elemento
        //como não é uma lista ordenada, a remoção pode ser a realocação com a última posição
        int pos = buscar(elemento);
        if (pos != -1) {
            vetor[pos] = vetor[cont - 1]; //cont -1, pois o vetor inicia em 0 (zero)
            cont--;
        }
    }

    public void exibirLista() {
        if (!estaVazia()) {
            System.out.print("\n | ");
            for (int i = 0; i < cont; i++) {
                System.out.print(vetor[i]+" | ");
            }
            System.out.println();
        }
        else{
            System.out.println("\nLISTA VAZIA = |  |");
        }
    }
}
