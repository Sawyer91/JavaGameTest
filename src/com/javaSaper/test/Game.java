package com.javaSaper.test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.util.Random;

/**
 * Created by sawyer on 30.09.16.
 */

public class Game extends JFrame {

    final String PROGRAM_NAME = "Сапер";
    final String SING_OF_FLAG = "f";
    final int BLOCK_SIZE = 30;
    final int FIELD_SIZE = 9;
    final int FIELD_DX = 6;
    final int FIELD_DY = 28;
    final int START_LOCATION = 200;
    final int MOUSE_BUTTON_LEFT = 1;
    final int MOUSE_BUTTON_RIGHT = 3;
    final int NUMBER_OF_MINES = 10;
    final int[] COLOR_OF_NUMBERS = {0x0000FF, 0x008000, 0xFF0000, 0x800000, 0x0};
    Cell[][] field = new Cell[FIELD_SIZE][FIELD_SIZE];
    Random random = new Random();
    int countOpenedCells;
    boolean youWon, bang;
    int bangX, bangY;


    public static void main (String [] args){
        new Game();
    }

    Game(){
        setTitle(PROGRAM_NAME);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(START_LOCATION, START_LOCATION, FIELD_SIZE*BLOCK_SIZE + FIELD_DX, FIELD_SIZE*BLOCK_SIZE + FIELD_DY);
        setResizable(false);
        final TimerLabel timerLabel = new TimerLabel();
        timerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        final Canvas canvas = new Canvas();
        canvas.setBackground(Color.WHITE);
        canvas.addMouseListener(new MouseAdapter() {
        });
    }
}
