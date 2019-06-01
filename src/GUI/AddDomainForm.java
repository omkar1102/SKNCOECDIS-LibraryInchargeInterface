/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DatabaseAccessObjects.QueryObjects.AddDomainAttributes;
import LibraryIncharge.ServerRequests;
import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class AddDomainForm extends javax.swing.JFrame {

    /**
     * Creates new form verifyStudentForm
     */
    boolean correctInput = true;
    Color forgroundColor = new Color(131, 56, 209);

    public AddDomainForm() {
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

        jLabel1 = new javax.swing.JLabel();
        addDomainPanel = new javax.swing.JPanel();
        addPublisherLable = new javax.swing.JLabel();
        domainNameLabel = new javax.swing.JLabel();
        messageLabel = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        domainNameText = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("SKNCOECDIS v.18.1 - Departmental Library");
        setResizable(false);

        addDomainPanel.setBackground(new java.awt.Color(235, 232, 247));

        addPublisherLable.setFont(new java.awt.Font("Century Schoolbook", 3, 28)); // NOI18N
        addPublisherLable.setForeground(new java.awt.Color(131, 56, 209));
        addPublisherLable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addPublisherLable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/64px/Edit2.png"))); // NOI18N
        addPublisherLable.setText("Add Domain");

        domainNameLabel.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        domainNameLabel.setForeground(new java.awt.Color(131, 56, 209));
        domainNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        domainNameLabel.setText("domain name : ");

        messageLabel.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        messageLabel.setForeground(new java.awt.Color(131, 56, 209));
        messageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        messageLabel.setText("enter details to add domain");

        cancelButton.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(131, 56, 209));
        cancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/32px/CancelButton.png"))); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        addButton.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        addButton.setForeground(new java.awt.Color(131, 56, 209));
        addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/32px/AddButton.png"))); // NOI18N
        addButton.setText("Add");
        addButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        domainNameText.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        domainNameText.setForeground(new java.awt.Color(131, 106, 209));
        domainNameText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(131, 106, 209)));
        domainNameText.setSelectionColor(new java.awt.Color(203, 192, 235));
        domainNameText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                domainNameTextKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                domainNameTextKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout addDomainPanelLayout = new javax.swing.GroupLayout(addDomainPanel);
        addDomainPanel.setLayout(addDomainPanelLayout);
        addDomainPanelLayout.setHorizontalGroup(
            addDomainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addDomainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addDomainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addPublisherLable, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                    .addGroup(addDomainPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(addButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelButton))
                    .addComponent(messageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(addDomainPanelLayout.createSequentialGroup()
                        .addComponent(domainNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(domainNameText)))
                .addContainerGap())
        );
        addDomainPanelLayout.setVerticalGroup(
            addDomainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addDomainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addPublisherLable, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(messageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addDomainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(domainNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(domainNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addDomainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(addDomainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 237, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(addDomainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        boolean enteredAllAttributes = true;
        AddDomainAttributes addDomainAttributes = new AddDomainAttributes();
        try {
            if (!domainNameText.getText().equals("")) {
                addDomainAttributes.domain_name = domainNameText.getText();
            } else {
                enteredAllAttributes = false;
            }

            if (enteredAllAttributes && correctInput) {
                boolean added_successfully;
                added_successfully = ServerRequests.addDomain(addDomainAttributes);
                if (added_successfully) {
                    GUI.libraryInchargeInterfacePanel.showRequestResult("domain added successfully");
                } else {
                    GUI.libraryInchargeInterfacePanel.showRequestResult("domain didn't added, domain might be already added");
                }
                GUI.libraryInchargeInterfaceFrame.setEnabled(true);
                this.dispose();
            } else if (!enteredAllAttributes) {
                JOptionPane.showMessageDialog(null, "all fields are mandatory");
            } else if (!correctInput) {
                JOptionPane.showMessageDialog(null, "incorrect input");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "invalid number format");
        } catch (IOException ex) {
            Logger.getLogger(AddDomainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        GUI.libraryInchargeInterfacePanel.showRequestResult("domain not added");
        GUI.libraryInchargeInterfaceFrame.setEnabled(true);
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void domainNameTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_domainNameTextKeyTyped
        if (domainNameText.getText().length() >= 100) {
            evt.consume();
            messageLabel.setForeground(Color.MAGENTA);
            messageLabel.setText("*maximum charchter length is 100");
        }
    }//GEN-LAST:event_domainNameTextKeyTyped

    private void domainNameTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_domainNameTextKeyReleased
        messageLabel.setForeground(forgroundColor);
        messageLabel.setText("enter details to add domain");
    }//GEN-LAST:event_domainNameTextKeyReleased

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
//            java.util.logging.Logger.getLogger(verifyStudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(verifyStudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(verifyStudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(verifyStudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new VerifyStudentForm().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JPanel addDomainPanel;
    private javax.swing.JLabel addPublisherLable;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel domainNameLabel;
    private javax.swing.JTextField domainNameText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel messageLabel;
    // End of variables declaration//GEN-END:variables
}