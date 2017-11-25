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
import javax.swing.JTextField;

import nhom5.model.DiaNhac;
import nhom5.model.QuanLy;
import nhom5.model.SanPham;

public class CapNhatSanPhamUI extends JFrame{
	
	SanPham sp;
	
	// Khai bao cac bien duoc su dung
	JTextField txtMa, txtTen, txtGiaMua, txtGiaBan, txtSoLuong;
	JButton btnCapNhat;
	
	// Constructor
	public CapNhatSanPhamUI (String title, SanPham sp) {
		super(title);
		this.sp = sp;
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
					txtMa.setEditable(false);
					txtMa.setText(sp.getMa());
				pnMa.add(lblMa); pnMa.add(txtMa);
				
				JPanel pnTen = new JPanel();
				pnTen.setLayout(new FlowLayout());
					JLabel lblTen = new JLabel("Ten san pham: ");
					txtTen = new JTextField(20);
				pnTen.add(lblTen); pnTen.add(txtTen);
				
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
				
			pnCenter.add(pnMa);pnCenter.add(pnTen);pnCenter.add(pnGiaMua);pnCenter.add(pnGiaBan);pnCenter.add(pnSoLuong);
		
			JPanel pnButton = new JPanel();
				btnCapNhat = new JButton("Cap nhat");
			pnButton.add(btnCapNhat);
			
		pnMain.add(pnCenter,BorderLayout.CENTER); pnMain.add(pnButton, BorderLayout.SOUTH);
		
		lblMa.setPreferredSize(lblTen.getPreferredSize());
		lblGiaBan.setPreferredSize(lblTen.getPreferredSize());
		lblGiaMua.setPreferredSize(lblTen.getPreferredSize());
		lblSoLuong.setPreferredSize(lblTen.getPreferredSize());
		
		con.add(pnMain);
	}
	
	public void addEvents() {
		btnCapNhat.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(	txtTen.getText().isEmpty()	  || txtGiaMua.getText().isEmpty() ||	
					txtGiaBan.getText().isEmpty() || txtSoLuong.getText().isEmpty()) {
						
						sendMess("Yeu cau nhap du thong tin.");
				
				}
				else {
					try {
						QuanLy.capNhatSanPham(  sp,txtTen.getText(),Integer.parseInt(txtGiaMua.getText()),
												Integer.parseInt(txtGiaBan.getText()), Integer.parseInt(txtSoLuong.getText()) );
						sendMess("Them thanh cong.");
					}
					catch(Exception e1) {
						sendMess("Thong tin khong hop le.");
					}
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
