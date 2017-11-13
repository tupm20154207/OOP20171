package nhom5.ui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class QuanLyChiPhiUI extends JPanel {

	// Khai bao cac bien duoc su dung
	
	JTextField txtTim;
	JButton btnThem, btnTim;
	DefaultTableModel dtm;
	JTable tbl;
	
	// Constructor
	public QuanLyChiPhiUI () {
		super();
		addControls();
		addEvents();
	}
	
	// Add controls
	
	public void addControls() {
		
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		// Panel Tim Kiem
			
			JPanel pnTim = new JPanel();
			pnTim.setLayout(new FlowLayout());
			this.add(pnTim);
			
				JLabel lblTim = new JLabel("Nhap ngay: ");
				txtTim = new JTextField(20);
				btnTim = new JButton("Tim");
		
			pnTim.add(lblTim);pnTim.add(txtTim);pnTim.add(btnTim);
		
		// Thong tin chi phi
			JPanel pnChiPhi = new JPanel();
			pnChiPhi.setLayout(new BorderLayout());
			this.add(pnChiPhi);
			
				dtm = new DefaultTableModel();
				dtm.addColumn("Ngày chi");
				dtm.addColumn("Số tiền chi");
				dtm.addColumn("Lý do chi");
				
				tbl = new JTable(dtm);
				
				JScrollPane sc = new JScrollPane(tbl, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			pnChiPhi.add(sc, BorderLayout.CENTER);
			
		//Panel button
			
		JPanel pnButton = new JPanel();
		pnButton.setLayout(new FlowLayout(FlowLayout.RIGHT));
		this.add(pnButton);
		
			btnThem = new JButton("Thêm chi phí");
			
		pnButton.add(btnThem);			
		
	}
	
	// Add events
	
	public void addEvents() {
		
		btnThem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ThemKhoanChiUI tmp = new ThemKhoanChiUI("Khoan chi moi");
				tmp.showWindow();
			}
		});
	}
}
