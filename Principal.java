
package procesos;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        Procesos.generarPreguntaRespuestas();
        String[] preg = Procesos.getPreguntas();
        int[] res = Procesos.getRespuestas();
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
