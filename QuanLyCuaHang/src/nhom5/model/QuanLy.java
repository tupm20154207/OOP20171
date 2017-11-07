package nhom5.model;

public class QuanLy {
	
	//quan ly san pham
	public static void themDiaNhac(DiaNhac dn)
	{
		CuaHang.getDsSanPham().add(dn);
	}
	public static void themDiaPhim(DiaPhim dp)
	{
		CuaHang.getDsSanPham().add(dp);
	}
	public static void themSach(Sach s)
	{
		CuaHang.getDsSanPham().add(s);
	}
	
	//quan ly nhan vien
	
	
	//quan ly chi phi
	
	
	//quan ly hoa don
}
