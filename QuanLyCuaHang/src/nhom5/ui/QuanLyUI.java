package ductung.ui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class QuanLyUI extends JFrame {
	
	JMenuBar mnuBar;
	JMenu mnuFile;
	JMenu mnuAccount;
	JMenuItem mnuFileOpen;
	JMenuItem mnuFileSave;
	JMenuItem mnuAccountLogout;
	
	JFileChooser chooser;
	
	JTabbedPane tab;
	
	JTextField txtTimKiem;
	JButton btnTimKiem;
	DefaultTableModel dtm;
	JTable tblSanPham;
	JButton btnThem;
	JButton btnXoa;
	JButton btnCapNhat;
	
	public QuanLyUI (String title)
	{
		super(title);
		addControls();
		addEvents();
	}

	private void addControls() {
		// tạo menu
		mnuBar = new JMenuBar();
		setJMenuBar(mnuBar);
		mnuFile = new JMenu("File");
		mnuAccount = new JMenu("Account");
		mnuBar.add(mnuFile);
		mnuBar.add(mnuAccount);
		mnuFileOpen = new JMenuItem("Open");
		mnuFileSave = new JMenuItem("Save");
		mnuFile.add(mnuFileOpen);
		mnuFile.add(mnuFileSave);
		mnuAccountLogout = new JMenuItem("Log out");
		mnuAccount.add(mnuAccountLogout);
		
		
		Container con = getContentPane();
		//tạo các tab
		tab = new JTabbedPane();
		con.add(tab);
		JPanel pnTab1 = new JPanel();
		JPanel pnTab2 = new JPanel();
		JPanel pnTab3 = new JPanel();
		tab.addTab("Quản lý sản phẩm", pnTab1);
		tab.addTab("Quản lý nhân viên", pnTab2);
		tab.addTab("Quản lý chi phí", pnTab3);
		
		/* tab quản lý sản phẩm */
		pnTab1.setLayout(new BoxLayout(pnTab1, BoxLayout.Y_AXIS));
		//mục tìm kiếm sản phẩm
		JPanel pnTimKiem = new JPanel();
		pnTab1.add(pnTimKiem);
		pnTimKiem.setLayout(new FlowLayout());
		txtTimKiem = new JTextField(30);
		btnTimKiem = new JButton("Tìm kiếm");
		pnTimKiem.add(txtTimKiem);
		pnTimKiem.add(btnTimKiem);
		//mục thông tin sản phẩm
		JPanel pnThongTin = new JPanel();
		pnTab1.add(pnThongTin);
		pnThongTin.setLayout(new BorderLayout());
		dtm = new DefaultTableModel();
		dtm.addColumn("Mã");
		dtm.addColumn("Tên");
		dtm.addColumn("Loại");
		dtm.addColumn("Số lượng");
		dtm.addColumn("Giá mua");
		dtm.addColumn("Gía bán");
		dtm.addColumn("Thông tin");
		tblSanPham = new JTable(dtm);
		JScrollPane sc = new JScrollPane(tblSanPham, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		pnThongTin.add(sc, BorderLayout.CENTER);
		//mục quản lý sản phẩm
		JPanel pnQuanLy = new JPanel();
		pnTab1.add(pnQuanLy);
		pnQuanLy.setLayout(new FlowLayout(FlowLayout.RIGHT));
		btnThem = new JButton("Thêm sản phẩm");
		btnXoa = new JButton("Xóa sản phẩm");
		btnCapNhat = new JButton("Cập nhật sản phẩm");
		pnQuanLy.add(btnThem);
		pnQuanLy.add(btnXoa);
		pnQuanLy.add(btnCapNhat);
		
		/* tab quản lý nhân viên */
		
	}
	private void addEvents() {
		
	}
	
	public void showWindow()
	{
		this.setSize(800, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
