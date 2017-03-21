package digitalizacion.archivo;

import GUI.Portada;
import GUI.migrador;
import GUI.numerador;
import java.awt.EventQueue;
import javax.swing.JFrame;
import org.jvnet.substance.SubstanceLookAndFeel;

public class DigitalizacionArchivo {

    public static void main(String[] args) {
        
       
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    JFrame.setDefaultLookAndFeelDecorated(true);
                    SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.NebulaSkin");
                } catch (Exception e) {
                }

                numerador numerar=new numerador();
                System.out.println(numerar.numero("13","2013"));
                
            }
        });
    }

}