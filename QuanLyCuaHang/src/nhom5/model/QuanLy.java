package ductung.model;

import java.util.Vector;

public class QuanLy {
	private String ma;
	private String ten;
	private Vector<SanPham> danhSachSanPham;
	private Vector<NhanVienBanHang> danhSachNhanVien;
	private Vector<ChiPhi> danhSachChiPhi;
	public String getMa() {
		return ma;
	}
	public void setMa(String ma) {
		this.ma = ma;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public Vector<SanPham> getDanhSachSanPham() {
		return danhSachSanPham;
	}
	public void setDanhSachSanPham(Vector<SanPham> danhSachSanPham) {
		this.danhSachSanPham = danhSachSanPham;
	}
	public Vector<NhanVienBanHang> getDanhSachNhanVien() {
		return danhSachNhanVien;
	}
	public void setDanhSachNhanVien(Vector<NhanVienBanHang> danhSachNhanVien) {
		this.danhSachNhanVien = danhSachNhanVien;
	}
	public Vector<ChiPhi> getDanhSachChiPhi() {
		return danhSachChiPhi;
	}
	public void setDanhSachChiPhi(Vector<ChiPhi> danhSachChiPhi) {
		this.danhSachChiPhi = danhSachChiPhi;
	}
	
}
