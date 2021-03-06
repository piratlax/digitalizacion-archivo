
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


public class Inventariado extends javax.swing.JFrame {
   
    int conteo,certificados;
    int limite;
    String idBorrar;
    String sql;
    conexion con=new conexion();
    Connection cn=con.conexion();
    DefaultTableModel modelo;
      
    public Inventariado() {
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
        txtcaja = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtplantel = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jcCat = new javax.swing.JComboBox<>();
        jButton8 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        txtcantidad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtcertificado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

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

        jLabel18.setText("Caja");

        jLabel19.setText("Plantel");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jButton1.setText("Listado");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jcCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "todos", "plantel", "gabino", "iese", "caja", "archivero", "digital" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jcCat, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtcaja, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtplantel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnBuscar)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtcaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(txtplantel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(jButton1)
                    .addComponent(jcCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jButton8.setText("Salir");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel23.setText("Cantidad:");

        txtcantidad.setEditable(false);
        txtcantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidadActionPerformed(evt);
            }
        });

        jLabel1.setText("Legajos");

        jLabel24.setText("Cantidad:");

        txtcertificado.setEditable(false);

        jLabel2.setText("Certificados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton8)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtcertificado, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)))))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel24)
                        .addComponent(txtcertificado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel23)
                        .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addComponent(jButton8)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       String[] titulos={"Cat","Caja","Nombre","Plantel","Generacion","Documento","Observacion","cantidad"};
       String[] registros = new String [8];
       String cat=jcCat.getSelectedItem().toString();
       txtcantidad.setText("");
       if (cat.equals("todos")){
            sql="SELECT * FROM inventario WHERE caja='"+txtcaja.getText()+"'"+
               "and plantel='"+txtplantel.getText()+"' ORDER BY caja ASC";
       }else{
            sql="SELECT * FROM inventario WHERE caja='"+txtcaja.getText()+"'"+
               "and plantel like('%"+txtplantel.getText()+"%')"
                    + "and cat='"+cat+"'";
       }
       modelo = new DefaultTableModel(null,titulos);
       
       conteo=0;
       certificados=0;
       try {
       
       Statement table;
       table = cn.createStatement();
       ResultSet rs=table.executeQuery(sql);
       while (rs.next()){
           registros[0]=rs.getString("cat");
           registros[1]=rs.getString("caja");
           registros[2]=rs.getString("nombre");
           registros[3]=rs.getString("plantel");
           registros[4]=rs.getString("generacion");
           registros[5]=rs.getString("documento");
           registros[6]=rs.getString("observacion");
           registros[7]=rs.getString("cantidad");
           
           
           modelo.addRow(registros);
           if (rs.getString("observacion").equals("LEGAJOS")){
           int agregar =Integer.parseInt(rs.getString("cantidad"));
           conteo=conteo+agregar;
       }
           
           
           if (rs.getString("observacion").equals("CERTIFICADO")){
           int agregar =Integer.parseInt(rs.getString("cantidad"));
           certificados=certificados+agregar;
       }
       }
       tabla.setModel(modelo);
       //tabla.addMouseListener(new MouseAdapter() 
         // Busqueda en la tabla con el click del mouse
       txtcantidad.setText(Integer.toString(conteo));
       txtcertificado.setText(Integer.toString(certificados));
       
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
            Logger.getLogger(Inventariado.class.getName()).log(Level.SEVERE, null, ex);
        }
        Portada frm=new Portada();
        frm.toFront();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
       if (evt.getClickCount()==2){
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
                        Logger.getLogger(Inventariado.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            }
            catch (SQLException ex) {
                Logger.getLogger(Inventariado.class.getName()).log(Level.SEVERE, null, ex);
            }

        } 
       }
    }//GEN-LAST:event_tablaMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        cargar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtcantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidadActionPerformed

   
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
            java.util.logging.Logger.getLogger(Inventariado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventariado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventariado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventariado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventariado().setVisible(true);
            }
        });
    }
    
    /*public void mostrarEstudiante(){
        
        // lee los estudiantes de la previa base de datos
        try {
           String sql="SELECT * FROM estudiante ORDER By id DESC ";
           Statement st;
           st = cn.createStatement();
           ResultSet rs=st.executeQuery(sql);
            while (rs.next()){
               txtId.setText(rs.getString("id"));
               conteo=Integer.parseInt(rs.getString("id"));
               limite=Integer.parseInt(rs.getString("id"));
               txtFolio.setText(rs.getString("folio"));
               txtMatricula.setText(rs.getString("matricula"));
               txtNombre.setText(rs.getString("nombre"));
               txtPaterno.setText(rs.getString("paterno"));
               txtMaterno.setText(rs.getString("materno"));
               txtPlantel.setText(rs.getString("plantel"));
               txtPeriodo.setText(rs.getString("periodo"));
               btnGrabar.setEnabled(false);
        btnActualizar.setEnabled(false);
               
           }
        } catch (SQLException ex) {
            Logger.getLogger(Digitalizados.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }
    */
    //mostrar tabla
    
    void cargar(){
       // muestra datos en la tabla
       String[] titulos={"id","Caja","Nombre","Plantel","Generacion","Documento","Observacion","cantidad"};
       String[] registros = new String [8];
       String sql="SELECT * FROM inventario ORDER BY id ASC";
       modelo = new DefaultTableModel(null,titulos);
       
              
       try {
       
       Statement table;
       table = cn.createStatement();
       ResultSet rs=table.executeQuery(sql);
       while (rs.next()){
           registros[0]=rs.getString("cat");
           registros[1]=rs.getString("caja");
           registros[2]=rs.getString("nombre");
           registros[3]=rs.getString("plantel");
           registros[4]=rs.getString("generacion");
           registros[5]=rs.getString("documento");
           registros[6]=rs.getString("observacion");
           registros[7]=rs.getString("cantidad");
           
           
           modelo.addRow(registros);
           conteo++;
           if (rs.getString("observacion").equals("CERTIFICADO")){
           int agregar =Integer.parseInt(rs.getString("cantidad"));
           certificados=certificados+agregar;
       }
       }
       tabla.setModel(modelo);
       //tabla.addMouseListener(new MouseAdapter() 
         // Busqueda en la tabla con el click del mouse
       txtcantidad.setText(Integer.toString(conteo));
       txtcertificado.setText(Integer.toString(certificados));
       
       
       
                
        
    
       }
       catch (SQLException ex){
           System.out.println ("Sin poder ejecutar el query a la tabla");
       }
   }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton8;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JFileChooser jFileChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcCat;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtcaja;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtcertificado;
    private javax.swing.JTextField txtplantel;
    // End of variables declaration//GEN-END:variables
}
