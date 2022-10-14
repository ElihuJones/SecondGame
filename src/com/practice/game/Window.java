package com.practice.game;

import javax.swing.JFrame;

//Started this game to improve my skills and to develop something fun. 14OCT2022 @ 0130.
public class Window extends JFrame {

  public Window() {
    setTitle("Junior's Second Game");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setContentPane(new GamePanel(1280, 720));
    pack();
    setLocationRelativeTo(null);
    setVisible(true);
  }

}
