/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itgo.teachjava2;

/**
 *
 * @author tomnyson
 */
public class SinhVien {
    private String massv;
    private String ten;
    private String nganh;
    private double dtb;
    private boolean gioitinh;

    public SinhVien(String massv, String ten, String nganh, double dtb, boolean gioitinh) {
        this.massv = massv;
        this.ten = ten;
        this.nganh = nganh;
        this.dtb = dtb;
        this.gioitinh = gioitinh;
    }

    public SinhVien() {
    }

    public String getMassv() {
        return massv;
    }

    public void setMassv(String massv) {
        this.massv = massv;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public double getDtb() {
        return dtb;
    }

    public void setDtb(double dtb) {
        this.dtb = dtb;
    }

    public boolean isGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(boolean gioitinh) {
        this.gioitinh = gioitinh;
    }
    
}
