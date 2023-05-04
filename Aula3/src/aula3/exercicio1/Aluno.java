/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula3.exercicio1;

/**
 *
 * @author alunos
 */
public class Aluno {
    private String nome;
    private String ra;
    private float p1;
    private float p2;
    private float t1;
    private float t2;
    
    public Aluno(String nome, String ra, float p1, float p2, float t1, float t2){
        this.nome = nome;
        this.ra = ra;
        this.p1 = p1;
        this.p2 = p2;
        this.t1 = t1;
        this.t2 = t2;
    }
    
    public Aluno(){
        
    }

public String getNome(){
    return nome;
}

public void setNome(String nome){
    this.nome = nome;
}

public String getRa(){
    return ra;
}

public void setRa(String ra){
    this.ra = ra;
}

public float getP1(){
    return p1;
}

public void setP1(float p1){
    this.p1 = p1;
}

public float getP2(){
    return p2;
}

public void setP2(float p2){
    this.p2 = p2;
}

public float getT1(){
    return t1;
}

public void setT1(float t1){
    this.t1 = t1;
}

public float getT2(){
    return t2;
}

public void setT2(float t2){
    this.t2 = t2;
}

public float media(){
    return (p1+p2+t1+t2)/4.0f;
}

public boolean situacao(){
    if(media()>=5){
        return true;
    }
    return false;
}

public void setNotas(float p1, float p2){
    this.p1 = p1; 
    this.p2 = p2; 
    //o this se refere à variável do objeto da classe
}
}
