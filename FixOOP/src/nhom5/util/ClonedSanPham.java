/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhom5.util;

import nhom5.model.SanPham;

/**
 *
 * @author krayz
 */
public class ClonedSanPham {
    
    private String maSP;
    private String tenSP;
    private int giaMua;
    private int giaBan;
    private int soLuong;
    
    public ClonedSanPham(SanPham sp, int soLuongBan){
        maSP = sp.getMa();
        tenSP = sp.getTen();
        giaMua = sp.getGiaMua();
        giaBan = sp.getGiaBan();
        soLuong = soLuongBan;
    }

    public String getMaSP() {
        return maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public int getGiaMua() {
        return giaMua;
    }

    public int getGiaBan() {
        return giaBan;
    }
    
}
