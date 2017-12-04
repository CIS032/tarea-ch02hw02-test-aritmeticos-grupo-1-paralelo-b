/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procesos;

/**
 *
 * @author USUARIO
 */
public class PreguntaAdicion implements PreguntaEntera{
    private int a,b;
    public PreguntaAdicion() {
        a=(int)(Math.random()*50+1);
        b=(int)(Math.random()*50);
    }
    public  void  prueba(){
        System.out.println(a+" + "+b);
    }
    
     public String getPregunta() {
        return "¿Cuanto es "+a+" + " +b+ "?";
    }
    public int getRespuestaCorrecta() {
        return a+b;
    }
}
