
package logica;

import java.sql.Connection;
import java.sql.DriverManager;


public class conexion {
    Connection con=null;
    public Connection conexion(){
        try {
            Class.forName("org.sqlite.JDBC");
            con=DriverManager.getConnection("jdbc:sqlite:certificado.db");
        } catch (Exception e) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      System.exit(0);
        }
        return con;
    }
            
}
