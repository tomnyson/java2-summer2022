/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itgo.teachjava2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tomnyson
 */
public class QLSinhVienDB {

    private static String USER_NAME = "dev";
    private static String PASSWORD = "dev";
    private static String DATABASE = "qlbh";
    private static String DB_URL = "jdbc:mysql://192.168.64.2:3306/teachJava2";

    public static Connection getSqlConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
            System.out.println("connect successfully!");
        } catch (Exception e) {
            System.out.println("connect failure!");
            e.printStackTrace();
        }
        return conn;
    }

    public static ResultSet getResult(String query) {
        ResultSet rs = null;
        Connection conn = getSqlConnection();
        try {
            Statement stmt = conn.createStatement();
            rs = stmt.executeQuery(query);
            conn.close();
        } catch (Exception e) {
            System.out.println("connect failure!");
            e.printStackTrace();
        }
        return rs;
    }
    private ArrayList<SinhVien> listSinhVien;

    public QLSinhVienDB(ArrayList<SinhVien> listSinhVien) {
        this.listSinhVien = listSinhVien;
    }

    public QLSinhVienDB() {
        this.listSinhVien = new ArrayList<>();
    }

    public ArrayList<SinhVien> getListSinhVien() {
        try {
            ArrayList<SinhVien> catList = new ArrayList<>();
            Connection connect = getSqlConnection();
            String sql = "select * from sinhviens";
            if (connect != null) {
                System.err.println("connect success");
                PreparedStatement prst = connect.prepareStatement(sql);
                ResultSet result = prst.executeQuery();
                while (result.next()) {
                    System.err.println("go here" + result.getString("masv"));   
                    SinhVien sv = new SinhVien();
                    sv.setMassv(result.getString("masv"));
                    sv.setTen(result.getString("tensv"));
                    sv.setNganh(result.getString("nganh"));
                    sv.setDtb(result.getFloat("diemTb"));
                    sv.setGioitinh(result.getBoolean("gioitinh"));
                    catList.add(sv);
                }
            }

            return catList;
        } catch (Exception e) {
            e.printStackTrace();
            return listSinhVien;
        }
    }

    public boolean addSinhVien(SinhVien sv) {
        try {
            Connection connect = getSqlConnection();
            String sql = "insert into sinhviens(masv, tensv, nganh, diemTb, gioitinh) values (?,?,?,?,?)";
            PreparedStatement prst = connect.prepareStatement(sql);
            prst.setString(1, sv.getMassv());
            prst.setString(2, sv.getTen());
            prst.setString(3, sv.getNganh());
            prst.setDouble(4, sv.getDtb());
            prst.setBoolean(5, sv.getGioitinh());
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

    public void delete(String txtMssv) {
        for (SinhVien sinhVien : listSinhVien) {
            if (sinhVien.getMassv().equals(txtMssv)) {
                listSinhVien.remove(sinhVien);
                break;
            }
        }
    }
}
