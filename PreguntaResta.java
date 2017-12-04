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
public class PreguntaResta implements PreguntaEntera{
    private int a,b;
    public PreguntaResta() {
        a=(int)(Math.random()*50+1);
        b=(int)(Math.random()*50);
    }
     public String getPregunta() {
        return "¿Cuanto es "+b+" - " +a+ "?";
    }
    public int getRespuestaCorrecta() {
        return b-a;
    }
}
