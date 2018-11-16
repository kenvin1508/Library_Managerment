package ui;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author votungnghia
 */
public class LoginJF extends javax.swing.JFrame {

    /**
     * Creates new form
     */
    private Timer time;
    private String user, password;

    public LoginJF() {
        initComponents();
        setLocationRelativeTo(this);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                if (JOptionPane.showConfirmDialog(null,
                        "Are you sure to close this window?", "Really Closing?",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                    dispose();
//                    Index in = new Index();
//                    in.setVisible(true);
                }
            }
        });

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
        login = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jTFName = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPFpass = new javax.swing.JPasswordField();
        jBLogin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        loader = new javax.swing.JPanel();
        image_loader = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.CardLayout());

        login.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)), "Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24), new java.awt.Color(255, 0, 51))); // NOI18N

        jTFName.setForeground(new java.awt.Color(102, 102, 102));
        jTFName.setText("Tên đăng nhập");
        jTFName.setBorder(null);
        jTFName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTFNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFNameFocusLost(evt);
            }
        });
        jTFName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNameActionPerformed(evt);
            }
        });
        jTFName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFNameKeyTyped(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(41, 168, 73));

        jSeparator2.setForeground(new java.awt.Color(41, 168, 73));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/user.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/passwd.png"))); // NOI18N

        jPFpass.setBorder(null);
        jPFpass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPFpassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPFpassFocusLost(evt);
            }
        });
        jPFpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPFpassKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPFpassKeyTyped(evt);
            }
        });

        jBLogin.setBackground(new java.awt.Color(51, 255, 0));
        jBLogin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jBLogin.setText("Login");
        jBLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLoginActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Books_70px.png"))); // NOI18N

        jLabel6.setText("Fogot Password Click Here ....");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(10, 10, 10)
                                .addComponent(jTFName, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPFpass, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTFName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jPFpass, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addComponent(jBLogin)))
                .addGap(85, 85, 85))
        );

        jLabel5.setText("LibraryManage (C) 2018");

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(login, "card2");

        loader.setBackground(new java.awt.Color(255, 255, 255));

        image_loader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/load.gif"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(41, 168, 73));
        jLabel1.setText("Loggin in...");

        javax.swing.GroupLayout loaderLayout = new javax.swing.GroupLayout(loader);
        loader.setLayout(loaderLayout);
        loaderLayout.setHorizontalGroup(
            loaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loaderLayout.createSequentialGroup()
                .addContainerGap(145, Short.MAX_VALUE)
                .addGroup(loaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(image_loader)
                    .addGroup(loaderLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(158, 158, 158))
        );
        loaderLayout.setVerticalGroup(
            loaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loaderLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(image_loader, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jPanel2.add(loader, "card3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFNameFocusGained

        if (jTFName.getText().equals("Tên đăng nhập")) {
            jTFName.setText("");
            jTFName.setForeground(Color.BLACK);

        }
    }//GEN-LAST:event_jTFNameFocusGained

    private void jPFpassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPFpassFocusGained
        password = String.valueOf(jPFpass.getPassword());
        if (password.equals("Mật khẩu")) {
            jPFpass.setText("");
            jPFpass.setForeground(Color.BLACK);
            jPFpass.setEchoChar('*');
        }

    }//GEN-LAST:event_jPFpassFocusGained

    private void jBLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLoginActionPerformed
        checkPass();
    }//GEN-LAST:event_jBLoginActionPerformed

    private void jPFpassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPFpassKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            checkPass();
        }
    }//GEN-LAST:event_jPFpassKeyPressed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        JOptionPane.showMessageDialog(null, " Contact with Administrator :)  ");
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jTFNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFNameFocusLost
        if (jTFName.getText().isEmpty()) {
            jTFName.setForeground(Color.GRAY);
            jTFName.setText("Tên đăng nhập");
        }

    }//GEN-LAST:event_jTFNameFocusLost

    private void jPFpassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPFpassFocusLost

        password = String.valueOf(jPFpass.getPassword());
        if (password.isEmpty()) {;
            jPFpass.setForeground(Color.GRAY);
            jPFpass.setText("Mật khẩu");
            jPFpass.setEchoChar((char) 0);
        }
    }//GEN-LAST:event_jPFpassFocusLost

    private void jTFNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNameActionPerformed

    private void jTFNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFNameKeyTyped
      onlyNumberAndAlpha(evt);
    }//GEN-LAST:event_jTFNameKeyTyped

    private void jPFpassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPFpassKeyTyped
        onlyNumberAndAlpha(evt);
    }//GEN-LAST:event_jPFpassKeyTyped
   public void onlyNumberAndAlpha(KeyEvent evt) {
        char c = evt.getKeyChar();
        if (!(Character.isAlphabetic(c)) && !(Character.isDigit(c)) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) {
            evt.consume();
        }
    }
    public void checkPass() {
        password = String.valueOf(jPFpass.getPassword());
        user = jTFName.getText();
        if (password.equals("") || password.equals("jPasswordField1")||password.equals("Mật khẩu")) {
            JOptionPane.showMessageDialog(null, " Password is null ");
        } else if (user.equals("")||user.equals("Tên đăng nhập")) {
            JOptionPane.showMessageDialog(null, " User is null ");
        } else {
            Thread thread;
            thread = new Thread() {
                @Override
                public void run() {
                    Main main = new Main();
                    main.checkLogin(user, password);
                      dispose();
//                        loader.setVisible(true);
//                        Thread.sleep(1000);
//                        dispose();
                }

            };

            thread.start();

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
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(LoginJF.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new LoginJF().setVisible(true);

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel image_loader;
    private javax.swing.JButton jBLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jPFpass;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTFName;
    private javax.swing.JPanel loader;
    private javax.swing.JPanel login;
    // End of variables declaration//GEN-END:variables
}