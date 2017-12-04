package nhom5.test;

import java.util.Date;
import nhom5.model.ChiPhi;
import nhom5.model.CuaHang;

import nhom5.model.DiaNhac;
import nhom5.model.DiaPhim;
import nhom5.model.NhanVienBanHang;
import nhom5.model.QuanLy;
import nhom5.model.Sach;
import nhom5.model.SanPham;
import nhom5.ui.QuanLyUI;
import nhom5.util.TienIch;

public class TestQuanLyUI {

    public static void main(String[] args) {

        QuanLy.setTaiKhoan("ql");QuanLy.setMatKhau("1");
        QuanLy.themNhanVien(new NhanVienBanHang("nv1", "1", "Tu", TienIch.chuyenDoiNgay("17/11/1997"), new Date(), 15000));
        QuanLy.themNhanVien(new NhanVienBanHang("nv2", "2", "Tu", TienIch.chuyenDoiNgay("17/11/1997"), new Date(), 15000));
        QuanLy.themNhanVien(new NhanVienBanHang("nv3", "3", "Tu", TienIch.chuyenDoiNgay("17/11/1997"), new Date(), 15000));

        QuanLy.themSanPham(new DiaNhac(TienIch.sinhMaSP("dn"), "24K", 1, 1, 1,"bruno mars","pop"));
        QuanLy.themSanPham(new DiaPhim(TienIch.sinhMaSP("dp"), "Inception", 2, 12,1,"christopher nolan","asd"));
        QuanLy.themSanPham(new Sach(TienIch.sinhMaSP("s"),"Sherlock Holmes",3,5,1,"conan doyle","dfg"));
        
        QuanLy.themChiPhi(new ChiPhi(TienIch.sinhMaCP(),100000, "Hong phan mem quan ly ban hang", new Date()));
        QuanLy.themChiPhi(new ChiPhi(TienIch.sinhMaCP(),2000000000, "Chay cua hang", new Date()));

        QuanLyUI ui = new QuanLyUI("Quản lý");

    }
}
