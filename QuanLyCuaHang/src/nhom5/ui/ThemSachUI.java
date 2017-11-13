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

public class ThemSachUI extends JFrame{
	
	// Khai bao cac bien duoc su dung
	
	JTextField txtTacGia,txtNXB,txtMa, txtTen, txtGiaMua, txtGiaBan, txtSoLuong;
	JButton btnThem;
	
	// Constructor
	public ThemSachUI(String title) {
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
					JLabel lblMa = new JLabel("Ma san pham: ");
					txtMa = new JTextField(20);
				pnMa.add(lblMa); pnMa.add(txtMa);
				
				JPanel pnTen = new JPanel();
				pnTen.setLayout(new FlowLayout());
					JLabel lblTen = new JLabel("Ten san pham: ");
					txtTen = new JTextField(20);
				pnTen.add(lblTen); pnTen.add(txtTen);
				
				JPanel pnTacGia = new JPanel();
					pnTacGia.setLayout(new FlowLayout());
					JLabel lblTacGia = new JLabel("Tac gia: ");
					txtTacGia = new JTextField(20);
				pnTacGia.add(lblTacGia);pnTacGia.add(txtTacGia);
				
				JPanel pnNXB = new JPanel();
				pnNXB.setLayout(new FlowLayout());
					JLabel lblNXB = new JLabel("Nha xuat ban: ");
					txtNXB = new JTextField(20);
				pnNXB.add(lblNXB);pnNXB.add(txtNXB);
				
				JPanel pnGiaMua = new JPanel();
				pnGiaMua.setLayout(new FlowLayout());
					JLabel lblGiaMua = new JLabel("Gia mua: ");
					txtGiaMua = new JTextField(20);
				pnGiaMua.add(lblGiaMua); pnGiaMua.add(txtGiaMua);
				
				JPanel pnGiaBan = new JPanel();
				pnGiaBan.setLayout(new FlowLayout());
					JLabel lblGiaBan = new JLabel("Gia ban: ");
					txtGiaBan = new JTextField(20);
				pnGiaBan.add(lblGiaBan); pnGiaBan.add(txtGiaBan);
				
				JPanel pnSoLuong= new JPanel();
				pnSoLuong.setLayout(new FlowLayout());
					JLabel lblSoLuong = new JLabel("So luong: ");
					txtSoLuong = new JTextField(20);
				pnSoLuong.add(lblSoLuong); pnSoLuong.add(txtSoLuong);
				
			pnCenter.add(pnMa);pnCenter.add(pnTen);pnCenter.add(pnTacGia);pnCenter.add(pnNXB);pnCenter.add(pnGiaMua);pnCenter.add(pnGiaBan);pnCenter.add(pnSoLuong);
		
			JPanel pnButton = new JPanel();
				btnThem = new JButton("Them");
			pnButton.add(btnThem);	
			
		pnMain.add(pnCenter,BorderLayout.CENTER);pnMain.add(pnButton,BorderLayout.SOUTH);
		
		con.add(pnMain);
		
		lblMa.setPreferredSize(lblTen.getPreferredSize());
		lblGiaBan.setPreferredSize(lblTen.getPreferredSize());
		lblGiaMua.setPreferredSize(lblTen.getPreferredSize());
		lblSoLuong.setPreferredSize(lblTen.getPreferredSize());
		lblTacGia.setPreferredSize(lblTen.getPreferredSize());
		lblNXB.setPreferredSize(lblTen.getPreferredSize());
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
