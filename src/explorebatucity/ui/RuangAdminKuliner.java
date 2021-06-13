/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package explorebatucity.ui;

import explorebatucity.DB.koneksi;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import explorebatucity.kelas.kuliner;
import javax.swing.JOptionPane;



/**
 *
 * @author Zidan
 */
public class RuangAdminKuliner extends javax.swing.JFrame {

    kuliner app = new kuliner();

    /**
     * Creates new form Admin
     */
    public RuangAdminKuliner() {
        initComponents();
        tampil_combo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtnamatempat = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtnotelp = new javax.swing.JTextField();
        txtjambuka = new javax.swing.JTextField();
        txtalamat = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TombolTambah = new javax.swing.JButton();
        Tombolkosong = new javax.swing.JButton();
        TombolLogout = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtinfo = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtkeunikan = new javax.swing.JTextArea();
        TombolUpdate = new javax.swing.JButton();
        TombolDelete = new javax.swing.JButton();
        ComboBox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Explore Batu City");
        setLocation(new java.awt.Point(250, 80));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(46, 204, 113));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Keunikan");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        txtnamatempat.setBackground(new java.awt.Color(46, 204, 113));
        txtnamatempat.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        txtnamatempat.setForeground(new java.awt.Color(255, 255, 255));
        txtnamatempat.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtnamatempat.setBorder(null);
        jPanel3.add(txtnamatempat, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 270, 30));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nama Tempat");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Alamat");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Buka");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Telepon");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        txtnotelp.setBackground(new java.awt.Color(46, 204, 113));
        txtnotelp.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtnotelp.setForeground(new java.awt.Color(255, 255, 255));
        txtnotelp.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtnotelp.setBorder(null);
        jPanel3.add(txtnotelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 550, 20));

        txtjambuka.setBackground(new java.awt.Color(46, 204, 113));
        txtjambuka.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtjambuka.setForeground(new java.awt.Color(255, 255, 255));
        txtjambuka.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtjambuka.setBorder(null);
        jPanel3.add(txtjambuka, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 550, 20));

        txtalamat.setBackground(new java.awt.Color(46, 204, 113));
        txtalamat.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtalamat.setForeground(new java.awt.Color(255, 255, 255));
        txtalamat.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtalamat.setBorder(null);
        jPanel3.add(txtalamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 550, 20));

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Deskripsi");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel9.setFont(new java.awt.Font("Minecraftia", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Ruang - Admin Kuliner");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, -1, 40));

        TombolTambah.setBackground(new java.awt.Color(51, 255, 0));
        TombolTambah.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        TombolTambah.setForeground(new java.awt.Color(255, 255, 255));
        TombolTambah.setText("Tambahkan");
        TombolTambah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TombolTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolTambahActionPerformed(evt);
            }
        });
        jPanel3.add(TombolTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 130, 30));

        Tombolkosong.setBackground(new java.awt.Color(0, 0, 0));
        Tombolkosong.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        Tombolkosong.setForeground(new java.awt.Color(255, 255, 255));
        Tombolkosong.setText("Kosongkan Ruang");
        Tombolkosong.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Tombolkosong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolkosongActionPerformed(evt);
            }
        });
        jPanel3.add(Tombolkosong, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 450, 160, 30));

        TombolLogout.setBackground(new java.awt.Color(231, 76, 60));
        TombolLogout.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        TombolLogout.setForeground(new java.awt.Color(255, 255, 255));
        TombolLogout.setText("Kembali ke Menu Utama");
        TombolLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TombolLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolLogoutActionPerformed(evt);
            }
        });
        jPanel3.add(TombolLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 610, 30));

        jScrollPane2.setBorder(null);

        txtinfo.setBackground(new java.awt.Color(46, 204, 113));
        txtinfo.setColumns(20);
        txtinfo.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtinfo.setForeground(new java.awt.Color(255, 255, 255));
        txtinfo.setRows(5);
        txtinfo.setTabSize(5);
        txtinfo.setBorder(null);
        txtinfo.setCaretColor(new java.awt.Color(39, 174, 96));
        txtinfo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtinfo.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        txtinfo.setSelectionColor(new java.awt.Color(39, 174, 96));
        jScrollPane2.setViewportView(txtinfo);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 550, 100));

        jScrollPane3.setBorder(null);

        txtkeunikan.setBackground(new java.awt.Color(46, 204, 113));
        txtkeunikan.setColumns(20);
        txtkeunikan.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtkeunikan.setForeground(new java.awt.Color(255, 255, 255));
        txtkeunikan.setRows(5);
        txtkeunikan.setTabSize(5);
        txtkeunikan.setBorder(null);
        txtkeunikan.setCaretColor(new java.awt.Color(39, 174, 96));
        txtkeunikan.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtkeunikan.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        txtkeunikan.setSelectionColor(new java.awt.Color(39, 174, 96));
        jScrollPane3.setViewportView(txtkeunikan);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 550, 100));

        TombolUpdate.setBackground(new java.awt.Color(0, 0, 255));
        TombolUpdate.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        TombolUpdate.setForeground(new java.awt.Color(255, 255, 255));
        TombolUpdate.setText("Update");
        TombolUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TombolUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolUpdateActionPerformed(evt);
            }
        });
        jPanel3.add(TombolUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, 130, 30));

        TombolDelete.setBackground(new java.awt.Color(231, 76, 60));
        TombolDelete.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        TombolDelete.setForeground(new java.awt.Color(255, 255, 255));
        TombolDelete.setText("Hapus");
        TombolDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TombolDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolDeleteActionPerformed(evt);
            }
        });
        jPanel3.add(TombolDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, 130, 30));

        ComboBox.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxActionPerformed(evt);
            }
        });
        jPanel3.add(ComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 260, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 720, 540));

        jLabel6.setIcon(new javax.swing.ImageIcon("D:\\File Programming\\Semester 2\\Tugas Prak PBO\\netbeans\\7. Project UAS\\explorebatucity\\src\\explorebatucity\\icon\\apple.png")); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 480, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void tampil_combo() {
        try {
        Connection con = koneksi.koneksiDB();
        Statement stt = con.createStatement();
        String sql = "select namatempat from kuliner order by namatempat asc";      
        ResultSet res = stt.executeQuery(sql);                                
        ComboBox.addItem("");
       
        while(res.next()){
            Object[] halo = new Object[1];
            halo[0] = res.getString(1);
            
            ComboBox.addItem((String) halo[0]);                                      
        }
        res.close(); stt.close();
         
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void tampilcb() {
        try {
        Connection con = koneksi.koneksiDB();
        Statement stt = con.createStatement();
        String sql = "select namatempat, info, alamat, jambuka, notelp, menukhas from kuliner where namatempat='"
                +ComboBox.getSelectedItem()+"'";  
        ResultSet res = stt.executeQuery(sql);
        
        while(res.next()){
            Object[] ob = new Object[6];
            ob[0]= res.getString(1);
            ob[1]= res.getString(2);
            ob[2]= res.getString(3);
            ob[3]= res.getString(4);
            ob[4]= res.getString(5);
            ob[5]= res.getString(6);
            
            txtnamatempat.setText((String) ob[0]);
            txtinfo.setText((String) ob[1]);
            txtalamat.setText((String) ob[2]);
            txtjambuka.setText((String) ob[3]);
            txtnotelp.setText((String) ob[4]);
            txtkeunikan.setText((String) ob[5]);
        }
        res.close(); stt.close();
         
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }              
    }
    
    private void TombolLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolLogoutActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new RuangAdminUtama().setVisible(true);
    }//GEN-LAST:event_TombolLogoutActionPerformed

    private void TombolTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolTambahActionPerformed
        // TODO add your handling code here:
        try {
            app.setNamatempat(txtnamatempat.getText());
            app.setInfo(txtinfo.getText());
            app.setAlamat(txtalamat.getText());
            app.setJambuka(txtjambuka.getText());
            app.setNotelp(Integer.parseInt(txtnotelp.getText()));
            app.setMenukhas(txtkeunikan.getText());
            
            app.simpandata(
                    app.getNamatempat(),
                    app.getInfo(),
                    app.getAlamat(),
                    app.getJambuka(),
                    app.getNotelp(),
                    app.getMenukhas());
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
            
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Data Telah Ditambahkan");
        }
    }//GEN-LAST:event_TombolTambahActionPerformed

    private void TombolUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolUpdateActionPerformed
        // TODO add your handling code here:
        try {
            app.setNamatempat(txtnamatempat.getText());
            app.setInfo(txtinfo.getText());
            app.setAlamat(txtalamat.getText());
            app.setJambuka(txtjambuka.getText());
            app.setNotelp(Integer.parseInt(txtnotelp.getText()));
            app.setMenukhas(txtkeunikan.getText());
            
            app.ubahdata(
                    app.getNamatempat(),
                    app.getInfo(),
                    app.getAlamat(),
                    app.getJambuka(),
                    app.getNotelp(),
                    app.getMenukhas());
            JOptionPane.showMessageDialog(null, "Data Berhasil Diupdate");
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "DATA SUDAH ADA");
        }
    }//GEN-LAST:event_TombolUpdateActionPerformed

    private void ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxActionPerformed
        // TODO add your handling code here:
        tampilcb();
    }//GEN-LAST:event_ComboBoxActionPerformed

    private void TombolkosongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolkosongActionPerformed
        // TODO add your handling code here:
        txtnamatempat.setText("");
        txtinfo.setText("");
        txtalamat.setText("");
        txtjambuka.setText("");
        txtnotelp.setText("");
        txtkeunikan.setText("");
    }//GEN-LAST:event_TombolkosongActionPerformed

    private void TombolDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolDeleteActionPerformed
        // TODO add your handling code here:
        try {
            app.setNamatempat(txtnamatempat.getText());
            app.hapusdata(app.getNamatempat());
            JOptionPane.showMessageDialog(null, "Data berhasil Dihapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data gagal Dihapus");
        }
    }//GEN-LAST:event_TombolDeleteActionPerformed

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
                if ("Flatlaf Dark".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RuangAdminKuliner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RuangAdminKuliner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RuangAdminKuliner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RuangAdminKuliner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new RuangAdminKuliner().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBox;
    private javax.swing.JButton TombolDelete;
    private javax.swing.JButton TombolLogout;
    private javax.swing.JButton TombolTambah;
    private javax.swing.JButton TombolUpdate;
    private javax.swing.JButton Tombolkosong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField txtalamat;
    private javax.swing.JTextArea txtinfo;
    private javax.swing.JTextField txtjambuka;
    private javax.swing.JTextArea txtkeunikan;
    private javax.swing.JTextField txtnamatempat;
    private javax.swing.JTextField txtnotelp;
    // End of variables declaration//GEN-END:variables


}
