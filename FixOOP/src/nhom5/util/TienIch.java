package nhom5.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import nhom5.model.CuaHang;

public class TienIch {
	
	// Cac ham tu dong tao ma nhan vien moi
	
	public static String sinhMaSP(String prefix) {
		
		// prefix = {S,DN,DP}
		
		return prefix + (CuaHang.getDsSanPham().size()); 
	}
	
	public static String sinhMaNV() {
		return "NV" + (CuaHang.getDsNhanVien().size()+"");
	}
	
	public static String sinhMaHD() {
		return "HD" + (CuaHang.getDsHoaDon().size()+"");
	}
	
	// Xu ly ngay thang
	
	public static Date chuyenDoiNgay(String input) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			Date date = sdf.parse(input);
			return date;
		}
		catch(ParseException e) {
			JOptionPane.showMessageDialog(null, "Dau vao sai");
		}
		
		return null;
	} 
	
	// Xu ly gio phut
	
	public static Date chuyenDoiGioPhutGiay(String input) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		
		try {
			Date time = sdf.parse(input);
			return time;
		}
		catch(ParseException e) {
			JOptionPane.showMessageDialog(null, "Dau vao sai");
		}
		
		return null;
	}
}
