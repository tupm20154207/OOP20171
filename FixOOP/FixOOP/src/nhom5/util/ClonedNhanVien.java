/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhom5.util;

import nhom5.model.NhanVienBanHang;

/**
 *
 * @author krayz
 */
public class ClonedNhanVien {
    private String maNV;
    private String tenNV;
    private int soGioTichLuy;
    private int luongCoBan;
    private int tongLuong;
    
    public ClonedNhanVien(NhanVienBanHang nv){
        maNV = nv.getMa();
        tenNV = nv.getTen();
        soGioTichLuy = nv.getGioTichLuy();
        luongCoBan = nv.getLuongCoBan();
        tongLuong = soGioTichLuy * luongCoBan;
    }

    public String getMaNV() {
        return maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public int getSoGioTichLuy() {
        return soGioTichLuy;
    }

    public int getLuongCoBan() {
        return luongCoBan;
    }

    public int getTongLuong() {
        return tongLuong;
    }
    
}
