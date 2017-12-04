package nhom5.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import nhom5.util.TienIch;

public class ChiPhi {
        
        private String maCP;
	private int soTien;
	private String lyDo;
	private Date ngay;
        
        public String getMaCP() {
             return maCP;
        }

        public void setMaCP(String maCP) {
            this.maCP = maCP;
        }
        
	public int getSoTien() {
		return soTien;
	}
	public void setSoTien(int soTien) {
		this.soTien = soTien;
	}
	public String getLyDo() {
		return lyDo;
	}
	public void setLyDo(String lyDo) {
		this.lyDo = lyDo;
	}
	public Date getNgay() {
		return ngay;
	}
        
	public void setNgay(Date ngay) {
		this.ngay = ngay;
	}
	public ChiPhi(String ma, int soTien, String lyDo, Date ngay) {
		super();
                this.maCP = ma;
		this.soTien = soTien;
		this.lyDo = lyDo;
		this.ngay = ngay;
	}
	
}
