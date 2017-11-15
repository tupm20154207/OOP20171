package nhom5.ui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import nhom5.model.CuaHang;
import nhom5.model.NhanVienBanHang;
import nhom5.model.SanPham;

public class NhanVienUI extends JFrame {
	
	NhanVienBanHang nhanVien;
	
	JMenuBar mnuBar;
	JMenu mnuAccount;
	JMenuItem mnuDangXuat, mnuDoiMatKhau;

	
	JFileChooser chooser;
	
	JTextField txtTimKiem;
	JButton btnTimKiem;
	
	DefaultTableModel dtm;
	JTable tblSanPham;
	
	JButton btnThanhToan;
	JButton btnThoat;
	
	public NhanVienUI (String title, NhanVienBanHang nv)
	{
		super(title);
		this.nhanVien = nv;
		addControls();
		addEvents();
	}

	private void addControls() {
		
		// Tao menu
		
		mnuBar = new JMenuBar();
		setJMenuBar(mnuBar);
		
			mnuAccount = new JMenu("Tai khoan");
		
				mnuDangXuat = new JMenuItem("Dang xuat");
			
				mnuDoiMatKhau = new JMenuItem("Doi mat khau");
		
			mnuAccount.add(mnuDangXuat);mnuAccount.add(mnuDoiMatKhau);
		
		mnuBar.add(mnuAccount);
		
		// Set layout cho cua so
		
		Container con = getContentPane();
		
		JPanel pnMain = new JPanel();
		pnMain.setLayout(new BoxLayout(pnMain, BoxLayout.Y_AXIS));
		
		// Panel Tim kiem
		
		JPanel pnTimKiem = new JPanel();
		pnTimKiem.setLayout(new FlowLayout());
		
			txtTimKiem = new JTextField(30);
			btnTimKiem = new JButton("Tìm kiếm");
		
		pnTimKiem.add(txtTimKiem);
		pnTimKiem.add(btnTimKiem);
		
		//Panel ThongTin
		
		JPanel pnThongTin = new JPanel();
		pnThongTin.setLayout(new BorderLayout());
		
			dtm = new DefaultTableModel();
			
			dtm.addColumn("Mã");
			dtm.addColumn("Tên");
			dtm.addColumn("Loại");
			dtm.addColumn("Số lượng");
			dtm.addColumn("Gía bán");
			
			tblSanPham = new JTable(dtm);
		
			JScrollPane sc = new JScrollPane(tblSanPham, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		pnThongTin.add(sc, BorderLayout.CENTER);
		
		//Panel Button
		
		JPanel pnButton = new JPanel();
		pnButton.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
			btnThanhToan = new JButton("Thanh toán");
			btnThoat = new JButton("Thoát");
			
		pnButton.add(btnThanhToan); 
		pnButton.add(btnThoat);
		
		pnMain.add(pnTimKiem); pnMain.add(pnThongTin);pnMain.add(pnButton);
		
		con.add(pnMain);
	}

	private void addEvents() {
		// TODO Auto-generated method stub
		
		mnuDangXuat.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				nhanVien.signOut();
				LoginUI tmp = new LoginUI("Dang nhap");
				tmp.showWindow();
				setVisible(false);
			}
		});
		
		mnuDoiMatKhau.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ChangePwdUI tmp = new ChangePwdUI("Doi mat khau");
				tmp.showWindow();
			}
		});
		
		btnTimKiem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String text = txtTimKiem.getText();
				if(CuaHang.getDsSanPham().containsKey(text)) {
					SanPham sp = CuaHang.getDsSanPham().get(text);
					String [] rowData = {sp.getMa(),sp.getTen(),sp.getClass().getSimpleName(),sp.getSoLuong()+"",sp.getGiaBan()+""};
					dtm.addRow(rowData);
				}
			}
		});
		
		btnThanhToan.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				HoaDonUI tmp = new HoaDonUI("Thanh toan");
				tmp.showWindow();
			}
		});
		
		btnThoat.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
	}
	
	public void showWindow()
	{
		this.setSize(800, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
