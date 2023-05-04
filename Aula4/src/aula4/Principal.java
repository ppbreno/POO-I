/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula4;

/**
 *
 * @author alunos
 */
public class Principal {
    public static void main(String[] args) {
        int cont = 0;
        Aluno v[] = new Aluno[10];
        v[0] = new Aluno("Aluno 1", 1f, 1f);
        cont++;
        v[1] = new Aluno("Aluno 2", 2f, 7f);
        cont++;
        v[2] = new Aluno("Aluno 3", 3f, 7f);
        cont++;
        for(int i = 0; i < v.length; i++){
            if(v[i] != null){
                System.out.println("Media: "+v[i].media());
            }
        }
           System.out.println("Outra estrategia");
        for (int i = 0; i < cont; i++) {
            System.out.println("Media: "+v[i].media());
        }
    }
}
