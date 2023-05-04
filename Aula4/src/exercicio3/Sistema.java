/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio3;

import java.util.Scanner;

/**
 *
 * @author alunos
 */
public class Sistema {
    private int cont_est = 0;
    private int cont_nac = 0;
    private int cont_imp = 0;
    
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
        Estadual est[] = new Estadual[10];
        Nacional nac[] = new Nacional[10];
        Importado imp[] = new Importado[10];
        Scanner sc = new Scanner(System.in);
        int op = 0;
        while(op != 9){
            op = menu();
            switch (op) {
                case 1:
                    if(cont_est < est.length){
                        System.out.println("Digite a descricao do produto: ");
                        String descricao = sc.nextLine();
                        System.out.println("Digite o valor do produto: ");
                        float valor = Float.parseFloat(sc.nextLine());
                        est[cont_est] = new Estadual(descricao, valor);
                        cont_est++;
                    }else{
                        System.out.println("Atingido número maximo de produtos\n");
                    }
                    break;
                case 2:
                    if(cont_nac < nac.length){
                        System.out.println("Digite a descricao do produto: ");
                        String descricao = sc.nextLine();
                        System.out.println("Digite o valor do produto: ");
                        float valor = Float.parseFloat(sc.nextLine());
                        nac[cont_nac] = new Nacional(descricao, valor);
                        cont_nac++;
                    }else{
                        System.out.println("Atingido número maximo de produtos\n");
                    }
                    break;
                case 3:
                    if(cont_imp < imp.length){
                        System.out.println("Digite a descricao do produto: ");
                        String descricao = sc.nextLine();
                        System.out.println("Digite o valor do produto: ");
                        float valor = Float.parseFloat(sc.nextLine());
                        imp[cont_imp] = new Importado(descricao, valor);
                        cont_imp++;
                    }else{
                        System.out.println("Atingido número maximo de produtos\n");
                    }
                    break;
                case 4:
                    if(cont_est > 0){
                        for(int i = 0; i < cont_est; i++){
                            est[i].exibir();
                        }
                        System.out.println("\n");
                    }else{
                        System.out.println("Nao ha produtos para exibir");
                    }
                    break;
                case 5:
                    if(cont_nac > 0){
                        for(int i = 0; i < cont_nac; i++){
                            nac[i].exibir();
                        }
                        System.out.println("\n");
                    }else{
                        System.out.println("Nao ha produtos para exibir");
                    }
                    break;
                case 6:
                    if(cont_imp > 0){
                        for(int i = 0; i < cont_imp; i++){
                            imp[i].exibir();
                        }
                        System.out.println("\n");
                    }else{
                        System.out.println("Nao ha contas para exibir");
                    }
                    break;
                case 7:
                    System.out.println("Produtos Estaduais: \n");
                    if(cont_est > 0){
                        for(int i = 0; i < cont_est; i++){
                            est[i].exibir();
                        }
                        System.out.println("\n");
                    }else{
                        System.out.println("Nao ha produtos para exibir");
                    }
                    System.out.println("Produtos Nacionais: \n");
                    if(cont_nac > 0){
                        for(int i = 0; i < cont_nac; i++){
                            nac[i].exibir();
                        }
                        System.out.println("\n");
                    }else{
                        System.out.println("Nao ha produtos para exibir");
                    }
                    System.out.println("Produtos Importados: \n");
                    if(cont_imp > 0){
                        for(int i = 0; i < cont_imp; i++){
                            imp[i].exibir();
                        }
                        System.out.println("\n");
                    }else{
                        System.out.println("Nao ha contas para exibir");
                    }
                    break;
                case 9:
                    break;
            }
        }
    }
}
