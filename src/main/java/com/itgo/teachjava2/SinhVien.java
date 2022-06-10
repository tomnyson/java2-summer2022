/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itgo.teachjava2;

import java.io.Serializable;

/**
 *
 * @author tomnyson
 */
public class SinhVien implements Serializable {

    private String massv;
    private String ten;
    private int nganhId;
    private String tenNganh;
    private double dtb;
    private boolean gioitinh;

    public SinhVien(String massv, String ten, int nganh, double dtb, boolean gioitinh) {
        this.massv = massv;
        this.ten = ten;
        this.nganhId = nganh;
        this.dtb = dtb;
        this.gioitinh = gioitinh;
    }

    public SinhVien(String massv, String ten, int nganhId, String tenNganh, double dtb, boolean gioitinh) {
        this.massv = massv;
        this.ten = ten;
        this.nganhId = nganhId;
        this.tenNganh = tenNganh;
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

    public int getNganh() {
        return nganhId;
    }

    public void setNganh(int nganh) {
        this.nganhId = nganh;
    }

    public double getDtb() {
        return dtb;
    }

    public void setDtb(double dtb) {
        this.dtb = dtb;
    }

    public boolean getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(boolean gioitinh) {
        this.gioitinh = gioitinh;
    }

    public int getNganhId() {
        return nganhId;
    }

    public void setNganhId(int nganhId) {
        this.nganhId = nganhId;
    }

    public String getTenNganh() {
        return tenNganh;
    }

    public void setTenNganh(String tenNganh) {
        this.tenNganh = tenNganh;
    }

  

}
