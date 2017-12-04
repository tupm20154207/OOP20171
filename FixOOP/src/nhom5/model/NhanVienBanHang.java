package nhom5.model;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;

import nhom5.util.ClonedSanPham;
import nhom5.util.TienIch;

public class NhanVienBanHang implements Serializable{
	
    private String ma;
    private String ten;
    private String matKhau;
    private int luongCoBan;
    private Date ngaySinh;
    private Date ngayVaoLam;
    private Date thoiDiemDangNhap; 
    private int gioTichLuy;
    private boolean trangThai;
		
	
	
    public NhanVienBanHang(String ma, String matKhau, String ten, Date ngaySinh, Date ngayVaoLam, int luongCoBan) {
        super();
        this.ma = ma;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.ngayVaoLam = ngayVaoLam;
        this.luongCoBan = luongCoBan;
        this.gioTichLuy = 0;
        this.trangThai = false;
        this.matKhau = matKhau;
    }
    
    public NhanVienBanHang() {
        super();
    }
    

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
    public String getMatKhau() {
            return matKhau;
    }
    public void setMatKhau(String matKhau) {
            this.matKhau = matKhau;
    }
    public Date getNgaySinh() {
            return ngaySinh;
    }
    public void setNgaySinh(Date ngaySinh) {
            this.ngaySinh = ngaySinh;
    }
    public Date getNgayVaoLam() {
            return ngayVaoLam;
    }
    public void setNgayVaoLam(Date ngayVaoLam) {
            this.ngayVaoLam = ngayVaoLam;
    }
    public int getLuongCoBan() {
            return luongCoBan;
    }
    public void setLuongCoBan(int luongCoBan) {
            this.luongCoBan = luongCoBan;
    }
    public boolean isActive() {
            return trangThai;
    }
    public void setTrangThai(boolean trangThai) {
            this.trangThai = trangThai;
    }
    public int getGioTichLuy() {
            return gioTichLuy;
    }
    public void setGioTichLuy(int gioTichLuy) {
            this.gioTichLuy = gioTichLuy;
    }	

    public Date getThoiDiemDangNhap() {
            return thoiDiemDangNhap;
    }

    public void setThoiDiemDangNhap(Date thoiDiemDangNhap) {
            this.thoiDiemDangNhap = thoiDiemDangNhap;
    }


    public void dangNhap() {
            this.setThoiDiemDangNhap(new Date());
            this.setTrangThai(true);
    }

    public void dangXuat() {
            Date now = new Date();
            this.setGioTichLuy(now.getHours()-this.getThoiDiemDangNhap().getHours());
            this.setThoiDiemDangNhap(null);
            this.setTrangThai(false);
    }

    public HoaDon thanhToan(HashMap<SanPham,Integer> dsSanPham) {

        HoaDon hoaDon = new HoaDon(TienIch.sinhMaHD(), new Date(), this);
        for(SanPham sanPham : dsSanPham.keySet()){
            
            ClonedSanPham clone = new ClonedSanPham(sanPham, dsSanPham.get(sanPham));
            hoaDon.themSanPham(clone);
            sanPham.setSoLuong(sanPham.getSoLuong() - dsSanPham.get(sanPham));
            
        }
        return hoaDon;
    }
}
