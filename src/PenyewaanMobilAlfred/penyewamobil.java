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

public class penyewamobil extends javax.swing.JFrame {

    /**
     * Creates new form penyewamobil
     */
    public penyewamobil() {
        initComponents();
         DefaultTableModel dataModel = (DefaultTableModel) tabelmobil.getModel();
   
    int rowCount = dataModel.getRowCount();
    while (rowCount > 0) {
        dataModel.removeRow(rowCount - 1);
        rowCount = dataModel.getRowCount();
        
    }   
    }

public void clear() {
TxtNama.setText("");
TxtKode.setText("");
TxtUmur.setText("");
TxtAlamat.setText("");
TxtSewa.setText("");
TxtKembali.setText("");
TxtTenggat.setText("");
TxtDenda.setText("");
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TxtNama = new javax.swing.JTextField();
        TxtKode = new javax.swing.JTextField();
        TxtUmur = new javax.swing.JTextField();
        TxtAlamat = new javax.swing.JTextField();
        TxtSewa = new javax.swing.JTextField();
        TxtKembali = new javax.swing.JTextField();
        TxtTenggat = new javax.swing.JTextField();
        BtnSelesai = new javax.swing.JButton();
        BtnBatal = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        TxtDenda = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelmobil = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        TxtID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("FORMULIR DATA PENYEWA MOBIL");

        jLabel2.setText("Nama :");

        jLabel3.setText("Kode_sewa :");

        jLabel4.setText("Umur :");

        jLabel5.setText("Alamat :");

        jLabel6.setText("Tanggal Sewa :");

        jLabel7.setText("Tenggat :");

        jLabel8.setText("Tanggal Dikembalikan :");

        TxtKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtKembaliActionPerformed(evt);
            }
        });

        BtnSelesai.setText("Simpan");
        BtnSelesai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSelesaiActionPerformed(evt);
            }
        });

        BtnBatal.setText("Batal");

        jLabel9.setText("Denda :");

        jButton1.setText("Hapus");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tabelmobil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nama", "Kode_Sewa", "Umur", "Alamat", "Tanggal Sewa", "Tanggal Dikembalikan", "Tenggat", "Denda", "ID PEMBELI"
            }
        ));
        jScrollPane2.setViewportView(tabelmobil);

        jLabel11.setText("id penyewa :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9))
                                .addGap(73, 73, 73)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtDenda)
                                    .addComponent(TxtTenggat)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(55, 55, 55)
                                .addComponent(TxtID))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TxtNama, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                                    .addComponent(TxtKode)
                                    .addComponent(TxtUmur)
                                    .addComponent(TxtAlamat)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtKembali, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                                    .addComponent(TxtSewa))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnSelesai)
                        .addGap(47, 47, 47)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jButton2))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TxtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(TxtKode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(TxtUmur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(TxtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnSelesai)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(BtnBatal)
                                .addComponent(jButton1)
                                .addComponent(jButton2)))))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TxtSewa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(TxtKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TxtTenggat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(TxtDenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(TxtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(256, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSelesaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSelesaiActionPerformed
        // TODO add your handling code here:
        int hari;
        int kerusakan;
        int denda;
        JOptionPane.showMessageDialog(null, "Data Penyewa Ditambahkan ke tabel");
        DefaultTableModel dataModel = (DefaultTableModel) tabelmobil.getModel();
        List list = new ArrayList<>();
        Penyewaa sewa = new Penyewaa();
        sewa.Nama(TxtNama.getText());
        sewa.kodesewa(TxtKode.getText());
        sewa.Umur(TxtUmur.getText());
        sewa.Alamat(TxtAlamat.getText());
        sewa.tglPinjam(TxtSewa.getText());
        sewa.tglDikembalikan(TxtKembali.getText());
        sewa.tenggat(TxtTenggat.getText());
        sewa.ID(TxtID.getText());
        hari = Integer.parseInt(TxtDenda.getText());
        //kerusakan = Integer.parseInt(rusak.getText());
        if(TxtDenda.getText().trim().isEmpty()){
            denda = sewa.denda();
        }else{
            denda = sewa.denda(hari);
        }
     list.add(sewa.Nama());
     list.add(sewa.kodesewa());
     list.add(sewa.Umur());
     list.add(sewa.Alamat());
     list.add(sewa.tglPinjam());
     list.add(sewa.tglDikembalikan());
     list.add(sewa.tenggat());
     list.add(denda);
     list.add(sewa.ID());
     dataModel.addRow(list.toArray());
     clear();
                

    }//GEN-LAST:event_BtnSelesaiActionPerformed

    private void TxtKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtKembaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtKembaliActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(penyewamobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(penyewamobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(penyewamobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(penyewamobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new penyewamobil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBatal;
    private javax.swing.JButton BtnSelesai;
    private javax.swing.JTextField TxtAlamat;
    private javax.swing.JTextField TxtDenda;
    private javax.swing.JTextField TxtID;
    private javax.swing.JTextField TxtKembali;
    private javax.swing.JTextField TxtKode;
    private javax.swing.JTextField TxtNama;
    private javax.swing.JTextField TxtSewa;
    private javax.swing.JTextField TxtTenggat;
    private javax.swing.JTextField TxtUmur;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JTable tabelmobil;
    // End of variables declaration//GEN-END:variables
}