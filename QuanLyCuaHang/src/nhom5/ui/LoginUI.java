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
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import nhom5.model.CuaHang;
import nhom5.model.NhanVienBanHang;
import nhom5.model.QuanLy;

public class LoginUI extends JFrame{
	
	// Khai bao cac bien duoc su dung
	
	JTextField txtUser,txtPwd;
	JButton btnSignIn;
	
	// Constructor
	public LoginUI(String title) {
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
				
				JPanel pnLogo = new JPanel();
				pnLogo.setLayout(new FlowLayout());
					
					JLabel lblLogo = new JLabel("Sign In");
				
					pnLogo.add(lblLogo);
					
				JPanel pnUser = new JPanel();
				pnUser.setLayout(new FlowLayout());
					JLabel lblUser = new JLabel("Ten nguoi dung: ");
					txtUser = new JTextField(20);
				pnUser.add(lblUser); pnUser.add(txtUser);
				
				JPanel pnPwd = new JPanel();
				pnPwd.setLayout(new FlowLayout());
					JLabel lblPwd = new JLabel("Mat khau: ");
					txtPwd = new JTextField(20);
				pnPwd.add(lblPwd); pnPwd.add(txtPwd);
			pnCenter.add(pnLogo);pnCenter.add(pnUser);pnCenter.add(pnPwd);
		
			JPanel pnButton = new JPanel();
				btnSignIn = new JButton("Dang nhap");
			pnButton.add(btnSignIn);
			
		pnMain.add(pnCenter,BorderLayout.CENTER); pnMain.add(pnButton, BorderLayout.SOUTH);
		
		lblPwd.setPreferredSize(lblUser.getPreferredSize());
		
		con.add(pnMain);
	}
	
	public void addEvents() {
		btnSignIn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String user = txtUser.getText();
				String password = txtPwd.getText();
				
				if(user.equals(QuanLy.getTaiKhoan()) && password.equals(QuanLy.getMatKhau())) {
					// Bat dau phien cua nguoi quan ly
					QuanLyUI ql = new QuanLyUI("Quan ly");
					ql.showWindow();
					setVisible(false);
				}
				
				else if(CuaHang.getDsTaiKhoan().containsKey(user) && password.equals(CuaHang.getDsTaiKhoan().get(user))) {
					
					// Bat dau phien cua nhan vien
					
					NhanVienBanHang nv = CuaHang.getDsNhanVien().get(user);
					NhanVienUI phienNhanVien = new NhanVienUI("Tim kiem");
					
					phienNhanVien.showWindow();
					setVisible(false);
				}
				
				else {
					JOptionPane.showMessageDialog(null,"Ten dang nhap hoac mat khau khong dung");
					txtUser.setText(""); txtPwd.setText("");
				}
			}
				
		});
	}
	
	public void showWindow() {
		this.setSize(380,380);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	

}
