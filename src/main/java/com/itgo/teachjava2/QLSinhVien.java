/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itgo.teachjava2;

import static com.itgo.teachjava2.QLSinhVienDB.getSqlConnection;
import dto.Nganh;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author tomnyson
 */
public class QLSinhVien {

    private static String USER_NAME = "root";
    private static String PASSWORD = "";
    private static String DATABASE = "teachJava2";
//    private static String DATABASE = "qlSinhVien";
    //jdbc:sqlserver://localhost:1433;databaseName=DynamicsAx2009 -> db name
    private static String DB_URL = "jdbc:mysql://localhost:3306/" + DATABASE; // localhost:
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
    }

    public ArrayList<SinhVien> getListSinhVien() {
        return listSinhVien;
    }

    public ArrayList<SinhVien> loadSinhVien() {
        ArrayList<SinhVien> list = new ArrayList<SinhVien>();
        try {
            Connection connect = getConnection();
            //sql query
            String sql = "select * from sinhviens sv inner join nganhs ng on sv.nganhId = ng.id";
            // stament connect
            PreparedStatement stm = connect.prepareStatement(sql);
            // function trả về một list dữ liệu
            ResultSet rst = stm.executeQuery();
            // kiểm tra xem có dữ liệu hay ko?
            while (rst.next()) {
                System.out.println("sv"+ rst.getString("name"));
                // add vào list theo kiểu sinhvien
                SinhVien sv = new SinhVien();
                sv.setMassv(rst.getString("masv"));
                sv.setTen(rst.getString("tensv"));
                sv.setNganh(rst.getInt("nganhId"));
                sv.setTenNganh(rst.getString("name"));
                sv.setDtb(rst.getDouble("diemTb"));
                sv.setGioitinh(rst.getBoolean("gioitinh"));
                // lấy ảnh từ db
                sv.setAnh(rst.getBytes("anh"));
                list.add(sv);
                listSinhVien.add(sv);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return list;
    }
    
     public ArrayList<Nganh> loadNganh() {
        ArrayList<Nganh> list = new ArrayList<Nganh>();
        try {
            Connection connect = getConnection();
            //sql query
            String sql = "select * from nganhs";
            // stament connect
            PreparedStatement stm = connect.prepareStatement(sql);
            // function trả về một list dữ liệu
            ResultSet rst = stm.executeQuery();
            // kiểm tra xem có dữ liệu hay ko?
            while (rst.next()) {
                // add vào list theo kiểu sinhvien
                Nganh sv = new Nganh();
                sv.setId(rst.getInt("id"));
                sv.setName(rst.getString("name"));
                list.add(sv);
            }
            // tat connect
            connect.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    

    public boolean addSinhVien(SinhVien sv) {
        try {
            Connection connect = getConnection();
            String sql = "insert into sinhviens(masv, tensv, nganhId, diemTb, gioitinh, anh)"
                    + "values(?, ?, ?, ?, ?, ?)";
            PreparedStatement stm = connect.prepareStatement(sql);
            stm.setString(1, sv.getMassv());
            stm.setString(2, sv.getTen());
            stm.setInt(3, sv.getNganh());
            stm.setDouble(4, sv.getDtb());
            stm.setBoolean(5, sv.getGioitinh());
            stm.setBytes(6, sv.getAnh());
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
            String sql = "update sinhviens set tensv=?, nganhId=?,"
                    + " diemtb=?, gioitinh=? where masv=? ";
            PreparedStatement prst = connect.prepareStatement(sql);
            prst.setString(1, sv.getTen());
            prst.setInt(2, sv.getNganh());
            prst.setDouble(3, sv.getDtb());
            prst.setBoolean(4, sv.getGioitinh());
            prst.setString(5, sv.getMassv());
            prst.setBytes(6, sv.getAnh());
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
