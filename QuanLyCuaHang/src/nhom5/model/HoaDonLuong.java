package nhom5.model;

import java.util.Date;
import java.util.HashMap;

public class HoaDonLuong {
	Date ngayTraLuong;
	HashMap<String, Integer> bangLuong; // key la ma nhan vien, value la luong tuong ung
	
	public HoaDonLuong(Date ngayTraLuong, HashMap<String, Integer> bangLuong) {
		super();
		this.ngayTraLuong = ngayTraLuong;
		this.bangLuong = bangLuong;
	}

	public Date getNgayTraLuong() {
		return ngayTraLuong;
	}

	public void setNgayTraLuong(Date ngayTraLuong) {
		this.ngayTraLuong = ngayTraLuong;
	}

	public HashMap<String, Integer> getBangLuong() {
		return bangLuong;
	}

	public void setLuongNhanVien(HashMap<String, Integer> bangLuong) {
		this.bangLuong = bangLuong;
	}	
	
}
