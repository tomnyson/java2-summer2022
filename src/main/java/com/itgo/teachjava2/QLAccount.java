/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itgo.teachjava2;

import dto.Account;
import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author tomnyson
 */
public class QLAccount {

    private ArrayList<Account> listAccount;
    private static String USER_NAME = "dev";
    private static String PASSWORD = "dev";
    private static String DATABASE = "teachJava2";
//    private static String DATABASE = "qlSinhVien";
    //jdbc:sqlserver://localhost:1433;databaseName=DynamicsAx2009 -> db name
    private static String DB_URL = "jdbc:mysql://192.168.64.2:3306/" + DATABASE; // localhost:

    public QLAccount(ArrayList<Account> listAccount) {
        this.listAccount = listAccount;
    }

    public QLAccount() {
        this.listAccount = new ArrayList<>();
        listAccount.add(new Account("admin", "123456", "admin"));
        listAccount.add(new Account("user", "123456", "user"));
    }

    public ArrayList<Account> getAll() {
        return listAccount;
    }

    public Account login(String username, String password) {
        try {
            Connection connect = getConnection();
            String sql = "select * from accounts where"
                    + " username = ? and password = ?";
            PreparedStatement stm = connect.prepareStatement(sql);
            stm.setString(1, username);
            stm.setString(2, password);
            ResultSet rst = stm.executeQuery();
            while (rst.next()) {
                Account account = new Account();
                account.setUsername(rst.getString("username"));
                account.setPassword(rst.getString("password"));
                account.setRole(rst.getString("role"));
                return account;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }

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

}
