/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itgo.teachjava2;

import static com.itgo.teachjava2.QLSinhVienDB.getSqlConnection;
import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author tomnyson
 */
public class QLSinhVien {

    private static String USER_NAME = "dev";
    private static String PASSWORD = "dev";
    private static String DATABASE = "teachJava2";
//    private static String DATABASE = "qlSinhVien";
    //jdbc:sqlserver://localhost:1433;databaseName=DynamicsAx2009 -> db name
    private static String DB_URL = "jdbc:mysql://192.168.64.2:3306/" + DATABASE; // localhost:
//    private static String DB_URL = "jdbc:sqlserver://localhost:1433; databaseName=" + DATABASE+""; // localhost:

    private ArrayList<SinhVien> listSinhVien;

    public QLSinhVien(ArrayList<SinhVien> listSinhVien) {
        this.listSinhVien = listSinhVien;
    }

    // ham connect 
    public Connection getConnection() {
        try {
            Connection conn = null;
            //khai bao can sử dụng
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
            System.out.println("connect thành công");
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("connect thất bại");
        }
        return null;
    }

    public QLSinhVien() {
        Connection connect = getConnection();
        this.listSinhVien = new ArrayList<>();
        listSinhVien.add(new SinhVien("sv01", "Sinh viên A", "CNTT", 7.5, true));
        listSinhVien.add(new SinhVien("sv02", "Sinh viên B", "CNTT", 4.5, true));
        listSinhVien.add(new SinhVien("sv03", "Sinh viên C", "CNTT", 8.5, false));
    }

    public ArrayList<SinhVien> getListSinhVien() {
        return listSinhVien;
    }

    public ArrayList<SinhVien> loadSinhVien() {
        ArrayList<SinhVien> list = new ArrayList<SinhVien>();
        try {
            Connection connect = getConnection();
            //sql query
            String sql = "select * from sinhviens";
            // stament connect
            PreparedStatement stm = connect.prepareStatement(sql);
            // function trả về một list dữ liệu
            ResultSet rst = stm.executeQuery();
            // kiểm tra xem có dữ liệu hay ko?
            while (rst.next()) {
                // add vào list theo kiểu sinhvien
                SinhVien sv = new SinhVien();
                sv.setMassv(rst.getString("masv"));
                sv.setTen(rst.getString("tensv"));
                sv.setNganh(rst.getString("nganh"));
                sv.setDtb(rst.getDouble("diemTb"));
                sv.setGioitinh(rst.getBoolean("gioitinh"));
                list.add(sv);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return list;
    }

    public boolean addSinhVien(SinhVien sv) {
        try {
            Connection connect = getConnection();
            String sql = "insert into sinhviens(masv, tensv, nganh, diemTb, gioitinh)"
                    + "values(?, ?, ?, ?, ?)";
            PreparedStatement stm = connect.prepareStatement(sql);
            stm.setString(1, sv.getMassv());
            stm.setString(2, sv.getTen());
            stm.setString(3, sv.getNganh());
            stm.setDouble(4, sv.getDtb());
            stm.setBoolean(5, sv.getGioitinh());
            int ketqua = stm.executeUpdate();
            if (ketqua > 0) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return false;
    }

    public boolean capNhatSinhVien(SinhVien sv) {
        try {
            Connection connect = getSqlConnection();
            String sql = "update sinhviens set tensv=?, nganh=?,"
                    + " diemtb=?, gioitinh=? where masv=? ";
            PreparedStatement prst = connect.prepareStatement(sql);
            prst.setString(1, sv.getTen());
            prst.setString(2, sv.getNganh());
            prst.setDouble(3, sv.getDtb());
            prst.setBoolean(4, sv.getGioitinh());
            prst.setString(5, sv.getMassv());
            int result = prst.executeUpdate();
            if (result > 0) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return false;
    }

    public boolean delete(String txtMssv) {
        try {
            Connection connect = getSqlConnection();
            String sql = "delete from sinhviens where masv=?";
            PreparedStatement prst = connect.prepareStatement(sql);
            prst.setString(1, txtMssv);
            int result = prst.executeUpdate();
            if (result > 0) {
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }
}
