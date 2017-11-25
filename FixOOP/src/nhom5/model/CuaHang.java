package nhom5.model;

import java.util.ArrayList;
import java.util.HashMap;

public class CuaHang {
	private static HashMap<String,SanPham> dsSanPham = new HashMap<>();
	private static HashMap<String,NhanVienBanHang> dsNhanVien = new HashMap<>();
	private static HashMap<String, HoaDon> dsHoaDon = new HashMap<>();
	private static ArrayList<ChiPhi> dsChiPhi = new ArrayList<>();
	private static ArrayList<HoaDonLuong> dsBangLuong = new ArrayList<>();
	private static HashMap<String, String> dsTaiKhoan = new HashMap<>();
	
	public static HashMap<String,SanPham> getDsSanPham() {
		return dsSanPham;
	}
	public static void setDsSanPham(HashMap<String,SanPham> dsSanPham) {
		CuaHang.dsSanPham = dsSanPham;
	}
	public static HashMap<String,NhanVienBanHang> getDsNhanVien() {
		return dsNhanVien;
	}
	public static void setDsNhanVien (HashMap<String,NhanVienBanHang> dsNhanVien) {
		CuaHang.dsNhanVien = dsNhanVien;
	}
	public static ArrayList<ChiPhi> getDsChiPhi() {
		return dsChiPhi;
	}
	public static void setDsChiPhi(ArrayList<ChiPhi> dsChiPhi) {
		CuaHang.dsChiPhi = dsChiPhi;
	}
	public static HashMap<String, HoaDon> getDsHoaDon() {
		return dsHoaDon;
	}
	public static void setDsHoaDon(HashMap<String, HoaDon> dsHoaDon) {
		CuaHang.dsHoaDon = dsHoaDon;
	}
	public static ArrayList<HoaDonLuong> getDsBangLuong() {
		return dsBangLuong;
	}
	public static void setDsBangLuong(ArrayList<HoaDonLuong> dsBangLuong) {
		CuaHang.dsBangLuong = dsBangLuong;
	}
	public static HashMap<String, String> getDsTaiKhoan() {
		return dsTaiKhoan;
	}
	public static void setDsTaiKhoan(HashMap<String, String> dsTaiKhoan) {
		CuaHang.dsTaiKhoan = dsTaiKhoan;
	}
	
}