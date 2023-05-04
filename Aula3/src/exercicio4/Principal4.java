/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio4;

import java.util.Scanner;

/**
 *
 * @author alunos
 */
public class Principal4 {
    public static void main(String[] args) {
        Horario h1 = new Horario();
        h1.setHoras(2);
        h1.setMinutos(57);
        h1.setSegundos(23);
        h1.exibir();
        System.out.println("Quantidade de segundos: "+h1.calcularSegundos());
        
        Horario h2 = new Horario(2, 4, 36);
        h2.exibir();
        System.out.println("Quantidade de segundos: "+h2.calcularSegundos());
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite as horas: ");
        int horas = sc.nextInt();
        System.out.println("Digite os minutos: ");
        int minutos = sc.nextInt();
        System.out.println("Digite os segundos: ");
        int segundos = sc.nextInt();
        Horario h3 = new Horario(horas, minutos, segundos);
        h3.exibir();
        System.out.println("Quantidade de segundos: "+h3.calcularSegundos());
    }
}
