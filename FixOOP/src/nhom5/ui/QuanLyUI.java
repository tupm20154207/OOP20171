
package nhom5.ui;

import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import nhom5.model.*;
import nhom5.tuongtacfile.PhienHoatDong;
import nhom5.util.TienIch;

public class QuanLyUI extends javax.swing.JFrame {
    DefaultTableModel dtmNV, dtmSP, dtmCP;
    /**
     * Creates new form QuanLyUI
     */ 
    public QuanLyUI() {
        initComponents();
    }

    public QuanLyUI(String title) {
        super(title);
        initComponents();
        
        dtmNV = (DefaultTableModel)tbQuanLyNhanVien.getModel();
        dtmSP = (DefaultTableModel)tbQuanLySanPham.getModel();
        dtmCP = (DefaultTableModel)tbQuanLyChiPhi.getModel();
        
        initTableSP();
        initTableNV();
        initTableCP();
        showWindow();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNhapTenSanPham = new javax.swing.JTextField();
        btnTimKiemSanPham = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbQuanLySanPham = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        cbLoaiSanPham = new javax.swing.JComboBox<>();
        btnThemSanPham = new javax.swing.JButton();
        btnXoaSanPham = new javax.swing.JButton();
        btnCapNhatSanPham = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbQuanLyNhanVien = new javax.swing.JTable();
        btnThemNhanVien = new javax.swing.JButton();
        btnXoaNhanVien = new javax.swing.JButton();
        btnChiTiet = new javax.swing.JButton();
        btnTraLuong = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtNhapNgay = new javax.swing.JTextField();
        btnTimKiemChiPhi = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbQuanLyChiPhi = new javax.swing.JTable();
        btnThemChiPhi = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuDoiMK = new javax.swing.JMenuItem();
        mnuDangXuat = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mnuHoaDon = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        jMenu2.setText("File");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("Nhập tên sản phẩm:");

        btnTimKiemSanPham.setText("Tìm kiếm");
        btnTimKiemSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemSanPhamActionPerformed(evt);
            }
        });

        tbQuanLySanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Ma SP", "Ten SP", "Loai", "So Luong", "Gia Mua", "Gia Ban", "Thong Tin"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbQuanLySanPham.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbQuanLySanPham);

        jLabel2.setText("Loại sản phẩm:");

        cbLoaiSanPham.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Đĩa nhạc", "Đĩa phim", "Sách" }));
        cbLoaiSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLoaiSanPhamActionPerformed(evt);
            }
        });

        btnThemSanPham.setText("Thêm sản phẩm");
        btnThemSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemSanPhamActionPerformed(evt);
            }
        });

        btnXoaSanPham.setText("Xóa sản phẩm");
        btnXoaSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaSanPhamActionPerformed(evt);
            }
        });

        btnCapNhatSanPham.setText("Cập nhật sản phẩm");
        btnCapNhatSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatSanPhamActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNhapTenSanPham)
                        .addGap(18, 18, 18)
                        .addComponent(btnTimKiemSanPham)
                        .addGap(74, 74, 74))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(cbLoaiSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnThemSanPham)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoaSanPham)
                        .addGap(18, 18, 18)
                        .addComponent(btnCapNhatSanPham)
                        .addContainerGap())))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNhapTenSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiemSanPham))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCapNhatSanPham)
                    .addComponent(btnXoaSanPham)
                    .addComponent(cbLoaiSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnThemSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane2.addTab("Sản phẩm", jPanel2);

        tbQuanLyNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã nhân viên", "Tên nhân viên", "Lương cơ bản", "Số giờ tích lũy", "Trạng thái hoạt động"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbQuanLyNhanVien);

        btnThemNhanVien.setText("Thêm nhân viên");
        btnThemNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemNhanVienActionPerformed(evt);
            }
        });

        btnXoaNhanVien.setText("Xóa nhân viên");
        btnXoaNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaNhanVienActionPerformed(evt);
            }
        });

        btnChiTiet.setText("Chi tiết");
        btnChiTiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChiTietActionPerformed(evt);
            }
        });

        btnTraLuong.setText("Trả lương");
        btnTraLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraLuongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThemNhanVien)
                .addGap(18, 18, 18)
                .addComponent(btnXoaNhanVien)
                .addGap(18, 18, 18)
                .addComponent(btnChiTiet)
                .addGap(18, 18, 18)
                .addComponent(btnTraLuong)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemNhanVien)
                    .addComponent(btnXoaNhanVien)
                    .addComponent(btnChiTiet)
                    .addComponent(btnTraLuong))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Nhân viên", jPanel3);

        jLabel3.setText("Nhập ngày:");

        btnTimKiemChiPhi.setText("Tìm kiếm");
        btnTimKiemChiPhi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemChiPhiActionPerformed(evt);
            }
        });

        tbQuanLyChiPhi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã chi", "Ngày chi", "Số tiền chi", "Lý do chi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tbQuanLyChiPhi);

        btnThemChiPhi.setText("Thêm chi phí");
        btnThemChiPhi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemChiPhiActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNhapNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTimKiemChiPhi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnLamMoi)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnThemChiPhi))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNhapNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiemChiPhi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                .addGap(1, 1, 1)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemChiPhi)
                    .addComponent(btnXoa)
                    .addComponent(btnLamMoi))
                .addGap(5, 5, 5))
        );

        jTabbedPane2.addTab("Chi phí", jPanel4);

        jMenu1.setText("Tài khoản");

        mnuDoiMK.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        mnuDoiMK.setText("Đổi mật khẩu");
        mnuDoiMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDoiMKActionPerformed(evt);
            }
        });
        jMenu1.add(mnuDoiMK);

        mnuDangXuat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        mnuDangXuat.setText("Đăng xuất");
        mnuDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDangXuatActionPerformed(evt);
            }
        });
        jMenu1.add(mnuDangXuat);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("Lịch sử giao dịch");

        mnuHoaDon.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        mnuHoaDon.setText("Truy vấn hóa đơn");
        mnuHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuHoaDonActionPerformed(evt);
            }
        });
        jMenu4.add(mnuHoaDon);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Lịch sử trả lương");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sendMess(String message){
        JOptionPane.showMessageDialog(null, message);
    }
    
    private void showWindow(){
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
    private void initTableSP(){
    
        dtmSP.setRowCount(0);
        for(SanPham sp : CuaHang.getDsSanPham().values()){
           
            String [] rowData = { sp.getMa(),sp.getTen(),sp.getClass().getSimpleName(),
                                  sp.getSoLuong()+"",sp.getGiaMua()+"",sp.getGiaBan()+"",sp.getThongTin()};
            dtmSP.addRow(rowData);
        }
    }
    
    private void initTableNV(){
        
        dtmNV.setRowCount(0);
        for(NhanVienBanHang nv : CuaHang.getDsNhanVien().values()){

            String trangthai = (nv.isActive()?"Dang lam viec":"OFFLINE");
       
            String [] rowData = { nv.getMa(), nv.getTen(),nv.getLuongCoBan()+"",nv.getGioTichLuy()+"", trangthai};
            dtmNV.addRow(rowData);
        }
    }
    
    private void initTableCP(){
        
        dtmCP.setRowCount(0);
        for(ChiPhi cp : CuaHang.getDsChiPhi().values()){
            String [] rowData = {cp.getMaCP(),TienIch.dayToString(cp.getNgay()),cp.getSoTien()+"", cp.getLyDo()};
            dtmCP.addRow(rowData);
        }
    }
    
    private void mnuDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDangXuatActionPerformed
        // TODO add your handling code here:
	LogInUI tmp = new LogInUI("Đăng nhập");
	setVisible(false);
    }//GEN-LAST:event_mnuDangXuatActionPerformed

    private void mnuDoiMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDoiMKActionPerformed
        // TODO add your handling code here:
        ChangePwdUI tmp = new ChangePwdUI(this,"Đổi mật khẩu",true,null);
				
    }//GEN-LAST:event_mnuDoiMKActionPerformed

    private void btnThemSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemSanPhamActionPerformed
        // TODO add your handling code here:
        switch(cbLoaiSanPham.getSelectedIndex()){
            case 0:
                JOptionPane.showMessageDialog(null, "Bạn chọn rõ sản phẩm","thông báo",JOptionPane.OK_OPTION);
                break;
            case 1:
                ThemDiaNhacUI dn = new ThemDiaNhacUI(this,"Thêm đĩa nhạc", true);
                if(dn.returnState) initTableSP();
                break;
            case 2:
                ThemDiaPhimUI dp = new ThemDiaPhimUI(this,"Thêm đĩa phim",true);
                if(dp.returnState) initTableSP();
                break;
            case 3:
                ThemSachUI s = new ThemSachUI(this,"Thêm sách",true);
                if(s.returnState) initTableSP();
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btnThemSanPhamActionPerformed

    private void cbLoaiSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLoaiSanPhamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbLoaiSanPhamActionPerformed

    private void btnTimKiemSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemSanPhamActionPerformed
            
        int loai = cbLoaiSanPham.getSelectedIndex();
        String xauTimKiem = txtNhapTenSanPham.getText();
        
        dtmSP.setRowCount(0);
        
        for(SanPham i : CuaHang.getDsSanPham().values()) {
            if(i.getTen().indexOf(xauTimKiem)!=-1 && (i.getLoai() == loai || loai == 0)) {
                String rowData[] = {i.getMa(),i.getTen(),i.getClass().getSimpleName(),i.getSoLuong()+"",i.getGiaMua()+"",i.getGiaBan()+"",i.getThongTin()};
                dtmSP.addRow(rowData);
            }
        }
        
    }//GEN-LAST:event_btnTimKiemSanPhamActionPerformed

    
    private void btnXoaSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaSanPhamActionPerformed
         if(tbQuanLySanPham.getSelectedRow()!= -1) {
            
            if( JOptionPane.showConfirmDialog(null, "Xác nhận xóa sản phẩm?", "Cập nhật", JOptionPane.YES_NO_OPTION) 
                == JOptionPane.NO_OPTION) return;
            
            String ma = tbQuanLySanPham.getValueAt(tbQuanLySanPham.getSelectedRow(), 0)+"";
            nhom5.model.QuanLy.xoaSanPham(CuaHang.getDsSanPham().get(ma));
            dtmSP.removeRow(tbQuanLySanPham.getSelectedRow());
            sendMess("Đã xóa.");
            
        }
    }//GEN-LAST:event_btnXoaSanPhamActionPerformed

    private void btnCapNhatSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatSanPhamActionPerformed
        if(tbQuanLySanPham.getSelectedRow() != -1) {
					
            String ma = tbQuanLySanPham.getValueAt(tbQuanLySanPham.getSelectedRow(), 0)+"";
            SanPham sp = CuaHang.getDsSanPham().get(ma);

            CapNhatSanPhamUI tmp = new CapNhatSanPhamUI(this,"Cap nhat san pham",true,sp);
            if(tmp.returnState){
                initTableSP();
            }
         }
    }//GEN-LAST:event_btnCapNhatSanPhamActionPerformed

    private void btnThemNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemNhanVienActionPerformed
        ThemNhanVienUI tmp = new ThemNhanVienUI(this,"Them nhan vien",true);
        if(tmp.returnState){
            initTableNV();
        }
    }//GEN-LAST:event_btnThemNhanVienActionPerformed

    private void btnXoaNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaNhanVienActionPerformed
        if(tbQuanLyNhanVien.getSelectedRow()!=-1) {
            
            if( JOptionPane.showConfirmDialog(null, "Xác nhận xóa nhân viên?", "Cập nhật", JOptionPane.YES_NO_OPTION) 
                == JOptionPane.NO_OPTION) return;
            
            String maNV = tbQuanLyNhanVien.getValueAt(tbQuanLyNhanVien.getSelectedRow(), 0)+"";
            NhanVienBanHang nv = CuaHang.getDsNhanVien().get(maNV);
            QuanLy.xoaNhanVien(nv);
            dtmNV.removeRow(tbQuanLyNhanVien.getSelectedRow());
            sendMess("Da xoa.");
        }
    }//GEN-LAST:event_btnXoaNhanVienActionPerformed

    private void btnChiTietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChiTietActionPerformed
         if(tbQuanLyNhanVien.getSelectedRow()!=-1) {
            String maNV = tbQuanLyNhanVien.getValueAt(tbQuanLyNhanVien.getSelectedRow(), 0)+"";
            NhanVienBanHang nv = CuaHang.getDsNhanVien().get(maNV);
            
            ChiTietThongTinNV dialog = new ChiTietThongTinNV(this, "Thong tin chi tiet", true, nv);
            if(dialog.returnState){
                initTableNV();
            }
        }
    }//GEN-LAST:event_btnChiTietActionPerformed

    private void btnTraLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraLuongActionPerformed
        TraLuongUI dialog = new TraLuongUI(this, "Tra luong", true);
        if(dialog.returnState){
            initTableNV();
        }
    }//GEN-LAST:event_btnTraLuongActionPerformed

    private void btnTimKiemChiPhiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemChiPhiActionPerformed
        try{
            String ngayTim = txtNhapNgay.getText().trim();
            dtmCP.setRowCount(0);
            for(ChiPhi cp : CuaHang.getDsChiPhi().values()){               
                if(TienIch.dayToString(cp.getNgay()).equals(ngayTim)){
                    Object [] rowData = {TienIch.dayToString(cp.getNgay()),cp.getSoTien(),cp.getLyDo()};
                    dtmCP.addRow(rowData);
                }
            }
            if(dtmCP.getRowCount() == 0){
                sendMess("Khong tim thay du lieu");
            }
        }
        catch(Exception e){
            sendMess("Du lieu dau vao khong hop le");
        }
    }//GEN-LAST:event_btnTimKiemChiPhiActionPerformed

    private void btnThemChiPhiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemChiPhiActionPerformed
        ThemKhoanChiUI dialog = new ThemKhoanChiUI(this, "Khoan chi moi", true);
        if(dialog.returnState){
            initTableCP();
        }
    }//GEN-LAST:event_btnThemChiPhiActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        if(tbQuanLyChiPhi.getSelectedRow()!=-1){
            String maChiPhi = tbQuanLyChiPhi.getValueAt(tbQuanLyChiPhi.getSelectedRow(), 0)+"";
            ChiPhi cp = CuaHang.getDsChiPhi().get(maChiPhi);
            QuanLy.xoaChiPhi(cp);
            dtmCP.removeRow(tbQuanLyChiPhi.getSelectedRow());
            sendMess("Da xoa.");
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        initTableCP();
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void mnuHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuHoaDonActionPerformed
         TruyVanHoaDonUI dialog = new TruyVanHoaDonUI(this, "Lịch sử thanh toán", true);
    }//GEN-LAST:event_mnuHoaDonActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
         LichSuTraLuong dialog = new LichSuTraLuong(this, "Lịch sử trả lương", true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (JOptionPane.showConfirmDialog(null, 
            "Ban co chac muon thoat chuong trinh?", "Thoat", 
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
		
            PhienHoatDong.ketThuc();
      	}
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(QuanLyUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhatSanPham;
    private javax.swing.JButton btnChiTiet;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnThemChiPhi;
    private javax.swing.JButton btnThemNhanVien;
    private javax.swing.JButton btnThemSanPham;
    private javax.swing.JButton btnTimKiemChiPhi;
    private javax.swing.JButton btnTimKiemSanPham;
    private javax.swing.JButton btnTraLuong;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXoaNhanVien;
    private javax.swing.JButton btnXoaSanPham;
    private javax.swing.JComboBox<String> cbLoaiSanPham;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JMenuItem mnuDangXuat;
    private javax.swing.JMenuItem mnuDoiMK;
    private javax.swing.JMenuItem mnuHoaDon;
    private javax.swing.JTable tbQuanLyChiPhi;
    private javax.swing.JTable tbQuanLyNhanVien;
    private javax.swing.JTable tbQuanLySanPham;
    private javax.swing.JTextField txtNhapNgay;
    private javax.swing.JTextField txtNhapTenSanPham;
    // End of variables declaration//GEN-END:variables
}
