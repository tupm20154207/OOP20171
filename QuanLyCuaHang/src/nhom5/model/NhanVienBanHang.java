package ductung.model;

import java.util.Vector;

public class NhanVienBanHang {
	private String ma;
	private String ten;
	private int luong;
	private Vector<HoaDon> hoaDon;
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
	public int getLuong() {
		return luong;
	}
	public void setLuong(int luong) {
		this.luong = luong;
	}
	public Vector<HoaDon> getHoaDon() {
		return hoaDon;
	}
	public void setHoaDon(Vector<HoaDon> hoaDon) {
		this.hoaDon = hoaDon;
	}
}
