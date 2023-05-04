/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula4;

/**
 *
 * @author alunos
 */
public class Aluno {
    private String nome;
    private float n1;
    private float n2;

    public Aluno(){
        
    }

    public Aluno(String nome, float n1, float n2) {
        this.nome = nome;
        this.n1 = n1;
        this.n2 = n2;
    }
    
    

public String getNome(){
    return nome;
}

public void setNome(String nome){
    this.nome = nome;
}

    public float getN1() {
        return n1;
    }

    public void setN1(float n1) {
        this.n1 = n1;
    }

    public float getN2() {
        return n2;
    }

    public void setN2(float n2) {
        this.n2 = n2;
    }

public float media(){
    return (n1+n2)/2.0f;
}

public boolean situacao(){
    if(media()>=5){
        return true;
    }
    return false;
}

public void setNotas(float n1, float n2){
    this.n1 = n1; 
    this.n2 = n2; 
    //o this se refere à variável do objeto da classe
}
}
