/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio4;

/**
 *
 * @author alunos
 */
public class Horario {
    private int horas;
    private int minutos;
    private int segundos;

    public Horario() {
    }

    public Horario(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public int getHoras() {
        return horas;
    }

    public boolean setHoras(int horas) {
        if(horas < 24){
            this.horas = horas;
            return true;
        }else{
            return false;
        }
        
    }

    public int getMinutos() {
        return minutos;
    }

    public boolean setMinutos(int minutos) {
        if(minutos < 60){
            this.minutos = minutos;
            return true;
        }else{
            return false;
        }
    }

    public int getSegundos() {
        return segundos;
    }

    public boolean setSegundos(int segundos) {
        if(segundos < 60){
            this.segundos = segundos;
            return true;
        }else{
            return false;
        }
    }
    
    public void exibir(){
        System.out.println(horas+":"+minutos+":"+segundos);
    }
    
    public int calcularSegundos(){
        return (horas * 3600) + (minutos * 60) + segundos;
    }
}
