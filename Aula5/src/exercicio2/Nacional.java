/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio2;

import exercicio1.Peça;

/**
 *
 * @author alunos
 */
public class Nacional extends Produto{
    protected float taxa = 0.05f;

    public Nacional() {
    }

    public Nacional(String desc, float valor) {
        super(desc, valor);
    }

    public float getTaxa() {
        return taxa;
    }

    @Override
    public float preco(){
        return valor + (valor * imposto) + (valor * taxa);
    }
    
    @Override
    public void relatorio(){
        System.out.println("Descricao: "+desc);
        System.out.println("Valor: "+valor);
        System.out.println("Imposto: "+imposto);
        System.out.println("Taxa: "+taxa);
        System.out.println("Preco final: "+preco());
    }
}
