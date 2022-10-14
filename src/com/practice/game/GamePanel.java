package com.practice.game;


import java.awt.Dimension;
import javax.swing.JPanel;

public class GamePanel extends JPanel {

  public static int width;
  public static int height;

  public GamePanel(int width,int height) {
    setPreferredSize(new Dimension(width, height));
    setFocusable(true);
    requestFocus();

  }

}
