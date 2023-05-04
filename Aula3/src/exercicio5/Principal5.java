/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio5;

import java.util.Scanner;

/**
 *
 * @author alunos
 */
public class Principal5 {
    public static void main(String[] args) {
        CCE c1 = new CCE();
        c1.setTitular("Vinicius");
        c1.setSaldo(400f);
        c1.setLimite(100);
        c1.exibir();
        c1.depositar(60f);
        c1.saque(600f);
        c1.exibir();
        
        CCE c2 = new CCE("Tifanny", 700f, 260f);
        c2.exibir();
        c2.depositar(70f);
        c2.saque(600f);
        c2.exibir();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do titular da conta: ");
        String titular = sc.nextLine();
        System.out.println("Digite o saldo: ");
        float saldo = sc.nextFloat();
        System.out.println("Digite o limite negativo: ");
        float limite = sc.nextFloat();
        CCE c3 = new CCE(titular, saldo, limite);
        c3.exibir();
        System.out.println("Digite um valor para deposito: ");
        float valor = sc.nextFloat();
        c3.depositar(valor);
        System.out.println("Digite um valor para saque: ");
        valor = sc.nextFloat();
        c3.saque(valor);
        c3.exibir();
    }
}
