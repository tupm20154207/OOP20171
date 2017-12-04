/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhom5.test;

import java.util.Date;
import nhom5.model.DiaNhac;
import nhom5.model.DiaPhim;
import nhom5.model.NhanVienBanHang;
import nhom5.model.QuanLy;
import nhom5.model.Sach;
import nhom5.ui.NhanVienUI;
import nhom5.util.TienIch;

/**
 *
 * @author krayz
 */
public class testNhanVienUI {
    public static void main(String args[]){
        NhanVienBanHang nv = new NhanVienBanHang("nv1", "1", "Tu", TienIch.chuyenDoiNgay("17/11/1997"), new Date(), 15000);
        QuanLy.themNhanVien(nv);
        
        QuanLy.themSanPham(new DiaNhac(TienIch.sinhMaSP("dn"), "24K", 1, 1, 1,"bruno mars","pop"));
        QuanLy.themSanPham(new DiaPhim(TienIch.sinhMaSP("dp"), "Inception", 2, 12,1,"christopher nolan","asd"));
        QuanLy.themSanPham(new Sach(TienIch.sinhMaSP("s"),"Sherlock Holmes",3,5,1,"conan doyle","dfg"));
        
        NhanVienUI nvUI = new NhanVienUI("Nhan vien",nv);
    }
}
