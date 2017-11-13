package nhom5.ui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ThemNhanVienUI extends JFrame{
	
	// Khai bao cac bien duoc su dung
	
	JTextField txtNgaySinh,txtNgayVaoLam,txtMa, txtTen, txtLuongCoBan;
	JButton btnThem;
	
	// Constructor
	public ThemNhanVienUI(String title) {
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
			
				JPanel pnMa = new JPanel();
				pnMa.setLayout(new FlowLayout());
					JLabel lblMa = new JLabel("Ma: ");
					txtMa = new JTextField(20);
				pnMa.add(lblMa); pnMa.add(txtMa);
				
				JPanel pnTen = new JPanel();
				pnTen.setLayout(new FlowLayout());
					JLabel lblTen = new JLabel("Ten: ");
					txtTen = new JTextField(20);
				pnTen.add(lblTen); pnTen.add(txtTen);
				
				JPanel pnNgaySinh = new JPanel();
				pnNgaySinh.setLayout(new FlowLayout());
					JLabel lblNgaySinh = new JLabel("Ngay sinh: ");
					txtNgaySinh = new JTextField(20);
				pnNgaySinh.add(lblNgaySinh); pnNgaySinh.add(txtNgaySinh);
				
				JPanel pnNgayVaoLam = new JPanel();
				pnNgayVaoLam.setLayout(new FlowLayout());
					JLabel lblNgayVaoLam = new JLabel("Ngay vao lam: ");
					txtNgayVaoLam = new JTextField(20);
				pnNgayVaoLam.add(lblNgayVaoLam); pnNgayVaoLam.add(txtNgayVaoLam);
					
				JPanel pnLuongCoBan = new JPanel();
				pnLuongCoBan.setLayout(new FlowLayout());
					JLabel lblLuongCoBan = new JLabel("Luong co ban: ");
					txtLuongCoBan = new JTextField(20);
				pnLuongCoBan.add(lblLuongCoBan); pnLuongCoBan.add(txtLuongCoBan);
				
			pnCenter.add(pnMa);pnCenter.add(pnTen);pnCenter.add(pnNgaySinh);pnCenter.add(pnNgayVaoLam);pnCenter.add(pnLuongCoBan);
		
			JPanel pnButton = new JPanel();
				btnThem = new JButton("Them");
			pnButton.add(btnThem);	
			
		pnMain.add(pnCenter,BorderLayout.CENTER);pnMain.add(pnButton,BorderLayout.SOUTH);
		
		con.add(pnMain);
		
		lblMa.setPreferredSize(lblNgayVaoLam.getPreferredSize());
		lblTen.setPreferredSize(lblNgayVaoLam.getPreferredSize());
		lblNgaySinh.setPreferredSize(lblNgayVaoLam.getPreferredSize());
		//lblLuongCoBan.setPreferredSize(lblNgayVaoLam.getPreferredSize());
	}
	
	public void addEvents() {
		
	}
	
	public void showWindow() {
		this.setSize(380,380);
//		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
