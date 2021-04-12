package me.alien.minesweper;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame{
    static int hight = 268;
    static int width = 290;
    static int DELAY = 100;
    public static final int mapY = ((int)(hight-8)/10);
    public static final int mapX = ((int)(width-8)/10);

    public Main(){
        initUI();
    }

    private void initUI(){
        Game game = new Game(DELAY);
        add(game);
        addKeyListener(game);

        setTitle("Snake");
        setSize(width, hight);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setMinimumSize(getSize());
        setMaximumSize(getSize());
    }

    private void add(Game game) {
    }

    public static void main(String[] args){
        /*if(args.length>0){
            System.out.println(args[0]);
            if(args[0].equals("-debug")){
                DELAY = 500;
                Game.showID = true;
            }else if(args[0].equals("-debug:noid")){
                Game.showID=false;
                DELAY=500;
            }
        }else{
            Game.showID=false;
        }*/
        EventQueue.invokeLater((new Runnable() {
            @Override
            public void run() {
                Main ex = new Main();
                ex.setVisible(true);
            }
        }));
    }
}
