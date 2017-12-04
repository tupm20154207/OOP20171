/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhom5.ui;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import nhom5.model.CuaHang;
import nhom5.model.NhanVienBanHang;
import nhom5.model.SanPham;

/**
 *
 * @author Hoai Nguyen
 */
public class NhanVienUI extends javax.swing.JFrame {

    NhanVienBanHang nhanVien;
    DefaultTableModel dtm;
    /**
     * Creates new form NhanVienUI
     */
    public NhanVienUI() {
        initComponents();
    }

    public NhanVienUI (String title, NhanVienBanHang nv)
	{
            super(title);
            this.nhanVien= nv;
            initComponents();
            dtm = (DefaultTableModel)tbl.getModel();
            dtm.setRowCount(0);

            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
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

        txtTimKiem = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        btnThanhToan = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuDangXuat = new javax.swing.JMenuItem();
        mnuDoiMatKhau = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        btnThanhToan.setText("Thanh toán");
        btnThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhToanActionPerformed(evt);
            }
        });

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã", "Tên", "Loại", "Còn lại", "Giá bán"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbl);

        jMenu1.setText("Tài khoản");

        mnuDangXuat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        mnuDangXuat.setText("Đăng xuất");
        mnuDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDangXuatActionPerformed(evt);
            }
        });
        jMenu1.add(mnuDangXuat);

        mnuDoiMatKhau.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        mnuDoiMatKhau.setText("Đổi mật khẩu");
        mnuDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDoiMatKhauActionPerformed(evt);
            }
        });
        jMenu1.add(mnuDoiMatKhau);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnThanhToan)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnThanhToan)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDangXuatActionPerformed
        // TODO add your handling code here:
        nhanVien.signOut();
        
	LogInUI tmp = new LogInUI("Đăng nhập");
	
        dispose();
    }//GEN-LAST:event_mnuDangXuatActionPerformed

    private void mnuDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDoiMatKhauActionPerformed
        // TODO add your handling code here:
        ChangePwdUI tmp = new ChangePwdUI(this,"Đổi mật khẩu",true,nhanVien);
    }//GEN-LAST:event_mnuDoiMatKhauActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
        dtm.setRowCount(0);
        String text = txtTimKiem.getText();
        if(CuaHang.getDsSanPham().containsKey(text)) {
                SanPham sp = CuaHang.getDsSanPham().get(text);
                Object [] rowData = {sp.getMa(),sp.getTen(),sp.getClass().getSimpleName(),
                                     sp.getSoLuong(),sp.getGiaBan()};
                dtm.addRow(rowData);
        }
        else {
            sendMess("Ma san pham khong dung");
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhToanActionPerformed
        // TODO add your handling code here:
        if(dtm.getRowCount() > 0) {
            ArrayList<SanPham> dsSP = new ArrayList<>();

            for(int i = 0; i < dtm.getRowCount(); i++) {
                String ma = (String)dtm.getValueAt(i, 0);
                dsSP.add(CuaHang.getDsSanPham().get(ma));
            }

            HoaDonUI tmp = new HoaDonUI(this,"Hoa don",true,nhanVien, dsSP);
            dtm.setRowCount(0);
        }
    }//GEN-LAST:event_btnThanhToanActionPerformed

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
            java.util.logging.Logger.getLogger(NhanVienUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NhanVienUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NhanVienUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NhanVienUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NhanVienUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThanhToan;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem mnuDangXuat;
    private javax.swing.JMenuItem mnuDoiMatKhau;
    private javax.swing.JTable tbl;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}