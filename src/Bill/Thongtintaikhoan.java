
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bill;

import Helper.DBHelper;
import Main.*;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;






/**
 *
 * @author Manh
 */
public class Thongtintaikhoan extends javax.swing.JPanel {
 
    /**
     * Creates new form Khachhang
     */
    
    ResultSet rs;
    PreparedStatement ps;
    DBHelper db = new DBHelper();
    Connection con = db.getCon();

    public Thongtintaikhoan(String name) {
        initComponents();
        thongtintaikhoan(name);
    
  
    }
    public void thongtintaikhoan(String name){
     try {
            ps = con.prepareStatement("select * from Employee where NameEmp=?");
            ps.setString(1, name);
            rs = ps.executeQuery();
            if (rs.next()) {
                lblhoten.setText(rs.getString(3));
                if (rs.getString(4).equals("Nam")) {
                    tbldgioitinh.setText("Nam");
                } else {
                    tbldgioitinh.setText("Nữ");
                }
                tblngaysinh.setText(rs.getString(5));
                lbldiathoai.setText(rs.getString(6));
                lblemail.setText(rs.getString(7));
                lbldiachi.setText(rs.getString(8));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi 101:: Không thể kết nối đến máy chủ");
        }
    
    
    }
    
    
   
   



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        order = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lbldiathoai = new javax.swing.JLabel();
        lblhoten = new javax.swing.JLabel();
        tbldgioitinh = new javax.swing.JLabel();
        tblngaysinh = new javax.swing.JLabel();
        lblemail = new javax.swing.JLabel();
        lbldiachi = new javax.swing.JLabel();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(850, 540));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(128, 128, 131));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 620));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("THÔNG TIN TÀI KHOẢN");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 70));

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Số điện thoại: ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 140, 40));

        jLabel4.setBackground(new java.awt.Color(153, 153, 153));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Giới tính:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 120, 40));

        jLabel5.setBackground(new java.awt.Color(153, 153, 153));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Ngày sinh: ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 150, 40));

        jLabel7.setBackground(new java.awt.Color(153, 153, 153));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Email:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 90, 40));

        jLabel8.setBackground(new java.awt.Color(153, 153, 153));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Địa chỉ: ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 80, 40));

        order.setBackground(new java.awt.Color(0, 0, 0));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Đồng ý");

        javax.swing.GroupLayout orderLayout = new javax.swing.GroupLayout(order);
        order.setLayout(orderLayout);
        orderLayout.setHorizontalGroup(
            orderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        orderLayout.setVerticalGroup(
            orderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(order, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 460, 120, 50));

        jLabel13.setBackground(new java.awt.Color(153, 153, 153));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setText("Tên nhân viên: ");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 190, 40));

        lbldiathoai.setBackground(new java.awt.Color(153, 153, 153));
        lbldiathoai.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbldiathoai.setForeground(new java.awt.Color(153, 153, 153));
        lbldiathoai.setText("Trống");
        jPanel1.add(lbldiathoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 350, 170, 40));

        lblhoten.setBackground(new java.awt.Color(153, 153, 153));
        lblhoten.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblhoten.setForeground(new java.awt.Color(153, 153, 153));
        lblhoten.setText("Trống");
        jPanel1.add(lblhoten, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 170, 40));

        tbldgioitinh.setBackground(new java.awt.Color(153, 153, 153));
        tbldgioitinh.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tbldgioitinh.setForeground(new java.awt.Color(153, 153, 153));
        tbldgioitinh.setText("Trống");
        jPanel1.add(tbldgioitinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 170, 40));

        tblngaysinh.setBackground(new java.awt.Color(153, 153, 153));
        tblngaysinh.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tblngaysinh.setForeground(new java.awt.Color(153, 153, 153));
        tblngaysinh.setText("Trống");
        jPanel1.add(tblngaysinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 170, 40));

        lblemail.setBackground(new java.awt.Color(153, 153, 153));
        lblemail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblemail.setForeground(new java.awt.Color(153, 153, 153));
        lblemail.setText("Trống");
        jPanel1.add(lblemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, 170, 40));

        lbldiachi.setBackground(new java.awt.Color(153, 153, 153));
        lbldiachi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbldiachi.setForeground(new java.awt.Color(153, 153, 153));
        lbldiachi.setText("Trống");
        jPanel1.add(lbldiachi, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 240, 170, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbldiachi;
    private javax.swing.JLabel lbldiathoai;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblhoten;
    private javax.swing.JPanel order;
    private javax.swing.JLabel tbldgioitinh;
    private javax.swing.JLabel tblngaysinh;
    // End of variables declaration//GEN-END:variables
}
