/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itgo.teachjava2;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author tomnyson
 */
public class QLSinhVien {
    public ArrayList listSinhVien;

    public ArrayList getListSinhVien() {
        return listSinhVien;
    }

    public QLSinhVien() {
        this.listSinhVien = new ArrayList<>();
        listSinhVien.add(new SinhVien("SV01","sv1","CNTT",7.7, true));
    }
    
    public void add(SinhVien sv) {
        listSinhVien.add(sv);
    }
    
}
