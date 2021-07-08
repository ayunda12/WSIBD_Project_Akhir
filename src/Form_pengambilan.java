
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author acer
 */
public class Form_pengambilan extends javax.swing.JInternalFrame {

    ResultSet RsProduk = null;

    public Form_pengambilan() {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).setNorthPane(null);
        tampil_transaksi();
        totalbayar.setVisible(false);
        txtstatusbarang.setVisible(false);
        txtbayar.setEnabled(false);
         txtstatusbayar.setVisible(false);

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
        jScrollPane1 = new javax.swing.JScrollPane();
        tabeldetail = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        tagihan = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btntambah = new javax.swing.JButton();
        txtstatusbayar = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        txttotalsemua = new javax.swing.JTextField();
        txtbayar = new javax.swing.JTextField();
        txtkembalian = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmbkode = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtpelanggan = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelstatus = new javax.swing.JLabel();
        txtbayarsebelumnya = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtstatusbarang = new javax.swing.JTextField();
        totalbayar = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        tabeldetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nama Paket", "Satuan", "Harga", "Jumlah", "Total"
            }
        ));
        tabeldetail.setEnabled(false);
        tabeldetail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabeldetailMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabeldetail);

        jPanel5.setBackground(new java.awt.Color(255, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 102), 2));

        tagihan.setBackground(new java.awt.Color(255, 102, 102));
        tagihan.setFont(new java.awt.Font("Book Antiqua", 1, 45)); // NOI18N
        tagihan.setText("0");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tagihan, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tagihan, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Total ");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Pembayaran Sebelumnya");

        btntambah.setText("Tambah");
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });

        txtstatusbayar.setBackground(new java.awt.Color(255, 204, 204));
        txtstatusbayar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0)));
        txtstatusbayar.setEnabled(false);

        jButton6.setText("Simpan");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        txttotalsemua.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txttotalsemua.setEnabled(false);

        txtkembalian.setEnabled(false);

        jPanel4.setBackground(new java.awt.Color(255, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 102), 2));

        jLabel1.setText("Cari No Order ");

        cmbkode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Cari No Order --" }));
        cmbkode.setEnabled(false);
        cmbkode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbkodeActionPerformed(evt);
            }
        });

        jLabel2.setText("Nama Pelanggan");

        txtpelanggan.setEnabled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(69, 69, 69)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtpelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbkode, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbkode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 51, 0));
        jLabel6.setText("Data Oder");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 51, 0));
        jLabel7.setText("Tagihan");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Status Pembayaran  :");

        labelstatus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtbayarsebelumnya.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Bayar");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Kembalian");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(133, 133, 133))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(190, 190, 190))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbayarsebelumnya, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttotalsemua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(btntambah, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(totalbayar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)))
                        .addComponent(txtstatusbarang, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbayar, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtkembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtstatusbayar, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btntambah, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(txtbayarsebelumnya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(txtbayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txttotalsemua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtkembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtstatusbayar, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtstatusbarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(totalbayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabeldetailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabeldetailMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabeldetailMouseClicked

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed

        cmbkode.setEnabled(true);
        txtbayar.setEnabled(true);
          txtstatusbayar.setVisible(false);
    }//GEN-LAST:event_btntambahActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        String status = txtstatusbarang.getText();
        if (txtstatusbayar.getText().toString().equals("DP")) {
            int byrsebelum = Integer.parseInt(txtbayarsebelumnya.getText());
            int bayarsesudah = Integer.parseInt(txtbayar.getText());

            int tagihannya = Integer.parseInt(txttotalsemua.getText());
            int semua = byrsebelum + bayarsesudah;
            int sisa = bayarsesudah - tagihannya;
            txtkembalian.setText("" + sisa);
            totalbayar.setText("" + semua);
            txtstatusbayar.setText("Lunas");

        } else if ((txtstatusbayar.getText().toString().equals("Belum lunas"))) {
            int byrsebelum = Integer.parseInt(txtbayarsebelumnya.getText());
            int bayarsesudah = Integer.parseInt(txtbayar.getText());
            int tagihannya = Integer.parseInt(txttotalsemua.getText());
            int sisa = bayarsesudah - tagihannya;
            txtkembalian.setText("" + sisa);
            int semua = byrsebelum + bayarsesudah;
            totalbayar.setText("" + semua);
            txtstatusbayar.setText("Lunas");
        } else {
            int byrsebelum = Integer.parseInt(txtbayarsebelumnya.getText());
            totalbayar.setText("" + byrsebelum);
        }
        String total = totalbayar.getText();
        String kembalian = txtkembalian.getText();
        String statusbayar=txtstatusbayar.getText();
        try {

            Statement statement = (Statement) Koneksi_table.GetConnection().createStatement();
            statement.executeUpdate("UPDATE tb_transaksi SET status_barang ='" + status + "',bayar='" + total + "',sisa='" + kembalian +"',status_pembayaran='" + statusbayar + "'WHERE kode_transaksi='" + cmbkode.getSelectedItem() + "'");
            txtstatusbayar.setText("Lunas");
            labelstatus.setText("Lunas");
            statement.close();
            
            JOptionPane.showMessageDialog(null, "Data Berhasil di Simpan !!", "Pesan", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception t) {
            JOptionPane.showMessageDialog(null, "Data Gagal di Simpan !!", "Pesan", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButton6ActionPerformed

    private void cmbkodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbkodeActionPerformed
        txtstatusbayar.setVisible(false);
        tampil_tabeltransaksi();
        baca_transaksi();
        if (txtstatusbayar.getText().toString().equals("Belum lunas")) {
            int totalsemua = Integer.parseInt(txttotalsemua.getText());
            int pembayaransebelumnya = Integer.parseInt(txtbayarsebelumnya.getText());
            int kurangnya = totalsemua - pembayaransebelumnya;
            tagihan.setText("" + kurangnya);
        } else if (txtstatusbayar.getText().toString().equals("DP")) {
            int totalsemua = Integer.parseInt(txttotalsemua.getText());
            int pembayaransebelumnya = Integer.parseInt(txtbayarsebelumnya.getText());
            int kurangnya = totalsemua - pembayaransebelumnya;
            tagihan.setText("" + kurangnya);
        }else{
        txtbayar.setEnabled(false);
        }

    }//GEN-LAST:event_cmbkodeActionPerformed

    public void tampil_transaksi() {
        try {
            Statement statement = (Statement) Koneksi_table.GetConnection().createStatement();

            String sql = "select kode_transaksi from tb_transaksi order by kode_transaksi asc";
            ResultSet res = statement.executeQuery(sql);
            while (res.next()) {
                Object[] ob = new Object[1];
                ob[0] = res.getString(1);
                cmbkode.addItem((String) ob[0]);
            }
            res.close();
            statement.close();
        } catch (Exception e) {
        }

    }

    public void baca_transaksi() {
        try {
            Statement statement = (Statement) Koneksi_table.GetConnection().createStatement();
            Date ys = new Date();
            SimpleDateFormat s = new SimpleDateFormat("dd MMM yyyy");
            String sql = "select nama,tgl_terima,tgl_selesai,nama_pelanggan,sub_total,bayar,sisa,status_pembayaran from tb_transaksi,tb_pelanggan,tb_pengguna where tb_pelanggan.kode_pelanggan = tb_transaksi.kode_pelanggan AND tb_pengguna.kode_pengguna=tb_transaksi.kode_pengguna AND kode_transaksi='" + cmbkode.getSelectedItem() + "'";
            ResultSet res = statement.executeQuery(sql);
            while (res.next()) {
                String nama_pelanggan = res.getString("nama_pelanggan");
                String nama_pengguna = res.getString("nama");
                String total = res.getString("sub_total");
                String tglselesai = res.getString("tgl_selesai");
                String bayar = res.getString("bayar");

                String kembalian = res.getString("sisa");
                String statusbayar = res.getString("status_pembayaran");
                txtpelanggan.setText(nama_pelanggan);
                txtstatusbarang.setText("Sudah di Ambil");
                txtstatusbayar.setText(statusbayar);
                txtbayarsebelumnya.setText(bayar);
                txttotalsemua.setText(total);

                if (txtstatusbayar.getText().toString().equals("Lunas")) {
                    tagihan.setText("0");
                    labelstatus.setText("Lunas");

                } else if (txtstatusbayar.getText().toString().equals("Belum lunas")) {
                    labelstatus.setText("Belum lunas");
                } else {
                    labelstatus.setText("DP");
                    //tagihan.setText(total);
                }

            }

        } catch (Exception e) {
        }

    }

    private void tampil_tabeltransaksi() {

        try {

            DefaultTableModel tbl = new DefaultTableModel();
            tbl.addColumn("Nama");
            tbl.addColumn("Satuan");
            tbl.addColumn("Harga");
            tbl.addColumn("Jumlah");
            tbl.addColumn("Total");
            tabeldetail.setModel(tbl);

            Statement statement = (Statement) Koneksi_table.GetConnection().createStatement();
            tbl.getDataVector().removeAllElements();

            RsProduk = statement.executeQuery("SELECT kode_detail,nama_paket,tb_paketlaundry.harga AS harga_paket,tb_detailtransaksi.harga,jumlah,satuan from tb_detailtransaksi,tb_paketlaundry WHERE tb_paketlaundry.kode_paket = tb_detailtransaksi.kode_paket AND kode_transaksi='" + cmbkode.getSelectedItem() + "'");
            while (RsProduk.next()) {

                Object[] data = {
                    RsProduk.getString("nama_paket"),
                    RsProduk.getString("satuan"),
                    RsProduk.getString("harga_paket"),
                    RsProduk.getString("jumlah"),
                    RsProduk.getString("harga")
//                    RsProduk.getString("hak_akses")
                };
                tbl.addRow(data);
            }
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btntambah;
    private javax.swing.JComboBox<String> cmbkode;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelstatus;
    private javax.swing.JTable tabeldetail;
    private javax.swing.JLabel tagihan;
    private javax.swing.JTextField totalbayar;
    private javax.swing.JTextField txtbayar;
    private javax.swing.JTextField txtbayarsebelumnya;
    private javax.swing.JTextField txtkembalian;
    private javax.swing.JTextField txtpelanggan;
    private javax.swing.JTextField txtstatusbarang;
    private javax.swing.JTextField txtstatusbayar;
    private javax.swing.JTextField txttotalsemua;
    // End of variables declaration//GEN-END:variables
}