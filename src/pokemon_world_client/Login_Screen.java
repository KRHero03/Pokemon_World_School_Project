/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.1015229
 */
package pokemon_world_client;

import java.awt.*;
import java.io.InputStream;
import java.net.URI;
import java.sql.*;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import sun.audio.AudioData;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import sun.audio.ContinuousAudioDataStream;

public class Login_Screen extends javax.swing.JFrame {

    public Login_Screen() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pokemon World Beta");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("Resources/Graphics/Icons/icon.png")).getImage());
        setUndecorated(true);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setBackground(new Color(0f,0f,0f,0f));
        jLabel12.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("NO UPDATES");
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 210, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, 210, 140));

        jPasswordField1.setBackground(new Color(1f,0.5f,0.5f,0.5f));
        jPasswordField1.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        jPasswordField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPasswordField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPasswordField1.setEchoChar('•');
        jPasswordField1.setSelectionColor(new Color(255,50,50));
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 270, 20));

        jTextField2.setBackground(new Color(1f,0.5f,0.5f,0.5f));
        jTextField2.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField2.setSelectionColor(new Color(255,50,50));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 335, 270, 20));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon_world_client/Resources/Graphics/Miscellaneous/Logo/Logo_500_200.gif"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon_world_client/Resources/Graphics/Buttons/Register.png"))); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MouseExited(evt);
            }
        });
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon_world_client/Resources/Graphics/Buttons/Login.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
        });
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon_world_client/Resources/Graphics/Miscellaneous/Login_Screen_Social/Twitter_icon.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon_world_client/Resources/Graphics/Miscellaneous/Login_Screen_Social/Instagram_icon.png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon_world_client/Resources/Graphics/Miscellaneous/Login_Screen_Social/Facebook_icon.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon_world_client/Resources/Graphics/Miscellaneous/Login_Screen_Menu.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon_world_client/Resources/Graphics/Miscellaneous/Login_Screen_Name.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon_world_client/Resources/Graphics/Buttons/Minimize.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon_world_client/Resources/Graphics/Buttons/Exit.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(745, 0, 60, -1));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new Color(255,0,0,150));
        jTextField1.setAutoscrolls(false);
        jTextField1.setBorder(null);
        jTextField1.setFocusable(false);
        jTextField1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jTextField1MouseDragged(evt);
            }
        });
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField1MousePressed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon_world_client/Resources/Graphics/Backgrounds/Login_Screen.gif"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setSize(new java.awt.Dimension(800, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    static String Username = "", Password = "";
    int posX = 0, posY = 0;
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        music();
        scroll_updates();
    }//GEN-LAST:event_formWindowOpened

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        posX = evt.getX();
        posY = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        this.setLocation(evt.getXOnScreen() - posX, evt.getYOnScreen() - posY);
    }//GEN-LAST:event_formMouseDragged

    private void jTextField1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseDragged
        this.setLocation(evt.getXOnScreen() - posX, evt.getYOnScreen() - posY);
    }//GEN-LAST:event_jTextField1MouseDragged

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked

    }//GEN-LAST:event_jTextField1MouseClicked

    private void jTextField1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MousePressed
        posX = evt.getX();
        posY = evt.getY();
    }//GEN-LAST:event_jTextField1MousePressed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        sound_effect("Resources/Music/Small Sound Effects/Click.wav");
        this.setState(1);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        sound_effect("Resources/Music/Small Sound Effects/Click.wav");
        System.exit(0);

    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        jLabel3.setIcon(new ImageIcon(getClass().getResource("Resources/Graphics/Buttons/Exit_Hover.png")));
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        jLabel3.setIcon(new ImageIcon(getClass().getResource("Resources/Graphics/Buttons/Exit.png")));        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        jLabel4.setIcon(new ImageIcon(getClass().getResource("Resources/Graphics/Buttons/Minimize_Hover.png")));        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        jLabel4.setIcon(new ImageIcon(getClass().getResource("Resources/Graphics/Buttons/Minimize.png")));       // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        browse("https://p-world.000webhostapp.com/");
        sound_effect("Resources/Music/Small Sound Effects/Click.wav");// TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        int original = (int) jLabel6.getLocation().getY();
        timer_animate = animate(original, jLabel6);
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        stop_animate(timer_animate);
        jLabel6.setLocation((int) jLabel6.getLocation().getX(), 340);
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        int original = (int) jLabel7.getLocation().getY();
        timer_animate = animate(original, jLabel7);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        stop_animate(timer_animate);
        jLabel7.setLocation((int) jLabel7.getLocation().getX(), 370);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        stop_animate(timer_animate);
        jLabel8.setLocation((int) jLabel8.getLocation().getX(), 400);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseExited

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        int original = (int) jLabel8.getLocation().getY();
        timer_animate = animate(original, jLabel8);          // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        browse("https://www.facebook.com/");
        sound_effect("Resources/Music/Small Sound Effects/Click.wav");
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        browse("https://www.instagram.com/");
        sound_effect("Resources/Music/Small Sound Effects/Click.wav");
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        browse("https://www.twitter.com/");
        sound_effect("Resources/Music/Small Sound Effects/Click.wav");
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
        int original = (int) jLabel9.getLocation().getY();
        timer_animate = animate(original, jLabel9);
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        stop_animate(timer_animate);
        jLabel9.setLocation((int) jLabel9.getLocation().getX(), 400);
    }//GEN-LAST:event_jLabel9MouseExited

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
        int original = (int) jLabel10.getLocation().getY();
        timer_animate = animate(original, jLabel10);
    }//GEN-LAST:event_jLabel10MouseEntered

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
        stop_animate(timer_animate);
        jLabel10.setLocation((int) jLabel10.getLocation().getX(), 400);
    }//GEN-LAST:event_jLabel10MouseExited

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        try {
            sound_effect("Resources/Music/Small Sound Effects/Click.wav");
            Username = jTextField2.getText();
            Password = jPasswordField1.getText();
            MessageBox msg = new MessageBox();
            if (Username.isEmpty() || Password.isEmpty()) {
                msg.Message = "Please enter valid credentials.";
                msg.setVisible(true);

            } else {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection(SplashScreen.databaseURL, SplashScreen.databaseUsername, SplashScreen.databasePassword);
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("Select * from Login where Username='" + Username + "';");

                if (!rs.last()) {
                    msg.Message = "Please enter valid Username.";
                    msg.setVisible(true);
                } else {
                    rs.beforeFirst();
                    while (rs.next()) {
                        if (Password.equals(rs.getString("Password"))) {
                            Game game = new Game();
                            game.UID = rs.getInt("UID");
                            Statement stmt1 = con.createStatement();
                            ResultSet rt = stmt1.executeQuery("Select * from Game where UID='" + game.UID + "';");
                            while (rt.next()) {
                                game.checkPoint = rt.getInt("CheckPoint");
                                game.itemCount = rt.getInt("itemCount");

                                game.items = rt.getString("items").split(" ");
                                game.setVisible(true);
                                stop_music();
                                this.dispose();                              

                            }
                            Statement stmt2 = con.createStatement();
                            ResultSet registration = stmt2.executeQuery("Select * from Registration where UID='" + game.UID + "';");
                            while (registration.next()) {
                                game.gender = registration.getString("Gender");
                            }
                            registration.close();
                            rt.close();
                        } else {
                            msg.Message = "Please enter valid Password.";
                            msg.setVisible(true);
                        }
                    }
                    rs.close();
                }
                con.close();
            }

        } catch (Exception e) {
            MessageBox msg = new MessageBox();
            msg.Message = "Please enter valid credentials.";
            msg.setVisible(true);
            System.out.println(e);

        }
    }//GEN-LAST:event_jLabel9MouseClicked
    Timer timer_animate = new Timer();

    private void browse(String URL) {
        try {
            Desktop desktop = java.awt.Desktop.getDesktop();
            URI oURL = new URI(URL);
            desktop.browse(oURL);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private Timer animate(int y, JLabel jLabel) {
        Timer timer_vibrate = new Timer();
        timer_vibrate.schedule(
                new TimerTask() {
            @SuppressWarnings("UseSpecificCatch")
            int image = 1;
            int step = 1;
            int y_temp = y;

            public void run() {
                y_temp += step;
                jLabel.setLocation((int) jLabel.getLocation().getX(), y_temp);
                if (y_temp < y - 1) {
                    step = +1;
                } else if (y_temp > y + 1) {
                    step = -1;
                }

            }
        }, 0, 1);
        return timer_vibrate;

    }

    private void stop_animate(Timer timer) {
        timer.cancel();

    }

    InputStream is;
    AudioStream audioStream;

    private void music() {
        java.util.Timer timer1 = new java.util.Timer();
        timer1.schedule(new TimerTask() {
            @SuppressWarnings("UseSpecificCatch")

            public void run() {
                try {
                    is = getClass().getResourceAsStream("Resources/Music/Background/Login_Screen_Background.wav");
                    audioStream = new AudioStream(is);
                    AudioPlayer.player.start(audioStream);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }, 0, 80000);

    }

    private void stop_music() {
        AudioPlayer.player.stop(audioStream);
    }

    private void scroll_updates() {
        java.util.Timer timer2 = new java.util.Timer();
        timer2.schedule(new TimerTask() {
            @SuppressWarnings("UseSpecificCatch")

            public void run() {
                jLabel12.setLocation((int) jLabel12.getLocation().getX(), (int) jLabel12.getLocation().getY() - 1);
                if (jLabel12.getLocation().getY() + jLabel12.getHeight() < -20) {
                    jLabel12.setLocation((int) jLabel12.getLocation().getX(), (int) 160);
                }
            }
        }, 0, 50);
    }

    private void sound_effect(String Path) {
        try {
            InputStream is;
            AudioStream audioStream;
            is = getClass().getResourceAsStream(Path);
            audioStream = new AudioStream(is);
            AudioPlayer.player.start(audioStream);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

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
            java.util.logging.Logger.getLogger(Login_Screen.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Screen.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Screen.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Screen.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Screen().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
