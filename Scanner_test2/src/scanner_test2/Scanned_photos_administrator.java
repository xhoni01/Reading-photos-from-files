/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package scanner_test2;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author First-it09
 */
public class Scanned_photos_administrator extends javax.swing.JFrame {

    /**
     * Creates new form Scanned_photos
     */
    public Scanned_photos_administrator() {
        initComponents();
        getImagesName();
    }
Show_scanned_photos show = new Show_scanned_photos();

public void getImagesName()
{ 
    try{
    File file = new File(getClass().getResource("/scanner/Scanner_images").getFile());
    Object[] files = file.list();
    DefaultTableModel model = (DefaultTableModel)jTable_Images.getModel();
    model.setColumnIdentifiers(new String[] {"Images Names"});
    Object[] row = new Object[1];
    for (int i = 0; i < files.length; i++)
    {
        row[0]=files[i];
        model.addRow(row);
    }
}catch(Exception e){
    System.out.println(e);
}
    
    
            
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Images = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jTable_Images.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_Images.setRequestFocusEnabled(false);
        jTable_Images.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_ImagesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Images);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Rifresko");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable_ImagesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_ImagesMouseClicked
        int index = jTable_Images.getSelectedRow();
        TableModel model = jTable_Images.getModel();
        String imageName = model.getValueAt(index, 0).toString();
        show.setVisible(true);
        show.pack();
        show.setLocationRelativeTo(null);
        show.setDefaultCloseOperation(Scanned_photos_administrator.DISPOSE_ON_CLOSE);
        
        ImageIcon icon = new ImageIcon(getClass().getResource("/scanner/Scanner_images/"+imageName));
        Image img = icon.getImage().getScaledInstance(show.jLabel_show_image.getWidth(), show.jLabel_show_image.getHeight(), Image.SCALE_SMOOTH);
        show.jLabel_show_image.setIcon(new ImageIcon(img));
    }//GEN-LAST:event_jTable_ImagesMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   DefaultTableModel model1 = (DefaultTableModel)jTable_Images.getModel();
   model1.setColumnCount(0);
   model1.setRowCount(0);
   try{
    File file = new File(getClass().getResource("/scanner/Scanner_images").getFile());
    Object[] files = file.list();
    DefaultTableModel model = (DefaultTableModel)jTable_Images.getModel();
    model.setColumnIdentifiers(new String[] {"Images Names"});
    Object[] row = new Object[1];
    for (int i = 0; i < files.length; i++)
    {
        row[0]=files[i];
        model.addRow(row);
    }
}catch(Exception e){
    System.out.println(e);
}
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Scanned_photos_administrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Scanned_photos_administrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Scanned_photos_administrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Scanned_photos_administrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Scanned_photos_administrator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable_Images;
    // End of variables declaration//GEN-END:variables
}
