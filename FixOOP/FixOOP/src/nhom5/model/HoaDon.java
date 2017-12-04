package nhom5.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import nhom5.util.ClonedSanPham;

public class HoaDon {
	private String maHoaDon;
	private ArrayList<ClonedSanPham> banGhi;
	private Date ngay;
	private String maNV;
        private String tenNV;
	public String getMaHoaDon() {
		return maHoaDon;
	}
	public void setMaHoaDon(String maHoaDon) {
		this.maHoaDon = maHoaDon;
	}
	public ArrayList<ClonedSanPham> getBanGhi() {
		return banGhi;
	}
	public void setBanGhi(ArrayList<ClonedSanPham> banGhi) {
		this.banGhi = banGhi;
	}
	public Date getNgay() {
		return ngay;
	}
	public void setNgay(Date ngay) {
		this.ngay = ngay;
	}

        public String getMaNV() {
            return maNV;
        }

        public void setMaNV(String maNV) {
            this.maNV = maNV;
        }

        public String getTenNV() {
            return tenNV;
        }

        public void setTenNV(String tenNV) {
            this.tenNV = tenNV;
        }
	
	public HoaDon(String ma, Date ngay, NhanVienBanHang nv) {
		super();
		this.ngay = ngay;
		this.maHoaDon = ma;
		this.maNV = nv.getMa();
                this.tenNV = nv.getTen();
		this.banGhi = new ArrayList<ClonedSanPham>();
	}
	public void themSanPham(ClonedSanPham sp)
	{
		this.banGhi.add(sp);
	}
	public int tinhTongTien()
	{
            int tongTien = 0;
            for(ClonedSanPham sp : banGhi)
            {
                tongTien += sp.getSoLuong()*sp.getGiaBan();
            }
            return tongTien;
	}
	
	public int tinhTongLai()
	{
            int tongLai = 0;
            for(ClonedSanPham sp : banGhi)
            {
                tongLai += sp.getSoLuong()*(sp.getGiaBan()-sp.getGiaMua());
            }
            return tongLai;
	}
}
