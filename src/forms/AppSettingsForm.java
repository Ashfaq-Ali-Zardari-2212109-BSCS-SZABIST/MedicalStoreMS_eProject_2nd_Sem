/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forms;

import Forms.LoginForm;
import java.io.File;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import utils.AAZAppUtils;

/**
 *
 * @author user
 */
public class AppSettingsForm extends javax.swing.JFrame {

    private AAZAppUtils AAZAppUtils;

    /**
     * Creates new form AppSettingsForm
     */
    public AppSettingsForm() {
        initComponents();
        InitAppComponents();
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
        jPanel2 = new javax.swing.JPanel();
        txtAppName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        chkbxLicenseKey = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        txtAppOwner = new javax.swing.JTextField();
        txtDBServer = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtDBName = new javax.swing.JTextField();
        txtDBUser = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        chkbxDBPassword = new javax.swing.JCheckBox();
        txtAppLicenseKey = new javax.swing.JPasswordField();
        txtDBPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(122, 204, 41));

        jPanel2.setBackground(new java.awt.Color(231, 249, 253));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        txtAppName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtAppName.setText("Medical Store MS");
        txtAppName.setNextFocusableComponent(txtAppLicenseKey);
        txtAppName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAppNameActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(119, 119, 119));
        jLabel4.setText("App Name");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(119, 119, 119));
        jLabel5.setText("App License Key");

        btnSave.setBackground(new java.awt.Color(122, 204, 41));
        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.setNextFocusableComponent(txtAppName);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(119, 119, 119));
        jLabel6.setText("App Settings");

        chkbxLicenseKey.setBackground(new java.awt.Color(231, 249, 253));
        chkbxLicenseKey.setText("Show License Key");
        chkbxLicenseKey.setNextFocusableComponent(txtAppOwner);
        chkbxLicenseKey.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkbxLicenseKeyStateChanged(evt);
            }
        });
        chkbxLicenseKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbxLicenseKeyActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(119, 119, 119));
        jLabel7.setText("App Owner");

        txtAppOwner.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtAppOwner.setText("Bushra Barkat Shaikh");
        txtAppOwner.setNextFocusableComponent(txtDBServer);
        txtAppOwner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAppOwnerActionPerformed(evt);
            }
        });

        txtDBServer.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtDBServer.setText("Lenovo");
        txtDBServer.setNextFocusableComponent(txtDBName);
        txtDBServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDBServerActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(119, 119, 119));
        jLabel8.setText("DB Server");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(119, 119, 119));
        jLabel9.setText("DB Name");

        txtDBName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtDBName.setText("MedicalStoreDB");
        txtDBName.setNextFocusableComponent(txtDBUser);
        txtDBName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDBNameActionPerformed(evt);
            }
        });

        txtDBUser.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtDBUser.setText("sa");
        txtDBUser.setNextFocusableComponent(txtDBPassword);
        txtDBUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDBUserActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(119, 119, 119));
        jLabel10.setText("DB User");

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(119, 119, 119));
        jLabel11.setText("DB Password");

        chkbxDBPassword.setBackground(new java.awt.Color(231, 249, 253));
        chkbxDBPassword.setText("Show DB Password");
        chkbxDBPassword.setNextFocusableComponent(btnSave);
        chkbxDBPassword.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkbxDBPasswordStateChanged(evt);
            }
        });

        txtAppLicenseKey.setText("KS234-CK966-41HK7-BA823-OK276");
        txtAppLicenseKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAppLicenseKeyActionPerformed(evt);
            }
        });

        txtDBPassword.setText("1234");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDBUser, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDBName, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDBServer, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(220, 220, 220)
                            .addComponent(jLabel6))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(95, 95, 95)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(chkbxLicenseKey)
                                .addComponent(txtAppName, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                .addComponent(txtAppLicenseKey)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtAppOwner, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkbxDBPassword)
                            .addComponent(txtDBPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(125, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(197, 197, 197))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel6)
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAppName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtAppLicenseKey, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(chkbxLicenseKey)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAppOwner, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDBServer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDBName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDBUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtDBPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkbxDBPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(btnSave)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAppNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAppNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAppNameActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String AppName = txtAppName.getText(),
                AppLicenseKey = txtAppLicenseKey.getText(),
                AppOwner = txtAppOwner.getText(),
                DBServer = txtDBServer.getText(),
                DBName = txtDBName.getText(),
                DBUser = txtDBUser.getText(),
                DBPassword = txtDBPassword.getText();

        if (AppName.equals("")
                || AppLicenseKey.equals("")
                || AppOwner.equals("")
                || DBServer.equals("")
                || DBName.equals("")
                || DBUser.equals("")
                || DBPassword.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter all fields to continue!",
                    "Error", 0);
            return;
        }

        int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to save these settings?", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        switch (result) {
            case JOptionPane.YES_OPTION:
                this.setVisible(false);
                AppSetup(AppName, AppLicenseKey, AppOwner, DBServer, DBName, DBUser, DBPassword);
                break;
            case JOptionPane.NO_OPTION:
                break;
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void chkbxLicenseKeyStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkbxLicenseKeyStateChanged
        chkbxLicenseKey.addActionListener(ae -> {
            JCheckBox c = (JCheckBox) ae.getSource();
            txtAppLicenseKey.setEchoChar(c.isSelected() ? '\u0000' : (Character) UIManager.get("PasswordField.echoChar"));
        });
    }//GEN-LAST:event_chkbxLicenseKeyStateChanged

    private void txtAppOwnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAppOwnerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAppOwnerActionPerformed

    private void txtDBServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDBServerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDBServerActionPerformed

    private void txtDBNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDBNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDBNameActionPerformed

    private void txtDBUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDBUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDBUserActionPerformed

    private void chkbxDBPasswordStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkbxDBPasswordStateChanged
        chkbxDBPassword.addActionListener(ae -> {
            JCheckBox c = (JCheckBox) ae.getSource();
            txtDBPassword.setEchoChar(c.isSelected() ? '\u0000' : (Character) UIManager.get("PasswordField.echoChar"));
        });
    }//GEN-LAST:event_chkbxDBPasswordStateChanged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setLocationRelativeTo(null);
        CheckAppSetup();
    }//GEN-LAST:event_formWindowOpened

    private void chkbxLicenseKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbxLicenseKeyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkbxLicenseKeyActionPerformed

    private void txtAppLicenseKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAppLicenseKeyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAppLicenseKeyActionPerformed
    private void AppSetup(String AppName, String AppLicenseKey, String AppOwner, String DBServer, String DBName, String DBUser, String DBPassword) {
        try {
            String FileName = "AppSettings";
            File tempFile = new File(FileName + ".json");
            boolean exists = tempFile.exists();
            if (!exists) {

//                JSONObject AppSettings = new JSONObject();
//                AppSettings.put("DBServer", "kkkk");
//                AppSettings.put("DBName", "MedicalStoreDB");
//                AppSettings.put("DBUser", "sa");
//                AppSettings.put("DBPassword", "1234");
//                JSONObject DBSettings = new JSONObject();
//                AppSettings.put("AppName", "Medical Store");
//                AppSettings.put("AppLicenseKey", "KS234-CK966-41HK7-BA823-OK276");
//                AppSettings.put("AppOwner", "Bushra Barkat Shaikh");
//                JSONArray AppSettingsArray = new JSONArray();
//                AppSettingsArray.add(AppSettings);
                if (AAZAppUtils.WriteAppSettings(FileName, AppName, AppLicenseKey, AppOwner, DBServer, DBName, DBUser, DBPassword)) { // Files.WriteFile(FileName, AppSettingsArray, ManageFiles.FileTypes.JSON)
                    AAZAppUtils.OpenForm(new LoginForm(), 5000);
                }
            } else {
                AAZAppUtils.OpenForm(new LoginForm(), 5000);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,
                    "Error, something went wrong.",
                    //                    ex.getMessage(),
                    "Error", 0);
        }
    }

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
            java.util.logging.Logger.getLogger(AppSettingsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppSettingsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppSettingsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppSettingsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppSettingsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JCheckBox chkbxDBPassword;
    private javax.swing.JCheckBox chkbxLicenseKey;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txtAppLicenseKey;
    private javax.swing.JTextField txtAppName;
    private javax.swing.JTextField txtAppOwner;
    private javax.swing.JTextField txtDBName;
    private javax.swing.JPasswordField txtDBPassword;
    private javax.swing.JTextField txtDBServer;
    private javax.swing.JTextField txtDBUser;
    // End of variables declaration//GEN-END:variables

    private void InitAppComponents() {
        AAZAppUtils = new AAZAppUtils();
    }

    private void CheckAppSetup() {
        String FileName = "AppSettings";
        File tempFile = new File(FileName + ".json");
        boolean exists = tempFile.exists();
        if (exists) {
            AAZAppUtils.OpenForm(new LoginForm(), 5000);
        }
    }
}
