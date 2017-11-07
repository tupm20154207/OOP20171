package nhom5.model;

import java.util.ArrayList;

public class CuaHang {
	private static ArrayList<SanPham> dsSanPham = new ArrayList<>();
	private static ArrayList<NhanVienBanHang> dsNhanVien = new ArrayList<>();
	private static ArrayList<ChiPhi> dsChiPhi = new ArrayList<>();
	private static ArrayList<HoaDon> dsHoaDon = new ArrayList<>();
	public static ArrayList<SanPham> getDsSanPham() {
		return dsSanPham;
	}
	public static void setDsSanPham(ArrayList<SanPham> dsSanPham) {
		CuaHang.dsSanPham = dsSanPham;
	}
	public static ArrayList<NhanVienBanHang> getDsNhanVien() {
		return dsNhanVien;
	}
	public static void setDsNhanVien(ArrayList<NhanVienBanHang> dsNhanVien) {
		CuaHang.dsNhanVien = dsNhanVien;
	}
	public static ArrayList<ChiPhi> getDsChiPhi() {
		return dsChiPhi;
	}
	public static void setDsChiPhi(ArrayList<ChiPhi> dsChiPhi) {
		CuaHang.dsChiPhi = dsChiPhi;
	}
	public static ArrayList<HoaDon> getDsHoaDon() {
		return dsHoaDon;
	}
	public static void setDsHoaDon(ArrayList<HoaDon> dsHoaDon) {
		CuaHang.dsHoaDon = dsHoaDon;
	}
	
}