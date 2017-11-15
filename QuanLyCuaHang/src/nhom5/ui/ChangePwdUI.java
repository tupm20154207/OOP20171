package nhom5.ui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import nhom5.model.NhanVienBanHang;
import nhom5.model.QuanLy;

public class ChangePwdUI extends JFrame{
	
	NhanVienBanHang nv;
	// Khai bao cac bien duoc su dung
	JPasswordField txtMKCu,txtMKMoi,txtNhapLai;
	JButton btnXacNhan;
	
	// Constructor
	public ChangePwdUI (String title, NhanVienBanHang nv) {
		super(title);
		this.nv = nv;
		addControls();
		addEvents();
	}
	
	public ChangePwdUI (String title) {
		super(title);
		this.nv = null;
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
					txtMKCu = new JPasswordField(20);
					txtMKCu.setEchoChar('*');
				pnMKCu.add(lblMKCu); pnMKCu.add(txtMKCu);
				
				JPanel pnMKMoi = new JPanel();
				pnMKMoi.setLayout(new FlowLayout());
					JLabel lblMKMoi = new JLabel("Mat khau moi: ");
					txtMKMoi = new JPasswordField(20);
					txtMKMoi.setEchoChar('*');
				pnMKMoi.add(lblMKMoi); pnMKMoi.add(txtMKMoi);
				
				JPanel pnNhapLai = new JPanel();
				pnNhapLai.setLayout(new FlowLayout());
					JLabel lblNhapLai = new JLabel("Nhap lai mat khau moi: ");
					txtNhapLai = new JPasswordField(20);
					txtNhapLai.setEchoChar('*');
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
		btnXacNhan.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(txtMKCu.getText().isEmpty() || txtMKMoi.getText().isEmpty() || txtNhapLai.getText().isEmpty()) {
					sendMess("Yeu cau nhap du thong tin");
				}
				else if(txtMKMoi.getText().equals(txtNhapLai.getText()) == false) {
					sendMess("Nhap lai sai");
				}
				else {
					if(nv == null) {	
						// Nguoi su dung la quan ly
						QuanLy.setMatKhau(txtMKMoi.getText());
					}
					else {
						// Nguoi su dung la nhan vien
						nv.setMatKhau(txtMKMoi.getText());
					}
					sendMess("Doi mat khau thanh cong!");
				}
			}
		});
	}
	
	public void showWindow() {
		this.setSize(380,380);
		//this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	public void sendMess(String message) {
		JOptionPane.showMessageDialog(null, message);
	}
}
