/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhom5.ui;

import java.util.Date;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import nhom5.model.CuaHang;
import nhom5.model.HoaDonLuong;
import nhom5.model.NhanVienBanHang;
import nhom5.model.QuanLy;

/**
 *
 * @author Hoai Nguyen
 */
public class TraLuongUI extends javax.swing.JFrame {
    private DefaultTableModel model = new DefaultTableModel();
    /**
     * Creates new form TraLuongUI
     */
    public TraLuongUI() {
        initComponents();
//        setValueToModelTable();
    }

     public TraLuongUI(String title) {
        super(title);
        initComponents();
        this.setSize(750,500);
//		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	this.setLocationRelativeTo(null);
	this.setVisible(true);
//        setValueToModelTable();
    }
    
    public void setValueToModelTable(){
        for(NhanVienBanHang i : CuaHang.getDsNhanVien().values()) {
			String rowData[] = {i.getTen(),i.getMa(),i.getGioTichLuy()+"",i.getLuongCoBan()+"",i.getGioTichLuy() * i.getLuongCoBan()+""};
			model.addRow(rowData);
		}
    }
    
    public void clearTable() {
		model.setRowCount(0);
	}
    
    public void sendMess(String message) {
		JOptionPane.showMessageDialog(null, message);
	}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbTraLuong = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtTongChi = new javax.swing.JTextField();
        btnTraLuong = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbTraLuong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Tên nhân viên", "Mã nhân viên", "Số giờ", "Lương cơ bản", "Tổng lươngl"
            }
        ));
        jScrollPane1.setViewportView(tbTraLuong);

        jLabel1.setText("Tổng chi:");

        btnTraLuong.setText("Trả lương");
        btnTraLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraLuongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTraLuong)
                        .addGap(137, 137, 137))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTongChi, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTongChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnTraLuong)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTraLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraLuongActionPerformed
        // TODO add your handling code here:
        setValueToModelTable();
        HashMap<String, Integer> bangLuong = new HashMap<>();
				
				for(NhanVienBanHang i : CuaHang.getDsNhanVien().values()) {
					bangLuong.put(i.getMa(), QuanLy.traLuong(i));
				}
				
				QuanLy.themBangLuong(new HoaDonLuong(new Date(), bangLuong));
				
				    sendMess("Trả lương thành công");
				
				clearTable();
    }//GEN-LAST:event_btnTraLuongActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TraLuongUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TraLuongUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TraLuongUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TraLuongUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TraLuongUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTraLuong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbTraLuong;
    private javax.swing.JTextField txtTongChi;
    // End of variables declaration//GEN-END:variables
}
