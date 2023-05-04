/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio2;

import java.util.Scanner;

/**
 *
 * @author alunos
 */
public class Sistema {
    
    public int menu(){
        int op = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("1 - Cadastrar Produto Estadual");
        System.out.println("2 - Cadastrar Produto Nacional");
        System.out.println("3 - Cadastrar Produto Importado");
        System.out.println("4 - Exibir Produtos Estaduais");
        System.out.println("5 - Exibir Produtos Nacional");
        System.out.println("6 - Exibir Produtos Importado");
        System.out.println("7 - Exibir Todos Produtos");
        System.out.println("9 - Sair");
        System.out.println("Sua opcao: ");
        op = Integer.parseInt(sc.nextLine());
        return op;
    }
    
    public void executar(){
        Produto produtos[] = new Produto[10];
        Scanner sc = new Scanner(System.in);
        int op = 0, cont = 0;
        while(op != 9){
            op = menu();
            switch (op) {
                case 1:
                    if(cont < produtos.length){
                        System.out.println("Digite a descricao do produto: ");
                        String desc = sc.nextLine();
                        System.out.println("Digite o valor do produto: ");
                        float valor = Float.parseFloat(sc.nextLine());
                        produtos[cont] = new Estadual(desc, valor);
                        cont++;
                    }else{
                        System.out.println("Atingido número maximo de produtos\n");
                    }
                    break;
                case 2:
                    if(cont < produtos.length){
                        System.out.println("Digite a descricao do produto: ");
                        String desc = sc.nextLine();
                        System.out.println("Digite o valor do produto: ");
                        float valor = Float.parseFloat(sc.nextLine());
                        produtos[cont] = new Nacional(desc, valor);
                        cont++;
                    }else{
                        System.out.println("Atingido número maximo de produtos\n");
                    }
                    break;
                case 3:
                    if(cont < produtos.length){
                        System.out.println("Digite a descricao do produto: ");
                        String desc = sc.nextLine();
                        System.out.println("Digite o valor do produto: ");
                        float valor = Float.parseFloat(sc.nextLine());
                        produtos[cont] = new Importado(desc, valor);
                        cont++;
                    }else{
                        System.out.println("Atingido número maximo de produtos\n");
                    }
                    break;
                case 4:
                    System.out.println("\n");
                    if(cont > 0){
                        for(int i = 0; i < cont; i++){
                            if(produtos[i] instanceof Estadual){
                                produtos[i].relatorio();
                            }
                        }
                    }else{
                        System.out.println("Nao ha produtos para exibir");
                    }
                    break;
                case 5:
                    System.out.println("\n");
                    if(cont > 0){
                        for(int i = 0; i < cont; i++){
                            if(produtos[i] instanceof Nacional){
                                produtos[i].relatorio();
                            }
                        }
                    }else{
                        System.out.println("Nao ha produtos para exibir");
                    }
                    break;
                case 6:
                    System.out.println("\n");
                    if(cont > 0){
                        for(int i = 0; i < cont; i++){
                            if(produtos[i] instanceof Importado){
                                produtos[i].relatorio();
                            }
                        }
                    }else{
                        System.out.println("Nao ha produtos para exibir");
                    }
                    break;
                case 7:
                    System.out.println("\n");
                    if(cont > 0){
                        for(int i = 0; i < cont; i++){
                            produtos[i].relatorio();
                        }
                    }else{
                        System.out.println("Nao ha produtos para exibir");
                    }
                    break;
                case 9:
                    break;
            }
        }
    }
}
