
package timetrack.gui;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author roxxu
 */
public class LoginGUI extends javax.swing.JFrame {
    
    PreparedStatement pstat;
    ResultSet rs;
    
    GUIMethods guiM = new GUIMethods();
    //Kallar på metoden som förbereder uppkopplingen till MySQL servern
    Connection cn = guiM.prepareDBConnection();
    
    public LoginGUI() {
        
        initComponents();
        loginButton.setVisible(false);
        this.setTitle("LOGIN");
        //Placerar fönstret i mitten av skärmen (ska göra innan setvisible)
        this.setLocationRelativeTo(null);
    }
    
    //Loginmetod som kallas på från main direkt när programmet startar
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginPanel = new MotionPanel(this);
        jPanel1 = new javax.swing.JPanel();
        titleLable = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        emailLabel = new javax.swing.JLabel();
        passLabel = new javax.swing.JLabel();
        emailInput = new javax.swing.JTextField();
        passField = new javax.swing.JPasswordField();
        userLogin = new javax.swing.JLabel();
        loginLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginPanel.setBackground(new java.awt.Color(74, 88, 117));
        loginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(47, 66, 84));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleLable.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        titleLable.setForeground(new java.awt.Color(255, 255, 255));
        titleLable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLable.setText("TT");
        jPanel1.add(titleLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 330, 50));

        loginPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 70));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        emailLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(47, 66, 84));
        emailLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emailLabel.setText("ANVÄNDARNAMN");
        jPanel2.add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 330, 30));

        passLabel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        passLabel.setForeground(new java.awt.Color(47, 66, 84));
        passLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passLabel.setText("LÖSENORD");
        jPanel2.add(passLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 330, 30));

        emailInput.setForeground(new java.awt.Color(47, 66, 84));
        emailInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        emailInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailInputActionPerformed(evt);
            }
        });
        jPanel2.add(emailInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 330, 30));

        passField.setForeground(new java.awt.Color(47, 66, 84));
        passField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passFieldActionPerformed(evt);
            }
        });
        jPanel2.add(passField, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 330, 30));

        userLogin.setFont(new java.awt.Font("SansSerif", 1, 8)); // NOI18N
        userLogin.setForeground(new java.awt.Color(47, 66, 84));
        userLogin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        userLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userLoginMouseClicked(evt);
            }
        });
        jPanel2.add(userLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 30, 30));

        loginLabel.setFont(new java.awt.Font("SansSerif", 1, 8)); // NOI18N
        loginLabel.setForeground(new java.awt.Color(47, 66, 84));
        loginLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        loginLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginLabelMouseClicked(evt);
            }
        });
        jPanel2.add(loginLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 30, 30));

        jPanel3.setBackground(new java.awt.Color(92, 126, 162));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel3MouseExited(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("LOGGA IN");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 330, 30));

        jPanel4.setBackground(new java.awt.Color(92, 126, 162));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel4MouseExited(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("AVSLUTA");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 0, 330, 30));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 330, 30));

        loginButton.setBackground(new java.awt.Color(47, 66, 84));
        loginButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Logga in");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        jPanel2.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 40, 10));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 8)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(47, 66, 84));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Copyright ©  Team Blue - All rights reserved");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 330, 20));

        loginPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 330, 270));

        getContentPane().add(loginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Kommer hit om användaren trycker "ENTER" i textrutan.
    //Tangenten "enter" räknas som en action och det räcker därför med att bara
    //ha en actionListener.
    private void passFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passFieldActionPerformed
        //Kallar på metoden loginButtonActionPerformed() som är samma
        //som när användaren trycker på OK vid inloggning.
        loginButtonActionPerformed(evt);
    }//GEN-LAST:event_passFieldActionPerformed
    
    //Kommer hit om användaren trycker "ENTER" i textrutan.
    //Tangenten "enter" räknas som en action och det räcker därför med att bara
    //ha en actionListener.
    private void emailInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailInputActionPerformed
        //Kallar på metoden loginButtonActionPerformed() som är samma
        //som när användaren trycker på OK vid inloggning.
        loginButtonActionPerformed(evt);
    }//GEN-LAST:event_emailInputActionPerformed

    private void loginLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginLabelMouseClicked
        startTimeTrack(6);
    }//GEN-LAST:event_loginLabelMouseClicked

    private void userLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userLoginMouseClicked
        startTimeTrack(2);
    }//GEN-LAST:event_userLoginMouseClicked

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        //Hämtar inmatningarna i textfälten
        String email = emailInput.getText();
        String pass = passField.getText();

        //If-satsen anropar metoden loginUser och skickar med email och pass från textfälten
        //Metoden kommer returnera en int med användarens ID, som lagras i userID.
        //Om användare + lösenord är fel eller inte finns så returneras 0.
        int userID = loginUser(email,pass);

        if(userID > 0){
            //Kallar på metoden som ska starta huvudprogrammet och skickar med
            //inloogad användares userID (från databasen)
            startTimeTrack(userID);
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered
        jPanel3.setBackground(new java.awt.Color(47,66,84));
    }//GEN-LAST:event_jPanel3MouseEntered

    private void jPanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseEntered
        jPanel4.setBackground(new java.awt.Color(47,66,84));
    }//GEN-LAST:event_jPanel4MouseEntered

    private void jPanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseExited
        jPanel3.setBackground(new java.awt.Color(92,126,162));
    }//GEN-LAST:event_jPanel3MouseExited

    private void jPanel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseExited
        jPanel4.setBackground(new java.awt.Color(92,126,162));
    }//GEN-LAST:event_jPanel4MouseExited

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        //Hämtar inmatningarna i textfälten
        String email = emailInput.getText();
        String pass = passField.getText();

        //If-satsen anropar metoden loginUser och skickar med email och pass från textfälten
        //Metoden kommer returnera en int med användarens ID, som lagras i userID.
        //Om användare + lösenord är fel eller inte finns så returneras 0.
        int userID = loginUser(email,pass);

        if(userID > 0){
            //Kallar på metoden som ska starta huvudprogrammet och skickar med
            //inloogad användares userID (från databasen)
            startTimeTrack(userID);
        }
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        this.dispose();
    }//GEN-LAST:event_jPanel4MouseClicked

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
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginGUI().setVisible(true);
            }
        });
        
    }
    private int loginUser(String email, String pass1){
        String qEmail = email;
        String qPass = pass1;
        //returnUserID som kommer att returnera UserID från databasen om användarnamn + lösenord matchar
        //Annars är den default 0 och returnerar då 0.
        int returnUserID = 0;
        try {
            //Ökar timeout till 5 sekunder
            DriverManager.setLoginTimeout(5);
            //Skapar ett SELECT statement till PreparedStatement objekt
            pstat = cn.prepareStatement("SELECT * FROM users WHERE email=? AND BINARY user_password=?");
            //Ändrar value-parametrar till texten i text-fälten.
            pstat.setString(1, qEmail);
            pstat.setString(2, qPass);
            //Utför SQL kommand
            rs = pstat.executeQuery();
            //Kollar om det finns MINST en rad från select statement (while hade kollat alla)
            if(rs.next()){
                //sparar värdet från första kolumnen (userID) från Select statemant.
                returnUserID = rs.getInt(1);
            }
            //Om ingen rad returneras från select statemant så betyder det att kombinationen
            //av användarnamn och lösenord ej hittades i databasen och då körs istället else.
            else{
                JOptionPane.showMessageDialog(null, "Felaktigt användarnamn/lösenord", "Ej behörig!", 0);
            }
            //Stänger kopplingen till databasen så att inte
            //max antal användare för databasen ska överskridas.
            cn.close();
        //Om något går fel med kopplingen till databasen... (kommer även hit om felaktigt select statement används osv.
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Kunde inte ansluta till databasen.\nKontrollera att du är ansluten till internet.", "Är du online?", 0);
            System.out.println(ex);
        }
        //Returnerar userID (från databasen)
        //Om login misslyckades så returneras 0.
        return returnUserID;
    }
    
    private void startTimeTrack(int userID){
        
        TimeTrackGUI tGUI = new TimeTrackGUI();
        //Sätter inloggad användare till userID (från databasen)
        tGUI.setUserID(userID);
        //Placerar objeketet i mitten på användarens skärm
        tGUI.setLocationRelativeTo(null);
        tGUI.setVisible(true);
        this.dispose();
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailInput;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPasswordField passField;
    private javax.swing.JLabel passLabel;
    private javax.swing.JLabel titleLable;
    private javax.swing.JLabel userLogin;
    // End of variables declaration//GEN-END:variables
}
