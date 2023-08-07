/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo02;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Danilo Medeiros Eler (FCT-UNESP) - https://daniloeler.github.io/
 */
public class Sistema {

    private Aluno alunos[];
    private int cont;
    private int max;

    public Sistema(int max) {
        this.max = max;
        alunos = new Aluno[max];
        cont = 0;
    }

    public Sistema() {
        max = 100;
        alunos = new Aluno[max];
        cont = 0;
    }

    public Aluno buscarAluno(String nome) {
        for (int i = 0; i < cont; i++) {
            if (alunos[i].getNome().equals(nome)) {
                return alunos[i];
            }
        }
        return null;
    }

    public int menu() {
        StringBuilder menuString = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int op = 0;
        String aux;
        menuString.append("MENU\n");
        menuString.append("1 - Cadastrar Aluno\n");
        menuString.append("2 - Exibir Alunos\n");
        menuString.append("3 - Procurar Aluno por Nome\n");
        menuString.append("9 - Sair\n");
        //System.out.println(menuString.toString());
        //System.out.print("Digite Opção: ");
        //JOptionPane.showMessageDialog(null, menuString.toString());
        aux = JOptionPane.showInputDialog(menuString.toString());
        //aux = sc.nextLine();
        op = Integer.parseInt(aux);
        return op;
    }

    public void executar() {
        int op = 0;
        String aux;
        String nome;
        float nota1, nota2;
        Scanner sc = new Scanner(System.in);
        do {
            op = menu();
            switch (op) {
                case 1://Cadastro de Aluno
                    if (cont < max) {
                        System.out.println("CADASTRO DE ALUNO\n");/*
                        System.out.print("Nome do Aluno: ");
                        nome = sc.nextLine();
                        System.out.print("Nota 1: ");
                        aux = sc.nextLine();
                        nota1 = Float.parseFloat(aux);
                        System.out.print("Nota 2: ");
                        aux = sc.nextLine();
                        nota2 = Float.parseFloat(aux);*/
                        nome = JOptionPane.showInputDialog("Digite o nome do aluno");
                        aux = JOptionPane.showInputDialog("Nota 1");
                        nota1 = Float.parseFloat(aux);
                        aux = JOptionPane.showInputDialog("Nota 2");
                        nota2 = Float.parseFloat(aux);
                        alunos[cont] = new Aluno(nome, nota1, nota2);
                        cont++;
                    } else {
                        System.out.println("SEM ESPAÇO PARA NOVO CADASTRO");
                    }

                    break;
                case 2:
                    if (cont > 0) {
                        System.out.println("LISTA DE ALUNOS\n");
                        for (int i = 0; i < cont; i++) {
                            alunos[i].exibir();
                            System.out.println("");
                        }
                    } else {
                        System.out.println("NENHUM ALUNO CADASTRADO");
                    }
                    break;
                case 3:
                    if (cont > 0) {
                        System.out.println("CONSULTAR UM ALUNO\n");
                        System.out.print("Nome do Aluno: ");
                        nome = sc.nextLine();
                        Aluno a = buscarAluno(nome);
                        if (a != null) {
                            a.exibir();
                        } else {
                            System.out.println("ALUNO NÃO ENCONTRADO");
                        }
                    } else {
                        System.out.println("NENHUM ALUNO CADASTRADO");
                    }
                    break;
            }
        } while (op != 9);
    }
}
