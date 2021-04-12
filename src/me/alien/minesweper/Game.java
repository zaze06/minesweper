package me.alien.minesweper;

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import java.awt.*;
import java.awt.event.*;

public class Game extends JPanel implements KeyListener, ActionListener {

    public static int DELAY;
    public static Timer timer;

    private Color lineColor = new ColorUIResource(64, 61, 61);

    public Game(int DELAY){
        this.DELAY = DELAY;
        initTimer();
    }

    private void initTimer() {
        System.out.println("making timer");
        timer = new Timer(DELAY, this);
        timer.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        System.out.println("drawing");
        super.paintComponent(g);
        doDrawing(g);
    }

    private void doDrawing(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(new ColorUIResource(255,255,255));
        g2d.fillRect(-5, -5, getWidth(), getHeight());

        g2d.setColor(lineColor);
        for(int i = 0; i < Main.mapX; i++) {
            System.out.println("line at "+i*10+""+0+""+i*10+""+getHeight());
            g2d.drawLine(i*10, 0, i*10, getHeight());
        }
        for(int i = 0; i < Main.mapY; i++){
            //g2d.drawLine()
        }
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Timer");
        repaint();
    }
}
