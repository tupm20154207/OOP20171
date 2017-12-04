package nhom5.model;

import java.util.Date;

public class QuanLy {
	
	private static String taiKhoan;
	private static String matKhau;

	
	public static String getTaiKhoan() {
		return taiKhoan;
	}

	public static void setTaiKhoan(String taiKhoan) {
		QuanLy.taiKhoan = taiKhoan;
	}

	public static String getMatKhau() {
		return matKhau;
	}

	public static void setMatKhau(String matKhau) {
		QuanLy.matKhau = matKhau;
	}
	
	// Cac phuong thuc quan ly nhan vien
	
	public static void themNhanVien(NhanVienBanHang nv) {
		CuaHang.getDsNhanVien().put(nv.getMa(), nv);
	}
	
	public static void xoaNhanVien(NhanVienBanHang nv) {
		CuaHang.getDsNhanVien().remove(nv.getMa());
	}
	
	public static void thayDoiThongTin(NhanVienBanHang nv, String ten, String matKhau, int luongCoBan, Date ngaySinh) {
		CuaHang.getDsNhanVien().get(nv.getMa()).setLuongCoBan(luongCoBan);
                CuaHang.getDsNhanVien().get(nv.getMa()).setTen(ten);
                CuaHang.getDsNhanVien().get(nv.getMa()).setMatKhau(matKhau);
                CuaHang.getDsNhanVien().get(nv.getMa()).setNgaySinh(ngaySinh);
	}
	
	public static int traLuong(NhanVienBanHang nv) {
		int luong = nv.getGioTichLuy() * nv.getLuongCoBan();
		nv.setGioTichLuy(0);
		return luong;
	}
	
	// Cac phuong thuc quan ly san pham
	
	public static void themSanPham(SanPham sp) {
		CuaHang.getDsSanPham().put(sp.getMa(), sp);
	}
	
	public static void xoaSanPham(SanPham sp) {
		CuaHang.getDsSanPham().remove(sp.getMa());
	}
	
	public static void capNhatSanPham(SanPham sp, String tenMoi, int giaMuaMoi, int giaBanMoi, int soLuongMoi) {
		sp.setTen(tenMoi);
		sp.setGiaBan(giaBanMoi);
		sp.setGiaMua(giaMuaMoi);
		sp.setSoLuong(soLuongMoi);
	}
	
	// Cac phuong thuc quan ly hoa don
	
	public static void themHoaDon(HoaDon hd) {
		CuaHang.getDsHoaDon().put(hd.getMaHoaDon(), hd);
	}
	
	// Cac phuong thuc quan ly chi phi
	
	public static void themChiPhi(ChiPhi cp) {
		CuaHang.getDsChiPhi().put(cp.getMaCP(),cp);
	}
        
        public static void xoaChiPhi (ChiPhi cp){
                CuaHang.getDsChiPhi().remove(cp.getMaCP());
        }
	
	// Cac phuong thuc quan ly hoa don tien luong
	
	public static void themBangLuong(HoaDonLuong hdl) {
		CuaHang.getDsBangLuong().put(hdl.getMaHDL(),hdl);
	}
}
