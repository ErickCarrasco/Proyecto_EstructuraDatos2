package source;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MainFrame extends javax.swing.JFrame {

    boolean togglesOpen=false;
    public MainFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu_File_mains = new javax.swing.JMenu();
        jMenu_Create_File = new javax.swing.JMenuItem();
        jMenu_Save_File = new javax.swing.JMenuItem();
        jMenu_Close_File = new javax.swing.JMenuItem();
        jMenu_Exit = new javax.swing.JMenuItem();
        jMenu_Edit_File = new javax.swing.JMenu();
        jMenu_RecordMenu = new javax.swing.JMenu();
        jMenuItem_Add_Record = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 384, Short.MAX_VALUE)
        );

        jMenu_File_mains.setText("Menu");
        jMenu_File_mains.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu_File_mainsMouseClicked(evt);
            }
        });

        jMenu_Create_File.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenu_Create_File.setText("Create File");
        jMenu_Create_File.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu_Create_FileMouseClicked(evt);
            }
        });
        jMenu_Create_File.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_Create_FileActionPerformed(evt);
            }
        });
        jMenu_File_mains.add(jMenu_Create_File);

        jMenu_Save_File.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenu_Save_File.setText("Save File");
        jMenu_Save_File.setEnabled(false);
        jMenu_File_mains.add(jMenu_Save_File);

        jMenu_Close_File.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_END, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenu_Close_File.setText("Close File");
        jMenu_Close_File.setEnabled(false);
        jMenu_File_mains.add(jMenu_Close_File);

        jMenu_Exit.setText("Exit");
        jMenu_Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu_ExitMouseClicked(evt);
            }
        });
        jMenu_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_ExitActionPerformed(evt);
            }
        });
        jMenu_File_mains.add(jMenu_Exit);

        jMenuBar2.add(jMenu_File_mains);

        jMenu_Edit_File.setText("Edit");
        jMenu_Edit_File.setEnabled(false);
        jMenuBar2.add(jMenu_Edit_File);

        jMenu_RecordMenu.setText("Record");
        jMenu_RecordMenu.setEnabled(false);

        jMenuItem_Add_Record.setText("Add Record");
        jMenu_RecordMenu.add(jMenuItem_Add_Record);

        jMenuBar2.add(jMenu_RecordMenu);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu_File_mainsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu_File_mainsMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenu_File_mainsMouseClicked

    private void jMenu_ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu_ExitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenu_ExitMouseClicked

    private void jMenu_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_ExitActionPerformed

        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu_ExitActionPerformed

    private void jMenu_Create_FileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu_Create_FileMouseClicked
        // TODO add your handling code here:
        if (togglesOpen==false) {
            jMenu_Save_File.setEnabled(true);
            jMenu_Close_File.setEnabled(true);
            togglesOpen=true;
        }
        else if (togglesOpen==true) {
            String decision;
            decision = JOptionPane.showInputDialog(this, "Do you want to save the actual file? 1/Yes 2/ No", "programe en espanyol prro", 0);
            if (decision.equals("1")) {
                
            }
            else{
                JOptionPane.showMessageDialog(jMenu1, "All data will be lost ", "Data Expunged ", 0);
            }
        }
    }//GEN-LAST:event_jMenu_Create_FileMouseClicked

    private void jMenu_Create_FileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_Create_FileActionPerformed
        // TODO add your handling code here:
        if (togglesOpen==false) {
            jMenu_Save_File.setEnabled(true);
            jMenu_Close_File.setEnabled(true);
            togglesOpen=true;
            
            
            //crear archivo de texto
            AdminArchivoT AA = new AdminArchivoT("");
        }
        else if (togglesOpen==true) {
            String decision;
            decision = JOptionPane.showInputDialog(this, "Do you want to save the actual file? 1/Yes 2/ No", "programe en espanyol prro", 0);
            if (decision.equals("1")) {
                
            }
            else{
                JOptionPane.showMessageDialog(this, "All data will be lost ", "Data Expunged ", 0);
            }
        }
    }//GEN-LAST:event_jMenu_Create_FileActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem_Add_Record;
    private javax.swing.JMenuItem jMenu_Close_File;
    private javax.swing.JMenuItem jMenu_Create_File;
    private javax.swing.JMenu jMenu_Edit_File;
    private javax.swing.JMenuItem jMenu_Exit;
    private javax.swing.JMenu jMenu_File_mains;
    private javax.swing.JMenu jMenu_RecordMenu;
    private javax.swing.JMenuItem jMenu_Save_File;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
