
package procesos;

/**
 *
 * @author USUARIO
 */
public class PreguntaMultiplicacion implements PreguntaEntera{
//Multiplicacion
    private int a,b;
    public PreguntaMultiplicacion() {// Se generan los numeros aleatoriamente para la multiplicacion
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
