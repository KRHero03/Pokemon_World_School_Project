/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon_world_client;

import com.sun.glass.events.KeyEvent;
import java.awt.Color;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.util.Scanner;
import javax.swing.Timer;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.swing.*;
import javax.swing.text.DefaultCaret;
import sun.audio.AudioData;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import sun.audio.ContinuousAudioDataStream;

public class Game extends javax.swing.JFrame {

    //User Global Variables
    int checkPoint = 2;
    int itemCount = 0;
    int UID = 0;
    int playerX = 0;
    int playerY = 0;
    String IP = "";
    String MAC = "";
    String[] items = new String[itemCount];
    String gender = "Male";
    int Char_Sprite = 0;
    int pose = 1;
    Timer move_timer = new Timer(40, null);
    Timer timer;
    boolean focus = true;

    //Map Global Variables
    int mapHeight = 0;
    int mapWidth = 0;
    int[][] collisionArray;
    String MapType = "City";
    String Map = "DesmondGreensGate";

    //GUIPanel Global Variables
    int swipe1 = 0;
    int swipe2 = 0;

    public Game() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        bagPanel = new java.awt.Panel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        mapPanel = new javax.swing.JPanel();
        MapTop = new javax.swing.JLabel();
        npcPanel = new javax.swing.JPanel();
        MapMid = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        MapBottom = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pokemon World Beta");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("Resources/Graphics/Icons/icon.png")).getImage());
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setSize(new java.awt.Dimension(800, 600));
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
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon_world_client/Resources/Graphics/Buttons/Exit.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(745, 0, 60, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon_world_client/Resources/Graphics/Miscellaneous/Game_Intro/Game_Name.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setOpaque(false);
        jPanel3.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel3ComponentShown(evt);
            }
        });
        jPanel3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel3KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPanel3KeyReleased(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bagPanel.setPreferredSize(new java.awt.Dimension(300, 400));
        bagPanel.setVisible(false);
        bagPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bagPanelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bagPanelMousePressed(evt);
            }
        });
        bagPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                bagPanelMouseDragged(evt);
            }
        });
        bagPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon_world_client/Resources/Graphics/Buttons/Exit.png"))); // NOI18N
        jLabel26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel26MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel26MouseExited(evt);
            }
        });
        bagPanel.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 0, -1, -1));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon_world_client/Resources/Graphics/Backgrounds/BagPanel.png"))); // NOI18N
        bagPanel.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 400));

        jPanel3.add(bagPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon_world_client/Resources/Graphics/GUIPanel/Swipe_Right.png"))); // NOI18N
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel20MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel20MouseExited(evt);
            }
        });
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 96, -1, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon_world_client/Resources/Graphics/GUIPanel/Swipe_Up.png"))); // NOI18N
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel21MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel21MouseExited(evt);
            }
        });
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 568, -1, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon_world_client/Resources/Graphics/GUIPanel/Options.png"))); // NOI18N
        jLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel22MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel22MouseExited(evt);
            }
        });
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 600, -1, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon_world_client/Resources/Graphics/GUIPanel/Pokedex.png"))); // NOI18N
        jLabel23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel23MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel23MouseExited(evt);
            }
        });
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 600, -1, -1));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon_world_client/Resources/Graphics/GUIPanel/Trainer.png"))); // NOI18N
        jLabel24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel24MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel24MouseExited(evt);
            }
        });
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 600, -1, -1));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon_world_client/Resources/Graphics/GUIPanel/Bag.png"))); // NOI18N
        jLabel25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel25MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel25MouseExited(evt);
            }
        });
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 600, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon_world_client/Resources/Maps/DesmondGreensGate/Banner.png"))); // NOI18N
        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, -35, -1, -1));

        mapPanel.setOpaque(false);
        mapPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MapTop.setName(""); // NOI18N
        mapPanel.add(MapTop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        npcPanel.setOpaque(false);
        npcPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        mapPanel.add(npcPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        mapPanel.add(MapMid, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon_world_client/Resources/Graphics/Character_Costumes/Male/0/1.png"))); // NOI18N
        jLabel19.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel19KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jLabel19KeyTyped(evt);
            }
        });
        mapPanel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 384, 32, 32));

        MapBottom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        MapBottom.setOpaque(true);
        MapBottom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MapBottomMouseClicked(evt);
            }
        });
        MapBottom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                MapBottomKeyPressed(evt);
            }
        });
        mapPanel.add(MapBottom, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel3.add(mapPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel6.setFocusable(false);
        jLabel6.setOpaque(true);
        jLabel6.setPreferredSize(new java.awt.Dimension(10, 10));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel2ComponentShown(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon_world_client/Resources/Graphics/Buttons/Confirm_Character.png"))); // NOI18N
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel17MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel17MouseExited(evt);
            }
        });
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 370, 30));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon_world_client/Resources/Graphics/Buttons/Previous.png"))); // NOI18N
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel14MouseExited(evt);
            }
        });
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon_world_client/Resources/Graphics/Buttons/Next.png"))); // NOI18N
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel13MouseExited(evt);
            }
        });
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 350, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon_world_client/Resources/Graphics/Character_Costumes/Male/0/Image.png"))); // NOI18N
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon_world_client/Resources/Graphics/Character_Costumes/Male/0/1.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 200, 64, 64));

        jLabel15.setBackground(new Color(1f,1f,1f,0.5f));
        jLabel15.setOpaque(true);
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 470, 300));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon_world_client/Resources/Graphics/Miscellaneous/Character_Design/Background_Mini.png"))); // NOI18N
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, -1, 280));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon_world_client/Resources/Graphics/Miscellaneous/Character_Design/Male.png"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 250, 550));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon_world_client/Resources/Graphics/Miscellaneous/Character_Design/Character.png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon_world_client/Resources/Graphics/Backgrounds/Character_Design/Background.png"))); // NOI18N
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel8.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jLabel8ComponentShown(evt);
            }
        });
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new Color(1f,1f,1f,0.5f));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jTextArea1.setForeground(new Color(188,10,10));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jTextArea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 720, 140));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon_world_client/Resources/Graphics/Buttons/Next.png"))); // NOI18N
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
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 520, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon_world_client/Resources/Graphics/Miscellaneous/Game_Intro/Prof_Arora.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon_world_client/Resources/Graphics/Backgrounds/Game_Intro/Background.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        setSize(new java.awt.Dimension(800, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
int posX = 0, posY = 0;
    int posBagX = 0, posBagY = 0;
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        posX = evt.getX();
        posY = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        this.setLocation(evt.getXOnScreen() - posX, evt.getYOnScreen() - posY);
    }//GEN-LAST:event_formMouseDragged
    int intro_check = 0;
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jLabel6.setVisible(false);
        jPanel1.setVisible(false);
        jPanel2.setVisible(false);
        jPanel3.setVisible(false);
        bagPanel.setVisible(false);
        switch (checkPoint) {
            case 0:
                System.exit(0);
                break;
            case 1:

                String backMusicPath = "Resources/Music/Background/Game_Intro_Background.wav";
                background_music(backMusicPath);
                jPanel3.setVisible(false);
                jPanel2.setVisible(false);
                jPanel1.setVisible(true);
                String text = "Letter from Prof. Arora:\nHello, " + Login_Screen.Username + "! Welcome to the world of Pokemons! My name is Arora! People call me the pokémon Prof! This world is inhabited by creatures called pokémon! For some people, pokémon are pets. Others use them for fights. Myself...I study pokémon as a profession.";
                animate_text(jTextArea1, text);
                break;
            case 2:

                jPanel1.setVisible(false);
                jPanel2.setVisible(false);
                jPanel3.setVisible(true);
                break;
        }
    }//GEN-LAST:event_formWindowOpened

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        this.setState(1);
        sound_effect("Resources/Music/Small Sound Effects/Click.wav");        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        jLabel4.setIcon(new ImageIcon(getClass().getResource("Resources/Graphics/Buttons/Minimize_Hover.png")));        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        jLabel4.setIcon(new ImageIcon(getClass().getResource("Resources/Graphics/Buttons/Minimize.png")));       // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        jLabel7.setIcon(new ImageIcon(getClass().getResource("Resources/Graphics/Buttons/Next_Hover.png")));        // TODO add your handling code here:

    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        jLabel7.setIcon(new ImageIcon(getClass().getResource("Resources/Graphics/Buttons/Next.png")));        // TODO add your handling code here:

    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        String msg = "";
        switch (intro_check) {
            case 1:
                jTextArea1.setText("");
                msg = "I reserach Pokemons, their behaviour and their nature to different stimuli. We still have a long way to go. I am delighted that you have joined us in this expedition to collect data about all the existing Pokemons! We will soon meet at RELIANCE GREENS! Till then, Bye, " + Login_Screen.Username + "!";
                animate_text(jTextArea1, msg);
                intro_check++;
                break;
            case 3:
                curtain();

        }
        sound_effect("Resources/Music/Small Sound Effects/Click.wav");
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        jLabel5.setIcon(new ImageIcon(getClass().getResource("Resources/Graphics/Buttons/Exit.png")));        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        jLabel5.setIcon(new ImageIcon(getClass().getResource("Resources/Graphics/Buttons/Exit_Hover.png")));
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        sound_effect("Resources/Music/Small Sound Effects/Click.wav");
        MessageBox msg = new MessageBox();
        msg.Message = "Do you want to Logout?";
        msg.remove(msg.getContentPane().getComponent(0));
        JLabel jLabel10 = new JLabel();
        jLabel10.setIcon(new ImageIcon(getClass().getResource("Resources/Graphics/Buttons/Yes.png")));
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                //Import IP and MAC address, save location, save checkpoint, save items, itemcount,etc.
                sound_effect("Resources/Music/Small Sound Effects/Click.wav");
                save_game();
                Login_Screen Login_Screen = new Login_Screen();
                Login_Screen.setVisible(true);

                stop_music();
                dispose();
                msg.dispose();
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10.setIcon(new ImageIcon(getClass().getResource("Resources/Graphics/Buttons/Yes_Hover.png")));

            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10.setIcon(new ImageIcon(getClass().getResource("Resources/Graphics/Buttons/Yes.png")));

            }
        });

        jLabel10.setVisible(true);
        jLabel10.setBounds(105, 110, 100, 25);
        JLabel jLabel11 = new JLabel();
        jLabel11.setIcon(new ImageIcon(getClass().getResource("Resources/Graphics/Buttons/No.png")));
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                //Import IP and MAC address, save location, save checkpoint, save items, itemcount,etc.
                sound_effect("Resources/Music/Small Sound Effects/Click.wav");

                msg.dispose();
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel11.setIcon(new ImageIcon(getClass().getResource("Resources/Graphics/Buttons/No_Hover.png")));

            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel11.setIcon(new ImageIcon(getClass().getResource("Resources/Graphics/Buttons/No.png")));

            }
        });

        jLabel11.setVisible(true);
        jLabel11.setBounds(240, 110, 100, 25);

        msg.add(jLabel10, null, 0);
        msg.add(jLabel11, null, 0);

        msg.setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel8ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel8ComponentShown

    }//GEN-LAST:event_jLabel8ComponentShown

    private void jPanel2ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel2ComponentShown
        jLabel10.setIcon(new ImageIcon(getClass().getResource("/pokemon_world_client/Resources/Graphics/Miscellaneous/Character_Design/" + gender + ".png")));
        timer = new Timer(1000, new ActionListener() {

            int pose = 1;

            public void actionPerformed(ActionEvent e) {
                switch (pose) {
                    case 1:
                        pose = 7;
                        break;
                    case 7:
                        pose = 4;
                        break;
                    case 4:
                        pose = 10;
                        break;
                    case 10:
                        pose = 1;
                        break;
                }
                ImageIcon icon = new ImageIcon(getClass().getResource("/pokemon_world_client/Resources/Graphics/Character_Costumes/" + gender + "/" + Char_Sprite + "/" + pose + ".png"));
                Image img = getScaledImage(icon.getImage(), 64, 64);
                jLabel11.setIcon(new ImageIcon(img));
                jLabel12.setIcon(new ImageIcon(getClass().getResource("/pokemon_world_client/Resources/Graphics/Character_Costumes/" + gender + "/" + Char_Sprite + "/Image.png")));

            }
        });
        timer.start();


    }//GEN-LAST:event_jPanel2ComponentShown

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        switch (Char_Sprite) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                Char_Sprite++;
                break;

            case 5:
                break;
        }
        sound_effect("Resources/Music/Small Sound Effects/Click.wav");
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseEntered
        jLabel13.setIcon(new ImageIcon(getClass().getResource("Resources/Graphics/Buttons/Next_Hover.png")));        // TODO add your handling code here:

    }//GEN-LAST:event_jLabel13MouseEntered

    private void jLabel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseExited
        jLabel13.setIcon(new ImageIcon(getClass().getResource("Resources/Graphics/Buttons/Next.png")));        // TODO add your handling code here:

    }//GEN-LAST:event_jLabel13MouseExited

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        switch (Char_Sprite) {
            case 0:
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                Char_Sprite--;

                break;

        }
        sound_effect("Resources/Music/Small Sound Effects/Click.wav");
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseEntered
        jLabel14.setIcon(new ImageIcon(getClass().getResource("Resources/Graphics/Buttons/Previous_Hover.png")));        // TODO add your handling code here:

    }//GEN-LAST:event_jLabel14MouseEntered

    private void jLabel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseExited
        jLabel14.setIcon(new ImageIcon(getClass().getResource("Resources/Graphics/Buttons/Previous.png")));        // TODO add your handling code here:

    }//GEN-LAST:event_jLabel14MouseExited

    private void jLabel17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseEntered
        jLabel17.setIcon(new ImageIcon(getClass().getResource("Resources/Graphics/Buttons/Confirm_Character_Hover.png")));        // TODO add your handling code here:

    }//GEN-LAST:event_jLabel17MouseEntered

    private void jLabel17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseExited
        jLabel17.setIcon(new ImageIcon(getClass().getResource("Resources/Graphics/Buttons/Confirm_Character.png")));        // TODO add your handling code here:

    }//GEN-LAST:event_jLabel17MouseExited

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        sound_effect("Resources/Music/Small Sound Effects/Click.wav");
        MessageBox msg = new MessageBox();
        msg.Message = "Are you sure?";
        msg.remove(msg.getContentPane().getComponent(0));
        JLabel jLabel10 = new JLabel();
        jLabel10.setIcon(new ImageIcon(getClass().getResource("Resources/Graphics/Buttons/Yes.png")));
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                //Import IP and MAC address, save location, save checkpoint, save items, itemcount,etc.
                sound_effect("Resources/Music/Small Sound Effects/Click.wav");
                checkPoint++;
                Map = "DesmondGreensGate";
                curtain();
                msg.dispose();
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10.setIcon(new ImageIcon(getClass().getResource("Resources/Graphics/Buttons/Yes_Hover.png")));

            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10.setIcon(new ImageIcon(getClass().getResource("Resources/Graphics/Buttons/Yes.png")));

            }
        });

        jLabel10.setVisible(true);
        jLabel10.setBounds(105, 110, 100, 25);
        JLabel jLabel11 = new JLabel();
        jLabel11.setIcon(new ImageIcon(getClass().getResource("Resources/Graphics/Buttons/No.png")));
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                //Import IP and MAC address, save location, save checkpoint, save items, itemcount,etc.
                sound_effect("Resources/Music/Small Sound Effects/Click.wav");

                msg.dispose();
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel11.setIcon(new ImageIcon(getClass().getResource("Resources/Graphics/Buttons/No_Hover.png")));

            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel11.setIcon(new ImageIcon(getClass().getResource("Resources/Graphics/Buttons/No.png")));

            }
        });

        jLabel11.setVisible(true);
        jLabel11.setBounds(240, 110, 100, 25);

        msg.add(jLabel10, null, 0);
        msg.add(jLabel11, null, 0);

        msg.setVisible(true);
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jPanel3ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel3ComponentShown
        load_map();

    }//GEN-LAST:event_jPanel3ComponentShown

    private void jPanel3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel3KeyPressed

    }//GEN-LAST:event_jPanel3KeyPressed

    private void jPanel3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel3KeyReleased

    }//GEN-LAST:event_jPanel3KeyReleased

    private void MapBottomKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MapBottomKeyPressed


    }//GEN-LAST:event_MapBottomKeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed


    }//GEN-LAST:event_formKeyPressed

    private void jLabel19KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel19KeyPressed

    }//GEN-LAST:event_jLabel19KeyPressed

    private void jLabel19KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel19KeyTyped

    }//GEN-LAST:event_jLabel19KeyTyped

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped

    }//GEN-LAST:event_formKeyTyped

    private void jLabel20MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseEntered
        if (swipe1 == 0) {
            jLabel20.setIcon(new ImageIcon(getClass().getResource("Resources/Graphics/GUIPanel/Swipe_Right_Hover.png")));        // TODO add your handling code here:
        } else {
            jLabel20.setIcon(new ImageIcon(getClass().getResource("Resources/Graphics/GUIPanel/Swipe_Left_Hover.png")));        // TODO add your handling code here:

        }

    }//GEN-LAST:event_jLabel20MouseEntered

    private void jLabel20MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseExited
        if (swipe1 == 0) {
            jLabel20.setIcon(new ImageIcon(getClass().getResource("Resources/Graphics/GUIPanel/Swipe_Right.png")));        // TODO add your handling code here:
        } else {
            jLabel20.setIcon(new ImageIcon(getClass().getResource("Resources/Graphics/GUIPanel/Swipe_Left.png")));        // TODO add your handling code here:
        }
    }//GEN-LAST:event_jLabel20MouseExited

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        Timer swipetimer = new Timer(1, new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (swipe1 == 0) {
                    jLabel20.setLocation((int) jLabel20.getLocation().getX() + 4, (int) jLabel20.getLocation().getY());
                    jLabel20.setIcon(new ImageIcon(getClass().getResource("Resources/Graphics/GUIPanel/Swipe_Right_Hover.png")));        // TODO add your handling code here:

                    if (jLabel20.getX() >= 160) {
                        ((Timer) e.getSource()).stop();
                        jLabel20.setIcon(new ImageIcon(getClass().getResource("Resources/Graphics/GUIPanel/Swipe_Left.png")));        // TODO add your handling code here:
                        swipe1 = 1;
                    }
                } else {
                    jLabel20.setLocation((int) jLabel20.getLocation().getX() - 4, (int) jLabel20.getLocation().getY());
                    jLabel20.setIcon(new ImageIcon(getClass().getResource("Resources/Graphics/GUIPanel/Swipe_Left_Hover.png")));        // TODO add your handling code here:

                    if (jLabel20.getX() <= 0) {
                        ((Timer) e.getSource()).stop();
                        jLabel20.setIcon(new ImageIcon(getClass().getResource("Resources/Graphics/GUIPanel/Swipe_Right.png")));        // TODO add your handling code here:
                        swipe1 = 0;
                    }
                }
            }
        }
        );
        swipetimer.start();
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked

        jLabel21.setIcon(new ImageIcon(getClass().getResource("Resources/Graphics/GUIPanel/Swipe_Down_Hover.png")));
        Timer swipetimer = new Timer(10, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (swipe2 == 0) {
                    jLabel22.setLocation((int) jLabel22.getLocation().getX(), (int) jLabel22.getLocation().getY() - 4);
                    jLabel23.setLocation((int) jLabel23.getLocation().getX(), (int) jLabel23.getLocation().getY() - 4);
                    jLabel24.setLocation((int) jLabel24.getLocation().getX(), (int) jLabel24.getLocation().getY() - 4);
                    jLabel25.setLocation((int) jLabel25.getLocation().getX(), (int) jLabel25.getLocation().getY() - 4);
                    jLabel21.setIcon(new ImageIcon(getClass().getResource("Resources/Graphics/GUIPanel/Swipe_Up_Hover.png")));

                    if (jLabel22.getY() <= 568) {
                        ((Timer) e.getSource()).stop();
                        jLabel21.setIcon(new ImageIcon(getClass().getResource("Resources/Graphics/GUIPanel/Swipe_Down.png")));
                        swipe2 = 1;
                    }
                } else {
                    jLabel22.setLocation((int) jLabel22.getLocation().getX(), (int) jLabel22.getLocation().getY() + 4);
                    jLabel23.setLocation((int) jLabel23.getLocation().getX(), (int) jLabel23.getLocation().getY() + 4);
                    jLabel24.setLocation((int) jLabel24.getLocation().getX(), (int) jLabel24.getLocation().getY() + 4);
                    jLabel25.setLocation((int) jLabel25.getLocation().getX(), (int) jLabel25.getLocation().getY() + 4);
                    jLabel21.setIcon(new ImageIcon(getClass().getResource("Resources/Graphics/GUIPanel/Swipe_Down_Hover.png")));

                    if (jLabel22.getY() >= 600) {
                        ((Timer) e.getSource()).stop();
                        jLabel21.setIcon(new ImageIcon(getClass().getResource("Resources/Graphics/GUIPanel/Swipe_Up.png")));
                        swipe2 = 0;
                    }
                }

            }
        });
        swipetimer.start();


    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel21MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseEntered
        if (swipe2 == 0) {
            jLabel21.setIcon(new ImageIcon(getClass().getResource("Resources/Graphics/GUIPanel/Swipe_Up_Hover.png")));
        } else {
            jLabel21.setIcon(new ImageIcon(getClass().getResource("Resources/Graphics/GUIPanel/Swipe_Down_Hover.png")));
        }
    }//GEN-LAST:event_jLabel21MouseEntered

    private void jLabel21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseExited
        if (swipe2 == 0) {
            jLabel21.setIcon(new ImageIcon(getClass().getResource("Resources/Graphics/GUIPanel/Swipe_Up.png")));
        } else {
            jLabel21.setIcon(new ImageIcon(getClass().getResource("Resources/Graphics/GUIPanel/Swipe_Down.png")));
        }
    }//GEN-LAST:event_jLabel21MouseExited

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked

    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel22MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseEntered
        jLabel22.setIcon(new ImageIcon(getClass().getResource("Resources/Graphics/GUIPanel/Options_Hover.png")));

    }//GEN-LAST:event_jLabel22MouseEntered

    private void jLabel22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseExited
        jLabel22.setIcon(new ImageIcon(getClass().getResource("Resources/Graphics/GUIPanel/Options.png")));

    }//GEN-LAST:event_jLabel22MouseExited

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked

    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel23MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseEntered
        jLabel23.setIcon(new ImageIcon(getClass().getResource("Resources/Graphics/GUIPanel/Pokedex_Hover.png")));

    }//GEN-LAST:event_jLabel23MouseEntered

    private void jLabel23MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseExited
        jLabel23.setIcon(new ImageIcon(getClass().getResource("Resources/Graphics/GUIPanel/Pokedex.png")));

    }//GEN-LAST:event_jLabel23MouseExited

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked

    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel24MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseEntered
        jLabel24.setIcon(new ImageIcon(getClass().getResource("Resources/Graphics/GUIPanel/Trainer_Hover.png")));

    }//GEN-LAST:event_jLabel24MouseEntered

    private void jLabel24MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseExited
        jLabel24.setIcon(new ImageIcon(getClass().getResource("Resources/Graphics/GUIPanel/Trainer.png")));

    }//GEN-LAST:event_jLabel24MouseExited

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        bagPanel.setLocation(400 - (bagPanel.getPreferredSize().width / 2), 300 - (bagPanel.getPreferredSize().height / 2));
        if (bagPanel.isVisible()) {
            bagPanel.setVisible(false);
        } else {
            bagPanel.setVisible(true);
        }
    }//GEN-LAST:event_jLabel25MouseClicked

    private void jLabel25MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseEntered
        jLabel25.setIcon(new ImageIcon(getClass().getResource("Resources/Graphics/GUIPanel/Bag_Hover.png")));

    }//GEN-LAST:event_jLabel25MouseEntered

    private void jLabel25MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseExited
        if (bagPanel.isVisible()) {

        } else {
            jLabel25.setIcon(new ImageIcon(getClass().getResource("Resources/Graphics/GUIPanel/Bag.png")));
        }
    }//GEN-LAST:event_jLabel25MouseExited

    private void MapBottomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MapBottomMouseClicked


    }//GEN-LAST:event_MapBottomMouseClicked

    private void bagPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bagPanelMouseClicked

    }//GEN-LAST:event_bagPanelMouseClicked

    private void bagPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bagPanelMouseDragged

        bagPanel.setLocation(evt.getXOnScreen() - this.getX() - posBagX, evt.getYOnScreen() - this.getY() - posBagY);

    }//GEN-LAST:event_bagPanelMouseDragged

    private void bagPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bagPanelMousePressed
        posBagX = evt.getX();
        posBagY = evt.getY();
    }//GEN-LAST:event_bagPanelMousePressed

    private void jLabel26MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseEntered
        jLabel26.setIcon(new ImageIcon(getClass().getResource("Resources/Graphics/Buttons/Exit_Hover.png")));

    }//GEN-LAST:event_jLabel26MouseEntered

    private void jLabel26MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseExited
        jLabel26.setIcon(new ImageIcon(getClass().getResource("Resources/Graphics/Buttons/Exit.png")));

    }//GEN-LAST:event_jLabel26MouseExited

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        bagPanel.setVisible(false);
        jLabel25.setIcon(new ImageIcon(getClass().getResource("Resources/Graphics/GUIPanel/Bag.png")));

    }//GEN-LAST:event_jLabel26MouseClicked
    InputStream is;
    AudioStream audioStream;

    private void load_map() {
        try {
            stop_music();
            switch (MapType) {
                case "Interior":
                case "City":
                    int music = (int) Math.round(20 * Math.random());
                    background_music("Resources/Music/Background/Map_Background/City_Background/" + music + ".wav");
                    break;
                case "Route":
                    music = (int) Math.round(18 * Math.random());

                    background_music("Resources/Music/Background/Map_Background/Route_Background/" + music + ".wav");
                    break;
            }
            jLabel19.setIcon(new ImageIcon(getClass().getResource("/pokemon_world_client/Resources/Graphics/Character_Costumes/" + gender + "/" + Char_Sprite + "/1.png")));
            jLabel18.setIcon(new ImageIcon(getClass().getResource("/pokemon_world_client/Resources/Maps/" + Map + "/Banner.png")));
            initializeMap();
            displayUI();
            bindKeystoPlayer();
            showMapName();

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    private void displayUI() {

    }

    private void showMapName() {
        Timer timer = new Timer(100, new ActionListener() {
            int step = 5;
            int i = 0;

            public void actionPerformed(ActionEvent e) {
                if (jLabel18.getY() == 35 && i < 20) {
                    i++;
                } else {
                    jLabel18.setLocation(jLabel18.getX(), jLabel18.getY() + step);
                }
                if (jLabel18.getY() > 35) {
                    step = -step;
                }
                if (jLabel18.getY() < -35) {
                    ((Timer) e.getSource()).stop();
                }

            }
        });
        timer.setInitialDelay(1);
        timer.start();
    }

    private int getMusicTime(String Path) {
        int durationInSeconds = 0;
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(getClass().getResourceAsStream(Path));
            AudioFormat format = audioInputStream.getFormat();
            long frames = audioInputStream.getFrameLength();
            durationInSeconds = (int) ((frames + 0.0) / format.getFrameRate());

        } catch (Exception e) {
            System.out.println(e);
        }
        return durationInSeconds;
    }
    Timer music_timer;

    private void background_music(String Path) {
        music_timer = new Timer(((getMusicTime(Path) * 1000) + 3000), new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    is = getClass().getResourceAsStream(Path);
                    audioStream = new AudioStream(is);
                    AudioPlayer.player.start(audioStream);
                } catch (Exception p) {
                    System.out.println(p);
                }
            }
        }
        );
        music_timer.setInitialDelay(1);
        music_timer.start();
    }

    private void stop_music() {
        try {
            AudioPlayer.player.stop(audioStream);
            music_timer.stop();
        } catch (Exception f) {

        }

    }

    private void sound_effect(String Path) {
        try {

            InputStream soundEffect = getClass().getResourceAsStream(Path);
            AudioStream soundEffectStream = new AudioStream(soundEffect);
            AudioPlayer.player.start(soundEffectStream);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void animate_text(JTextArea jTextArea, String Message) {
        Timer timer = new Timer(50, new ActionListener() {

            int i = 0;

            public void actionPerformed(ActionEvent e) {
                int length = Message.length();
                jTextArea.setText(jTextArea1.getText() + Message.substring(i, i + 1));
                i += 1;
                if (i % 23 == 0 || i % 11 == 0) {
                    sound_effect("Resources/Music/Small Sound Effects/Text.wav");
                }
                DefaultCaret caret = (DefaultCaret) jTextArea.getCaret();
                caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
                if (i == Message.length()) {
                    intro_check++;
                    ((Timer) e.getSource()).stop();
                }
            }
        });
        timer.start();

    }

    private void save_game() {

    }

    private void curtain() {
        Timer timer = new Timer(100, new ActionListener() {

            float alpha = 0;
            float step = 0.05f;

            public void actionPerformed(ActionEvent e) {
                switch (checkPoint) {
                    case 1:
                        break;
                    case 2:
                        jPanel2.getComponent(3).setVisible(false);
                        jPanel2.getComponent(4).setVisible(false);
                        break;
                }
                jLabel6.setVisible(true);
                alpha += step;
                if (alpha >= 1f) {
                    step = -step;
                    switch (checkPoint) {
                        case 1:
                            jPanel1.setVisible(false);

                            break;
                        case 2:
                            jPanel2.setVisible(false);

                            break;
                    }//if this doesnt work, check jLabel6 opaque property
                }

                if (alpha <= 0f) {
                    switch (checkPoint) {
                        case 1:
                            jPanel2.setVisible(true);
                            break;
                        case 2:
                            jPanel3.setVisible(true);
                            break;
                    }
                    jLabel6.setVisible(false);
                    ((Timer) e.getSource()).stop();
                }
                jLabel6.setBackground(new Color(0f, 0f, 0f, alpha));
            }

        });
        timer.start();
    }

    private void bindKeystoPlayer() {
        jLabel19.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_UP, 0, false), "Up");
        jLabel19.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_UP, 0, true), "Up_Stop");
        jLabel19.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_RIGHT, 0, false), "Right");
        jLabel19.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_RIGHT, 0, true), "Right_Stop");
        jLabel19.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_DOWN, 0, false), "Down");
        jLabel19.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_LEFT, 0, false), "Left");
        jLabel19.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_DOWN, 0, true), "Down_Stop");
        jLabel19.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_LEFT, 0, true), "Left_Stop");

        jLabel19.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_W, 0, false), "Up");
        jLabel19.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_A, 0, false), "Left");
        jLabel19.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_S, 0, false), "Down");
        jLabel19.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_D, 0, false), "Right");
        jLabel19.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_W, 0, true), "Up_Stop");
        jLabel19.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_A, 0, true), "Left_Stop");
        jLabel19.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_S, 0, true), "Down_Stop");
        jLabel19.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_D, 0, true), "Right_Stop");

        jLabel19.getActionMap().put("Up", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!move_timer.isRunning() && focus == true) {

                    move_timer = new Timer(100, new ActionListener() {

                        public void actionPerformed(ActionEvent f) {
                            switch (pose) {
                                case 4:
                                    pose = 5;
                                    break;
                                case 5:
                                    pose = 6;
                                    break;
                                case 6:
                                    pose = 4;
                                    break;
                                default:
                                    pose = 4;

                            }
                            jLabel19.setIcon(new ImageIcon(getClass().getResource("/pokemon_world_client/Resources/Graphics/Character_Costumes/" + gender + "/" + Char_Sprite + "/" + pose + ".png")));

                            if (MapBottom.getY() >= 0 || jLabel19.getY() > 300) {
                                playerX = (jLabel19.getX() - MapBottom.getX()) / 32;
                                playerY = (jLabel19.getY() - 32 - MapBottom.getY()) / 32;
                                if (checkCollision(playerX, playerY)) {
                                    jLabel19.setLocation(jLabel19.getX(), jLabel19.getY() - 32);
                                } else {
                                    playerY = (jLabel19.getY() - MapBottom.getY()) / 32;
                                }
                            } else {
                                playerX = (jLabel19.getX() - MapBottom.getX()) / 32;
                                playerY = (jLabel19.getY() - 32 - MapBottom.getY()) / 32;
                                if (checkCollision(playerX, playerY)) {
                                    MapBottom.setLocation(MapBottom.getX(), MapBottom.getY() + 32);
                                    MapTop.setLocation(MapTop.getX(), MapTop.getY() + 32);
                                    MapMid.setLocation(MapMid.getX(), MapMid.getY() + 32);
                                } else {
                                    playerY = (jLabel19.getY() - MapBottom.getY()) / 32;
                                }
                            }

                        }

                    });

                }
                move_timer.start();
            }

        }
        );
        jLabel19.getActionMap().put("Up_Stop", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                move_timer.stop();
                jLabel19.setIcon(new ImageIcon(getClass().getResource("/pokemon_world_client/Resources/Graphics/Character_Costumes/" + gender + "/" + Char_Sprite + "/4.png")));
                jLabel19.setLocation(jLabel19.getX(), Math.round((jLabel19.getY()) / 32) * 32);
                MapBottom.setLocation(MapBottom.getX(), Math.round((MapBottom.getY()) / 32) * 32);
                MapTop.setLocation(MapTop.getX(), Math.round((MapTop.getY()) / 32) * 32);
                MapMid.setLocation(MapMid.getX(), Math.round((MapMid.getY()) / 32) * 32);
            }
        });

        jLabel19.getActionMap().put("Down", new AbstractAction() {

            public void actionPerformed(ActionEvent e) {
                if (!move_timer.isRunning() && focus == true) {
                    move_timer = new Timer(100, new ActionListener() {

                        public void actionPerformed(ActionEvent f) {
                            switch (pose) {
                                case 1:
                                    pose = 2;
                                    break;
                                case 2:
                                    pose = 3;
                                    break;
                                case 3:
                                    pose = 1;
                                    break;
                                default:
                                    pose = 1;

                            }
                            jLabel19.setIcon(new ImageIcon(getClass().getResource("/pokemon_world_client/Resources/Graphics/Character_Costumes/" + gender + "/" + Char_Sprite + "/" + pose + ".png")));

                            if (MapBottom.getY() + MapBottom.getHeight() > 632 && jLabel19.getY() > 300) {
                                playerX = (jLabel19.getX() - MapBottom.getX()) / 32;
                                playerY = (jLabel19.getY() + 32 - MapBottom.getY()) / 32;
                                if (checkCollision(playerX, playerY)) {
                                    MapBottom.setLocation(MapBottom.getX(), MapBottom.getY() - 32);
                                    MapTop.setLocation(MapTop.getX(), MapTop.getY() - 32);
                                    MapMid.setLocation(MapMid.getX(), MapMid.getY() - 32);
                                } else {
                                    playerY = (jLabel19.getY() - MapBottom.getY()) / 32;
                                }

                            } else {
                                playerX = (jLabel19.getX() - MapBottom.getX()) / 32;
                                playerY = (jLabel19.getY() + 32 - MapBottom.getY()) / 32;
                                if (checkCollision(playerX, playerY)) {
                                    jLabel19.setLocation(jLabel19.getX(), jLabel19.getY() + 32);
                                } else {
                                    playerY = (jLabel19.getY() - MapBottom.getY()) / 32;
                                }
                            }

                        }
                    });
                    move_timer.start();
                }
            }

        }
        );
        jLabel19.getActionMap().put("Down_Stop", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                move_timer.stop();
                jLabel19.setIcon(new ImageIcon(getClass().getResource("/pokemon_world_client/Resources/Graphics/Character_Costumes/" + gender + "/" + Char_Sprite + "/1.png")));
                jLabel19.setLocation(jLabel19.getX(), Math.round((jLabel19.getY()) / 32) * 32);
                MapBottom.setLocation(MapBottom.getX(), Math.round((MapBottom.getY()) / 32) * 32);
                MapMid.setLocation(MapMid.getX(), Math.round((MapMid.getY()) / 32) * 32);
                MapTop.setLocation(MapTop.getX(), Math.round((MapTop.getY()) / 32) * 32);
            }
        });

        jLabel19.getActionMap().put("Left", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!move_timer.isRunning() && focus == true) {
                    move_timer = new Timer(100, new ActionListener() {

                        public void actionPerformed(ActionEvent f) {
                            switch (pose) {
                                case 10:
                                    pose = 11;
                                    break;
                                case 11:
                                    pose = 12;
                                    break;
                                case 12:
                                    pose = 10;
                                    break;
                                default:
                                    pose = 10;

                            }
                            jLabel19.setIcon(new ImageIcon(getClass().getResource("/pokemon_world_client/Resources/Graphics/Character_Costumes/" + gender + "/" + Char_Sprite + "/" + pose + ".png")));

                            if (MapBottom.getX() >= 0 || jLabel19.getX() > 400) {
                                playerX = (jLabel19.getX() - 32 - MapBottom.getX()) / 32;
                                playerY = (jLabel19.getY() - MapBottom.getY()) / 32;

                                if (checkCollision(playerX, playerY)) {
                                    jLabel19.setLocation(jLabel19.getX() - 32, jLabel19.getY());
                                } else {
                                    playerX = (jLabel19.getX() - MapBottom.getX()) / 32;
                                }
                            } else {
                                playerX = (jLabel19.getX() - 32 - MapBottom.getX()) / 32;
                                playerY = (jLabel19.getY() - MapBottom.getY()) / 32;
                                if (checkCollision(playerX, playerY)) {
                                    MapBottom.setLocation(MapBottom.getX() + 32, MapBottom.getY());
                                    MapTop.setLocation(MapTop.getX() + 32, MapTop.getY());
                                    MapMid.setLocation(MapMid.getX() + 32, MapMid.getY());
                                } else {
                                    playerX = (jLabel19.getX() - MapBottom.getX()) / 32;
                                }

                            }

                        }
                    }
                    );
                    move_timer.start();
                }
            }
        }
        );

        jLabel19.getActionMap().put("Left_Stop", new AbstractAction() {

            public void actionPerformed(ActionEvent e) {
                move_timer.stop();
                jLabel19.setIcon(new ImageIcon(getClass().getResource("/pokemon_world_client/Resources/Graphics/Character_Costumes/" + gender + "/" + Char_Sprite + "/10.png")));
                jLabel19.setLocation(Math.round((jLabel19.getX()) / 32) * 32, jLabel19.getY());
                MapBottom.setLocation(Math.round((MapBottom.getX()) / 32) * 32, MapBottom.getY());
                MapTop.setLocation(Math.round((MapTop.getX()) / 32) * 32, MapTop.getY());
                MapMid.setLocation(Math.round((MapMid.getX()) / 32) * 32, MapMid.getY());
            }
        });

        jLabel19.getActionMap().put("Right", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!move_timer.isRunning() && focus == true) {
                    move_timer = new Timer(100, new ActionListener() {

                        public void actionPerformed(ActionEvent f) {
                            switch (pose) {
                                case 7:
                                    pose = 8;
                                    break;
                                case 8:
                                    pose = 9;
                                    break;
                                case 9:
                                    pose = 7;
                                    break;
                                default:
                                    pose = 7;

                            }
                            jLabel19.setIcon(new ImageIcon(getClass().getResource("/pokemon_world_client/Resources/Graphics/Character_Costumes/" + gender + "/" + Char_Sprite + "/" + pose + ".png")));

                            if (MapBottom.getX() + MapBottom.getWidth() > 800 && jLabel19.getX() > 400) {
                                playerX = (jLabel19.getX() + 32 - MapBottom.getX()) / 32;
                                playerY = (jLabel19.getY() - MapBottom.getY()) / 32;

                                if (checkCollision(playerX, playerY)) {
                                    MapBottom.setLocation(MapBottom.getX() - 32, MapBottom.getY());
                                    MapTop.setLocation(MapTop.getX() - 32, MapTop.getY());
                                    MapMid.setLocation(MapMid.getX() - 32, MapMid.getY());

                                } else {
                                    playerX = (jLabel19.getX() - MapBottom.getX()) / 32;
                                }
                            } else {
                                playerX = (jLabel19.getX() + 32 - MapBottom.getX()) / 32;
                                playerY = (jLabel19.getY() - MapBottom.getY()) / 32;

                                if (checkCollision(playerX, playerY)) {
                                    jLabel19.setLocation(jLabel19.getX() + 32, jLabel19.getY());
                                } else {
                                    playerX = (jLabel19.getX() - MapBottom.getX()) / 32;
                                }
                            }

                        }
                    });
                    move_timer.start();
                }
            }
        });

        jLabel19.getActionMap().put("Right_Stop", new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                move_timer.stop();
                jLabel19.setIcon(new ImageIcon(getClass().getResource("/pokemon_world_client/Resources/Graphics/Character_Costumes/" + gender + "/" + Char_Sprite + "/7.png")));
                jLabel19.setLocation(Math.round((jLabel19.getX()) / 32) * 32, jLabel19.getY());
                MapBottom.setLocation(Math.round((MapBottom.getX()) / 32) * 32, MapBottom.getY());
                MapTop.setLocation(Math.round((MapTop.getX()) / 32) * 32, MapTop.getY());
                MapMid.setLocation(Math.round((MapMid.getX()) / 32) * 32, MapMid.getY());
            }
        });

    }

    private void initializeMap() {
        MapBottom.setIcon(new ImageIcon(getClass().getResource("/pokemon_world_client/Resources/Maps/" + Map + "/" + "Bot.png")));
        MapTop.setIcon(new ImageIcon(getClass().getResource("/pokemon_world_client/Resources/Maps/" + Map + "/" + "Top.png")));
        MapMid.setIcon(new ImageIcon(getClass().getResource("/pokemon_world_client/Resources/Maps/" + Map + "/" + "Mid.png")));
        switch (checkPoint) {
            case 2:

                MapBottom.setLocation(-384, -1280);
                MapTop.setLocation(-384, -1280);
                MapMid.setLocation(-384, -1280);
        }

        mapHeight = (MapBottom.getPreferredSize().height / 32);
        mapWidth = (MapBottom.getPreferredSize().width / 32);
        collisionArray = new int[mapWidth][mapHeight];

        File collisionFile = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            collisionFile = new File(getClass().getResource("/pokemon_world_client/Resources/Maps/" + Map + "/Collision.txt").toString().substring(5));
            fileReader = new FileReader(collisionFile);
            bufferedReader = new BufferedReader(fileReader);
        } catch (Exception e) {
        }
        for (int i = 0; i < mapHeight; i++) {
            String line = "";
            try {
                line = bufferedReader.readLine();
            } catch (Exception e) {

            }
            for (int j = 0; j < line.length(); j++) {
                collisionArray[j][i] = Integer.parseInt(line.substring(j, j + 1));
            }
        }

    }

    private boolean checkCollision(int x, int y) {
        try {
            if (collisionArray[x][y] == 0) {
                return true;
            } else {
                sound_effect("Resources/Music/Small Sound Effects/Collision.wav");
                return false;

            }
        } catch (Exception e) {
            return false;
        }
    }

    private Image getScaledImage(Image srcImg, int w, int h) {
        BufferedImage resizedImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = resizedImg.createGraphics();

        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(srcImg, 0, 0, w, h, null);
        g2.dispose();

        return resizedImg;
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Game().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MapBottom;
    private javax.swing.JLabel MapMid;
    private javax.swing.JLabel MapTop;
    private java.awt.Panel bagPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel mapPanel;
    private javax.swing.JPanel npcPanel;
    // End of variables declaration//GEN-END:variables
}
