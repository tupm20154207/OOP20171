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

import nhom5.model.CuaHang;
import nhom5.model.DiaNhac;
import nhom5.model.QuanLy;
import nhom5.util.TienIch;

public class ThemDiaNhacUI extends JFrame{
	
	// Khai bao cac bien duoc su dung
	
	JTextField txtCaSi,txtTheLoai,txtMa, txtTen, txtGiaMua, txtGiaBan, txtSoLuong;
	JButton btnThem;
	
	// Constructor
	public ThemDiaNhacUI(String title) {
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
					txtMa.setEditable(false);
					txtMa.setText(TienIch.sinhMaSP("dn"));
				pnMa.add(lblMa); pnMa.add(txtMa);
				
				JPanel pnTen = new JPanel();
				pnTen.setLayout(new FlowLayout());
					JLabel lblTen = new JLabel("Ten san pham: ");
					txtTen = new JTextField(20);
				pnTen.add(lblTen); pnTen.add(txtTen);
				
				JPanel pnCaSi = new JPanel();
					pnCaSi.setLayout(new FlowLayout());
					JLabel lblCaSi = new JLabel("Ca si: ");
					txtCaSi = new JTextField(20);
				pnCaSi.add(lblCaSi);pnCaSi.add(txtCaSi);
				
				JPanel pnTheLoai = new JPanel();
				pnTheLoai.setLayout(new FlowLayout());
					JLabel lblTheLoai = new JLabel("The loai: ");
					txtTheLoai = new JTextField(20);
				pnTheLoai.add(lblTheLoai);pnTheLoai.add(txtTheLoai);
				
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
				
			pnCenter.add(pnMa);pnCenter.add(pnTen);pnCenter.add(pnCaSi);pnCenter.add(pnTheLoai);pnCenter.add(pnGiaMua);pnCenter.add(pnGiaBan);pnCenter.add(pnSoLuong);
		
			JPanel pnButton = new JPanel();
				btnThem = new JButton("Them");
			pnButton.add(btnThem);	
			
		pnMain.add(pnCenter,BorderLayout.CENTER);pnMain.add(pnButton,BorderLayout.SOUTH);
		
		con.add(pnMain);
		
		lblMa.setPreferredSize(lblTen.getPreferredSize());
		lblGiaBan.setPreferredSize(lblTen.getPreferredSize());
		lblGiaMua.setPreferredSize(lblTen.getPreferredSize());
		lblSoLuong.setPreferredSize(lblTen.getPreferredSize());
		lblCaSi.setPreferredSize(lblTen.getPreferredSize());
		lblTheLoai.setPreferredSize(lblTen.getPreferredSize());
	}
	
	public void addEvents() {
		btnThem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(	   txtMa.getText().isEmpty() || txtTen.getText().isEmpty() || txtCaSi.getText().isEmpty() || txtTheLoai.getText().isEmpty()
					|| txtGiaMua.getText().isEmpty() ||	txtGiaBan.getText().isEmpty() ||	txtSoLuong.getText().isEmpty()) {
					sendMess("Yeu cau nhap du thong tin.");
				}
				else {
					try {
					   DiaNhac dn = new DiaNhac(txtMa.getText(), txtTen.getText(), Integer.parseInt(txtGiaMua.getText()), 
												Integer.parseInt(txtGiaBan.getText()), Integer.parseInt(txtSoLuong.getText()), 
												txtCaSi.getText(), txtTheLoai.getText());
					   QuanLy.themSanPham(dn);
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
