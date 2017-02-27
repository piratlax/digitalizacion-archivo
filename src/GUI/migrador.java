package GUI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import logica.conexion;

public class migrador {

    conexion con = new conexion();
    Connection cn = con.conexion();
    String pdfInicio = null;
    String pdfFinal = null;
    int conteo = 1;

    String id;
    String numero;
    String folio;
    String matricula;
    String nombre;
    String paterno;
    String materno;
    String plantel;
    String periodo;

    public void migraDatos() {
        //System.out.println ("hola");
        try {
            String sql = "SELECT * FROM alumno";
            Statement st;
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                id = rs.getString("id");
                numero = rs.getString("numero");
                folio = rs.getString("folio");
                matricula = rs.getString("matricula");
                nombre = rs.getString("nombre");
                paterno = rs.getString("paterno");
                materno = rs.getString("materno");
                plantel = rs.getString("plantel");
                periodo = rs.getString("periodo");

                String pdfInicio = "c:\\sicap\\certificados\\" + plantel + "\\" + periodo + "\\" + numero
                        + "-" + matricula + ".pdf";
                File inFile = new File(pdfInicio);
                if (inFile.exists()) {
                    //System.out.println("existe");
                    try {
                        PreparedStatement pps = cn.prepareStatement("INSERT INTO cobat (idCobat,folio,matricula,nombre,paterno,materno,plantel,periodo) "
                                + "VALUES (?,?,?,?,?,?,?,?)");
                        pps.setString(1, id);
                        pps.setString(2, folio);
                        pps.setString(3, matricula);
                        pps.setString(4, nombre);
                        pps.setString(5, paterno);
                        pps.setString(6, materno);
                        pps.setString(7, plantel);
                        pps.setString(8, periodo);
                        pps.executeUpdate();

                        pdfFinal = "c:\\sicap\\" + plantel + "\\" + id + ".pdf";
                        //File inFile = new File(pdfInicio);
                        File outFile = new File(pdfFinal);

                        FileInputStream in = new FileInputStream(inFile);
                        FileOutputStream out = new FileOutputStream(outFile);

                        int c;
                        while ((c = in.read()) != -1) {
                            out.write(c);
                        }

                        in.close();
                        out.close();

                        conteo++;
                    } catch (Exception e) {

                    }
                } else {
                    
                    System.out.println(numero+"-"+plantel + "-" + periodo + "-" + nombre + " " + paterno + " " + materno);
                }
            }
        } catch (Exception e) {
            System.out.println(plantel + " " + periodo + " " + nombre + " " + paterno + " " + materno);
        }

    }

}
