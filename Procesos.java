
package procesos;

public class Procesos {
    private static String[] preguntas=new String[10];

    public static String[] getPreguntas() {
        return preguntas;
    }

    public static int[] getRespuestas() {
        return respuestas;
    }
     private static int[] respuestas=new int [10];
    public static void generarPreguntaRespuestas(){
        PreguntaAdicion adicion;
        PreguntaResta resta;
        PreguntaMultiplicacion multiplicacion= new PreguntaMultiplicacion();
        
        int cont=0;
            preguntas[cont]=multiplicacion.getPregunta();
            respuestas[cont]=multiplicacion.getRespuestaCorrecta();
        while (cont<9) {
            cont++;
            adicion = new PreguntaAdicion();
            preguntas[cont]=adicion.getPregunta();
            respuestas[cont]=adicion.getRespuestaCorrecta();
            cont++;
            resta = new PreguntaResta();
            preguntas[cont]=resta.getPregunta();
            respuestas[cont]=resta.getRespuestaCorrecta();
            cont++;
            multiplicacion = new PreguntaMultiplicacion();
            preguntas[cont]=multiplicacion.getPregunta();
            respuestas[cont]=multiplicacion.getRespuestaCorrecta();
            //Aqui llama a los métodos que se encuentran en la clase PreguntaResta para realizar la verificación de la pregunta
            // y así mimso sube el coontador para q puedan realizarse un total de 10 preguntas.
        }
    }
}
