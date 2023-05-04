/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio6;

/**
 *
 * @author T-Gamer
 */
public class EletroDom {
    private String nome;
    private float potencia;
    private float utilizacao;

    public EletroDom() {
    }

    public EletroDom(String nome, float potencia, float utilizacao) {
        this.nome = nome;
        this.potencia = potencia;
        this.utilizacao = utilizacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public float getUtilizacao() {
        return utilizacao;
    }

    public void setUtilizacao(float utilizacao) {
        this.utilizacao = utilizacao;
    }
    
    public float wattsDia(){
        return potencia * utilizacao;
    }
    
    public float wattsMes(){
        return wattsDia() * 30;
    }
    
    public float wattsAno(){
        return wattsMes() * 12;
    }
    
    public float gastoMes(float precoKwatts){
        return (wattsMes() / 1000) * precoKwatts;
    }
    
    public void relatorio(float precoKwatts){
        System.out.println("Eletrodomestico: "+nome);
        System.out.println("Potencia do aparelho: P = "+potencia+"W");
        System.out.println("Tempo de utilizacao do aparelho: "+utilizacao+" horas/dia");
        System.out.println("Watts/Dia = "+wattsDia()+"W");
        System.out.println("Watts/Mes = "+wattsMes()+"W");
        System.out.println("Watts/Ano = "+wattsAno()+"W");
        System.out.println("Preco do Kwatt R$ "+precoKwatts);
        System.out.println("Gasto mensal é: R$ "+gastoMes(precoKwatts));
    }
}
