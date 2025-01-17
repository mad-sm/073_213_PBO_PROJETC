/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frame;

import controller.controllerHewan;
import javax.swing.JTable;
import Model.Hewan.*;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class hewan extends javax.swing.JFrame {

    /**
     * Creates new form hewan
     */
    controllerHewan data;
    public hewan() {
        initComponents();
        data = new controllerHewan(this);
        data.isitabel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelhewan = new javax.swing.JTable();
        Btambah = new javax.swing.JButton();
        Bedit = new javax.swing.JButton();
        Bhapus = new javax.swing.JButton();
        Bkembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabelhewan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nama", "Kelas", "Jenis Makanan"
            }
        ));
        tabelhewan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelhewanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelhewan);

        Btambah.setText("Tambah");
        Btambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtambahActionPerformed(evt);
            }
        });

        Bedit.setText("Edit");
        Bedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeditActionPerformed(evt);
            }
        });

        Bhapus.setText("Hapus");
        Bhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BhapusActionPerformed(evt);
            }
        });

        Bkembali.setText("Kembali");
        Bkembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BkembaliMouseClicked(evt);
            }
        });
        Bkembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BkembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 12, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Btambah, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Bedit, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Bhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Bkembali, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Btambah, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Bedit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Bhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Bkembali, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BhapusActionPerformed
        int selectedRow = tabelhewan.getSelectedRow();
    if (selectedRow != -1) {
        // Ambil ID dari baris yang dipilih
        int id = Integer.parseInt(tabelhewan.getValueAt(selectedRow, 0).toString());
        
        // Hapus baris dari model tabel
        ModelTableHewan model = (ModelTableHewan) tabelhewan.getModel();
        model.removeRow(selectedRow);
        
        // Panggil metode hapusData untuk menghapus data dari database
        data.hapusData(id);
        
        JOptionPane.showMessageDialog(this, "Data berhasil dihapus");
    } else {
        // Tampilkan pesan jika tidak ada baris yang dipilih
        JOptionPane.showMessageDialog(this, "Pilih baris yang ingin dihapus", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_BhapusActionPerformed

    private void BkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BkembaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BkembaliActionPerformed

    private void BkembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BkembaliMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new menu().setVisible(true);
    }//GEN-LAST:event_BkembaliMouseClicked

    private void tabelhewanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelhewanMouseClicked
       int baris = tabelhewan.getSelectedRow();
       
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelhewanMouseClicked

    private void BtambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtambahActionPerformed

                 this.setVisible(false);
        new Tambahhewan().setVisible(true);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_BtambahActionPerformed

    private void BeditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeditActionPerformed
        int selectedRow = tabelhewan.getSelectedRow();
    if (selectedRow != -1) {
        // Ambil data dari baris yang dipilih
        String id = tabelhewan.getValueAt(selectedRow, 0).toString();
        String nama = tabelhewan.getValueAt(selectedRow, 1).toString();
        String kelas = tabelhewan.getValueAt(selectedRow, 2).toString();
        String jenisMakanan = tabelhewan.getValueAt(selectedRow, 3).toString();

        // Buka form edit dengan data yang sudah diisi
        edithewan editForm = new edithewan(this, selectedRow, id, nama, kelas, jenisMakanan);
        editForm.setVisible(true);
    } else {
        // Tampilkan pesan jika tidak ada baris yang dipilih
        JOptionPane.showMessageDialog(this, "Pilih baris yang ingin diedit", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_BeditActionPerformed

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
            java.util.logging.Logger.getLogger(hewan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hewan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hewan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hewan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hewan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bedit;
    private javax.swing.JButton Bhapus;
    private javax.swing.JButton Bkembali;
    private javax.swing.JButton Btambah;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelhewan;
    // End of variables declaration//GEN-END:variables

    public JTable getTabelhewan() {
        return tabelhewan;
    }
    

    public void setTabelhewan(JTable tabelhewan) {
        this.tabelhewan = tabelhewan;
    }
    
}
