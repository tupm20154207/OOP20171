package nhom5.model;

import java.util.HashMap;

public class CuaHang{
	private static HashMap<String, SanPham>         dsSanPham = new HashMap<>();
	private static HashMap<String, NhanVienBanHang> dsNhanVien = new HashMap<>();
	private static HashMap<String, HoaDon>          dsHoaDon = new HashMap<>();
	private static HashMap<String, ChiPhi>          dsChiPhi = new HashMap<>();
	private static HashMap<String, HoaDonLuong>     dsBangLuong = new HashMap<>();
        
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
	public static HashMap<String,ChiPhi> getDsChiPhi() {
		return dsChiPhi;
	}
	public static void setDsChiPhi(HashMap<String,ChiPhi> dsChiPhi) {
		CuaHang.dsChiPhi = dsChiPhi;
	}
	public static HashMap<String, HoaDon> getDsHoaDon() {
		return dsHoaDon;
	}
	public static void setDsHoaDon(HashMap<String, HoaDon> dsHoaDon) {
		CuaHang.dsHoaDon = dsHoaDon;
	}
	public static HashMap<String,HoaDonLuong> getDsBangLuong() {
		return dsBangLuong;
	}
	public static void setDsBangLuong(HashMap<String,HoaDonLuong> dsBangLuong) {
		CuaHang.dsBangLuong = dsBangLuong;
        }
	
}