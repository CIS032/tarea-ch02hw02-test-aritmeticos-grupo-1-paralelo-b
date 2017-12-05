/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procesos;
//Adición
public class PreguntaAdicion implements PreguntaEntera{
    private int a,b;
    //aquí se generan los números que a continuación se utilizará en la operación
    public PreguntaAdicion() {
        a=(int)(Math.random()*50+1);
        b=(int)(Math.random()*50);
    }
    //String de la pregunta
    public  void  prueba(){
        System.out.println(a+" + "+b);
    }
    //sds
     public String getPregunta() {//presentación de la pregunta 
        return "¿Cuanto es "+a+" + " +b+ "?";
    }
    public int getRespuestaCorrecta() {//calcula y envía la respuesta correcta de la suma 
        return a+b;
    }
}
