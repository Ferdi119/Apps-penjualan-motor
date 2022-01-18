package pmotor;

import Sql.koneksisql;
import java.sql.*;
import javax.swing.*;

public class Login extends javax.swing.JFrame {
    Connection conn = koneksisql.getKoneksi();
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnlBG = new javax.swing.JPanel();
        PnlKiri = new javax.swing.JPanel();
        LabelIconKiri = new javax.swing.JLabel();
        PnlKanan = new javax.swing.JPanel();
        TextUsername = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        TextPassword = new javax.swing.JPasswordField();
        LabelLoginAdmin = new javax.swing.JLabel();
        BtnLogin = new javax.swing.JButton();
        LabelIconUser = new javax.swing.JLabel();
        LabelIconPassword = new javax.swing.JLabel();
        CheckShowPassword = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PnlBG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PnlKiri.setBackground(new java.awt.Color(255, 255, 255));

        LabelIconKiri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pmotor/img/anime-original-traffic-light-wallpaper-preview.jpg"))); // NOI18N
        LabelIconKiri.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout PnlKiriLayout = new javax.swing.GroupLayout(PnlKiri);
        PnlKiri.setLayout(PnlKiriLayout);
        PnlKiriLayout.setHorizontalGroup(
            PnlKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelIconKiri, javax.swing.GroupLayout.PREFERRED_SIZE, 600, Short.MAX_VALUE)
        );
        PnlKiriLayout.setVerticalGroup(
            PnlKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelIconKiri, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        PnlBG.add(PnlKiri, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 500));
        PnlKiri.getAccessibleContext().setAccessibleDescription("");

        PnlKanan.setBackground(new java.awt.Color(0, 59, 70));
        PnlKanan.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N

        TextUsername.setBackground(new java.awt.Color(0, 59, 70));
        TextUsername.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        TextUsername.setForeground(new java.awt.Color(255, 255, 255));
        TextUsername.setBorder(null);
        TextUsername.setOpaque(false);

        TextPassword.setBackground(new java.awt.Color(0, 59, 70));
        TextPassword.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        TextPassword.setForeground(new java.awt.Color(255, 255, 255));
        TextPassword.setBorder(null);
        TextPassword.setOpaque(false);
        TextPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextPasswordActionPerformed(evt);
            }
        });

        LabelLoginAdmin.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        LabelLoginAdmin.setForeground(new java.awt.Color(255, 255, 255));
        LabelLoginAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelLoginAdmin.setText("Login Admin");
        LabelLoginAdmin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        BtnLogin.setBackground(new java.awt.Color(255, 255, 255));
        BtnLogin.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        BtnLogin.setForeground(new java.awt.Color(0, 59, 70));
        BtnLogin.setText("Login");
        BtnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLoginActionPerformed(evt);
            }
        });

        LabelIconUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pmotor/img/icons8-user-25.png"))); // NOI18N

        LabelIconPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pmotor/img/icons8-password-25.png"))); // NOI18N

        CheckShowPassword.setBackground(new java.awt.Color(0, 59, 70));
        CheckShowPassword.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        CheckShowPassword.setForeground(new java.awt.Color(255, 255, 255));
        CheckShowPassword.setText("Show Passowrd");
        CheckShowPassword.setToolTipText("");
        CheckShowPassword.setName(""); // NOI18N
        CheckShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckShowPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnlKananLayout = new javax.swing.GroupLayout(PnlKanan);
        PnlKanan.setLayout(PnlKananLayout);
        PnlKananLayout.setHorizontalGroup(
            PnlKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlKananLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelLoginAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(PnlKananLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(PnlKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CheckShowPassword)
                    .addGroup(PnlKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jSeparator2)
                        .addGroup(PnlKananLayout.createSequentialGroup()
                            .addComponent(TextPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(LabelIconPassword))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlKananLayout.createSequentialGroup()
                            .addComponent(TextUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(LabelIconUser))
                        .addComponent(BtnLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        PnlKananLayout.setVerticalGroup(
            PnlKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlKananLayout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(LabelLoginAdmin)
                .addGap(59, 59, 59)
                .addGroup(PnlKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelIconUser)
                    .addGroup(PnlKananLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(TextUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PnlKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TextPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelIconPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CheckShowPassword)
                .addGap(19, 19, 19)
                .addComponent(BtnLogin)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        PnlBG.add(PnlKanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 350, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnlBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnlBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextPasswordActionPerformed

    private void CheckShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckShowPasswordActionPerformed
        if (CheckShowPassword.isSelected()) {
            TextPassword.setEchoChar((char)0);
        } else {
            TextPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_CheckShowPasswordActionPerformed

    private void BtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLoginActionPerformed
        String sql ="select * from login where username=? and password=? ";
        try{
            pst= conn.prepareStatement(sql);
            pst.setString(1, TextUsername.getText());
            pst.setString(2, String.valueOf(TextPassword.getPassword()));
            rs=pst.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "berhasil masuk");
                this.setVisible(false);
                new Home().setVisible(true);
            }else
                JOptionPane.showMessageDialog(null, "password / username salah");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BtnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnLogin;
    private javax.swing.JCheckBox CheckShowPassword;
    private javax.swing.JLabel LabelIconKiri;
    private javax.swing.JLabel LabelIconPassword;
    private javax.swing.JLabel LabelIconUser;
    private javax.swing.JLabel LabelLoginAdmin;
    private javax.swing.JPanel PnlBG;
    private javax.swing.JPanel PnlKanan;
    private javax.swing.JPanel PnlKiri;
    private javax.swing.JPasswordField TextPassword;
    private javax.swing.JTextField TextUsername;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}