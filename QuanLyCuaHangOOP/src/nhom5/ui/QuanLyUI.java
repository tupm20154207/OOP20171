package nhom5.ui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTabbedPane;

public class QuanLyUI extends JFrame{
	
	// Khoi tao cac bien can thiet
	
	JMenuBar mnuBar;
	JMenu mnuAccount;
	JMenuItem mnuDangXuat, mnuDoiMatKhau;
	
	JTabbedPane tab;
	
	// Constructor
	
	public QuanLyUI(String title) {
		super(title);
		addControls();
		addEvents();
	}
	
	
	// Add controls
	
	public void addControls() {
		
		// Tao menu
		
			mnuBar = new JMenuBar();
			setJMenuBar(mnuBar);
			
				mnuAccount = new JMenu("Tai khoan");
			
					mnuDangXuat = new JMenuItem("Dang xuat");
				
					mnuDoiMatKhau = new JMenuItem("Doi mat khau");
			
				mnuAccount.add(mnuDangXuat);mnuAccount.add(mnuDoiMatKhau);
			
			mnuBar.add(mnuAccount);
		
		// Them component
			Container con = getContentPane();
			tab = new JTabbedPane();
			con.add(tab);
			
			QuanLySanPhamUI pnTabSanPham = new QuanLySanPhamUI();
			QuanLyNhanVienUI pnTabNhanVien = new QuanLyNhanVienUI();
			QuanLyChiPhiUI pnTabChiPhi = new QuanLyChiPhiUI();
			
			tab.add("San pham",pnTabSanPham);
			tab.add("NhanVien",pnTabNhanVien);
			tab.add("Chi phi", pnTabChiPhi);
	}
	
	
	// Add events
	
	public void addEvents() {
		
		mnuDangXuat.addActionListener(new ActionListener() {			
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
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
	}
	
	// Show window
	
	public void showWindow() {
		this.setSize(800, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
}
