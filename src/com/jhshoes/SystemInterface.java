package com.jhshoes;

//name: Narissa Cooney
//date: 05 June 2017
//task: creating Log In page for user

import com.jhshoes.WelcomePage;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class SystemInterface extends javax.swing.JFrame {
    
    //creating object JHShoes
    JHShoes app = new JHShoes();

    public SystemInterface() {
        initComponents();
        //method to connect to the database
        app.connectDB();
        
       
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        checkBoxPassword = new javax.swing.JCheckBox();
        lblShoes = new javax.swing.JLabel();
        lblInfo = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnRegister = new javax.swing.JButton();
        lblPassword = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        btnLogIn = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(713, 433));
        getContentPane().setLayout(null);

        jPanel2.setLayout(null);

        checkBoxPassword.setText("Show Password");
        checkBoxPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxPasswordActionPerformed(evt);
            }
        });
        jPanel2.add(checkBoxPassword);
        checkBoxPassword.setBounds(200, 350, 140, 23);

        lblShoes.setFont(new java.awt.Font("STFangsong", 1, 48)); // NOI18N
        lblShoes.setText("JH Shoes");
        jPanel2.add(lblShoes);
        lblShoes.setBounds(490, 20, 240, 70);

        lblInfo.setFont(new java.awt.Font("Zapfino", 0, 13)); // NOI18N
        lblInfo.setText("specialising in training wear");
        jPanel2.add(lblInfo);
        lblInfo.setBounds(480, 80, 220, 40);
        jPanel2.add(txtPassword);
        txtPassword.setBounds(150, 310, 230, 40);

        btnRegister.setBackground(new java.awt.Color(255, 255, 255));
        btnRegister.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegister);
        btnRegister.setBounds(260, 380, 97, 29);

        lblPassword.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblPassword.setText("Password:");
        lblPassword.setToolTipText("");
        jPanel2.add(lblPassword);
        lblPassword.setBounds(30, 320, 110, 20);

        btnCancel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancel);
        btnCancel.setBounds(600, 370, 90, 30);

        lblUsername.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblUsername.setText("Username:");
        jPanel2.add(lblUsername);
        lblUsername.setBounds(30, 270, 100, 30);

        txtUsername.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jPanel2.add(txtUsername);
        txtUsername.setBounds(150, 260, 230, 40);

        btnLogIn.setBackground(new java.awt.Color(255, 255, 255));
        btnLogIn.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnLogIn.setText("Log In");
        btnLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogInActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogIn);
        btnLogIn.setBounds(170, 380, 80, 30);

        background.setIcon(new javax.swing.ImageIcon("/Users/narissacooney/Downloads/2015_asics_aw15_run_men_kayano_01a_lr_0.jpg")); // NOI18N
        jPanel2.add(background);
        background.setBounds(0, 0, 710, 440);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 710, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogInActionPerformed
        boolean valid = false;
        
        try{ 
                //connecting to the database using url
                Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/JHShoes", "narissa", "narissa");
                Statement stmt = con.createStatement();
                
                //selecting all information from the customer table in the database
                ResultSet rs = stmt.executeQuery("SELECT * from CUSTOMER");
                //looking for result that equals username and password
                while (rs.next())
                {
                    //getting username and password input from the user interface
                    String username = (rs.getString("Username"));
                    String password = (rs.getString("Password"));
                    
                    //checking passwords match in both 'password' and 'confirm password' fields in Log In UI
                    if (username.equalsIgnoreCase(txtUsername.getText()) && password.matches(txtPassword.getText()))
                    {   
                        valid = true;
                        //if passwords match and are correct, user will be logged into the system
                        JOptionPane.showMessageDialog(null, "Welcome to JHShoes " + username + " .");
                        //clears username and password fields once successful log in 
                        txtPassword.setText("");
                        txtUsername.setText("");
                        //closes current UI and opens Welcome Page
                        close();
                        //Creating welcome page object and stores Customer ID
                        WelcomePage w = new WelcomePage(rs.getString("CUSTOMERID"));
                        //sets the Welcome Page as visible 
                        w.setVisible(true);
                        break;
                    } 
                  }
                    //if username and password do not match, user will be notified to try again
                   if(!valid)
                  
                  {     //*****doesnt show on UI***** 
                        JOptionPane.showMessageDialog(null, "Incorrect, please enter valid username and password", "\n Try Again", JOptionPane.ERROR_MESSAGE);
                        txtPassword.setText("");
                        txtUsername.setText("");
                    }

                }
                    //if incorrect, database will not be updated and user will be prompted with an error message
                    catch(SQLException e)
                    {
                        JOptionPane.showMessageDialog(null, "SQL Exception occurred" + e);
                    }

    }//GEN-LAST:event_btnLogInActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        close();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void checkBoxPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxPasswordActionPerformed
       //check box reveals password ** to show user password
        if (checkBoxPassword.isSelected())
        {
            txtPassword.setEchoChar((char)0);
        }
        else
        {   //hides password using *
            txtPassword.setEchoChar('*');
            
        }
    }//GEN-LAST:event_checkBoxPasswordActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
            
            //User can select to register, which will then re-direct them to the Register UI
            close();
            RegisterPage p = new RegisterPage();
            p.setVisible(true);
    }//GEN-LAST:event_btnRegisterActionPerformed

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
            java.util.logging.Logger.getLogger(SystemInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SystemInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SystemInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SystemInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SystemInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnLogIn;
    private javax.swing.JButton btnRegister;
    private javax.swing.JCheckBox checkBoxPassword;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblShoes;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    //creating close method
    private void close()
    {
        WindowEvent winClosing = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosing);
    }







}
