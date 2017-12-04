/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhom5.ui;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import nhom5.model.*;
import nhom5.util.TienIch;

/**
 *
 * @author Hoai Nguyen
 */
public class ThemKhoanChiUI extends javax.swing.JDialog {
    
    public boolean returnState;
    /**
     * Creates new form ThemKhoanChiUI
     */
    public ThemKhoanChiUI() {
        initComponents();
    }

    public ThemKhoanChiUI(JFrame parent, String title, boolean modal) {
        super(parent,title, modal);
        returnState = false;
        initComponents();
     
	this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	this.setLocationRelativeTo(null);
	this.setVisible(true);
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
        txtNgay = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSoTien = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnThemKhoanChi = new javax.swing.JButton();
        txtLyDo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Ngày:");

        jLabel2.setText("Số tiền:");

        jLabel3.setText("Lý do:");

        btnThemKhoanChi.setText("Thêm");
        btnThemKhoanChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemKhoanChiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtLyDo, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(txtSoTien)
                    .addComponent(txtNgay)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btnThemKhoanChi)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSoTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtLyDo, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addComponent(btnThemKhoanChi)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void sendMess(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
    
    private void btnThemKhoanChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemKhoanChiActionPerformed
        try{
            if( txtNgay.getText().isEmpty() ||
                txtLyDo.getText().isEmpty() || 
                txtSoTien.getText().isEmpty()  ){
                
                sendMess("Yeu cau nhap du thong tin");
            }
            else{
                Date ngayChi = TienIch.chuyenDoiNgay(txtNgay.getText());
                if(ngayChi == null) return;
                int soTien = Integer.parseInt(txtSoTien.getText());
                String lyDo = txtLyDo.getText();

                ChiPhi chi = new ChiPhi(TienIch.sinhMaCP(),soTien, lyDo, ngayChi);
                QuanLy.themChiPhi(chi);
                returnState = true;
                
                dispose();
            }
        }
        catch(Exception e){
            sendMess("Du lieu khong hop le");
        }
    }//GEN-LAST:event_btnThemKhoanChiActionPerformed

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
            java.util.logging.Logger.getLogger(ThemKhoanChiUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThemKhoanChiUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThemKhoanChiUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThemKhoanChiUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThemKhoanChiUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThemKhoanChi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtLyDo;
    private javax.swing.JTextField txtNgay;
    private javax.swing.JTextField txtSoTien;
    // End of variables declaration//GEN-END:variables
}