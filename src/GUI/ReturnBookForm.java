/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DatabaseAccessObjects.QueryObjects.BookReturnAttributes;
import LibraryIncharge.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author hp
 */
public class ReturnBookForm extends javax.swing.JFrame {

    /**
     * Creates new form LoginActivity
     */
 
    BookReturnAttributes book_return_query=new BookReturnAttributes();   
    int selectedRow=-1;
    public ReturnBookForm(int selectedRow, String username, int book_id, String book_title, String fine_amount) {
        initComponents();
        book_return_query.book_id=book_id;
        book_return_query.username=username;
        this.selectedRow=selectedRow;
        
        usernameLabel.setText("username : "+username);

        if(book_title.length()<=50){
             bookDetailsLabel.setText("book : "+book_id+", "+String.valueOf(book_title.toCharArray(), 0, book_title.length()));
        }
        else{
          bookDetailsLabel.setText("book : "+book_id+", "+String.valueOf(book_title.toCharArray(), 0, 50)+" ...");
        }
       
        fineAmountLable.setText("fine amount : "+fine_amount);
        chargeFineToggleButton.setText("Charge Fine ?");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        returnBookPanel = new javax.swing.JPanel();
        activityTitleLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        bookDetailsLabel = new javax.swing.JLabel();
        returnButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        chargeFineToggleButton = new javax.swing.JToggleButton();
        fineAmountLable = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("SKNCOECDIS v18.1 - Departmental Library");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);
        setResizable(false);

        returnBookPanel.setBackground(new java.awt.Color(235, 232, 247));

        activityTitleLabel.setFont(new java.awt.Font("Century Schoolbook", 3, 28)); // NOI18N
        activityTitleLabel.setForeground(new java.awt.Color(131, 56, 209));
        activityTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        activityTitleLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/64px/ReturnBook.png"))); // NOI18N
        activityTitleLabel.setText("Return Book");

        usernameLabel.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(131, 106, 209));
        usernameLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        bookDetailsLabel.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        bookDetailsLabel.setForeground(new java.awt.Color(131, 106, 209));
        bookDetailsLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        returnButton.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        returnButton.setForeground(new java.awt.Color(131, 56, 209));
        returnButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/32px/ReturnButton.png"))); // NOI18N
        returnButton.setText("Return ");
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(131, 56, 209));
        cancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/32px/CancelButton.png"))); // NOI18N
        cancelButton.setText("Cancel ");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        chargeFineToggleButton.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        chargeFineToggleButton.setForeground(new java.awt.Color(131, 56, 209));
        chargeFineToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/32px/CancelButton.png"))); // NOI18N
        chargeFineToggleButton.setText("Charge Fine?  ");
        chargeFineToggleButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        chargeFineToggleButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        chargeFineToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chargeFineToggleButtonActionPerformed(evt);
            }
        });

        fineAmountLable.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        fineAmountLable.setForeground(new java.awt.Color(131, 106, 209));
        fineAmountLable.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout returnBookPanelLayout = new javax.swing.GroupLayout(returnBookPanel);
        returnBookPanel.setLayout(returnBookPanelLayout);
        returnBookPanelLayout.setHorizontalGroup(
            returnBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(returnBookPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(returnBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bookDetailsLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(activityTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(usernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, returnBookPanelLayout.createSequentialGroup()
                        .addGap(0, 157, Short.MAX_VALUE)
                        .addComponent(chargeFineToggleButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(returnButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelButton))
                    .addComponent(fineAmountLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        returnBookPanelLayout.setVerticalGroup(
            returnBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(returnBookPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(activityTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bookDetailsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fineAmountLable, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(returnBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chargeFineToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(returnBookPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(returnBookPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        try {
            book_return_query.is_fine = chargeFineToggleButton.isSelected();
            GUI.libraryInchargeInterfaceFrame.setEnabled(true);
            GUI.libraryInchargeInterfacePanel.showRequestResult(ServerRequests.returnBook(book_return_query));
            GUI.libraryInchargeInterfacePanel.removeRowFromTable(3, selectedRow);
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(ReturnBookForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_returnButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
          GUI.libraryInchargeInterfaceFrame.setEnabled(true);
          GUI.libraryInchargeInterfacePanel.showRequestResult("book didn't return");
          this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void chargeFineToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chargeFineToggleButtonActionPerformed
        if(chargeFineToggleButton.isSelected()){
           ImageIcon icon=new ImageIcon(getClass().getResource("/Icons/32px/OkayButton.png"));
           chargeFineToggleButton.setIcon(icon);
        }
        else{
         ImageIcon icon=new ImageIcon(getClass().getResource("/Icons/32px/CancelButton.png"));
           chargeFineToggleButton.setIcon(icon);
    }
    }//GEN-LAST:event_chargeFineToggleButtonActionPerformed

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
//            java.util.logging.Logger.getLogger(ReturnBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ReturnBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ReturnBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ReturnBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
////        java.awt.EventQueue.invokeLater(new Runnable() {
////            public void run() {
////                new EditConnectionForm().setVisible(true);
////                
////            }
////        });
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
////        java.awt.EventQueue.invokeLater(new Runnable() {
////            public void run() {
////                new EditConnectionForm().setVisible(true);
////                
////            }
////        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel activityTitleLabel;
    private javax.swing.JLabel bookDetailsLabel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JToggleButton chargeFineToggleButton;
    private javax.swing.JLabel fineAmountLable;
    private javax.swing.JPanel returnBookPanel;
    private javax.swing.JButton returnButton;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
