/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import api.AuthAPI;
import java.awt.Color;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class dangkytaikhoan extends javax.swing.JFrame {

    /**
     * Creates new form dangkytaikhoan
     */
    public dangkytaikhoan() {
        initComponents();
    }

    /**
     * Phương thức kiểm tra tính đúng đắn của thông tin tài khoản đăng ký
     *
     * @return true nếu đúng dữ liệu, false nếu sai
     */
    public boolean kiemtrathongtin() {
        if (matkhau1Text.getPassword().length == 0 || matkhau2Text.getPassword().length == 0 || taikhoanText.getText().length() == 0 || tenText.getText().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập đầy đủ thông tin tài khoản muốn đăng ký");
            return false;
        } else if (String.valueOf(matkhau1Text.getPassword()).compareTo(String.valueOf(matkhau2Text.getPassword())) != 0) {
            return false;
        }
        return true;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tenText = new javax.swing.JTextField();
        taikhoanText = new javax.swing.JTextField();
        dangkyButton = new javax.swing.JButton();
        matkhau1Text = new javax.swing.JPasswordField();
        matkhau2Text = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(500, 200));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(51, 153, 255));
        jLabel1.setFont(new java.awt.Font("Corbel", 0, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("THÔNG TIN ĐĂNG KÝ");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 471, 114));

        jLabel2.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(41, 41, 41));
        jLabel2.setText("Tên tài khoản:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 228, -1, 33));

        jLabel3.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(41, 41, 41));
        jLabel3.setText("Họ tên đầy đủ:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 145, -1, 31));

        jLabel4.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(41, 41, 41));
        jLabel4.setText("Mật khẩu:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 279, -1, 32));

        tenText.setBackground(new java.awt.Color(208, 208, 208));
        tenText.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        tenText.setBorder(null);
        getContentPane().add(tenText, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 145, 215, 31));

        taikhoanText.setBackground(new java.awt.Color(208, 208, 208));
        taikhoanText.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        taikhoanText.setBorder(null);
        taikhoanText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taikhoanTextActionPerformed(evt);
            }
        });
        getContentPane().add(taikhoanText, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 228, 215, 33));

        dangkyButton.setBackground(new java.awt.Color(0, 153, 255));
        dangkyButton.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        dangkyButton.setForeground(new java.awt.Color(255, 255, 255));
        dangkyButton.setText("Đăng ký");
        dangkyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dangkyButtonActionPerformed(evt);
            }
        });
        getContentPane().add(dangkyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 100, -1));

        matkhau1Text.setBackground(new java.awt.Color(208, 208, 208));
        matkhau1Text.setBorder(null);
        matkhau1Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matkhau1TextActionPerformed(evt);
            }
        });
        matkhau1Text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                matkhau1TextKeyReleased(evt);
            }
        });
        getContentPane().add(matkhau1Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 279, 215, 32));

        matkhau2Text.setBackground(new java.awt.Color(208, 208, 208));
        matkhau2Text.setBorder(null);
        matkhau2Text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                matkhau2TextKeyReleased(evt);
            }
        });
        getContentPane().add(matkhau2Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 329, 215, 33));

        jLabel5.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(41, 41, 41));
        jLabel5.setText("Nhập lại mật khẩu:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 329, -1, 30));

        jLabel6.setBackground(new java.awt.Color(245, 245, 245));
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 470, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void taikhoanTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taikhoanTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_taikhoanTextActionPerformed

    private void matkhau1TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matkhau1TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matkhau1TextActionPerformed

    private void matkhau2TextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_matkhau2TextKeyReleased
        String matkhau1 = String.valueOf(matkhau1Text.getPassword());
        String matkhau2 = String.valueOf(matkhau2Text.getPassword());
        if (matkhau2.equals("")) {
            matkhau2Text.setBorder(null);
        } else {
            if (matkhau2.equals(matkhau1)) {
                matkhau2Text.setBorder(BorderFactory.createLineBorder(Color.GREEN, 1));
            } else {
                matkhau2Text.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
        }
    }//GEN-LAST:event_matkhau2TextKeyReleased

    private void matkhau1TextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_matkhau1TextKeyReleased
        String matkhau1 = String.valueOf(matkhau1Text.getPassword());
        String matkhau2 = String.valueOf(matkhau2Text.getPassword());
        if (matkhau2.equals("")) {
            matkhau2Text.setBorder(null);
        } else {
            if (matkhau2.equals(matkhau1)) {
                matkhau2Text.setBorder(BorderFactory.createLineBorder(Color.GREEN, 1));
            } else {
                matkhau2Text.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
        }
    }//GEN-LAST:event_matkhau1TextKeyReleased

    private void dangkyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dangkyButtonActionPerformed
        if (kiemtrathongtin()) {
            HashMap<String, String> userInfo = new HashMap<>();
            userInfo.put("username", taikhoanText.getText());
            userInfo.put("password", String.valueOf(matkhau1Text.getPassword()));
            userInfo.put("fullName", tenText.getText());
            try {
                AuthAPI.register(userInfo);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            JOptionPane.showMessageDialog(rootPane, "Đăng ký thành công");
            try {
                AuthAPI.login(userInfo);
                dangnhap.me.dispose();
                new xemthongtindulieu().setVisible(true);
                this.dispose();
            } catch (Exception ex) {
                Logger.getLogger(dangkytaikhoan.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "vui lòng nhập đúng mật khẩu 2 lần.");
            return;
        }
    }//GEN-LAST:event_dangkyButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dangkyButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField matkhau1Text;
    private javax.swing.JPasswordField matkhau2Text;
    private javax.swing.JTextField taikhoanText;
    private javax.swing.JTextField tenText;
    // End of variables declaration//GEN-END:variables

}
