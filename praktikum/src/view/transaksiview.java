/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.transaksi;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import model.admin;
import model.cetak;
import model.foto;
import model.notapembelian;

/**
 *
 * @author IT
 */
public class transaksiview extends javax.swing.JFrame {
transaksi Transaksi;
ArrayList<notapembelian> arrKeranjang;
Double Harga_Total;    
/**
     * Creates new form transaksiview
     */
    public transaksiview() throws SQLException {
        initComponents();
        this.Transaksi = new transaksi();
        this.arrKeranjang = new ArrayList<>();
        this.Harga_Total = 0.0;
        this.showComboBoxpelanggan();
        this.showComboBoxpegawai();
        this.showComboBoxkurir();
        this.showComboBoxproduk();
        this.showTabelKeranjang();
    }
    private void showComboBoxpelanggan() throws SQLException {
        DefaultComboBoxModel dtmpelanggan = new DefaultComboBoxModel();
        
        for(admin p : this.Transaksi.getadmin()){
            dtmnama.addElement(p.getnama_depan()+ " " + p.getnama_belakang());
        }
        this.cbpelanggan.setModel(dtmpelanggan);
    }
    private void showComboBoxpegawai() throws SQLException{
        DefaultComboBoxModel dcbmpegawai = new DefaultComboBoxModel();
        
        for(pegawai p : this.Transaksi.getdatapegawai()){
            dcbmpegawai.addElement(p.getnama_depan() + " " + p.getnama_belakang());
        }
        this.cbpegawai.setModel(dcbmpegawai);
    }
    private void showComboBoxkurir() throws SQLException{
        DefaultComboBoxModel dcbmkurir = new DefaultComboBoxModel();
        
        for(kurir k : this.Transaksi.getdatakurir()){
            dcbmkurir.addElement(k.getNama_perusahaan());
        }
        this.cbkurir.setModel(dcbmkurir);
    }
    private void showComboBoxproduk() throws SQLException{
        DefaultComboBoxModel dcbmproduk = new DefaultComboBoxModel();
        
        for(produk p : this.Transaksi.getdataproduk()){
            dcbmproduk.addElement(p.getNama_produk()+ "(" + p.getStok_produk()+ ")");
        }
        this.cbproduk.removeAll();
        this.cbproduk.setModel(dcbmproduk);
    }
    private void showTabelKeranjang(){
        DefaultTableModel dtmkeranjang = new DefaultTableModel(new String[]{"Nama Produk", "Harga Satuan", "Jumlah", "Diskon"}, 0);
    dtmkeranjang.setRowCount(0);
    
    for(detail_pemesanan dp : this.arrKeranjang){
        dtmkeranjang.addRow(new String[]{dp.getProduk().getNama_produk().toString(), dp.getProduk().getHarga_satuan().toString(), dp.getJumlah().toString(), dp.getDiskon().toString()});
    }
    this.tblkeranjang.setModel(dtmkeranjang);
    }
    
    private void showHargaTotal(){
        this.tftotalharga.setText(String.valueOf(this.Harga_Total));
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
        jLabel9 = new javax.swing.JLabel();
        cbpelanggan = new javax.swing.JComboBox<>();
        cbpegawai = new javax.swing.JComboBox<>();
        cbkurir = new javax.swing.JComboBox<>();
        tfalamat = new javax.swing.JTextField();
        tftanggalpengiriman = new javax.swing.JTextField();
        cbproduk = new javax.swing.JComboBox<>();
        tfjumlah = new javax.swing.JTextField();
        tfdiskon = new javax.swing.JTextField();
        tftotalharga = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblkeranjang = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblpesanan = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tadetail_pemesanan = new javax.swing.JTextArea();
        btntambah = new javax.swing.JButton();
        btnsimpan = new javax.swing.JButton();
        btnlihat_detail = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nama");

        jLabel2.setText("No_pelanggan");

        jLabel3.setText("Alamat");

        jLabel4.setText("Ukuran foto");

        jLabel5.setText("Harga");

        jLabel6.setText("Tanggal cetak");

        jLabel7.setText("Tanggal selesai cetak");

        jLabel8.setText("Harga");

        jLabel9.setText("total harga");

        cbpelanggan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbpelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbpelangganActionPerformed(evt);
            }
        });

        cbpegawai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbkurir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tftanggalpengiriman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tftanggalpengirimanActionPerformed(evt);
            }
        });

        cbproduk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tblkeranjang.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblkeranjang);

        tblpesanan.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblpesanan);

        tadetail_pemesanan.setColumns(20);
        tadetail_pemesanan.setRows(5);
        jScrollPane3.setViewportView(tadetail_pemesanan);

        btntambah.setText("tambah");
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });

        btnsimpan.setText("simpan");

        btnlihat_detail.setText("lihat detail");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btntambah)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(34, 34, 34))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(72, 72, 72)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tftotalharga, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cbkurir, 0, 90, Short.MAX_VALUE)
                                .addComponent(cbpegawai, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbpelanggan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfalamat)
                                .addComponent(tftanggalpengiriman)
                                .addComponent(cbproduk, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfjumlah)
                                .addComponent(tfdiskon)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnsimpan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(72, 72, 72))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnlihat_detail)
                        .addGap(206, 206, 206))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(cbpelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(cbpegawai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(cbkurir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(tfalamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(tftanggalpengiriman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfjumlah, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel6)
                                                    .addComponent(cbproduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel7)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel8))
                                    .addComponent(tfdiskon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btntambah))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(btnsimpan)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tftotalharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnlihat_detail)))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(161, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbpelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbpelangganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbpelangganActionPerformed

    private void tftanggalpengirimanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tftanggalpengirimanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tftanggalpengirimanActionPerformed

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed

    try {
        detail_pemesanan dp = new detail_pemesanan();
        dp.setJumlah(Integer.parseInt(this.tfjumlah.getText()));
        dp.setProduk(this.Transaksi.getdataproduk().get(this.cbproduk.getSelectedIndex()));
  
        if(this.tfdiskon.getText().equals("")){
            dp.setDiskon(Double.parseDouble("0"));
            Harga_Total += this.Transaksi.getdataproduk().get(this.cbproduk.getSelectedIndex()).getHarga_satuan() * Integer.parseInt (this.tfjumlah.getText());
        }else{
            Double diskon = new Double(this.tfdiskon.getText());
            Integer TotalHargaSebelumDiskon = this.Transaksi.getdataproduk().get(cbproduk.getSelectedIndex()).getHarga_satuan() * Integer.parseInt (this.tfjumlah.getText());
            Double HargaDiskon = TotalHargaSebelumDiskon * diskon;
            dp.setDiskon(diskon);
            Harga_Total += TotalHargaSebelumDiskon - HargaDiskon;
        }
    this.showHargaTotal();
    this.arrKeranjang.add(dp);
    this.showTabelKeranjang();
    this.tfdiskon.setText (" ");
    this.tfdiskon.setText(" ");
        
    } catch (SQLException ex) {
        Logger.getLogger(transaksiview.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btntambahActionPerformed

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
            java.util.logging.Logger.getLogger(transaksiview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(transaksiview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(transaksiview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(transaksiview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new transaksiview().setVisible(true);
                } catch (SQLException ex) {
  Logger.getLogger(transaksiview.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlihat_detail;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JButton btntambah;
    private javax.swing.JComboBox<String> cbkurir;
    private javax.swing.JComboBox<String> cbpegawai;
    private javax.swing.JComboBox<String> cbpelanggan;
    private javax.swing.JComboBox<String> cbproduk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea tadetail_pemesanan;
    private javax.swing.JTable tblkeranjang;
    private javax.swing.JTable tblpesanan;
    private javax.swing.JTextField tfalamat;
    private javax.swing.JTextField tfdiskon;
    private javax.swing.JTextField tfjumlah;
    private javax.swing.JTextField tftanggalpengiriman;
    private javax.swing.JTextField tftotalharga;
    // End of variables declaration//GEN-END:variables

    
}
