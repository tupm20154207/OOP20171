package nhom5.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class HoaDon {
	private String maHoaDon;
	private HashMap<SanPham, Integer> banGhi;
	private Date ngay;
	private NhanVienBanHang nv;
	public String getMaHoaDon() {
		return maHoaDon;
	}
	public void setMaHoaDon(String maHoaDon) {
		this.maHoaDon = maHoaDon;
	}
	public HashMap<SanPham, Integer> getBanGhi() {
		return banGhi;
	}
	public void setBanGhi(HashMap<SanPham, Integer> banGhi) {
		this.banGhi = banGhi;
	}
	public Date getNgay() {
		return ngay;
	}
	public void setNgay(Date ngay) {
		this.ngay = ngay;
	}
	public NhanVienBanHang getNv() {
		return nv;
	}
	public void setNv(NhanVienBanHang nv) {
		this.nv = nv;
	}
	public HoaDon(String ma, Date ngay, NhanVienBanHang nv) {
		super();
		this.ngay = ngay;
		this.maHoaDon = ma;
		this.nv = nv;
		this.banGhi = new HashMap<>();
	}
	public void themSanPham(SanPham sp, int sl)
	{
		this.banGhi.put(sp, new Integer(sl));
	}
	public int tinhTongTien()
	{
		int tongTien = 0;
		for(Map.Entry<SanPham, Integer> entry: banGhi.entrySet())
		{
			SanPham sp = entry.getKey();
			int sl = entry.getValue();
			tongTien += sp.getGiaBan()*sl;
		}
		return tongTien;
	}
	
	public int tinhTongLai()
	{
		int tongLai = 0;
		for(Map.Entry<SanPham, Integer> entry: banGhi.entrySet())
		{
			SanPham sp = entry.getKey();
			int sl = entry.getValue();
			tongLai += sl*(sp.getGiaBan()-sp.getGiaMua());
		}
		return tongLai;
	}
}
