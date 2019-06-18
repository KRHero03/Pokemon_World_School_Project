package pokemon_world_client;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.TimerTask;
import java.sql.*;

public class SplashScreen {

    int posX = 0;
    int posY = 0;
    static String databaseUsername = "root";
    static String databasePassword = "admin";
    static String databaseURL = "jdbc:mysql://192.168.29.247:3306/pokemonworld";

    public static void main(String[] args) {
        new SplashScreen();

    }

    SplashScreen() {
        //Captures Screen Dimensions
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) (screenSize.getWidth() / 2) - 250;
        int y = (int) (screenSize.getHeight() / 2) - 100;

        //Sets up SplashScren Frame
        JFrame splashscreen = new JFrame();
        splashscreen.setUndecorated(true);
        splashscreen.setBackground(new Color(0, 0, 0, 0));
        splashscreen.setSize(500, 200);
        splashscreen.setLocation(x, y);
        splashscreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        splashscreen.setIconImage(new javax.swing.ImageIcon(getClass().getResource("Resources/Graphics/Icons/icon.png")).getImage());
        splashscreen.setTitle("Pokemon World - Beta");
        
        //Sets up Splashimage JLabel
        JLabel splashimage = new JLabel();
        splashimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("Resources/Graphics/Backgrounds/SplashScreen_Animation/1.png")));
        splashimage.setBounds(0, 0, 500, 200);

        //Adds Components to SplashScreen Frame
        splashscreen.add(splashimage);

        //SplashScreen Events
        splashscreen.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                posX = e.getX();
                posY = e.getY();
            }
        });
        splashscreen.addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent evt) {
                //sets frame position when mouse dragged			
                splashscreen.setLocation(evt.getXOnScreen() - posX, evt.getYOnScreen() - posY);

            }
        });

        splashscreen.setVisible(true);
        
        //Initiates two timers
        java.util.Timer timer = new java.util.Timer();
        java.util.Timer timer1 = new java.util.Timer();

        //Timer 1 for asserting connection with database
        timer1.schedule(new TimerTask() {
            @SuppressWarnings("UseSpecificCatch")

            public void run() {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection(databaseURL, databaseUsername, databasePassword);
                    Login_Screen main = new Login_Screen();                                                       
                    main.setVisible(true);
                    splashscreen.dispose();
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }, 5000);

        //Timer 2 for animating splashscreen
        timer.schedule(
                new TimerTask() {
            @SuppressWarnings("UseSpecificCatch")
            int image = 1;
            int step = 1;
            public void run() {
                splashimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("Resources/Graphics/Backgrounds/SplashScreen_Animation/" + image + ".png")));
                image += step;
                if (image == 20) {
                    step = -1;
                }
                if (image == 1) {
                    step = 1;
                }
            }
        }, 0, 50);

    }
}
