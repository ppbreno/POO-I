/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio1;

/**
 *
 * @author alunos
 */
public class Principal {
    public static void main(String[] args) {
        int count = 0;
        Peça pecas[] = new Peça[10];
        PeçaImp p;
        pecas[0] = new Peça("Fonte 220W", 350f, 75f);  
        count++;
        pecas[1] = new PeçaImp();
        pecas[1].setNome("Processador i7");
        pecas[1].setCusto(3000f);
        pecas[1].setLucro(1000f);
        p = (PeçaImp)pecas[1];
        p.setTaxa_imp(200f);
        p.setTaxa_frete(30f);
        count++;
        
        for(int i = 0; i < count; i++){
           pecas[i].exibir();
           System.out.println("Preco de "+ pecas[i].getNome()+ " eh "+ pecas[i].preco());
        }
    }
}
