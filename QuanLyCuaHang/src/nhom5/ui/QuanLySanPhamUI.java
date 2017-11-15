package nhom5.ui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import nhom5.model.CuaHang;
import nhom5.model.QuanLy;
import nhom5.model.SanPham;

public class QuanLySanPhamUI extends JPanel {

	// Khai bao cac bien duoc su dung
	
	JTextField txtTimKiem;
	JButton btnCapNhat, btnXoa, btnThem, btnTimKiem;
	JComboBox<String> cbo;
	DefaultTableModel dtm;
	JTable tbl;
	
	// Constructor
	public QuanLySanPhamUI () {
		super();
		addControls();
		addEvents();
	}
	
	// Add controls
	
	public void addControls() {
		
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		// Panel Tim Kiem 
		
		JPanel pnTimKiem = new JPanel();
		this.add(pnTimKiem);
		pnTimKiem.setLayout(new FlowLayout());
			
			JLabel lblTimKiem = new JLabel("Nhap ten san pham: ");
			txtTimKiem = new JTextField(30);
			btnTimKiem = new JButton("Tìm kiếm");
		
		pnTimKiem.add(lblTimKiem);
		pnTimKiem.add(txtTimKiem);
		pnTimKiem.add(btnTimKiem);
		
		// Panel Thong tin
		
		JPanel pnThongTin = new JPanel();
		this.add(pnThongTin);
		pnThongTin.setLayout(new BorderLayout());
		
			dtm = new DefaultTableModel();
			dtm.addColumn("Mã");
			dtm.addColumn("Tên");
			dtm.addColumn("Loại");
			dtm.addColumn("Số lượng");
			dtm.addColumn("Giá mua");
			dtm.addColumn("Gía bán");
			dtm.addColumn("Thông tin");
			
		tbl = new JTable(dtm) {
			
			// Overide isCellEditable method, ngan chan viec sua doi thong tin trong table.
			
	        public boolean isCellEditable(int row, int column) {                		
	                return false;
	        };
	    };
	    
		JScrollPane sc = new JScrollPane(tbl, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		pnThongTin.add(sc, BorderLayout.CENTER);
		
		// Panel bottom
		
		JPanel pnBottom = new JPanel();
		pnBottom.setLayout(new BoxLayout(pnBottom, BoxLayout.X_AXIS));
		this.add(pnBottom);
		
			// Panel combobox
			
			JPanel pnCbo = new JPanel();
			pnCbo.setLayout(new FlowLayout(FlowLayout.LEFT));
			pnCbo.setPreferredSize(new Dimension(20,0));
				
				JLabel lblChoice = new JLabel("Loai san pham: ");
				cbo = new JComboBox<>();
				cbo.addItem("Tat ca");cbo.addItem("Dia nhac"); cbo.addItem("Dia phim"); cbo.addItem("Sach");
			
			pnCbo.add(lblChoice); pnCbo.add(cbo);
		
			// Panel Button
			
			JPanel pnButton = new JPanel();
			this.add(pnButton);
			pnButton.setLayout(new FlowLayout(FlowLayout.RIGHT));
				btnThem = new JButton("Thêm sản phẩm");
				btnXoa = new JButton("Xóa sản phẩm");
				btnCapNhat = new JButton("Cập nhật sản phẩm");
			pnButton.add(btnThem);
			pnButton.add(btnXoa);
			pnButton.add(btnCapNhat);
			
		pnBottom.add(pnCbo);pnBottom.add(pnButton);
	}
	
	// Add events
	
	public void addEvents() {
		
		btnTimKiem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				int loai = cbo.getSelectedIndex();
				String xauTimKiem = txtTimKiem.getText();
				
				clearTable();
				
				for(SanPham i : CuaHang.getDsSanPham().values()) {
					if(i.getTen().indexOf(xauTimKiem)!=-1 && (i.getLoai() == loai || loai == 0)) {
						String rowData[] = {i.getMa(),i.getTen(),i.getClass().getSimpleName(),i.getSoLuong()+"",i.getGiaMua()+"",i.getGiaBan()+"",i.toString()};
						dtm.addRow(rowData);
					}
				}
			}
		});
		
		btnThem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int loai = cbo.getSelectedIndex();
				switch (loai) {
				case 1:{
					ThemDiaNhacUI tmp = new ThemDiaNhacUI("Them dia nhac");
					tmp.showWindow();
					break;
				}
					
				case 2:{
					ThemDiaPhimUI tmp = new ThemDiaPhimUI("Them dia phim");
					tmp.showWindow();
					break;
				}
					
				case 3:{
					ThemSachUI tmp = new ThemSachUI("Them sach");
					tmp.showWindow();
					break;
				}

				default:
					sendMess("Vui long chon mot loai san pham cu the.");
					break;
				}
			}
		});
		
		btnXoa.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(tbl.getSelectedRow()!=-1) {
					String ma = tbl.getValueAt(tbl.getSelectedRow(), 0)+"";
					QuanLy.xoaSanPham(CuaHang.getDsSanPham().get(ma));
					dtm.removeRow(tbl.getSelectedRow());
					sendMess("Xoa thanh cong.");
				}
			}
		});
		
		btnCapNhat.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(tbl.getSelectedRow() != -1) {
					
					String ma = tbl.getValueAt(tbl.getSelectedRow(), 0)+"";
					SanPham sp = CuaHang.getDsSanPham().get(ma);
					
					CapNhatSanPhamUI tmp = new CapNhatSanPhamUI("Cap nhat san pham",sp);
					tmp.showWindow();
					
				}
				
			}
		});
	}
	
	public void clearTable() {
		dtm.setRowCount(0);
	}
	
	public void sendMess(String message) {
		JOptionPane.showMessageDialog(null, message);
	}
}
