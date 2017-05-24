
package logica;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class conexion {
    Connection con=null;
    public Connection conexion(){
        File f = new File("c:/sicap/DB/certificado.db");
        if(f.exists() && !f.isDirectory()) { 
        try {
            Class.forName("org.sqlite.JDBC");
            con=DriverManager.getConnection("jdbc:sqlite:c:/sicap/DB/certificado.db");
        } catch (Exception e) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      System.exit(0);
        }
        return con;
    }
        return con;
    }
    
}
