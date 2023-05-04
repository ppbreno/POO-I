/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio6;

/**
 *
 * @author T-Gamer
 */
public class Principal6 {
    public static void main(String[] args) {
        EletroDom e1 = new EletroDom();
        e1.setNome("Telefone sem fio");
        e1.setPotencia(3f);
        e1.setUtilizacao(24f);
        e1.relatorio(0.27f);
        
        EletroDom e2 = new EletroDom("aspirador de po", 1000f, 1f);
        e2.relatorio(0.32f);
    }
}
