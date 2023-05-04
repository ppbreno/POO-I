/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio2;

import java.util.Scanner;

/**
 *
 * @author T-Gamer
 */
public class Principal2 {
    public static void main(String[] args) {
        AlunoAcad a1 = new AlunoAcad();
        a1.setNome("Gustavo Ribeiro");
        a1.setIdade(18);
        a1.setPeso(66);
        a1.setAltura(1.82f);
        
        System.out.println("Nome: "+a1.getNome());
        a1.desconto();
        System.out.println("IMC: "+a1.imc());
        
        AlunoAcad a2 = new AlunoAcad("Lais", 18, 69, 1.73f);
        System.out.println("Nome: "+a2.getNome());
        a2.desconto();
        System.out.println("IMC: "+a2.imc());
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.println("Digite seu peso (em kg): ");
        float peso = sc.nextFloat();
        System.out.println("Digite sua altura (em metros): ");
        float altura = sc.nextFloat();
        AlunoAcad a3 = new AlunoAcad(nome, idade, peso, altura);
        System.out.println("Nome: "+a3.getNome());
        a3.desconto();
        System.out.println("IMC: "+a3.imc());
    }
}
