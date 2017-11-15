package nhom5.test;

import java.util.Date;

import nhom5.model.NhanVienBanHang;
import nhom5.model.QuanLy;
import nhom5.model.SanPham;
import nhom5.ui.HoaDonUI;
import nhom5.ui.LoginUI;
import nhom5.ui.ThemDiaNhacUI;
import nhom5.ui.ThemKhoanChiUI;
import nhom5.ui.TraLuongUI;
import nhom5.util.TienIch;

public class TestLogin {
	public static void main(String args[]) {
		
		QuanLy.setTaiKhoan("ql");QuanLy.setMatKhau("zxc");
		QuanLy.themNhanVien(new NhanVienBanHang("", "", "Tu", TienIch.chuyenDoiNgay("17/11/1997"), new Date(), 15000));
		
		QuanLy.themSanPham(new SanPham("1", "1", 1, 1, 1));
		
		LoginUI ui = new LoginUI("");
		ui.showWindow();
	}
}
