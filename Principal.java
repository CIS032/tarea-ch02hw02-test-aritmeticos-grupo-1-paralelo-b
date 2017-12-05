
package procesos;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        Procesos.generarPreguntaRespuestas();//Llama al métdo que se encuentra en la clase Proceso 
        String[] preg = Procesos.getPreguntas();
        int[] res = Procesos.getRespuestas();
        //En las dos líneas anteriores de código al ser .get lo que realiza es que llama al método Pregunta o Respuesta respectivamente 
        //que sirve para mostrar los atributos requeridos.
        int[] resUsuario = new int[res.length];
        int total=0;
        String historial ="\t\t\t[Test Aritmético]\n\nPREGUNTA\t       R.CORRECTA\tR.USUARIO\tPUNTAJE\n";
        for (int i = 0; i < 10; i++) {
            resUsuario[i]= Integer.parseInt(JOptionPane.showInputDialog(null,preg[i],"Preguntas Aritmeticas",JOptionPane.QUESTION_MESSAGE));
            historial +=""+preg[i]+"\t"+res[i]+"\t\t"+resUsuario[i]+"\t"; 
            if(res[i]==resUsuario[i]){
                JOptionPane.showMessageDialog(null,"Respuesta Correcta");
                historial+="\t10/10\n";
                total+=10;
            }else{
                JOptionPane.showMessageDialog(null,"Respuesta Incorrecta\nLa respuesta es: "+res[i]);
                historial+="\t0/10\n";
                
            }
        }
        historial+="\t\t\t\t\tPUNTAJE TOTAL\t"+total+"/100";
        JOptionPane.showMessageDialog(null, "El test se mostrará en consola");
        System.out.println(historial);
        
    }
}
