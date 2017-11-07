package nhom5.model;

public class NhanVienBanHang {
	private String ma;
	private String ten;
	private int luong;
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
	public NhanVienBanHang(String ma, String ten, int luong) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.luong = luong;
	}
	
}
