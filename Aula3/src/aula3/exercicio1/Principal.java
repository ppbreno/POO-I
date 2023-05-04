/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula3.exercicio1;

import java.util.Scanner;

/**
 *
 * @author alunos
 */
public class Principal {
       public static void main(String args[]) {
        //instanciando objeto com construtor vazio e utilização de outras funcoes
        Aluno a1 = new Aluno();
        a1.setNome("Mary Duarte");
        a1.setRa("221251847");
        a1.setP1(10);
        a1.setP2(8);
        a1.setT1(4);
        a1.setT2(7);
        System.out.println("Nome: "+a1.getNome());
        System.out.println("Media: "+a1.media());
        
        
        //Instanciando objeto com contrutor com parametros
        Aluno a2 = new Aluno("Kayanne","4645413",9,5, 10, 8.5f);
        System.out.println("Nome: "+a2.getNome());
        System.out.println("Media: "+a2.media());
        
        
        //Instanciando objeto por meio de entrada do usuario e construtor com parametros
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite RA: ");
        String ra = sc.nextLine();
        System.out.println("Digite nota 1: ");
        float p1 = sc.nextFloat();
        System.out.println("Digite nota 2: ");
        float p2 = sc.nextFloat();
        System.out.println("Digite trabalho 1: ");
        float t1 = sc.nextFloat();
        System.out.println("Digite trabalho 2: ");
        float t2 = sc.nextFloat();
        Aluno a3 = new Aluno(nome, ra, p1, p2, t1, t2);
        System.out.println("Nome: "+a3.getNome());
        System.out.println("Media: "+a3.media());
        
    }
}
