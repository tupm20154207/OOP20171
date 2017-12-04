package nhom5.model;

import java.io.Serializable;

public class Sach extends SanPham implements Serializable{
	private String nhaXuatBan;
	private String tacGia;
        
        public Sach(String ma, String ten, int giaMua, int giaBan, int soLuong, String nhaXuatBan, String tacGia) {
		super(ma, ten, giaMua, giaBan, soLuong);
		this.nhaXuatBan = nhaXuatBan;
		this.tacGia = tacGia;
	}
        
        public Sach() {
            super();
	}
        
        
	public String getNhaXuatBan() {
		return nhaXuatBan;
	}
	public void setNhaXuatBan(String nhaXuatBan) {
		this.nhaXuatBan = nhaXuatBan;
	}
	public String getTacGia() {
		return tacGia;
	}
	public void setTacGia(String tacGia) {
		this.tacGia = tacGia;
	}
	
	public String getThongTin() {
		return ("Tac gia: "+this.getTacGia()+", Nha xuat ban: "+this.getNhaXuatBan());
	}
}
