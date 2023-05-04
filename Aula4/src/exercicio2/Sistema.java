/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio2;

import java.util.Scanner;

/**
 *
 * @author contas
 */
public class Sistema {
    private Conta contas[] = new Conta[10];
    private int cont = 0;
    
    public int menu(){
        int op = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("1 - Cadastrar nova conta");
        System.out.println("2 - Saque");
        System.out.println("3 - Deposito");
        System.out.println("4 - Listar contas");
        System.out.println("5 - Relatorio geral");
        System.out.println("6 - Relatorio de contas cujo saldo esta abaixo de zero");
        System.out.println("7 - Relatorio da conta de um determinado cliente");
        System.out.println("9 - Sair");
        System.out.println("Sua opcao: ");
        op = Integer.parseInt(sc.nextLine());
        return op;
    }
    
    public int busca(String numero){
        for(int i = 0; i < cont; i++){
            if(contas[i].getNumero().equals(numero)){
                return i;
            }
        }
        return -1;
    }
    
    public int busca_cliente(String titular){
        for(int i = 0; i < cont; i++){
            if(contas[i].getTitular().equals(titular)){
                return i;
            }
        }
        return -1;
    }
    
    public void executar(){
        Scanner sc = new Scanner(System.in);
        int op = 0;
        while(op != 9){
            op = menu();
            switch (op) {
                case 1:
                    if(cont < contas.length){
                        System.out.println("Digite numero: ");
                        String numero = sc.nextLine();
                        System.out.println("Digite o nome do titular: ");
                        String titular = sc.nextLine();
                        System.out.println("Digite o saldo: ");
                        float saldo = Float.parseFloat(sc.nextLine());
                        System.out.println("Digite o limite: ");
                        float limite = Float.parseFloat(sc.nextLine());
                        System.out.println("Conta cadastrada\n");
                        contas[cont] = new Conta(numero, titular, saldo, limite);
                        cont++;
                    }else{
                        System.out.println("Atingido número maximo de contas\n");
                    }
                    break;
                case 2:
                    System.out.println("De qual conta deseja sacar?");
                    String conta = sc.nextLine();
                    System.out.println("Digite um valor que deseje sacar: ");
                    float valor = Float.parseFloat(sc.nextLine());
                    int index = busca(conta);
                    if(index >= 0){
                        contas[index].saque(valor);
                    }else{
                        System.out.println("Conta nao encontrada.");
                    }
                    break;
                case 3:
                    System.out.println("Em qual conta deseja depositar?");
                    conta = sc.nextLine();
                    System.out.println("Digite um valor que deseje depositar: ");
                    valor = Float.parseFloat(sc.nextLine());
                    index = busca(conta);
                    if(index >= 0){
                        contas[index].depositar(valor);
                    }else{
                        System.out.println("Conta nao encontrada.");
                    }
                    break;
                case 4:
                    if(cont > 0){
                        for(int i = 0; i < cont; i++){
                            System.out.println(i+"- "+contas[i].getTitular());
                        }
                        System.out.println("\n");
                    }else{
                        System.out.println("Nao ha contas para exibir");
                    }
                    break;
                case 5:
                    for(int i = 0; i < cont; i++){
                        contas[i].exibir();
                    }
                    break;
                case 6:
                    for(int i = 0; i < cont; i++){
                        if(contas[i].getSaldo() < 0){
                            contas[i].exibir();
                        }
                    }
                    break;
                case 7:
                    System.out.println("Qual titular deseja pesquisar?");
                    String titular = sc.nextLine();
                    index = busca_cliente(titular);
                    if(index >= 0){
                        contas[index].exibir();
                    }else{
                        System.out.println("Conta nao encontrada");
                    }
                    break;
                case 9:
                    break;
            }
        }
    }
}
