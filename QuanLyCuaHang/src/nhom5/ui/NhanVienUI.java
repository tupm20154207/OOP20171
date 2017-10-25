package nhom5.ui;

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
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class NhanVienUI extends JFrame {
	
	JMenuBar mnuBar;
	JMenu mnuFile;
	JMenu mnuAccount;
	JMenuItem mnuFileOpen;
	JMenuItem mnuFileSave;
	JMenuItem mnuAccountLogout;
	
	JFileChooser chooser;
	
	JTextField txtTimKiem;
	JButton btnTimKiem;
	
	DefaultTableModel dtm;
	JTable tblSanPham;
	
	JButton btnThanhToan;
	JButton btnThoat;
	
	public NhanVienUI (String title)
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
		con.setLayout(new BoxLayout(con, BoxLayout.Y_AXIS));
		
		//mục tìm kiếm sản phẩm
		JPanel pnTimKiem = new JPanel();
		con.add(pnTimKiem);
		pnTimKiem.setLayout(new FlowLayout());
		txtTimKiem = new JTextField(30);
		btnTimKiem = new JButton("Tìm kiếm");
		pnTimKiem.add(txtTimKiem);
		pnTimKiem.add(btnTimKiem);
		
		//mục thông tin sản phẩm
		JPanel pnThongTin = new JPanel();
		con.add(pnThongTin);
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
		
		//mục thanh toán cho khách đến mua hàng
		JPanel pnThanhToan = new JPanel();
		con.add(pnThanhToan);
		pnThanhToan.setLayout(new FlowLayout(FlowLayout.RIGHT));
		btnThanhToan = new JButton("Thanh toán");
		btnThoat = new JButton("Thoát");
		pnThanhToan.add(btnThanhToan);
		pnThanhToan.add(btnThoat);
	}

	private void addEvents() {
		// TODO Auto-generated method stub
		
	}
	
	public void showWindow()
	{
		this.setSize(800, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
