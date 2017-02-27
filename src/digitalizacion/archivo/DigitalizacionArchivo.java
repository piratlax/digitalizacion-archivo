package digitalizacion.archivo;

import GUI.Portada;
import GUI.migrador;
import java.awt.EventQueue;
import javax.swing.JFrame;
import org.jvnet.substance.SubstanceLookAndFeel;

public class DigitalizacionArchivo {

    public static void main(String[] args) {
        migrador clase=new migrador();
                clase.migraDatos();
        /*
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    JFrame.setDefaultLookAndFeelDecorated(true);
                    SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.NebulaSkin");
                } catch (Exception e) {
                }

                //new Portada().setVisible(true);
                
            }
        });
    }*/
}
}