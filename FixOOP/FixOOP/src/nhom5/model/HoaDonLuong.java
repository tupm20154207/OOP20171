package nhom5.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import nhom5.util.ClonedNhanVien;

public class HoaDonLuong {
    private String maHDL;    
    private Date ngayTraLuong;
    private ArrayList<ClonedNhanVien> bangLuong; 

    public HoaDonLuong(String maHDL,Date ngayTraLuong) {
        super();
        this.maHDL = maHDL;
        this.ngayTraLuong = ngayTraLuong;
        this.bangLuong = new ArrayList<>();
    }
    
    public Date getNgayTraLuong() {
        return ngayTraLuong;
    }

    public void setNgayTraLuong(Date ngayTraLuong) {
        this.ngayTraLuong = ngayTraLuong;
    }

    public ArrayList<ClonedNhanVien> getBangLuong() {
        return bangLuong;
    }

    public void setLuongNhanVien(ArrayList<ClonedNhanVien> bangLuong) {
        this.bangLuong = bangLuong;
    }	
    
    public String getMaHDL() {
        return maHDL;
    }

    public void setMaHDL(String maHDL) {
        this.maHDL = maHDL;
    }
    
    public void themNV(ClonedNhanVien nv){
        bangLuong.add(nv);
    }
    public int tinhTongChi(){
        int tongChi = 0;
        for(ClonedNhanVien nv : bangLuong){
            tongChi += nv.getLuongCoBan() * nv.getSoGioTichLuy();
        }
        return tongChi;
    }
}
