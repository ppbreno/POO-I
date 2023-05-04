/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula4;

import java.util.Scanner;

/**
 *
 * @author alunos
 */
public class Sistema {
    private int menu(){
        int op = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Listar");
        System.out.println("9 - Sair");
        op = Integer.parseInt(sc.nextLine());
        return op;
    }
    
    public void executar(){
        Aluno vetor[] = new Aluno[10];
        Scanner sc = new Scanner(System.in);
        int cont = 0; //contagem de alunos cadastrados
        int op = 0;
        do{
            op = menu();
            switch(op){
                case 1: //cadastro
                    if(cont < vetor.length){
                        System.out.println("Nome: ");
                        String nome = sc.nextLine();
                        System.out.println("Nota1: ");
                        float n1 = Float.parseFloat(sc.nextLine()); //lê como String e converte para float
                        System.out.println("Nota2: ");
                        float n2 = Float.parseFloat(sc.nextLine()); //serve para não misturar com enter no buffer
                        vetor[cont] = new Aluno(nome, n1, n2);
                        cont++;
                    }else{
                        System.out.println("Vetor Cheio");
                    }
                    break;
                case 2: //listar
                    if(cont > 0){
                        for (int i = 0; i < cont; i++) {
                            System.out.println("Nome: "+vetor[i].getNome());
                            System.out.println("Media: "+vetor[i].media());
                        }
                    }else{
                        System.out.println("Nenhum aluno cadastrado");
                    }
                    break;
                case 9: //sair
                    break;
            }
        }while(op != 9);
    }
}
