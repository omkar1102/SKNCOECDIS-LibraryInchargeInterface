/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Connection.ConnectionDetails;
import LibraryIncharge.*;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class LoginForm extends javax.swing.JFrame {

    /**
     * Creates new form LoginActivity
     *
     * @throws java.net.UnknownHostException
     */
    public LoginForm() throws UnknownHostException {
        initComponents();
        this.setAlwaysOnTop(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginPanel = new javax.swing.JPanel();
        loginTitleLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        usernameText = new javax.swing.JTextField();
        passwordPasswordField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        editConnectionButton = new javax.swing.JButton();

        setDefaultCloseOperation(this.closeFrame());
        setTitle("SKNCOECDIS v18.1 - Departmental Library");
        setBackground(new java.awt.Color(235, 232, 247));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);
        setIconImage(new ImageIcon(getClass().getResource(LibraryInchargeInterface.interfaceFrameImageIconPath)).getImage());
        setResizable(false);

        loginPanel.setBackground(new java.awt.Color(235, 232, 247));

        loginTitleLabel.setFont(new java.awt.Font("Century Schoolbook", 3, 28)); // NOI18N
        loginTitleLabel.setForeground(new java.awt.Color(131, 56, 209));
        loginTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginTitleLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/64px/DepartmentalLibrary.png"))); // NOI18N
        loginTitleLabel.setText("Departmental Library");

        usernameLabel.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(131, 106, 209));
        usernameLabel.setText("username : ");

        passwordLabel.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(131, 106, 209));
        passwordLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        passwordLabel.setText("password : ");

        usernameText.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        usernameText.setForeground(new java.awt.Color(131, 106, 209));
        usernameText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(131, 106, 209)));
        usernameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextActionPerformed(evt);
            }
        });

        passwordPasswordField.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        passwordPasswordField.setForeground(new java.awt.Color(131, 106, 209));
        passwordPasswordField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(131, 106, 209)));
        passwordPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordPasswordFieldActionPerformed(evt);
            }
        });

        loginButton.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        loginButton.setForeground(new java.awt.Color(131, 106, 209));
        loginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/32px/LoginButton.png"))); // NOI18N
        loginButton.setText("Login");
        loginButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        editConnectionButton.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        editConnectionButton.setForeground(new java.awt.Color(131, 56, 209));
        editConnectionButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/32px/Connection.png"))); // NOI18N
        editConnectionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editConnectionButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(loginTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(passwordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(usernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameText)
                            .addComponent(passwordPasswordField)
                            .addGroup(loginPanelLayout.createSequentialGroup()
                                .addGap(35, 432, Short.MAX_VALUE)
                                .addComponent(editConnectionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(250, 250, 250))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passwordPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                        .addComponent(editConnectionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTextActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        this.setAlwaysOnTop(false);
        if (!(usernameText.getText().equals("") || passwordPasswordField.getPassword().equals(""))) {
            String username = usernameText.getText().trim();
            String password = String.valueOf(passwordPasswordField.getPassword()).trim();
            if (username.length() > 16 || password.length() > 64) {
                JOptionPane.showMessageDialog(null, "incorrect username/ password");
            }
            boolean signUpSuccessfully;
            try {
                signUpSuccessfully = ServerRequests.login(username, password);
                if (signUpSuccessfully && LibraryInchargeInterface.user.user_role.equals("L")) {
                    Thread guiThread = new Thread(new GUI());
                    guiThread.start();
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "incorrect username/ password");
                }
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "username/ password can not be empty");
        }
        this.setAlwaysOnTop(true);
    }//GEN-LAST:event_loginButtonActionPerformed

    private void editConnectionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editConnectionButtonActionPerformed
        ConnectionDetails connectionDetails = new ConnectionDetails();
        connectionDetails = ConnectionDetails.getConnectionDetails(connectionDetails);
        if (connectionDetails.portAddress == 0) {
            connectionDetails.ipAddress = "localhost";
        }
        EditConnectionForm editConnectionForm = new EditConnectionForm(connectionDetails, true);
        editConnectionForm.setTitle(LibraryInchargeInterface.interfaceFrameTitle);
        ImageIcon logo;
        logo = new ImageIcon(getClass().getResource(LibraryInchargeInterface.interfaceFrameImageIconPath));
        editConnectionForm.setIconImage(logo.getImage());
        editConnectionForm.setLocationRelativeTo(null);
        editConnectionForm.pack();
        this.dispose();
        editConnectionForm.setVisible(true);
    }//GEN-LAST:event_editConnectionButtonActionPerformed

    private void passwordPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordPasswordFieldActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new LoginForm().setVisible(true);
//                
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editConnectionButton;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel loginTitleLabel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordPasswordField;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameText;
    // End of variables declaration//GEN-END:variables
private int closeFrame() {
        Platform.exit();
        return 3; //EXIT_ON_CLOSE
    }
}
