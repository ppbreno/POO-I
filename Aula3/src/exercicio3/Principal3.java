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
public class Principal3 {
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        c1.setNome("Victor");
        c1.setNum_conta("123456789");
        c1.setSaldo(500.70f);
        System.out.println("Nome: "+c1.getNome());
        System.out.println("Saldo: "+c1.getSaldo());
        c1.depositar(300f);
        System.out.println("Saldo apos deposito: "+c1.getSaldo());
        c1.sacar(600.20f);
        System.out.println("Saldo apos saque: "+c1.getSaldo());
        
        Cliente c2 = new Cliente("Hugo", "654657", 305f);
        System.out.println("Nome: "+c2.getNome());
        System.out.println("Saldo: "+c2.getSaldo());
        c2.depositar(220f);
        System.out.println("Saldo apos deposito: "+c2.getSaldo());
        c2.sacar(700f);
        System.out.println("Saldo apos saque: "+c2.getSaldo());
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite numero da conta: ");
        String conta = sc.nextLine();
        System.out.println("Digite o saldo: ");
        float saldo = sc.nextFloat();
        System.out.println("Digite valor para deposito: ");
        float deposito = sc.nextFloat();
        System.out.println("Digite valor para sacar: ");
        float saque = sc.nextFloat();
        Cliente c3 = new Cliente(nome, conta, saldo);
        System.out.println("Nome: "+c3.getNome());
        System.out.println("Saldo: "+c3.getSaldo());
        c3.depositar(deposito);
        System.out.println("Saldo apos deposito: "+c3.getSaldo());
        c3.sacar(saque);
        System.out.println("Saldo apos saque: "+c3.getSaldo());
    }
}
