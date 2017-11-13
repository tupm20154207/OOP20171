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

public class ChangePwdUI extends JFrame{
	
	// Khai bao cac bien duoc su dung
	JTextField txtMKCu,txtMKMoi,txtNhapLai;
	JButton btnXacNhan;
	
	// Constructor
	public ChangePwdUI (String title) {
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
			
				JPanel pnMKCu = new JPanel();
				pnMKCu.setLayout(new FlowLayout());
					JLabel lblMKCu = new JLabel("Mat khau cu: ");
					txtMKCu = new JTextField(20);
				pnMKCu.add(lblMKCu); pnMKCu.add(txtMKCu);
				
				JPanel pnMKMoi = new JPanel();
				pnMKMoi.setLayout(new FlowLayout());
					JLabel lblMKMoi = new JLabel("Mat khau moi: ");
					txtMKMoi = new JTextField(20);
				pnMKMoi.add(lblMKMoi); pnMKMoi.add(txtMKMoi);
				
				JPanel pnNhapLai = new JPanel();
				pnNhapLai.setLayout(new FlowLayout());
					JLabel lblNhapLai = new JLabel("Nhap lai mat khau moi: ");
					txtNhapLai = new JTextField(20);
				pnNhapLai.add(lblNhapLai); pnNhapLai.add(txtNhapLai);
				
			pnCenter.add(pnMKCu);pnCenter.add(pnMKMoi);pnCenter.add(pnNhapLai);
		
			JPanel pnButton = new JPanel();
				btnXacNhan = new JButton("Xac nhan");
			pnButton.add(btnXacNhan);
			
		pnMain.add(pnCenter,BorderLayout.CENTER); pnMain.add(pnButton, BorderLayout.SOUTH);
		
		lblMKCu.setPreferredSize(lblNhapLai.getPreferredSize());
		lblMKMoi.setPreferredSize(lblNhapLai.getPreferredSize());
		
		con.add(pnMain);
	}
	
	public void addEvents() {
		
	}
	
	public void showWindow() {
		this.setSize(380,380);
		//this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
