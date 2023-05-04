/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio;

/**
 *
 * @author alunos
 */
public class Principal {
    public static void main(String[] args) {
        ContaComum cc = new ContaComum("12345", "Breno", 500);
        ContaEspecial ce = new ContaEspecial("54321", "Gabriel viadinho", -100, 200);
        
        System.out.println("Titular: "+cc.titular+" Saldo pos-saque: "+ cc.saque(400));
        System.out.println("Titular: "+ce.titular+" Saldo pos-saque: "+ ce.saque(50));
    }
}
