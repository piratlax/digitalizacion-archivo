package GUI;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.conexion;

public class numerador {

    conexion con = new conexion();
    Connection cn = con.conexion();

    int conteo = 1;
    String plantel = "21";
    String periodo = "2013";

    /*String id;
    String numero;
    String folio;
    String matricula;
    String nombre;
    String paterno;
    String materno;
    String plantel;
    String periodo;
     */
    public void migraDatos() {

        try {
            String sql = "SELECT * FROM cobat where plantel='" + plantel + "' and periodo='" + periodo + "' ORDER BY folio ASC ";
            Statement st;
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String identificacion = rs.getString("idCobat");
                try {
                    PreparedStatement pps = cn.prepareStatement("UPDATE cobat SET numero='" + conteo + "' WHERE idCobat='" + identificacion + "'");
                    pps.executeUpdate();
                    System.out.println(conteo);
                    conteo++;

                } catch (Exception e) {
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(numerador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public String numero(String Plantel, String Periodo){
        int valor=0;
        try {
            String sql = "SELECT * FROM cobat where plantel='" + Plantel + "' and periodo='" + Periodo + "' ORDER BY folio ASC ";
            Statement st;
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
             valor++;   
            }
        } catch (SQLException ex) {
            Logger.getLogger(numerador.class.getName()).log(Level.SEVERE, null, ex);
        }
        ++valor;
        String resultado=Integer.toString(valor);
        return resultado;
    }

}
