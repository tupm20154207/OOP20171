package nhom5.ui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import nhom5.model.CuaHang;
import nhom5.model.NhanVienBanHang;
import nhom5.model.QuanLy;

public class QuanLyNhanVienUI extends JPanel {

	// Khai bao cac bien duoc su dung
	
	JButton btnLamMoi, btnSuaLuongCoBan, btnXoa, btnThem, btnTraLuong;
	DefaultTableModel dtm;
	JTable tbl;
	
	// Constructor
	public QuanLyNhanVienUI () {
		super();
		addControls();
		addEvents();
	}
	
	// Add controls
	
	public void addControls() {
		
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		// Thong tin nhan vien
		
		JPanel pnNhanVien = new JPanel();
		pnNhanVien.setLayout(new BorderLayout());
		this.add(pnNhanVien);
		
			dtm = new DefaultTableModel();
			dtm.addColumn("Mã nhân viên");
			dtm.addColumn("Tên nhân viên");
			dtm.addColumn("Ngay sinh");
			dtm.addColumn("Ngay vao lam");
			dtm.addColumn("Luong co ban");
			dtm.addColumn("So gio tich luy");
			dtm.addColumn("Trang thai hoat dong");
		
			tbl = new JTable(dtm) {
				
				// Overide isCellEditable method, ngan chan viec sua doi thong tin trong table.
				
		        public boolean isCellEditable(int row, int column) {                		
		                return false;
		        };
		    };
		    
			JScrollPane sc = new JScrollPane(tbl, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		pnNhanVien.add(sc, BorderLayout.CENTER);
		
		// Panel Button
		
		JPanel pnButton = new JPanel();
		pnButton.setLayout(new FlowLayout(FlowLayout.RIGHT));
		this.add(pnButton);
		
			btnLamMoi = new JButton("Lam moi");
			btnThem = new JButton("Thêm nhân viên");
			btnXoa = new JButton("Xóa nhân viên");
			btnSuaLuongCoBan = new JButton("Sua luong co ban");
			btnTraLuong = new JButton("Trả lương");
		
		pnButton.add(btnLamMoi);
		pnButton.add(btnThem);
		pnButton.add(btnXoa);
		pnButton.add(btnSuaLuongCoBan);
		pnButton.add(btnTraLuong);
	}
	
	// Add events
	
	public void addEvents() {
		
		btnLamMoi.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				clearTable();
				for(NhanVienBanHang i : CuaHang.getDsNhanVien().values()) {
					String [] rowData = {i.getMa(),i.getTen(),sdf.format(i.getNgaySinh()),sdf.format(i.getNgayVaoLam()),i.getLuongCoBan()+"",
									  i.getGioTichLuy()+"", (i.isActive() ? "ONLINE" : "OFFLINE")};
					dtm.addRow(rowData);
				}
			}
		});
		
		btnThem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ThemNhanVienUI tmp = new ThemNhanVienUI("Them nhan vien");
				tmp.showWindow();
			}
		});
		
		btnXoa.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(tbl.getSelectedRow()!=-1) {
					String maNV = tbl.getValueAt(tbl.getSelectedRow(), 0)+"";
					NhanVienBanHang nv = CuaHang.getDsNhanVien().get(maNV);
					QuanLy.xoaNhanVien(nv);
					dtm.removeRow(tbl.getSelectedRow());
					sendMess("Xoa thanh cong");
				}
			}
		});
		
		btnSuaLuongCoBan.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(tbl.getSelectedRow()!=-1) {
					
					String maNV = tbl.getValueAt(tbl.getSelectedRow(), 0)+"";
					NhanVienBanHang nv = CuaHang.getDsNhanVien().get(maNV);
					
					String inputValue = JOptionPane.showInputDialog("Nhap luong co ban moi: ");
					
					try {
						QuanLy.suaLuongCoBan(nv, Integer.parseInt(inputValue));
						sendMess("Sua thanh cong");
					}
					catch(Exception e1) {
						sendMess("Du lieu khong hop le");
					}
				}
				
				
			}
		});
		
		btnTraLuong.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				TraLuongUI tmp = new TraLuongUI("Tra luong");
				tmp.showWindow();
			}
		});
	}
	
	public void sendMess(String message) {
		JOptionPane.showMessageDialog(null, message);
	}
	
	public void clearTable() {
		dtm.setRowCount(0);
	}
}
