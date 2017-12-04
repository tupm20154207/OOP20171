/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhom5.ui;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import nhom5.model.DiaNhac;
import nhom5.model.QuanLy;

/**
 *
 * @author Hoai Nguyen
 */
public class ThemDiaNhacUI extends javax.swing.JDialog {
    
    public boolean returnState;
    /**
     * Creates new form ThemDiaNhacUI
     */
    public ThemDiaNhacUI() {
        initComponents();
    }

    public ThemDiaNhacUI(JFrame parent, String title, boolean modal) {
        super(parent,title,modal);
        returnState = false;
        initComponents();
      
	this.setLocationRelativeTo(null);
	this.setVisible(true);
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

        jLabel1 = new javax.swing.JLabel();
        txtMaSanPhamN = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTenSanPhamN = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCaSi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTheLoaiN = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtGiaMuaN = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtGiaBanN = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtSoLuongN = new javax.swing.JTextField();
        btnThemN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Mã sản phẩm:");

        jLabel2.setText("Tên sản phẩm:");

        jLabel3.setText("Ca sĩ:");

        jLabel4.setText("Thể loại:");

        jLabel5.setText("Giá mua:");

        jLabel6.setText("Giá bán:");

        jLabel7.setText("Số lượng:");

        btnThemN.setText("Thêm");
        btnThemN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMaSanPhamN, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(txtTenSanPhamN)
                            .addComponent(txtCaSi)
                            .addComponent(txtTheLoaiN)
                            .addComponent(txtGiaMuaN)
                            .addComponent(txtGiaBanN)
                            .addComponent(txtSoLuongN)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(btnThemN)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMaSanPhamN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTenSanPhamN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCaSi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTheLoaiN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtGiaMuaN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtGiaBanN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtSoLuongN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnThemN)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemNActionPerformed
        
        if( txtMaSanPhamN.getText().isEmpty()  || 
            txtTenSanPhamN.getText().isEmpty() || 
            txtCaSi.getText().isEmpty()        || 
            txtTheLoaiN.getText().isEmpty()    || 
            txtGiaMuaN.getText().isEmpty()     ||	
            txtGiaBanN.getText().isEmpty()     ||	
            txtSoLuongN.getText().isEmpty()) {
                sendMess("Yeu cau nhap du thong tin.");
        }
        else {
            try {
               DiaNhac dn = new DiaNhac(txtMaSanPhamN.getText(), 
                                        txtTenSanPhamN.getText(), 
                                        Integer.parseInt(txtGiaMuaN.getText()), 
                                        Integer.parseInt(txtGiaBanN.getText()), 
                                        Integer.parseInt(txtSoLuongN.getText()), 
                                        txtCaSi.getText(), txtTheLoaiN.getText());
               QuanLy.themSanPham(dn);
               sendMess("Them thanh cong.");
               returnState = true;
               dispose();
            }
            catch(Exception e1) {
                    sendMess("Thong tin khong hop le.");
            }
        }
    }//GEN-LAST:event_btnThemNActionPerformed

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
            java.util.logging.Logger.getLogger(ThemDiaNhacUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThemDiaNhacUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThemDiaNhacUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThemDiaNhacUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThemDiaNhacUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThemN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtCaSi;
    private javax.swing.JTextField txtGiaBanN;
    private javax.swing.JTextField txtGiaMuaN;
    private javax.swing.JTextField txtMaSanPhamN;
    private javax.swing.JTextField txtSoLuongN;
    private javax.swing.JTextField txtTenSanPhamN;
    private javax.swing.JTextField txtTheLoaiN;
    // End of variables declaration//GEN-END:variables
}
