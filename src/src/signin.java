/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author allen
 */
public class signin extends javax.swing.JFrame {

    /**
     * Creates new form signin
     */
    public signin() {
        initComponents();
    }

//    void startTimer(int milliseconds) {
//        Timer timer = new Timer (milliseconds, (e) -> {
//            JOptionPane.getRootFrame().dispose();
//        });
//        timer.setRepeats(false);
//        timer.start();
//    }
    private boolean validateCredentials(String username, String password) {
        try ( BufferedReader reader = new BufferedReader(new FileReader(accStorage.getfilepath()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                String savedId = data[0].trim();
                String savedUsername = data[1].trim();
                String savedPassword = data[2].trim();
                if (username.equals(savedUsername) && password.equals(savedPassword)) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
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
        signinlabel = new javax.swing.JLabel();
        usernamelabel = new javax.swing.JLabel();
        usernamefield = new javax.swing.JTextField();
        passwordlabel = new javax.swing.JLabel();
        passwordfield = new javax.swing.JPasswordField();
        loginbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 300));

        signinlabel.setFont(new java.awt.Font("Helvetica Neue", 0, 48)); // NOI18N
        signinlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signinlabel.setText("Sign In");

        usernamelabel.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        usernamelabel.setText("Username:");

        usernamefield.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N

        passwordlabel.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        passwordlabel.setText("Password:");

        passwordfield.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N

        loginbutton.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        loginbutton.setText("Login");
        loginbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(passwordfield, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(passwordlabel, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(usernamefield, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(usernamelabel, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(signinlabel, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(loginbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(signinlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernamelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernamefield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordfield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(400, 328));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbuttonActionPerformed
        // TODO add your handling code here:
        String admin = "admin";
        String adminpass = "admin";
        String usercheck = usernamefield.getText();
        String passcheck = passwordfield.getText();
        if (usernamefield.getText().equals(admin) && passwordfield.getText().equals(adminpass)) {
            JOptionPane.showMessageDialog(null, "Logged In..", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
            dispose();
            dashboard dashboard = new dashboard();
            dashboard.addproductbutton.setEnabled(true);
            dashboard.addaccountbutton.setEnabled(true);
            dashboard.setVisible(true);
        } else if (validateCredentials(usercheck, passcheck)) {
            JOptionPane.showMessageDialog(null, "Logged In..", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
            dispose();
            dashboard dashboard = new dashboard();
            dashboard.setVisible(true);
        } else if (!usercheck.equals(register.username) && passcheck.equals(register.password)) {
            JOptionPane.showMessageDialog(null, "Invalid Username", "Login Failed", JOptionPane.ERROR_MESSAGE);
        } else if (usercheck.equals(register.username) && !passcheck.equals(register.password)) {
            JOptionPane.showMessageDialog(null, "Invalid Password", "Login Failed", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Invalid Username and Password", "Login Failed", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_loginbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(signin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginbutton;
    private javax.swing.JPasswordField passwordfield;
    private javax.swing.JLabel passwordlabel;
    private javax.swing.JLabel signinlabel;
    private javax.swing.JTextField usernamefield;
    private javax.swing.JLabel usernamelabel;
    // End of variables declaration//GEN-END:variables
}
