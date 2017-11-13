package nhom5.ui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class QuanLySanPhamUI extends JPanel {

	// Khai bao cac bien duoc su dung
	
	JTextField txtTimKiem;
	JButton btnCapNhat, btnXoa, btnThem, btnTimKiem;
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
			txtTimKiem = new JTextField(30);
			btnTimKiem = new JButton("Tìm kiếm");
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
			
		tbl = new JTable(dtm);
		JScrollPane sc = new JScrollPane(tbl, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		pnThongTin.add(sc, BorderLayout.CENTER);
		
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
	}
	
	// Add events
	
	public void addEvents() {
		
		btnThem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ThemDiaNhacUI tmp = new ThemDiaNhacUI("Them dia nhac");
				tmp.showWindow();
			}
		});
		
		btnCapNhat.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				CapNhatSanPhamUI tmp = new CapNhatSanPhamUI("Cap nhat san pham");
				tmp.showWindow();
			}
		});
	}
}
