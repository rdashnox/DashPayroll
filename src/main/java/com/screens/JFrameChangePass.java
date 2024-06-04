/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.screens;
import com.baseActions.UserAuthentication;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author JD Morales
 */
public class JFrameChangePass extends javax.swing.JFrame {


    /**
     * Creates new form JavaTabs
     */
    public JFrameChangePass() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setResizable(false);        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelHeader = new javax.swing.JPanel();
        labelCompanyName = new java.awt.Label();
        labelCompanyLogo = new javax.swing.JLabel();
        jPanelFooter = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton1ChangePass = new javax.swing.JButton();
        jButtonBackToLogin = new javax.swing.JButton();
        jPasswordField1OldPass = new javax.swing.JPasswordField();
        jPasswordField1NewPass = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        jPasswordField1ConPass = new javax.swing.JPasswordField();
        jLabel15 = new javax.swing.JLabel();
        jTextField1Email = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelHeader.setBackground(new java.awt.Color(99, 93, 255));

        labelCompanyName.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        labelCompanyName.setForeground(new java.awt.Color(255, 255, 255));
        labelCompanyName.setText("MotorPH");

        labelCompanyLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LOGO_icon.png"))); // NOI18N
        labelCompanyLogo.setText("jLabel1");
        labelCompanyLogo.setMaximumSize(new java.awt.Dimension(172, 119));
        labelCompanyLogo.setMinimumSize(new java.awt.Dimension(172, 119));
        labelCompanyLogo.setPreferredSize(new java.awt.Dimension(172, 192));

        javax.swing.GroupLayout jPanelHeaderLayout = new javax.swing.GroupLayout(jPanelHeader);
        jPanelHeader.setLayout(jPanelHeaderLayout);
        jPanelHeaderLayout.setHorizontalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCompanyLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelCompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelHeaderLayout.setVerticalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addGroup(jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelHeaderLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelCompanyLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelHeaderLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(labelCompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelFooter.setBackground(new java.awt.Color(99, 93, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Office Hours: 8:00AM - 5:00PM");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Office Address: 5th Flr., The World Center #330 Sen. Gil Puyat Ave., Makati City, Manila, Philippines");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Office Phone Number: +63-2-754-7000");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Office Email: support@motorph.com");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Group 1");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Section : A1101");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("MO-IT103 - Computer Programming 2");

        javax.swing.GroupLayout jPanelFooterLayout = new javax.swing.GroupLayout(jPanelFooter);
        jPanelFooter.setLayout(jPanelFooterLayout);
        jPanelFooterLayout.setHorizontalGroup(
            jPanelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFooterLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelFooterLayout.createSequentialGroup()
                    .addGap(0, 1035, Short.MAX_VALUE)
                    .addGroup(jPanelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelFooterLayout.createSequentialGroup()
                            .addGap(396, 396, 396)
                            .addComponent(jLabel11))
                        .addGroup(jPanelFooterLayout.createSequentialGroup()
                            .addGap(356, 356, 356)
                            .addComponent(jLabel21))
                        .addGroup(jPanelFooterLayout.createSequentialGroup()
                            .addGap(226, 226, 226)
                            .addComponent(jLabel18)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanelFooterLayout.setVerticalGroup(
            jPanelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFooterLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(jPanelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelFooterLayout.createSequentialGroup()
                    .addGap(0, 40, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MOTORPHBackground.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(147, 145, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Change Password");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 190, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("New Password:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Old Password:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jButton1ChangePass.setBackground(new java.awt.Color(99, 93, 255));
        jButton1ChangePass.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1ChangePass.setForeground(new java.awt.Color(255, 255, 255));
        jButton1ChangePass.setText("Submit");
        jButton1ChangePass.setBorderPainted(false);
        jButton1ChangePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ChangePassActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1ChangePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 130, -1));

        jButtonBackToLogin.setBackground(new java.awt.Color(99, 93, 255));
        jButtonBackToLogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonBackToLogin.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBackToLogin.setText("Back");
        jButtonBackToLogin.setBorderPainted(false);
        jButtonBackToLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackToLoginActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonBackToLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 130, -1));
        jPanel1.add(jPasswordField1OldPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 230, -1));
        jPanel1.add(jPasswordField1NewPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 230, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Confirm New Password:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));
        jPanel1.add(jPasswordField1ConPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 230, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Email:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));
        jPanel1.add(jTextField1Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 230, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelHeader, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 556, Short.MAX_VALUE))
            .addComponent(jPanelFooter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                .addComponent(jPanelFooter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ChangePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ChangePassActionPerformed
        String email = jTextField1Email.getText();
        String oldPassword = new String(jPasswordField1OldPass.getPassword());
        String newPassword = new String(jPasswordField1NewPass.getPassword());
        String confirmPassword = new String(jPasswordField1ConPass.getPassword());

      
        
        // Check if new password matches the confirmed password
        if (!newPassword.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(null, "Passwords do not match!");
            return; // Exit the method if passwords don't match
        }

        try {
            /*
            // Update password in the database
            String updateQuery = "UPDATE motorphdb SET Password = ? WHERE Email = ?";
            PreparedStatement updatePs = MotorPH_DB.con.prepareStatement(updateQuery);
            updatePs.setString(1, newPassword);
            updatePs.setString(2, email);
            int rowsAffected = updatePs.executeUpdate();

            // Check if password update was successful
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Your password have been updated successfully!");
            } else {
                JOptionPane.showMessageDialog(null, "Failed to update password. Please try again.");
            } */
            
        // Check if all fields are populated
        if (email.equals("") || oldPassword.equals("") || newPassword.equals("") || confirmPassword.equals("")) {
                JOptionPane.showMessageDialog(null, "Please populate all fields!");
                //return; // Exit the method if passwords don't match
            } else {
                UserAuthentication changePassword = new UserAuthentication();
                int flagChangePassword = changePassword.updatePassword(newPassword, email, oldPassword);

                // Check if password update was successful
                if (flagChangePassword > 0) {
                    JOptionPane.showMessageDialog(null, "Your password have been updated successfully!");

                    this.dispose();
                    JFrameLogin FrameLogin = new JFrameLogin();
                    FrameLogin.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Failed to update password. Check your email and/or old password.");
                }
            }           
   
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "An error occurred while updating password. Please try again. \n" + ex);   
        }
    }//GEN-LAST:event_jButton1ChangePassActionPerformed

    private void jButtonBackToLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackToLoginActionPerformed
        this.dispose();
        JFrameLogin FrameLogin = new JFrameLogin();
        FrameLogin.setVisible(true);
    }//GEN-LAST:event_jButtonBackToLoginActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameChangePass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1ChangePass;
    private javax.swing.JButton jButtonBackToLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelFooter;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JPasswordField jPasswordField1ConPass;
    private javax.swing.JPasswordField jPasswordField1NewPass;
    private javax.swing.JPasswordField jPasswordField1OldPass;
    private javax.swing.JTextField jTextField1Email;
    private javax.swing.JLabel labelCompanyLogo;
    private java.awt.Label labelCompanyName;
    // End of variables declaration//GEN-END:variables
}
