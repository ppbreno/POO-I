/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio7;

import java.util.Scanner;

/**
 *
 * @author T-Gamer
 */
public class Principal7 {
    public static void main(String[] args) {
        Lista l = new Lista(10);      
        Scanner sc = new Scanner(System.in);
        String menu = "1 - Inserir\n"+
                "2 - Exibir Lista\n"+
                "3 - Remover\n"+
                "4 - Sair";
        
        int op = 0;
        int elem;
        do {
            System.out.println(menu);
            System.out.print("Opção: ");
            op = sc.nextInt();
            switch (op){
                case 1:
                    System.out.println("\nINSERÇÃO\n");
                    System.out.print("\nDigite Elemento: ");
                    elem = sc.nextInt();
                    l.add(elem);
                    break;
                case 2:
                    System.out.println("\nEXIBIR LISTA\n");
                    l.exibirLista();
                    break;
                case 3:
                    System.out.println("\nREMOÇÃO\n");
                    System.out.print("\nDigite Elemento para remoção: ");
                    elem = sc.nextInt();
                    l.remover(elem);
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        }while (op != 4);
    }
}
