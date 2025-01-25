// Name: 
// Class: CS 240
// Assignment: 
// File: SnakeGame.java

import javax.swing.JFrame;

import Screens.GameScreen;
import Screens.TitleScreen;

public class SnakeGame {
    public static final int WINDOW_WIDTH = 800;
    public static final int WINDOW_HEIGHT = 600;

    public static TitleScreen titleScreen;
    public static GameScreen gameScreen;

    public static void main(String[] args) {

        // game window
        JFrame window = new JFrame("Snake Game");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        window.setLayout(null);

        gameScreen = new GameScreen(window);
        titleScreen = new TitleScreen(window, event -> {
            startButtonClicked(window);
        });

        window.setVisible(true);

        System.out.println("end");
    }

    private static void startButtonClicked(JFrame parent) {
        titleScreen.setVisible(false);
        gameScreen.setVisible(true);
    }
}
