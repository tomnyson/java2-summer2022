/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itgo.teachjava2;

import dto.Nganh;
import dto.Category;
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showConfirmDialog;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tomnyson
 */
public class frmQLSinhVienDemo extends javax.swing.JFrame {

    /**
     * Creates new form frmQLSinhVien
     */
    QLSinhVienDB qlSinhVien = new QLSinhVienDB();

    public void loadNganh() {
        String[] nganhArr = {"Công nghệ thông ", "Đồ Hoạ", "Kinh Tế", "Marketing"};
        DefaultComboBoxModel model = new DefaultComboBoxModel(nganhArr);
        cbNganh.setModel(model);

    }

    public frmQLSinhVienDemo(JButton btnOpen, JButton btnReadListSv, JButton btnSave, JButton btnSaveSV, JButton btnSearch, JButton btnSendData, JButton btnXepLoai, JButton btnXepLoai1, ButtonGroup buttonGroup1, JComboBox<String> cbCategory, JComboBox<String> cbNganh, JCheckBox jCheckBox1, JCheckBox jCheckBox2, JCheckBox jCheckBox3, JCheckBox jCheckBox4, JCheckBox jCheckBox5, JCheckBox jCheckBox6, JLabel jLabel1, JLabel jLabel2, JLabel jLabel3, JLabel jLabel4, JLabel jLabel5, JLabel jLabel6, JLabel jLabel7, JLabel jLabel8, JScrollPane jScrollPane1, JScrollPane jScrollPane2, JRadioButton rbNam, JRadioButton rbNu, JTable tbSinhVien, JTextField txtDTB, JTextField txtMSSV, JTextField txtName, JTextArea txtNote, JTextField txtSearch) throws HeadlessException {
        this.btnOpen = btnOpen;
        this.btnReadListSv = btnReadListSv;
        this.btnSave = btnSave;
        this.btnSaveSV = btnSaveSV;
        this.btnSearch = btnSearch;
        this.btnXepLoai = btnXepLoai;
        this.btnXepLoai1 = btnXepLoai1;
        this.buttonGroup1 = buttonGroup1;
        this.cbCategory = cbCategory;
        this.cbNganh = cbNganh;
        this.jCheckBox1 = jCheckBox1;
        this.jCheckBox2 = jCheckBox2;
        this.jCheckBox3 = jCheckBox3;
        this.jCheckBox4 = jCheckBox4;
        this.jCheckBox5 = jCheckBox5;
        this.jCheckBox6 = jCheckBox6;
        this.jLabel1 = jLabel1;
        this.jLabel2 = jLabel2;
        this.jLabel3 = jLabel3;
        this.jLabel4 = jLabel4;
        this.jLabel5 = jLabel5;
        this.jLabel6 = jLabel6;
        this.jLabel7 = jLabel7;
        this.jLabel8 = jLabel8;
        this.jScrollPane1 = jScrollPane1;
        this.jScrollPane2 = jScrollPane2;
        this.rbNam = rbNam;
        this.rbNu = rbNu;
        this.tbSinhVien = tbSinhVien;
        this.txtDTB = txtDTB;
        this.txtMSSV = txtMSSV;
        this.txtName = txtName;
        this.txtNote = txtNote;
        this.txtSearch = txtSearch;
    }

    public void loadCategory() {

        List<Category> listCat = new ArrayList<>();
        listCat.add(new Category(1, "php", "php"));
        listCat.add(new Category(2, "c#", "c#"));
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        for (int i = 0; i < listCat.size(); i++) {
            model.addElement(listCat.get(i));
        }
        cbCategory.setModel(model);

    }
    
       public void loadListNganh() {

        ArrayList<Nganh> listCat = qlSinhVien.getCategoryList();
        ArrayList<String> cars = new ArrayList<String>();
           for (Nganh nganh : listCat) {
               cars.add(nganh.toString());
           }
           String[] array = cars.toArray(new String[0]);
           listCategories.setListData((array));

    }
    
    

    public void loadTable() {
        String[] columns = {"MSSV", "Tên", "Ngành", "ĐTB", "Giới tính"};
        Object[][] rows = {};
        ArrayList<SinhVien> listSinhVien = qlSinhVien.getListSinhVien();
        System.out.println("sinhvien" + listSinhVien.size());
        DefaultTableModel dataModel = new DefaultTableModel();
        dataModel.setColumnIdentifiers(columns);
        for (SinhVien item : listSinhVien) {
            dataModel.addRow(new Object[]{item.getMassv(),
                item.getTen(),
                item.getNganh(),
                item.getDtb(),
                item.getDtb()});
        }
        tbSinhVien.setModel(dataModel);
    }

    public frmQLSinhVienDemo() {
        initComponents();
        loadNganh();
        loadTable();
        loadCategory();
        loadListNganh();
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
        txtSearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDTB = new javax.swing.JTextField();
        btnXepLoai = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        rbNam = new javax.swing.JRadioButton();
        rbNu = new javax.swing.JRadioButton();
        btnXepLoai1 = new javax.swing.JButton();
        cbNganh = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbSinhVien = new javax.swing.JTable();
        txtMSSV = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        cbCategory = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtNote = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnOpen = new javax.swing.JButton();
        btnSaveSV = new javax.swing.JButton();
        btnReadListSv = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listCategories = new javax.swing.JList<>();
        txtCategoryName = new javax.swing.JTextField();
        btnRemoveCat = new javax.swing.JButton();
        btnAddCat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Kannada Sangam MN", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Phần mềm quản lý sinh viên");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);

        txtSearch.setToolTipText("nhập tên cần tìm");

        jLabel2.setText("MSSV:");

        jLabel3.setText("Họ Tên");

        jLabel4.setText("Ngành");

        jLabel5.setText("ĐTB");

        btnXepLoai.setIcon(new javax.swing.ImageIcon("/Users/tomnyson/NetBeansProjects/teachjava2/src/main/java/com/itgo/teachjava2/icon/them.png")); // NOI18N
        btnXepLoai.setText("thêm");
        btnXepLoai.setOpaque(true);
        btnXepLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXepLoaiActionPerformed(evt);
            }
        });

        jLabel6.setText("giới tính");

        buttonGroup1.add(rbNam);
        rbNam.setText("Nam");

        buttonGroup1.add(rbNu);
        rbNu.setText("Nữ");

        btnXepLoai1.setText("xếp loại");
        btnXepLoai1.setOpaque(true);
        btnXepLoai1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXepLoai1ActionPerformed(evt);
            }
        });

        cbNganh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setText("sở thích");

        jCheckBox1.setText("tiếng anh");

        jCheckBox2.setText("coding");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setText("chơi game");

        jCheckBox4.setText("travel");

        jCheckBox5.setText("xem phim");

        jCheckBox6.setText("khác");

        tbSinhVien.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbSinhVien);

        btnSearch.setText("tìm kiếm");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        cbCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCategoryActionPerformed(evt);
            }
        });

        txtNote.setColumns(20);
        txtNote.setRows(5);
        jScrollPane2.setViewportView(txtNote);

        jLabel8.setText("NOTE");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnOpen.setText("open");
        btnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenActionPerformed(evt);
            }
        });

        btnSaveSV.setText("save List SV");
        btnSaveSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveSVActionPerformed(evt);
            }
        });

        btnReadListSv.setText("read List");
        btnReadListSv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadListSvActionPerformed(evt);
            }
        });

        listCategories.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listCategories.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listCategoriesValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(listCategories);

        btnRemoveCat.setText("Remove");

        btnAddCat.setText("Add");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSave)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnOpen))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCategoryName, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnAddCat)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnRemoveCat)
                                        .addGap(34, 34, 34)))
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jCheckBox4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jCheckBox5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jCheckBox6))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jCheckBox1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jCheckBox3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jCheckBox2))))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                            .addGap(314, 314, 314))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(26, 26, 26)
                                            .addComponent(rbNam)
                                            .addGap(18, 18, 18)
                                            .addComponent(rbNu))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtDTB, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(jLabel3)
                                                    .addGap(18, 18, 18))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel4)
                                                    .addGap(18, 18, 18)))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                                                .addComponent(cbNganh, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnXepLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(54, 54, 54)
                                            .addComponent(btnXepLoai1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(32, 32, 32))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSearch))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnSaveSV, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnReadListSv)))))))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(193, 193, 193)
                    .addComponent(txtMSSV, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(480, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(cbNganh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtDTB, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rbNu)
                                    .addComponent(jLabel6)
                                    .addComponent(rbNam))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(jCheckBox2)
                                        .addComponent(jCheckBox3)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jCheckBox4)
                                    .addComponent(jCheckBox6)
                                    .addComponent(jCheckBox5))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnXepLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnXepLoai1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(jLabel8))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSaveSV)
                        .addComponent(btnReadListSv)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCategoryName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnRemoveCat)
                                    .addComponent(btnAddCat))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnOpen))
                .addContainerGap(269, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(149, 149, 149)
                    .addComponent(txtMSSV, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(816, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnXepLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXepLoaiActionPerformed
        // TODO add your handling code here:
        if (!txtMSSV.getText().equals("")
                || !txtName.getText().equals("")) {
            String massv = txtMSSV.getText();
            String ten = txtName.getText();
            String nganh = (String) cbNganh.getSelectedItem();
            double dtb = Double.parseDouble(txtDTB.getText());
            boolean gioiTinh = false; // false nữ
//            boolean gioiTinh = rbNam.isSelected() ? true : false;
            if (rbNam.isSelected()) {
                gioiTinh = true; // nam
            }

            // tao sv
            SinhVien sv = new SinhVien(massv, ten, 1, dtb, gioiTinh);

            // add sv vao list
            qlSinhVien.addSinhVien(sv);
            // load lai table
            loadTable();
            JOptionPane.showMessageDialog(null, "Thêm thành ");

        } else {
            JOptionPane.showMessageDialog(null, "Dữ liệu không để trống");
        }
    }//GEN-LAST:event_btnXepLoaiActionPerformed

    private void btnXepLoai1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXepLoai1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXepLoai1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchActionPerformed

    private void cbCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCategoryActionPerformed
        // TODO add your handling code here:

        //lấy detai 
        Category current = (Category) cbCategory.getModel().getSelectedItem();
        System.err.println("current" + current.getId());
    }//GEN-LAST:event_cbCategoryActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int retval = fileChooser.showSaveDialog(null);
        if (retval == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            if (file == null) {
                return;
            }
            if (!file.getName().toLowerCase().endsWith(".txt")) {
                file = new File(file.getParentFile(), file.getName() + ".txt");
            }
            try {
                txtNote.write(new OutputStreamWriter(new FileOutputStream(file),
                        "utf-8"));
                JOptionPane.showMessageDialog(null, "save note success");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        int retval = fileChooser.showOpenDialog(null);
        if (retval == JFileChooser.APPROVE_OPTION) {
            // lấy file hiện taị đang chọn
            File file = fileChooser.getSelectedFile();
            try {
                FileReader reader = new FileReader(file.getAbsoluteFile());
                BufferedReader br = new BufferedReader(reader);
                txtNote.read(br, evt);
                br.close();
                txtNote.requestFocus();
                JOptionPane.showMessageDialog(null, "read note success");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnOpenActionPerformed

    private void btnSaveSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveSVActionPerformed
        // TODO add your handling code here:
        try {
            JFileChooser fileChooser = new JFileChooser();
            int retval = fileChooser.showSaveDialog(null);
            if (retval == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                if (file == null) {
                    return;
                }
                if (!file.getName().toLowerCase().endsWith(".txt")) {
                    file = new File(file.getParentFile(), file.getName() + ".txt");
                }
                try {
                    FileOutputStream out = new FileOutputStream(file.getAbsoluteFile());
                    ObjectOutputStream oos = new ObjectOutputStream(out);
                    QLSinhVien qlsv = new QLSinhVien();
                    List<SinhVien> sv = qlsv.getListSinhVien();
                    oos.writeObject(sv);
                    out.close();
                    JOptionPane.showMessageDialog(null, "save danh sách sv");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
        }


    }//GEN-LAST:event_btnSaveSVActionPerformed

    private void btnReadListSvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadListSvActionPerformed
        // TODO add your handling code here:
        try {
            JFileChooser fileChooser = new JFileChooser();
            int retval = fileChooser.showOpenDialog(null);
            if (retval == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                try {
                    FileInputStream fis = new FileInputStream(file.getAbsoluteFile());
                    ObjectInputStream ois = new ObjectInputStream(fis);
                    List<SinhVien> list = (List<SinhVien>) ois.readObject();
                    ois.close();
                    for (SinhVien sv : list) {
                        System.out.print(sv.toString());
                    }
                    JOptionPane.showMessageDialog(null, "read note success");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnReadListSvActionPerformed

    private void listCategoriesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listCategoriesValueChanged
        // TODO add your handling code here:
       String nganh = listCategories.getSelectedValue();
       txtCategoryName.setText(nganh);
    }//GEN-LAST:event_listCategoriesValueChanged

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
            java.util.logging.Logger.getLogger(frmQLSinhVienDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmQLSinhVienDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmQLSinhVienDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmQLSinhVienDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmQLSinhVienDemo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCat;
    private javax.swing.JButton btnOpen;
    private javax.swing.JButton btnReadListSv;
    private javax.swing.JButton btnRemoveCat;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSaveSV;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnXepLoai;
    private javax.swing.JButton btnXepLoai1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbCategory;
    private javax.swing.JComboBox<String> cbNganh;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> listCategories;
    private javax.swing.JRadioButton rbNam;
    private javax.swing.JRadioButton rbNu;
    private javax.swing.JTable tbSinhVien;
    private javax.swing.JTextField txtCategoryName;
    private javax.swing.JTextField txtDTB;
    private javax.swing.JTextField txtMSSV;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextArea txtNote;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
