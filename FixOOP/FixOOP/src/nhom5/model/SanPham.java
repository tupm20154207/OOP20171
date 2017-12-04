package nhom5.model;

public class SanPham {
	
	private String ma;
	private String ten;
	private int giaMua;
	private int giaBan;
	private int soLuong;
        
        public SanPham(String ma, String ten, int giaMua, int giaBan, int soLuong) {
		this.ma = ma;
		this.ten = ten;
		this.giaMua = giaMua;
		this.giaBan = giaBan;
		this.soLuong = soLuong;
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
	public int getGiaMua() {
		return giaMua;
	}
	public void setGiaMua(int giaMua) {
		this.giaMua = giaMua;
	}
	public int getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(int giaBan) {
		this.giaBan = giaBan;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	
	public int getLoai() {
		if		(this instanceof DiaNhac) return 1;
		else if (this instanceof DiaPhim) return 2;
		else if (this instanceof Sach	) return 3;
		else return 0;
	}
	public String getThongTin() {
		return "";
	}
}
