/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PenyewaanMobilAlfred;

/**
 *
 * @author acerN
 */
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;

public class GUI_PenyewaanMobil extends javax.swing.JFrame {

    /**
     * Creates new form GUI_PenyewaanMobil
     */
    public GUI_PenyewaanMobil() {
        initComponents();
        PenyewaanMobil sewa = new PenyewaanMobil();
        TxtHarga.setText(Integer.toString(sewa.HargaMobil));
        TxtHarga.setEnabled(false);
         DefaultTableModel dataModel = (DefaultTableModel) TxtPenyewaan1.getModel();
   
    int rowCount = dataModel.getRowCount();
    while (rowCount > 0) {
        dataModel.removeRow(rowCount - 1);
        rowCount = dataModel.getRowCount();  
    } 
    }

      public void clear() {
TxtNama.setText("");
TxtUmur.setText("");
TxtAlamat.setText("");
buttonGroup1.clearSelection();
buttonGroup2.clearSelection();
TxtDurasi.setText("");
TxtTanggal.setText("");
TxtHarga.setText("");
TxtID.setText("");
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TxtNama = new javax.swing.JTextField();
        TxtUmur = new javax.swing.JTextField();
        TxtAlamat = new javax.swing.JTextField();
        TxtDurasi = new javax.swing.JTextField();
        TxtAvanza = new javax.swing.JRadioButton();
        TxtBrio = new javax.swing.JRadioButton();
        TxtYaris = new javax.swing.JRadioButton();
        TxtMerah = new javax.swing.JRadioButton();
        TxtHitam = new javax.swing.JRadioButton();
        TxtPutih = new javax.swing.JRadioButton();
        BTNcetak = new javax.swing.JButton();
        TxtBatal = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        TxtTanggal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TxtHarga = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        TxtPenyewaan1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        TxtID = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("FORMULIR PENYEWAAN");

        jLabel2.setText("Nama :");

        jLabel3.setText("Umur :");

        jLabel4.setText("Alamat :");

        jLabel5.setText("Jenis Mobil :");

        jLabel6.setText("Warna Mobil :");

        jLabel7.setText("Durasi Penyewaan :");

        TxtNama.setText(" ");
        TxtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNamaActionPerformed(evt);
            }
        });

        buttonGroup1.add(TxtAvanza);
        TxtAvanza.setText("Avanza");
        TxtAvanza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtAvanzaActionPerformed(evt);
            }
        });

        buttonGroup1.add(TxtBrio);
        TxtBrio.setText("Brio");

        buttonGroup1.add(TxtYaris);
        TxtYaris.setText("Yaris");

        buttonGroup2.add(TxtMerah);
        TxtMerah.setText("Merah");

        buttonGroup2.add(TxtHitam);
        TxtHitam.setText("Hitam");
        TxtHitam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtHitamActionPerformed(evt);
            }
        });

        buttonGroup2.add(TxtPutih);
        TxtPutih.setText("Putih");
        TxtPutih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPutihActionPerformed(evt);
            }
        });

        BTNcetak.setText("Simpan");
        BTNcetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNcetakActionPerformed(evt);
            }
        });

        TxtBatal.setText("Hapus");
        TxtBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtBatalActionPerformed(evt);
            }
        });

        jLabel9.setText("Tanggal Penyewaan :");

        jLabel10.setText("Harga : ");

        TxtPenyewaan1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nama", "Umur", "Alamat", "Jenis Mobil", "Warna Mobl", "Durasi Penyewaan", "Tanggal Penyewaan", "Harga", "ID"
            }
        ));
        jScrollPane3.setViewportView(TxtPenyewaan1);

        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel11.setText("id pembeli :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addGap(87, 87, 87)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtNama, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                                    .addComponent(TxtUmur)
                                    .addComponent(TxtAlamat)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(89, 89, 89)
                                .addComponent(TxtHarga))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel11))
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(TxtAvanza)
                                                .addGap(31, 31, 31)
                                                .addComponent(TxtBrio, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(TxtYaris))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(TxtMerah)
                                                .addGap(36, 36, 36)
                                                .addComponent(TxtHitam)
                                                .addGap(27, 27, 27)
                                                .addComponent(TxtPutih)))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(TxtID))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BTNcetak)
                                .addGap(34, 34, 34)
                                .addComponent(TxtBatal)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)))
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(22, 22, 22)
                                .addComponent(TxtDurasi))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TxtTanggal)))
                        .addGap(121, 121, 121))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TxtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TxtUmur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(TxtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(TxtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(TxtAvanza)
                            .addComponent(TxtBrio)
                            .addComponent(TxtYaris))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtMerah)
                            .addComponent(TxtHitam)
                            .addComponent(TxtPutih)
                            .addComponent(jLabel6)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtBatal)
                            .addComponent(jButton1)
                            .addComponent(BTNcetak))))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TxtDurasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(TxtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(419, 419, 419)
                .addComponent(jLabel8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNamaActionPerformed

    private void TxtAvanzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtAvanzaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtAvanzaActionPerformed

    private void TxtHitamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtHitamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtHitamActionPerformed

    private void TxtPutihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPutihActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPutihActionPerformed

    private void TxtBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtBatalActionPerformed
DefaultTableModel dataModel = (DefaultTableModel)
TxtPenyewaan1.getModel();
 int rowCount = dataModel.getRowCount();
 while (rowCount > 0){
 dataModel.removeRow(rowCount - 1);
 rowCount = dataModel.getRowCount();
 }
        
    }//GEN-LAST:event_TxtBatalActionPerformed

    private void BTNcetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNcetakActionPerformed
        JOptionPane.showMessageDialog(null, "Data Penyewa Ditambahkan ke tabel");
       DefaultTableModel dataModel = (DefaultTableModel) TxtPenyewaan1.getModel();
       List list = new ArrayList<>();
        PenyewaanMobil sewa = new PenyewaanMobil();
        sewa.Nama(TxtNama.getText());
        sewa.Umur(TxtUmur.getText());
        sewa.Alamat(TxtAlamat.getText());
        sewa.tanggal(TxtTanggal.getText());
        sewa.ID(TxtID.getText());
        
        String JenisMobil="";
        if (TxtAvanza.isSelected()){
            sewa.JenisMobil(TxtAvanza.getText());
        }
        else if (TxtBrio.isSelected()){
            sewa.JenisMobil(TxtBrio.getText());
        }
        else{
            sewa.JenisMobil(TxtYaris.getText());
        }
        String WarnaMobil="";
        if (TxtMerah.isSelected()){
            sewa.WarnaMobil(TxtMerah.getText());

        }
        else if (TxtHitam.isSelected()){
            sewa.WarnaMobil(TxtHitam.getText());
        }
        else {
            sewa.WarnaMobil(TxtPutih.getText());
        }
       sewa.HargaMobil = Integer.parseInt(TxtHarga.getText());
 sewa.DurasiPenyewaan = Integer.parseInt(TxtDurasi.getText());
 
 list.add(sewa.Nama());
 list.add(sewa.Umur());
 list.add(sewa.Alamat());
 list.add(sewa.JenisMobil());
 list.add(sewa.WarnaMobil());
 list.add(sewa.DurasiPenyewaan()+" Hari");
 list.add(sewa.tanggal());
 list.add(sewa.HargaMobil());
 list.add(sewa.ID());
 dataModel.addRow(list.toArray());
 clear();

    }//GEN-LAST:event_BTNcetakActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
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
            java.util.logging.Logger.getLogger(GUI_PenyewaanMobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_PenyewaanMobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_PenyewaanMobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_PenyewaanMobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_PenyewaanMobil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNcetak;
    private javax.swing.JTextField TxtAlamat;
    private javax.swing.JRadioButton TxtAvanza;
    private javax.swing.JButton TxtBatal;
    private javax.swing.JRadioButton TxtBrio;
    private javax.swing.JTextField TxtDurasi;
    private javax.swing.JTextField TxtHarga;
    private javax.swing.JRadioButton TxtHitam;
    private javax.swing.JTextField TxtID;
    private javax.swing.JRadioButton TxtMerah;
    private javax.swing.JTextField TxtNama;
    private javax.swing.JTable TxtPenyewaan1;
    private javax.swing.JRadioButton TxtPutih;
    private javax.swing.JTextField TxtTanggal;
    private javax.swing.JTextField TxtUmur;
    private javax.swing.JRadioButton TxtYaris;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
