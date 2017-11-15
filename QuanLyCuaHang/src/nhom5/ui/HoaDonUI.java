package nhom5.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.Border;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

import nhom5.model.CuaHang;
import nhom5.model.HoaDon;
import nhom5.model.NhanVienBanHang;
import nhom5.model.QuanLy;
import nhom5.model.SanPham;
import nhom5.util.TienIch;

public class HoaDonUI extends JFrame{
	
	NhanVienBanHang nhanVien;
	ArrayList<String> dsSP;
	// Khai bao cac bien duoc su dung
	
	JTextField txtTongTien, txtKhachGui, txtTraLai;
	JButton btnIn,btnXoa;
	DefaultTableModel dtm;
	JTable tbl;
	
	// Constructor
	public HoaDonUI(String title, NhanVienBanHang nv, ArrayList<String> dsSP) {
		super(title);
		this.nhanVien = nv;
		this.dsSP = dsSP;
		addControls();
		addEvents();
	}
	
	public void addControls() {
		
		Container con = getContentPane();
		
		JPanel pnMain = new JPanel();
		pnMain.setLayout(new BorderLayout());
		
			JPanel pnCenter = new JPanel();
			pnCenter.setLayout(new BoxLayout(pnCenter, BoxLayout.Y_AXIS));
				
				JPanel pnDanhSach = new JPanel();
				pnDanhSach.setLayout(new BorderLayout());
			
					dtm = new DefaultTableModel();
					dtm.addColumn("Ten");dtm.addColumn("Ma");dtm.addColumn("So Luong");dtm.addColumn("Don gia");dtm.addColumn("Thanh tien");
					
					tbl = new JTable(dtm) {
						
						// Overide isCellEditable method, ngan chan viec sua doi thong tin trong table.
						
				        public boolean isCellEditable(int row, int column) {                		
				                if(column == 2) return true;
				                return false;
				        };
				    };
				    
					tbl.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
					tbl.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
					
					JScrollPane sc = new JScrollPane(tbl,
										 JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
										 JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS); 
					
					sc.setPreferredSize(new Dimension(600,400));
				// Tao khung bao
				Border borderDanhSach = BorderFactory.createLineBorder(Color.BLUE);
				
				//
				
				pnDanhSach.setBorder(borderDanhSach);
				pnDanhSach.setPreferredSize(new Dimension(450,350));
				pnDanhSach.add(sc);
		
				JPanel pnTongTien = new JPanel();
				pnTongTien.setLayout(new FlowLayout(FlowLayout.RIGHT));
					JLabel lblTongTien = new JLabel("Tong tien: ");
					txtTongTien = new JTextField(10);
				pnTongTien.add(lblTongTien); pnTongTien.add(txtTongTien);
				
				JPanel pnKhachGui = new JPanel();
				pnKhachGui.setLayout(new FlowLayout(FlowLayout.RIGHT));
					JLabel lblKhachGui = new JLabel("Khach gui: ");
					txtKhachGui = new JTextField(10);
				pnKhachGui.add(lblKhachGui); pnKhachGui.add(txtKhachGui);
				
				JPanel pnTraLai = new JPanel();
				pnTraLai.setLayout(new FlowLayout(FlowLayout.RIGHT));
					JLabel lblTraLai = new JLabel("Tra lai: ");
					txtTraLai = new JTextField(10);
				pnTraLai.add(lblTraLai); pnTraLai.add(txtTraLai);
			
			pnCenter.add(pnDanhSach);
			pnCenter.add(pnTongTien);pnCenter.add(pnKhachGui);pnCenter.add(pnTraLai);
			
			JPanel pnButton = new JPanel();
			pnButton.setLayout(new FlowLayout(FlowLayout.RIGHT));
				btnXoa = new JButton("Bo chon");
				btnIn = new JButton("In hoa don");			
			pnButton.add(btnXoa);pnButton.add(btnIn);
			
		pnMain.add(pnCenter,BorderLayout.CENTER);
		pnMain.add(pnButton,BorderLayout.SOUTH);
		
		con.add(pnMain);
	}
	
	public void addEvents() {
		
		// Them danh sach san pham da chon vao bang
		
		for(int i = 0; i < dsSP.size(); i++) {
			SanPham sp = CuaHang.getDsSanPham().get(dsSP.get(i));
			String [] rowData = {sp.getTen(),sp.getMa(),"1",sp.getGiaBan()+"",sp.getGiaBan()+""};
			dtm.addRow(rowData);
		}
		
		txtTongTien.setText(tinhTongTien()+"");
		
		// Chinh sua muc thanh tien khi so luong san pham thay doi
		
		tbl.getModel().addTableModelListener(new TableModelListener() {
			
			@Override
			public void tableChanged(TableModelEvent e) {
				// TODO Auto-generated method stub
				if(e.getType() == TableModelEvent.UPDATE) {
					int row = e.getFirstRow();
					int column = e.getColumn();
					if(column == 2) {
						
						String maSP = tbl.getValueAt(row, 0).toString();
						int soLuong = getIntAt(row, column);
						
						if(CuaHang.getDsSanPham().get(maSP).getSoLuong() < soLuong) {
							sendMess("Khong du san pham");
							tbl.setValueAt(0, row, column);
							tbl.setValueAt(0, row, 4);
						}
						
						else {
							tbl.setValueAt(getIntAt(row,2) * getIntAt(row,3), row, 4);
						}
						
						txtTongTien.setText(tinhTongTien()+"");
					}				
				}
			}
		});
		
		// Kiem tra so tien khach tra, cap nhat so tien tra lai
		
		txtKhachGui.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					int khachGui = Integer.parseInt(txtKhachGui.getText());
					int tongTien = Integer.parseInt(txtTongTien.getText());
					if(khachGui < tongTien) {
						sendMess("really?");
						return;
					}
					txtTraLai.setText((khachGui-tongTien)+"");
				}
				catch (Exception e1) {
					sendMess("Dau vao khong hop le");
				}
			}
		});
		
		
		// Them su kien in hoa don
		
		btnIn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				// Kiem tra cac o text
				
				if(txtKhachGui.getText().isEmpty() || txtTraLai.getText().isEmpty()) {
					sendMess("Yeu cau nhap du thong tin cho hoa don");
				}
				
				else {
					// Cap nhat so luong san pham  
					
					for(int i = 0; i < dtm.getRowCount(); i++) {
						SanPham sp = CuaHang.getDsSanPham().get(dsSP.get(i));
						sp.setSoLuong(sp.getSoLuong()- getIntAt(i,2));
					}
					
					// Them hoa don vao csdl
					
					QuanLy.themHoaDon(new HoaDon(TienIch.sinhMaHD(), new Date(), nhanVien));
					
					// Thong bao thanh cong
					
					sendMess("In hoa don thanh cong!");
					
				}
				
			}
		});
		
		// Them su kien xoa
		
		btnXoa.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int row = tbl.getSelectedRow();
				if(row != -1) {
					dtm.removeRow(row);
				}
			}
		});
	}
	
	public void showWindow() {
		this.setSize(750,500);
		//this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	public int getIntAt(int row, int column) {
		int value;
		try{
			value = Integer.parseInt((String)tbl.getValueAt(row, column));
			return value;
		}
		catch (Exception e) {
			// TODO: handle exception
			return 0;
		}
	}
	
	public int tinhTongTien() {
		int tongTien = 0;
		for(int i = 0; i < dtm.getRowCount(); i++) {
			tongTien += getIntAt(i,2) * getIntAt(i,3);
		}
		return tongTien;
	}
	
	public void sendMess(String message) {
		JOptionPane.showMessageDialog(null, message);
	}
}
