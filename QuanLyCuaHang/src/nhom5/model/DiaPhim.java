package nhom5.model;

public class DiaPhim extends SanPham {
	private String tenDaoDien;
	private String tenDienVien;
	public String getTenDaoDien() {
		return tenDaoDien;
	}
	public void setTenDaoDien(String tenDaoDien) {
		this.tenDaoDien = tenDaoDien;
	}
	public String getTenDienVien() {
		return tenDienVien;
	}
	public void setTenDienVien(String tenDienVien) {
		this.tenDienVien = tenDienVien;
	}
	public DiaPhim(String ma, String ten, int giaMua, int giaBan, int soLuong, String tenDaoDien, String tenDienVien) {
		super(ma, ten, giaMua, giaBan, soLuong);
		this.tenDaoDien = tenDaoDien;
		this.tenDienVien = tenDienVien;
	}
	
}
