package nhom5.model;

public class DiaPhim extends SanPham {
	private String tenDaoDien;
	private String theLoai;
	public String getTenDaoDien() {
		return tenDaoDien;
	}
	public void setTenDaoDien(String tenDaoDien) {
		this.tenDaoDien = tenDaoDien;
	}
	public String getTheLoai() {
		return theLoai;
	}
	public void setTheLoai(String tenDienVien) {
		this.theLoai = theLoai;
	}
	public DiaPhim(String ma, String ten, int giaMua, int giaBan, int soLuong, String tenDaoDien, String theLoai) {
		super(ma, ten, giaMua, giaBan, soLuong);
		this.tenDaoDien = tenDaoDien;
		this.theLoai = theLoai;
	}
	public String getThongTin() {
		return ("The loai: "+this.getTheLoai()+", Dao dien: "+ this.getTenDaoDien());
	}
}
