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
public class PreguntaMultiplicacion implements PreguntaEntera{
    private int a,b;
    public PreguntaMultiplicacion() {
        a=(int)(Math.random()*50+1);
        b=(int)(Math.random()*50);
    }

    public String getPregunta() {
        return "¿Cuanto es "+a+" * " +b+ "?";
    }
    public int getRespuestaCorrecta() {
        return a*b;
    }
    
}
