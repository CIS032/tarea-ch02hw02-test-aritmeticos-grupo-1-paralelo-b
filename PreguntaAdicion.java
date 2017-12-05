/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procesos;
//Adición
public class PreguntaAdicion implements PreguntaEntera{
    private int a,b;
    public PreguntaAdicion() {//aquí se generan los números que a continuación se utilizará en la operación
        a=(int)(Math.random()*50+1);
        b=(int)(Math.random()*50);
    }
    public  void  prueba(){//String de la pregunta
        System.out.println(a+" + "+b);
    }
    
     public String getPregunta() {//presentación de la pregunta 
        return "¿Cuanto es "+a+" + " +b+ "?";
    }
    public int getRespuestaCorrecta() {//calcula y envía la respuesta correcta de la suma 
        return a+b;
    }
}
