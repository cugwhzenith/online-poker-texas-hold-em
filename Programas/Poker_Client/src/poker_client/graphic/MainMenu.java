package poker_client.graphic;

import entities.Player;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;
import network.Checks;
import network.Connection;
import network.NetShutdownHook;
import javax.script.*;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import php.java.script.*;
import php.java.servlet.*;


/**
 * Client's MainMenu Window.
 * @author Mario Codes
 * @version 0.4 Adding the set of a random player when not login to use.
 */
public class MainMenu extends javax.swing.JFrame {
    private Player player;
    
    
    /**
     * Creates new form Main
     */
    public MainMenu() {
        initComponents();
        setLocationRelativeTo(null);
        
        player = iniPlayer();
    }

    /**
     * Doing an ini of a random player into the system. If the user does not log-in this will be the ID used.
     * @return Ini player with a random ID.
     */
    private Player iniPlayer() {
        Random random = new Random();
        String id = Integer.toString(random.nextInt(10000));
        return new Player(id);
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
        jButtonLogIn = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuAplication = new javax.swing.JMenu();
        jMenuItemSignUp = new javax.swing.JMenuItem();
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
        jButtonJoinGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonJoinGameActionPerformed(evt);
            }
        });

        jButtonLogIn.setText("Log In");
        jButtonLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogInActionPerformed(evt);
            }
        });

        jButtonExit.setText("Exit");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

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
                    .addComponent(jButtonLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jButtonLogIn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonExit)
                .addGap(12, 12, 12))
        );

        jMenuAplication.setText("Aplication");

        jMenuItemSignUp.setText("Sign Up");
        jMenuAplication.add(jMenuItemSignUp);

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

    private void outputCreateGame(int result) {
        switch(result) {
            case 1:
                JOptionPane.showConfirmDialog(rootPane, "Game created correctly.", "Result", JOptionPane.OK_CANCEL_OPTION);
                break; // todo: close this window and open the game one.
            case 0:
                JOptionPane.showConfirmDialog(rootPane, "Internal error. Please try again.", "Result", JOptionPane.OK_CANCEL_OPTION);
                break;
            case -1:
                JOptionPane.showConfirmDialog(rootPane, "Connection error. Check the server is reachable by the client.", "Result", JOptionPane.OK_CANCEL_OPTION);
                break;
            case -2:
                JOptionPane.showConfirmDialog(rootPane, "Reference contains no valid characters. Only Alphanumerics and underscore.", "Result", JOptionPane.OK_CANCEL_OPTION);
                break;    
            case -3:
                JOptionPane.showConfirmDialog(rootPane, "Number of players no valid. Only numbers 2-9.", "Result", JOptionPane.OK_CANCEL_OPTION);
                break;
            case -4:
                JOptionPane.showConfirmDialog(rootPane, "This game's reference is currently in use. Please use another one.", "Result", JOptionPane.OK_CANCEL_OPTION);
                break;
        }
    }
    
    private void createGame() {
        String ref = JOptionPane.showInputDialog("Enter the new reference of the game:");
        String numberPlayers = null;
        int result;
        
        if(ref != null) {
            numberPlayers = JOptionPane.showInputDialog("Total number of players (2-9):");
            if(numberPlayers != null) {
                result = Facade.createGame(player.getID(), ref, numberPlayers);
                outputCreateGame(result);
            }
        }
    }
    
    private void jButtonNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewGameActionPerformed
        createGame();
    }//GEN-LAST:event_jButtonNewGameActionPerformed

    private void jMenuItemOpenWebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemOpenWebActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemOpenWebActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void outputJoinGame(int result) {
        switch(result) {
            case 1:
                JOptionPane.showConfirmDialog(rootPane, "Game joined correctly.", "Result", JOptionPane.OK_CANCEL_OPTION);
                break; // todo: close this window and open the game one.
            case 0:
                JOptionPane.showConfirmDialog(rootPane, "Internal error. Please try again.", "Result", JOptionPane.OK_CANCEL_OPTION);
                break;
            case -1:
                JOptionPane.showConfirmDialog(rootPane, "Connection error. Check the server is reachable by the client.", "Result", JOptionPane.OK_CANCEL_OPTION);
                break;
            case -2:
                JOptionPane.showConfirmDialog(rootPane, "Reference contains no valid characters. Only Alphanumerics and underscore.", "Result", JOptionPane.OK_CANCEL_OPTION);
                break;    
            case -3:
                JOptionPane.showConfirmDialog(rootPane, "A game with this reference does not currently exist. You may create it.", "Result", JOptionPane.OK_CANCEL_OPTION);
                break;
            case -4:
                JOptionPane.showConfirmDialog(rootPane, "The game with this reference has already started and cannot be joined.", "Result", JOptionPane.OK_CANCEL_OPTION);
                break;
        }
    }
    
    private void joinGame() {
        String ref = JOptionPane.showInputDialog("Enter the reference of the game to join:");
        if(ref != null) {
            int result = Facade.joinGame(player.getID(), ref);
            System.out.println(result);
            outputJoinGame(result);
        }
    }
    
    private void jButtonJoinGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonJoinGameActionPerformed
        joinGame();
    }//GEN-LAST:event_jButtonJoinGameActionPerformed

    /**
     * Asking the user for the credentials to Log-In.
     * @return String[]. [1] = User, [2] = Pwd. Null = Cancelled by user.
     */
    private String[] askCredentials() {
        String[] credentials = new String[2];
        credentials[0] = JOptionPane.showInputDialog("User:");
        if(credentials[0] != null) credentials[1] = JOptionPane.showInputDialog("Password: ");
        else return null;
        
        return credentials;
    }
    
    /**
     * Log-In into the game with an username and password.
     *  The credentials will be checked by a script in my web page.
     * @return Int. 1 = correct credentials. -1 = wrong user or pwd.
     */
    private int login(String user, String pwd) {
        try {
            HttpClient httpclient = HttpClients.createDefault();
            HttpPost httppost = new HttpPost("http://mariocodes.com/php/login_java.php");

            // Request parameters and other properties.
            List<NameValuePair> params = new ArrayList<NameValuePair>(1);
            params.add(new BasicNameValuePair("username", user));
             params.add(new BasicNameValuePair("password", pwd));
            httppost.setEntity(new UrlEncodedFormEntity(params, "UTF-8"));

            //Execute and get the response.
            HttpResponse response = httpclient.execute(httppost);
            HttpEntity entity = response.getEntity();

            if (entity != null) {
                InputStream instream = entity.getContent();
                try {
                    String s = "";
                    int i;
                    while((i = instream.read()) != -1) {
                        s += (char) i;
                    }
                    
                    return Integer.parseInt(s);
                } finally {
                    instream.close();
                }
            }
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        
        return -2;
    }
    
    /**
     * Complete action to log-in a player into the system.
     * @param evt 
     */
    private void jButtonLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogInActionPerformed
        int result = -10;
        String[] credentials = askCredentials();
        if(credentials != null) result = login(credentials[0], credentials[1]);
        if(result == 1) JOptionPane.showConfirmDialog(rootPane, "Welcome Back! User Loged-In.", "Succed", JOptionPane.OK_CANCEL_OPTION);
        else JOptionPane.showConfirmDialog(rootPane, "Wrong User and / or Password.", "Failed", JOptionPane.OK_CANCEL_OPTION);
    }//GEN-LAST:event_jButtonLogInActionPerformed

    private static void round(Player o, Player a) {
        Checks.checks(o, "SU");
        Checks.checks(a, "SU");

        System.out.println("");
        int pool = o.bet("SU", 100);
        System.out.println("Pool after bet: " +pool);
        pool = a.bet("SU", 100);
        System.out.println("Pool after bet: " +pool);
        Checks.checks(o, "SU");
        Checks.checks(a, "SU");
        System.out.println("");

        pool = o.bet("SU", 100);
        System.out.println("Pool after bet: " +pool);
        pool = a.bet("SU", 100);
        System.out.println("Pool after bet: " +pool);
        Checks.checks(o, "SU");
        Checks.checks(a, "SU");
        System.out.println("");

        pool = o.bet("SU", 100);
        System.out.println("Pool after bet: " +pool);
        pool = a.bet("SU", 100);
        System.out.println("Pool after bet: " +pool);
        Checks.checks(o, "SU");
        Checks.checks(a, "SU");
        System.out.println("");
        
        
        System.out.println("");
        System.out.println("Player retired");
        o.retire("SU");
        System.out.println("");
        
        
        pool = o.bet("SU", 100);
        System.out.println("Pool after bet: " +pool);
        pool = a.bet("SU", 100);
        System.out.println("Pool after bet: " +pool);
        System.out.println("");

        o.setChips(0);
        
        Checks.checks(o, "SU");
        Checks.checks(a, "SU");

        // System.out.println("AND THE WINNER IS: " +al.get(0) +", with: " +al.get(1) +", and has won: " +al.get(2) +" chips!");
        System.out.println("");
        System.out.println("Chips of " +o.getID() +": " +o.getChips());
        System.out.println("Chips of " +a.getID() +": " +a.getChips());
        System.out.println("");
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
//                Runtime.getRuntime().addShutdownHook(new NetShutdownHook()); // todo: set it where it has to be.
                 new MainMenu().setVisible(true);
//                new GameWindow(new Player("Mario"));

//                System.out.println("Connection Opened");     
//                Player o = new Player("mario");
//                Player a = new Player("maria");
//                
//                Connection.createGame("SU", o.getID(),  2);
//                Connection.joinGame("SU", a.getID());
//                
//                round(o, a);
//                
//                try {
//                    Thread.sleep(6000);
//                } catch(InterruptedException ex) { ex.printStackTrace(); }
//                
//                // New Round.
//                System.out.println("New Round!");
//                round(o, a);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonJoinGame;
    private javax.swing.JButton jButtonLogIn;
    private javax.swing.JButton jButtonNewGame;
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
    private javax.swing.JMenuItem jMenuItemLostPassword;
    private javax.swing.JMenuItem jMenuItemOpenWeb;
    private javax.swing.JMenuItem jMenuItemSignUp;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
