/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itgo.teachjava2;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showConfirmDialog;

/**
 *
 * @author tomnyson
 */
public class frmQLSinhVien extends javax.swing.JFrame {

    /**
     * Creates new form frmQLSinhVien
     */
    public frmQLSinhVien() {
        initComponents();
        loadCbNganh();
    }
    public void loadCbNganh() {
        String [] arrNganh = {"CNTT", "Đồ Hoà", "Kinh Tế", "Marketing"};
        DefaultComboBoxModel model = new DefaultComboBoxModel(arrNganh);
        cbNganh.setModel(model);
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
        jLabel1 = new javax.swing.JLabel();
        txtMSSV = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDTB = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        rbNam = new javax.swing.JRadioButton();
        rbNu = new javax.swing.JRadioButton();
        btnXepLoai = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        ckHocBai = new javax.swing.JCheckBox();
        ckGame = new javax.swing.JCheckBox();
        lbKetQua = new javax.swing.JLabel();
        cbNganh = new javax.swing.JComboBox<>();
        txtThemNganh = new javax.swing.JTextField();
        btnThem1 = new javax.swing.JButton();
        btnThemNganh = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbSinhVien = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Kannada Sangam MN", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Phần mềm quản lý sinh viên");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 35, 389, 61));
        getContentPane().add(txtMSSV, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 296, 34));

        jLabel2.setText("MSSV:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 148, 77, -1));

        jLabel3.setText("Họ Tên");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 185, -1, -1));
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 296, 34));

        jLabel4.setText("Ngành");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 235, -1, -1));

        jLabel5.setText("ĐTB");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 279, 187, -1));
        getContentPane().add(txtDTB, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 296, 34));

        jLabel6.setText("giới tính");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 326, -1, -1));

        buttonGroup1.add(rbNam);
        rbNam.setText("Nam");
        rbNam.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbNamStateChanged(evt);
            }
        });
        rbNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNamActionPerformed(evt);
            }
        });
        getContentPane().add(rbNam, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 322, -1, -1));

        buttonGroup1.add(rbNu);
        rbNu.setText("Nữ");
        getContentPane().add(rbNu, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 322, -1, -1));

        btnXepLoai.setBackground(new java.awt.Color(0, 0, 255));
        btnXepLoai.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnXepLoai.setText("xem sở thích");
        btnXepLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXepLoaiActionPerformed(evt);
            }
        });
        getContentPane().add(btnXepLoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 410, 156, 34));

        jLabel7.setText("sở thích");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 361, -1, -1));

        ckHocBai.setText("học bài");
        getContentPane().add(ckHocBai, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 357, -1, -1));

        ckGame.setText("chơi game");
        getContentPane().add(ckGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 357, -1, -1));

        lbKetQua.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lbKetQua.setForeground(new java.awt.Color(0, 241, 0));
        lbKetQua.setText("Kết Quả");
        getContentPane().add(lbKetQua, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 452, -1, 30));

        cbNganh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CNTT", "Đồ Hoạ", "Kinh Tế", "PR" }));
        cbNganh.setName("cbBox"); // NOI18N
        cbNganh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNganhActionPerformed(evt);
            }
        });
        getContentPane().add(cbNganh, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 300, -1));
        getContentPane().add(txtThemNganh, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 140, 40));

        btnThem1.setBackground(new java.awt.Color(0, 0, 255));
        btnThem1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnThem1.setIcon(new javax.swing.ImageIcon("/Users/tomnyson/NetBeansProjects/teachjava2/src/main/java/com/itgo/teachjava2/icon/them.png")); // NOI18N
        btnThem1.setText("thêm");
        btnThem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnThem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 116, 34));

        btnThemNganh.setText("thêm Nganh");
        btnThemNganh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemNganhActionPerformed(evt);
            }
        });
        getContentPane().add(btnThemNganh, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 240, -1, -1));

        tbSinhVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"sv01", "A", "CNTT", "7.6", "Nam"},
                {"sv02", "B", "LT", "8.0", "Nữ"}
            },
            new String [] {
                "MASV", "tên", "Ngành", "DTB", "Giới Tính"
            }
        ));
        tbSinhVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbSinhVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbSinhVien);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, 710, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnXepLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXepLoaiActionPerformed
        // TODO add your handling code here:
        boolean hocBai = ckHocBai.isSelected();
        boolean choiGame = ckGame.isSelected();
        if (hocBai && choiGame) {
            lbKetQua.setText("Bạn có sở thích là học bài và thích chơi game ");
        } else if (hocBai) {
            lbKetQua.setText("Bạn có sở thích học bài ");
        } else if (choiGame) {
            lbKetQua.setText("Bạn có sở thích choi game ");
        } else {
            lbKetQua.setText("chưa chọn ");
        }
    }//GEN-LAST:event_btnXepLoaiActionPerformed

    private void rbNamStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbNamStateChanged
        // TODO add your handling code here:
//        System.out.println(rbNam.isSelected());
    }//GEN-LAST:event_rbNamStateChanged

    private void rbNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNamActionPerformed
        // TODO add your handling code here:
        System.out.println(rbNam.isSelected());
    }//GEN-LAST:event_rbNamActionPerformed

    private void cbNganhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNganhActionPerformed
        // TODO add your handling code here:
        // return vị trí được chon
        System.out.println((String.valueOf(cbNganh.getSelectedIndex())));
        // return về đối tượng được chọn 
        System.out.println((String.valueOf(cbNganh.getSelectedItem())));
        // 
    }//GEN-LAST:event_cbNganhActionPerformed

    private void btnThem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThem1ActionPerformed

    private void btnThemNganhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemNganhActionPerformed
        // TODO add your handling code here:
        String nganh = txtThemNganh.getText();
        if(nganh.equals("")) {
        JOptionPane.showMessageDialog(null, "nhập tên ngành cần thêm");
        } else {
            cbNganh.addItem(nganh);
            System.err.println("số phần tửL" + cbNganh.getItemCount());
        }
    }//GEN-LAST:event_btnThemNganhActionPerformed

    private void tbSinhVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbSinhVienMouseClicked
        // TODO add your handling code here:
       // lấy index của hàng
       int indexRow =  tbSinhVien.getSelectedRow();
       // lấy giá 
       String mssv = tbSinhVien.getValueAt(indexRow, 0).toString();
       String ten = tbSinhVien.getValueAt(indexRow, 1).toString();
       String dtb = tbSinhVien.getValueAt(indexRow,3).toString();
       String nganh = tbSinhVien.getValueAt(indexRow, 2).toString();
       String gioiTinh = tbSinhVien.getValueAt(indexRow, 4).toString();
       if(gioiTinh.equals("Nữ")) {
           rbNu.setSelected(true);
           rbNam.setSelected(false);
       } else {
           rbNam.setSelected(true);
           rbNu.setSelected(false);
       }
       //biding cobobox theo giá trị chọn từ table
       cbNganh.getModel().setSelectedItem(nganh);
       // set lại text
       txtMSSV.setText(gioiTinh);
       txtName.setText(ten);
       txtDTB.setText(dtb);
       lbKetQua.setText(mssv);
    }//GEN-LAST:event_tbSinhVienMouseClicked

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
            java.util.logging.Logger.getLogger(frmQLSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmQLSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmQLSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmQLSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmQLSinhVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThem1;
    private javax.swing.JButton btnThemNganh;
    private javax.swing.JButton btnXepLoai;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbNganh;
    private javax.swing.JCheckBox ckGame;
    private javax.swing.JCheckBox ckHocBai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbKetQua;
    private javax.swing.JRadioButton rbNam;
    private javax.swing.JRadioButton rbNu;
    private javax.swing.JTable tbSinhVien;
    private javax.swing.JTextField txtDTB;
    private javax.swing.JTextField txtMSSV;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtThemNganh;
    // End of variables declaration//GEN-END:variables
}