
package procesos;

/**
 *
 * @author USUARIO
 */
//La Clase PreguntaMultiplicacion implemeta la interfaz PreguntaEntera 
//en la cual en esta clase se debe implementar se de implementar los métodos definidos
public class PreguntaMultiplicacion implements PreguntaEntera{
//Multiplicacion
    private int a,b;
    public PreguntaMultiplicacion() {//CONSTRUCTOR  
        // Se generan los numeros aleatoriamente para la multiplicacion
        a=(int)(Math.random()*50+1);
        b=(int)(Math.random()*50);
    }

    public String getPregunta() {// Se genera la pregunta
        return "¿Cuanto es "+a+" * " +b+ "?";
    }
    public int getRespuestaCorrecta() {// Se genera el resultado correcto para comparar la respuesta de usuario
        return a*b;
    }
    
}
