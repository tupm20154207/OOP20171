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

public class ThemKhoanChiUI extends JFrame{
	
	// Khai bao cac bien duoc su dung
	
	JTextField txtNgay,txtSoTien,txtLyDo;
	JButton btnThem;
	
	// Constructor
	public ThemKhoanChiUI(String title) {
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
			
				JPanel pnNgay = new JPanel();
				pnNgay.setLayout(new FlowLayout());
					JLabel lblNgay = new JLabel("Ngay: ");
					txtNgay = new JTextField(20);
				pnNgay.add(lblNgay); pnNgay.add(txtNgay);
				
				JPanel pnSoTien = new JPanel();
				pnSoTien.setLayout(new FlowLayout());
					JLabel lblSoTien = new JLabel("SoTien: ");
					txtSoTien = new JTextField(20);
				pnSoTien.add(lblSoTien); pnSoTien.add(txtSoTien);
				
				JPanel pnLyDo = new JPanel();
				pnLyDo.setLayout(new FlowLayout());
					JLabel lblLyDo = new JLabel("LyDo: ");
					txtLyDo = new JTextField(20);
				pnLyDo.add(lblLyDo); pnLyDo.add(txtLyDo);
				
			pnCenter.add(pnNgay);pnCenter.add(pnSoTien);pnCenter.add(pnLyDo);
		
			JPanel pnButton = new JPanel();
				btnThem = new JButton("Them");
			pnButton.add(btnThem);	
			
		pnMain.add(pnCenter,BorderLayout.CENTER);pnMain.add(pnButton,BorderLayout.SOUTH);
		
		con.add(pnMain);
		
		lblNgay.setPreferredSize(lblSoTien.getPreferredSize());
		lblLyDo.setPreferredSize(lblSoTien.getPreferredSize());

	}
	
	public void addEvents() {
		
	}
	
	public void showWindow() {
		this.setSize(380,380);
	//	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
