/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhom5.tuongtacfile;

import java.io.EOFException;
import java.util.HashMap;
import nhom5.model.*;


/**
 *
 * @author krayz
 */
public class PhienHoatDong {
    
    private static String folder = "/home/tung1705/Desktop/OOP/FixOOP/database" ;
    private static String filename;
    
    public static boolean batDau(){
       
        try{
            // Doc tai khoan va mat khau cua nguoi quan ly
        
            filename = "/quanly/quanly.ser";
            String rawData = ObjectFileFactory.docFile(folder+filename);

            String [] data = rawData.split("\n");
            QuanLy.setTaiKhoan(data[0]);
            QuanLy.setMatKhau(data[1]);

            // Doc danh sach nhan vien

            filename = "/dsNhanVien/nhanvien.ser";
            HashMap<String,NhanVienBanHang> dsNhanVien = ObjectFileFactory.docFile(folder+filename);
            CuaHang.setDsNhanVien(dsNhanVien);

            // Doc danh sach san pham

            filename = "/dsSanPham/sanpham.ser";
            HashMap<String,SanPham> dsSanPham = ObjectFileFactory.docFile(folder+filename);
            CuaHang.setDsSanPham(dsSanPham);

            // Doc danh sach hoa don luong

            filename = "/dsHoaDonLuong/hoadonluong.ser";
            HashMap<String,HoaDonLuong> dsHoaDonLuong = ObjectFileFactory.docFile(folder+filename);
            CuaHang.setDsBangLuong(dsHoaDonLuong);

            // Doc danh sach chi phi

            filename = "/dsChiPhi/chiphi.ser";
            HashMap<String,ChiPhi> dsChiPhi = ObjectFileFactory.docFile(folder+filename);
            CuaHang.setDsChiPhi(dsChiPhi);

            // Doc danh sach hoa don

            filename = "/dsHoaDon/hoadon.ser";
            HashMap<String,HoaDon> dsHoaDon =  ObjectFileFactory.docFile(folder+filename);
            CuaHang.setDsHoaDon(dsHoaDon);
            return true;
        
        }

        catch(Exception e){
            return true;
        }
    //    return false;
    }
    
    public static void ketThuc(){
       
        try{
        
            // Luu tai khoan va mat khau cua nguoi quan ly
        
            filename = "/quanly/quanly.ser";
            ObjectFileFactory.luuFile(QuanLy.getTaiKhoan()+"\n"+QuanLy.getMatKhau(), folder + filename);

            // Luu danh sach nhan vien

            filename = "/dsNhanVien/nhanvien.ser";
            ObjectFileFactory.luuFile(CuaHang.getDsNhanVien(), folder + filename);

            // Luu danh sach san pham

            filename = "/dsSanPham/sanpham.ser";
            ObjectFileFactory.luuFile(CuaHang.getDsSanPham(), folder + filename);

            // Luu danh sach hoa don luong

            filename = "/dsHoaDonLuong/hoadonluong.ser";
            ObjectFileFactory.luuFile(CuaHang.getDsBangLuong(), folder + filename);

            // Luu danh sach chi phi

            filename = "/dsChiPhi/chiphi.ser";
            ObjectFileFactory.luuFile(CuaHang.getDsChiPhi(), folder + filename);

            // Luu danh sach hoa don

            filename = "/dsHoaDon/hoadon.ser";
            ObjectFileFactory.luuFile(CuaHang.getDsHoaDon(), folder + filename);
            
            System.exit(0);
        }
        catch(Exception e){
            e.printStackTrace();
        } 
    }
}
