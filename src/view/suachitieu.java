package view;

import api.AuthAPI;
import java.util.HashMap;
import javax.swing.JOptionPane;
import utils.StringUtils;
import utils.TokenTool;

/**
 * Form sửa thông tin chi tiêu
 *
 * @author PAT
 */
public class suachitieu extends javax.swing.JFrame {

    //Định danh người dùng
    String userid = "";

    /**
     * Hàm khởi tạo có tham số
     *
     * @param ngay ngày chi tiêu
     * @param noidung nội dung chi tiêu
     * @param sotien số tiền chi tiêu
     * @param kieu kiểu thu/chi
     */
    public suachitieu(String ngay, String noidung, String sotien, String kieu) {
        initComponents();

        //Cập nhật thông tin bản ghi vào các trường văn bản
        ngayText.setText(ngay);
        noidungText.setText(noidung);
        tienText.setText(StringUtils.removeSeparator(" ", sotien));
        if (kieu.compareTo("Thu") == 0) {
            kieuComboBox.setSelectedIndex(0);
        } else {
            kieuComboBox.setSelectedIndex(1);
        }
    }

    public suachitieu() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ngayText = new javax.swing.JTextField();
        noidungText = new javax.swing.JTextField();
        tienText = new javax.swing.JTextField();
        kieuComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        luuButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(500, 200));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("VND");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, -1, 30));

        jLabel7.setFont(new java.awt.Font("Corbel", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Năm-Tháng-Ngày");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, -1, 30));

        jLabel1.setBackground(new java.awt.Color(51, 153, 255));
        jLabel1.setFont(new java.awt.Font("Corbel", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nhập lại thông tin cần sửa");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 555, 105));

        ngayText.setBackground(new java.awt.Color(221, 221, 221));
        ngayText.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        ngayText.setBorder(null);
        getContentPane().add(ngayText, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 189, 241, 35));

        noidungText.setBackground(new java.awt.Color(221, 221, 221));
        noidungText.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        noidungText.setBorder(null);
        getContentPane().add(noidungText, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 242, 243, 36));

        tienText.setBackground(new java.awt.Color(221, 221, 221));
        tienText.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        tienText.setBorder(null);
        getContentPane().add(tienText, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 296, 242, 33));

        kieuComboBox.setFont(new java.awt.Font("Corbel", 0, 16)); // NOI18N
        kieuComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Thu", "Chi" }));
        kieuComboBox.setBorder(null);
        getContentPane().add(kieuComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 374, 91, -1));

        jLabel2.setFont(new java.awt.Font("Corbel", 0, 17)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Ngày thực hiện:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 196, 117, -1));

        jLabel3.setFont(new java.awt.Font("Corbel", 0, 17)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Nội dung thu chi:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 242, -1, 36));

        jLabel4.setFont(new java.awt.Font("Corbel", 0, 17)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Số tiền:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 296, 90, 33));

        jLabel5.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Kiểu:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 369, 85, 34));

        luuButton.setBackground(new java.awt.Color(0, 204, 0));
        luuButton.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        luuButton.setForeground(new java.awt.Color(255, 255, 255));
        luuButton.setText("Lưu");
        luuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luuButtonActionPerformed(evt);
            }
        });
        getContentPane().add(luuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 421, 105, 40));

        jLabel6.setBackground(new java.awt.Color(247, 247, 247));
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 106, 550, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void luuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luuButtonActionPerformed

        //Xét các trường văn bản trống
        if (ngayText.getText().length() == 0 || tienText.getText().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng không bỏ trống trường Ngày thực hiện và Số tiền!");
            return;
        } else {

            //Tạo đối tượng chứa thông tin đã sửa
            Object[] editedRow = new Object[]{
                xemthongtindulieu.me.currentIndex + 1,
                ngayText.getText(),
                noidungText.getText(),
                StringUtils.threeDigitsSeparate(" ", tienText.getText()),
                kieuComboBox.getSelectedItem().toString()
            };

            //Tạo đối tượng dữ liệu gửi cho API
            if (AuthAPI.isLoggedIn()) {
                HashMap<String, String> token = TokenTool.getToken();

                if (token != null) {
                    this.userid = token.get("userid");

                }

                HashMap<String, String> editedRecord = new HashMap<>();
                editedRecord.put("userid", userid);
                editedRecord.put("onDate", ngayText.getText());
                editedRecord.put("content", noidungText.getText());
                editedRecord.put("amount", tienText.getText());
                if (kieuComboBox.getSelectedItem().toString().compareTo("Chi") == 0) {
                    editedRecord.put("positive", "0");
                } else {
                    editedRecord.put("positive", "1");
                }

                //Thực hiện sửa thông tin
                xemthongtindulieu.me.SuaBanGhiChiTieu(editedRow, editedRecord);

                //Thông báo thành công và thoát frame
                JOptionPane.showMessageDialog(rootPane, "Đã sửa.");
                this.dispose();
            }
        }
    }//GEN-LAST:event_luuButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JComboBox<String> kieuComboBox;
    private javax.swing.JButton luuButton;
    private javax.swing.JTextField ngayText;
    private javax.swing.JTextField noidungText;
    private javax.swing.JTextField tienText;
    // End of variables declaration//GEN-END:variables

}
