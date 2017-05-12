package poker_client.graphic;

import entities.Player;
import network.Check;
import network.Connection;

/*
* TODOs:
* Set the client so it asks for IP and Port on login.
* I leave everything related to users and the web to when I've mine uploaded and on the Internet.
*/

/**
 * Client's MainMenu Window.
 * @author Mario Codes Sánchez
 * @version 0.0.1 Just created, setting basics.
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public MainMenu() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabelUserChange = new javax.swing.JLabel();
        jLabelUser = new javax.swing.JLabel();
        jLabelLogo = new javax.swing.JLabel();
        jButtonNewGame = new javax.swing.JButton();
        jButtonJoinGame = new javax.swing.JButton();
        jButtonSignUp = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuAplication = new javax.swing.JMenu();
        jMenuItemLogIn = new javax.swing.JMenuItem();
        jMenuItemLostPassword = new javax.swing.JMenuItem();
        jMenuItemOpenWeb = new javax.swing.JMenuItem();
        jMenuConfiguration = new javax.swing.JMenu();
        jMenuHelp = new javax.swing.JMenu();
        jMenuItemLearnPlay = new javax.swing.JMenuItem();
        jMenuItemDocumentation = new javax.swing.JMenuItem();
        jMenuItemAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelUserChange.setText("Guest");

        jLabelUser.setText("User:");

        jButtonNewGame.setText("New Game");
        jButtonNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewGameActionPerformed(evt);
            }
        });

        jButtonJoinGame.setText("Join Existing Game");

        jButtonSignUp.setText("Sign Up");

        jButtonExit.setText("Exit");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelUserChange)
                .addGap(28, 28, 28))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonJoinGame, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNewGame, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUserChange)
                    .addComponent(jLabelUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButtonNewGame)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonJoinGame)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSignUp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonExit)
                .addGap(12, 12, 12))
        );

        jMenuAplication.setText("Aplication");

        jMenuItemLogIn.setText("Log In");
        jMenuAplication.add(jMenuItemLogIn);

        jMenuItemLostPassword.setText("Lost Password");
        jMenuAplication.add(jMenuItemLostPassword);

        jMenuItemOpenWeb.setText("Open Web");
        jMenuItemOpenWeb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemOpenWebActionPerformed(evt);
            }
        });
        jMenuAplication.add(jMenuItemOpenWeb);

        jMenuBar1.add(jMenuAplication);

        jMenuConfiguration.setText("Config");
        jMenuBar1.add(jMenuConfiguration);

        jMenuHelp.setText("Help");

        jMenuItemLearnPlay.setText("Learn to Play");
        jMenuHelp.add(jMenuItemLearnPlay);

        jMenuItemDocumentation.setText("Documentation");
        jMenuHelp.add(jMenuItemDocumentation);

        jMenuItemAbout.setText("About...");
        jMenuHelp.add(jMenuItemAbout);

        jMenuBar1.add(jMenuHelp);

        setJMenuBar(jMenuBar1);

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

    private void jButtonNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewGameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNewGameActionPerformed

    private void jMenuItemOpenWebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemOpenWebActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemOpenWebActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // new MainMenu().setVisible(true);
                System.out.println("Connection Opened");     
                Player p = new Player("mario");
                
                boolean result = Connection.createGame("SU", "SHI",  2);
                System.out.println("Result is: " +result);
                
                result = Connection.joinGame("SU", "MARIO");
                System.out.println("Result is: " +result);
                
                Runnable t = () -> { Check.checks(p, "SU");};
                
                while(true) {
                    try {
                        new Thread(t).start();
                        Thread.sleep(5000);
                    } catch(InterruptedException ex) { ex.printStackTrace(); }
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonJoinGame;
    private javax.swing.JButton jButtonNewGame;
    private javax.swing.JButton jButtonSignUp;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JLabel jLabelUserChange;
    private javax.swing.JMenu jMenuAplication;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuConfiguration;
    private javax.swing.JMenu jMenuHelp;
    private javax.swing.JMenuItem jMenuItemAbout;
    private javax.swing.JMenuItem jMenuItemDocumentation;
    private javax.swing.JMenuItem jMenuItemLearnPlay;
    private javax.swing.JMenuItem jMenuItemLogIn;
    private javax.swing.JMenuItem jMenuItemLostPassword;
    private javax.swing.JMenuItem jMenuItemOpenWeb;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
