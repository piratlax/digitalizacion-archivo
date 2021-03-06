
package GUI;


import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.conexion;


public class Digitalizados extends javax.swing.JFrame {
    
    int conteo;
    int limite;
    String idBorrar;
    conexion con=new conexion();
    Connection cn=con.conexion();
    DefaultTableModel modelo;
      
    public Digitalizados() {
        initComponents();
        this.setLocationRelativeTo(null);
        //mostrarEstudiante();
        cargar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jFileChooser2 = new javax.swing.JFileChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        txtBplantel = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtBperiodo = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtBnombre = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtBpaterno = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtBmaterno = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        txtcantidad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Sistema de Captura de Certificados");

        tabla.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        jLabel18.setText("Plantel");

        jLabel19.setText("Periodo");

        jLabel20.setText("Nombre");

        jLabel21.setText("Paterno");

        jLabel22.setText("Materno");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBplantel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBperiodo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBpaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBmaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar)
                .addGap(0, 52, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtBplantel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(txtBperiodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(txtBnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(txtBpaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(txtBmaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton8.setText("Salir");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel23.setText("Cantidad:");

        txtcantidad.setEditable(false);

        jLabel1.setText("Certificados");

        jButton9.setText("Certificado");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton8))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButton9))
                .addGap(18, 18, 18)
                .addComponent(jButton8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       String[] titulos={"Folio","Matricula","Nombre","Paterno","Materno","Plantel","Generacion"};
       String[] registros = new String [7];
       String sql="SELECT * FROM cobat WHERE (nombre like '%"+txtBnombre.getText()+"%')"+
               "and (paterno like '%"+txtBpaterno.getText()+"%')"+
               "and (materno like '%"+txtBmaterno.getText()+"%')"+
               "and (plantel like '%"+txtBplantel.getText()+"%')"+
               "and (periodo like '%"+txtBperiodo.getText()+"%')";
       
       modelo = new DefaultTableModel(null,titulos);
       
       conteo=0;       
       try {
       
       Statement table;
       table = cn.createStatement();
       ResultSet rs=table.executeQuery(sql);
       while (rs.next()){
           registros[0]=rs.getString("folio");
           registros[1]=rs.getString("matricula");
           registros[2]=rs.getString("nombre");
           registros[3]=rs.getString("paterno");
           registros[4]=rs.getString("materno");
           registros[5]=rs.getString("plantel");
           registros[6]=rs.getString("periodo");
           
           modelo.addRow(registros);
           conteo++;
       }
       tabla.setModel(modelo);
  
       txtcantidad.setText(Integer.toString(conteo));
               
       
       
                
        
    
       }
       catch (SQLException ex){
           System.out.println ("Sin poder ejecutar el query a la tabla");
       }
 
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try {
            // salir del sistema
            cn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Digitalizados.class.getName()).log(Level.SEVERE, null, ex);
        }
        Portada frm=new Portada();
        frm.toFront();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
      /* if (evt.getClickCount()==2){
          int fila = tabla.getSelectedRow();
        if (fila>=0){
            try {
                String sql="SELECT * FROM alumno WHERE (folio='"+tabla.getValueAt(fila, 2).toString()+"') and (matricula='"+
                tabla.getValueAt(fila, 3).toString()+"')and (numero='"+
                tabla.getValueAt(fila, 1).toString()+"')and (plantel='"+
                tabla.getValueAt(fila, 7).toString()+"')and (periodo='"+
                tabla.getValueAt(fila, 8).toString()+"')";
                Statement st;
                st = cn.createStatement();
                ResultSet rs=st.executeQuery(sql);
                while (rs.next()){
                    File path = new File ("c:/sicap/certificados/"+rs.getString("plantel")+"/"+rs.getString("periodo")+"/"+
                        rs.getString("numero")+"-"+rs.getString("matricula")+".pdf");
                    //System.out.println ("c:/sicap/certificados/"+rs.getString("plantel")+"/"+rs.getString("periodo")+"/"+
                        //        rs.getString("numero")+"-"+rs.getString("matricula")+".pdf");
                    try {
                        Desktop.getDesktop().open(path);
                    } catch (IOException ex) {
                        Logger.getLogger(Digitalizados.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            }
            catch (SQLException ex) {
                Logger.getLogger(Digitalizados.class.getName()).log(Level.SEVERE, null, ex);
            }

        } 
       }*/
    }//GEN-LAST:event_tablaMouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        //mostrar PDF

        int fila = tabla.getSelectedRow();
        if (fila>=0){
            try {
                String sql="SELECT * FROM cobat WHERE (folio='"+tabla.getValueAt(fila, 0).toString()+"') and (matricula='"+
                tabla.getValueAt(fila, 1).toString()+"')and (plantel='"+
                tabla.getValueAt(fila, 5).toString()+"')and (periodo='"+
                tabla.getValueAt(fila, 6).toString()+"')and (nombre='"+
                tabla.getValueAt(fila, 2).toString()+"')and (paterno='"+
                tabla.getValueAt(fila, 3).toString()+"')and (materno='"+
                tabla.getValueAt(fila, 4).toString()+"')";
                System.out.println (sql);
                Statement st;
                st = cn.createStatement();
                ResultSet rs=st.executeQuery(sql);
                while (rs.next()){
                    File path = new File ("c:/sicap/"+rs.getString("plantel")+"/"+rs.getString("idCobat")+".pdf");
                    
                    try {
                        Desktop.getDesktop().open(path);
                    } catch (IOException ex) {
                        Logger.getLogger(Digitalizados.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            }
            catch (SQLException ex) {
                Logger.getLogger(Digitalizados.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        else{

        }
    }//GEN-LAST:event_jButton9ActionPerformed

   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Digitalizados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Digitalizados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Digitalizados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Digitalizados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Digitalizados().setVisible(true);
            }
        });
    }
    
    
    
    void cargar(){
       // muestra datos en la tabla
       String[] titulos={"Folio","Matricula","Nombre","Paterno","Materno","Plantel","Generacion"};
       String[] registros = new String [7];
       String sql="SELECT * FROM cobat ORDER BY idCobat DESC";
       modelo = new DefaultTableModel(null,titulos);
       
              
       try {
       
       Statement table;
       table = cn.createStatement();
       ResultSet rs=table.executeQuery(sql);
       while (rs.next()){
           registros[0]=rs.getString("folio");
           registros[1]=rs.getString("matricula");
           registros[2]=rs.getString("nombre");
           registros[3]=rs.getString("paterno");
           registros[4]=rs.getString("materno");
           registros[5]=rs.getString("plantel");
           registros[6]=rs.getString("periodo");
           
           modelo.addRow(registros);
           conteo++;
       }
       tabla.setModel(modelo);
       //tabla.addMouseListener(new MouseAdapter() 
         // Busqueda en la tabla con el click del mouse
       txtcantidad.setText(Integer.toString(conteo));
       
       
       
                
        
    
       }
       catch (SQLException ex){
           System.out.println ("Sin poder ejecutar el query a la tabla");
       }
   }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JFileChooser jFileChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtBmaterno;
    private javax.swing.JTextField txtBnombre;
    private javax.swing.JTextField txtBpaterno;
    private javax.swing.JTextField txtBperiodo;
    private javax.swing.JTextField txtBplantel;
    private javax.swing.JTextField txtcantidad;
    // End of variables declaration//GEN-END:variables
}
