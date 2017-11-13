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

public class TraLuongUI extends JFrame{
	
	// Khai bao cac bien duoc su dung
	
	JTextField txtTongChi;
	JButton btnTraLuong, btnXoa, btnDong;
	DefaultTableModel dtm;
	JTable tbl;
	
	// Constructor
	public TraLuongUI(String title) {
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
					dtm.addColumn("Ten");dtm.addColumn("Ma");dtm.addColumn("So Gio");dtm.addColumn("Luong Co Ban");
					
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
		
				JPanel pnTongChi = new JPanel();
				pnTongChi.setLayout(new FlowLayout(FlowLayout.RIGHT));
					JLabel lblTongChi = new JLabel("Tong chi: ");
					txtTongChi = new JTextField(15);
				pnTongChi.add(lblTongChi); pnTongChi.add(txtTongChi);
				
			
			pnCenter.add(pnDanhSach);
			pnCenter.add(pnTongChi);
			
			JPanel pnButton = new JPanel();
			pnButton.setLayout(new FlowLayout(FlowLayout.RIGHT));
				btnTraLuong = new JButton("Tra luong");
				btnXoa = new JButton("Xoa");
				btnDong = new JButton("Dong");
			pnButton.add(btnTraLuong);pnButton.add(btnXoa); pnButton.add(btnDong);
			
		pnMain.add(pnCenter,BorderLayout.CENTER);
		pnMain.add(pnButton,BorderLayout.SOUTH);
		
		con.add(pnMain);
	}
	
	public void addEvents() {
		
	}
	
	public void showWindow() {
		this.setSize(750,500);
//		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
