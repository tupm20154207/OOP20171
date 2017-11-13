package nhom5.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.Border;

import javax.swing.table.DefaultTableModel;

public class HoaDonUI extends JFrame{
	
	// Khai bao cac bien duoc su dung
	
	JTextField txtTongTien, txtKhachGui, txtTraLai;
	JButton btnIn,btnDong;
	DefaultTableModel dtm;
	JTable tbl;
	
	// Constructor
	public HoaDonUI(String title) {
		super(title);
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
					dtm.addColumn("Ten");dtm.addColumn("Ma");dtm.addColumn("So Luong");dtm.addColumn("Don gia");
					
					tbl = new JTable(dtm) {
						
						// Overide isCellEditable method, ngan chan viec sua doi thong tin trong table.
						
				        public boolean isCellEditable(int row, int column) {                		
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
				btnIn = new JButton("In hoa don");
				btnDong = new JButton("Dong");
			pnButton.add(btnIn);pnButton.add(btnDong);
			
		pnMain.add(pnCenter,BorderLayout.CENTER);
		pnMain.add(pnButton,BorderLayout.SOUTH);
		
		con.add(pnMain);
	}
	
	public void addEvents() {
		
	}
	
	public void showWindow() {
		this.setSize(750,500);
		//this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
