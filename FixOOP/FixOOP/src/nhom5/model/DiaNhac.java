package nhom5.model;

public class DiaNhac extends SanPham {
	private String tenCaSi;
	private String theLoai;
	public String getTenCaSi() {
		return tenCaSi;
	}
	public void setTenCaSi(String tenCaSi) {
		this.tenCaSi = tenCaSi;
	}
	public String getTheLoai() {
		return theLoai;
	}
	public void setTheLoai(String theLoai) {
		this.theLoai = theLoai;
	}
	public DiaNhac(String ma, String ten, int giaMua, int giaBan, int soLuong, String tenCaSi, String theLoai) {
		super(ma, ten, giaMua, giaBan, soLuong);
		this.tenCaSi = tenCaSi;
		this.theLoai = theLoai;
	}
	public String getThongTin() {
		return ("Ca si: "+this.getTenCaSi()+", The loai: "+ this.getTheLoai());
	}
}
