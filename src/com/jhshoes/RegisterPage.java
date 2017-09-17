package com.jhshoes;

//name: narissa cooney
//date: 17 June 2017
//task: Creating register page

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.util.Random;
import javax.swing.JOptionPane;

public class RegisterPage extends javax.swing.JFrame {

    //creating JHShoes Object
    JHShoes connect = new JHShoes();
    //Creating random object for random number generator
    Random rnd = new Random();

    public RegisterPage() {
        initComponents();
        //connects to the database
        connect.connectDB();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnLogIn = new javax.swing.JButton();
        txtConfirmPassword = new javax.swing.JPasswordField();
        txtPostcode = new javax.swing.JTextField();
        lblPostcode = new javax.swing.JLabel();
        txtTown = new javax.swing.JTextField();
        lblTown = new javax.swing.JLabel();
        txtStreet = new javax.swing.JTextField();
        lblStreet = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        lblConfirmPassword = new javax.swing.JLabel();
        txtMobile = new javax.swing.JTextField();
        lblMobile = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        btnRegisterComplete = new javax.swing.JButton();
        comboBoxRole = new javax.swing.JComboBox<>();
        txtPassword = new javax.swing.JPasswordField();
        txtEmail = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtTelephone = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        lblTelephone = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lblFirstName = new javax.swing.JLabel();
        lblBackGround2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(710, 410));
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        btnLogIn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnLogIn.setText("Log In");
        btnLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogInActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogIn);
        btnLogIn.setBounds(540, 350, 101, 30);
        jPanel1.add(txtConfirmPassword);
        txtConfirmPassword.setBounds(200, 340, 280, 30);
        jPanel1.add(txtPostcode);
        txtPostcode.setBounds(200, 130, 280, 26);

        lblPostcode.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblPostcode.setText("Postcode");
        jPanel1.add(lblPostcode);
        lblPostcode.setBounds(10, 130, 100, 22);

        txtTown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTownActionPerformed(evt);
            }
        });
        jPanel1.add(txtTown);
        txtTown.setBounds(200, 100, 280, 30);

        lblTown.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblTown.setText("Town");
        jPanel1.add(lblTown);
        lblTown.setBounds(10, 100, 80, 20);
        jPanel1.add(txtStreet);
        txtStreet.setBounds(200, 70, 280, 30);

        lblStreet.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblStreet.setText("Street");
        jPanel1.add(lblStreet);
        lblStreet.setBounds(10, 70, 80, 22);
        jPanel1.add(txtUsername);
        txtUsername.setBounds(200, 250, 280, 30);

        lblUsername.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblUsername.setText("Username");
        jPanel1.add(lblUsername);
        lblUsername.setBounds(10, 250, 120, 22);

        lblConfirmPassword.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblConfirmPassword.setText("Confirm Password");
        jPanel1.add(lblConfirmPassword);
        lblConfirmPassword.setBounds(10, 342, 180, 20);
        jPanel1.add(txtMobile);
        txtMobile.setBounds(200, 220, 280, 30);

        lblMobile.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblMobile.setText("Mobile");
        jPanel1.add(lblMobile);
        lblMobile.setBounds(10, 230, 80, 22);

        lblRole.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblRole.setText("Role");
        jPanel1.add(lblRole);
        lblRole.setBounds(10, 170, 45, 16);

        btnRegisterComplete.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnRegisterComplete.setText("Confirm Registration");
        btnRegisterComplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterCompleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegisterComplete);
        btnRegisterComplete.setBounds(480, 320, 200, 29);

        comboBoxRole.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        comboBoxRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customer", "Admin" }));
        jPanel1.add(comboBoxRole);
        comboBoxRole.setBounds(200, 160, 140, 27);
        jPanel1.add(txtPassword);
        txtPassword.setBounds(200, 310, 280, 30);

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel1.add(txtEmail);
        txtEmail.setBounds(200, 280, 280, 30);

        lblEmail.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblEmail.setText("Email");
        jPanel1.add(lblEmail);
        lblEmail.setBounds(10, 290, 100, 20);

        txtTelephone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelephoneActionPerformed(evt);
            }
        });
        jPanel1.add(txtTelephone);
        txtTelephone.setBounds(200, 190, 280, 30);
        jPanel1.add(txtLastName);
        txtLastName.setBounds(200, 40, 280, 30);

        lblPassword.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblPassword.setText("Password");
        jPanel1.add(lblPassword);
        lblPassword.setBounds(10, 320, 100, 22);

        lblTelephone.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblTelephone.setText("Telephone");
        jPanel1.add(lblTelephone);
        lblTelephone.setBounds(10, 200, 110, 22);

        lblLastName.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblLastName.setText("Last Name");
        jPanel1.add(lblLastName);
        lblLastName.setBounds(10, 40, 110, 22);

        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtFirstName);
        txtFirstName.setBounds(200, 10, 280, 30);

        lblFirstName.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblFirstName.setText("First Name");
        jPanel1.add(lblFirstName);
        lblFirstName.setBounds(10, 10, 130, 30);

        lblBackGround2.setIcon(new javax.swing.ImageIcon("/Users/narissacooney/Downloads/2015_asics_aw15_run_men_kayano_01a_lr_0.jpg")); // NOI18N
        lblBackGround2.setText("jLabel2");
        jPanel1.add(lblBackGround2);
        lblBackGround2.setBounds(0, 0, 740, 450);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 740, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterCompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterCompleteActionPerformed
        //creating new customer object   
        Customer customer = new Customer();

        //if password and confirmed password matches, pull information provided by user and insert into database
        if (txtPassword.getText().equals(txtConfirmPassword.getText())) {
            //pulling customer information from Register Page
            customer.setFirstName(txtFirstName.getText());
            customer.setLastName(txtLastName.getText());
            customer.setEmail(txtEmail.getText());
            customer.setTelephoneNumber(txtTelephone.getText());
            customer.setMobileNumber(txtMobile.getText());
            customer.setStreet(txtStreet.getText());
            customer.setTown(txtTown.getText());
            customer.setPostcode(txtPostcode.getText());
            customer.setUsername(txtUsername.getText());
            customer.setPassword(txtPassword.getText());
            customer.setConfirmPassword(txtConfirmPassword.getText());
            customer.setCustomerID(String.valueOf(rnd.nextInt(9000)));

            //Store customer details into CUSTOMER database.
            String input = ("CUSTOMER(CUSTOMERID, FIRSTNAME, LASTNAME, STREET, TOWN, POSTCODE, TELEPHONENUMBER, EMAIL, MOBILENUMBER, USERNAME, PASSWORD)");

            //sets string values
            String values = ("'" + customer.getCustomerID() + "', '"
                    + customer.getFirstName() + "', '"
                    + customer.getLastName() + "', '"
                    + customer.getStreet() + "', '"
                    + customer.getTown() + "', '"
                    + customer.getPostcode() + "', '"
                    + customer.getTelephoneNumber() + "', '"
                    + customer.getEmail() + "', '"
                    + customer.getMobileNumber() + "', '"
                    + customer.getUsername() + "', '"
                    + customer.getPassword() + "'");

            //writing customer information to the database
            connect.writeDB(input, values);

            //Clears all fields once created user
            txtFirstName.setText("");
            txtLastName.setText("");
            txtEmail.setText("");
            txtTelephone.setText("");
            txtMobile.setText("");
            txtStreet.setText("");
            txtTown.setText("");
            txtPostcode.setText("");
            txtPassword.setText("");
            txtConfirmPassword.setText("");
            txtUsername.setText("");

        } else //If passwords do not match, user will be prompted to re-enter
        {
            txtPassword.setText("");
            txtConfirmPassword.setText("");
            JOptionPane.showMessageDialog(null, "Passwords do not match" + " please re-enter your chosen password");
        }


    }//GEN-LAST:event_btnRegisterCompleteActionPerformed

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed

    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void txtTelephoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelephoneActionPerformed

    }//GEN-LAST:event_txtTelephoneActionPerformed

    private void txtTownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTownActionPerformed

    }//GEN-LAST:event_txtTownActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed

    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogInActionPerformed
        //once log in button is selected, page will be closed and user will be directed to welcome page
        SystemInterface s = new SystemInterface();
        s.setVisible(true);
        RegisterPage.super.setVisible(false);
    }//GEN-LAST:event_btnLogInActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogIn;
    private javax.swing.JButton btnRegisterComplete;
    private javax.swing.JComboBox<String> comboBoxRole;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBackGround2;
    private javax.swing.JLabel lblConfirmPassword;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblMobile;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPostcode;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblStreet;
    private javax.swing.JLabel lblTelephone;
    private javax.swing.JLabel lblTown;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPostcode;
    private javax.swing.JTextField txtStreet;
    private javax.swing.JTextField txtTelephone;
    private javax.swing.JTextField txtTown;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    //method to close current window and open new window
    private void close() {
        WindowEvent winClosing = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosing);
    }

}
