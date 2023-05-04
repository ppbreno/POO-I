/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio1;

import java.util.Scanner;

/**
 *
 * @author alunos
 */
public class Sistema {
    public int menu(){
        int op = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("1 - Cadastrar Aluno");
        System.out.println("2 - Listar Alunos");
        System.out.println("3 - Relatorio Geral");
        System.out.println("9 - Sair");
        System.out.println("Sua opcao: ");
        op = Integer.parseInt(sc.nextLine());
        return op;
    }
    
    public void executar(){
        AlunoAcad alunos[] = new AlunoAcad[10];
        Scanner sc = new Scanner(System.in);
        int op = 0, cont = 0;
        while(op != 9){
            op = menu();
            switch (op) {
                case 1:
                    if(cont < alunos.length){
                        System.out.println("Digite id: ");
                        int id = Integer.parseInt(sc.nextLine());
                        System.out.println("Digite um nome: ");
                        String nome = sc.nextLine();
                        System.out.println("Digite idade: ");
                        int idade = Integer.parseInt(sc.nextLine());
                        System.out.println("Digite peso: ");
                        float peso = Float.parseFloat(sc.nextLine());
                        System.out.println("Digite altura: ");
                        float altura = Float.parseFloat(sc.nextLine());
                        System.out.println("Aluno cadastrado\n");
                        alunos[cont] = new AlunoAcad(id, nome, idade, peso, altura);
                        cont++;
                    }else{
                        System.out.println("Atingido número máximo de alunos\n");
                    }
                    break;
                case 2:
                    if(cont > 0){
                        for(int i = 0; i < cont; i++){
                            System.out.println(i+1+"- "+alunos[i].getNome());
                        }
                        System.out.println("\n");
                    }else{
                        System.out.println("Nao ha nomes para exibir");
                    }
                    break;
                case 3:
                    for(int i = 0; i < cont; i++){
                        alunos[i].exibir();
                    }
                    break;
                case 9:
                    break;
            }
        }
    }
}
