// Name: 
// Class: CS 240
// Assignment: 
// File: SnakeGame.java

import javax.swing.JFrame;

import Screens.GameScreen;
import Screens.TitleScreen;

public class SnakeGame {
    // window size
    public static final int WINDOW_WIDTH = 800;
    public static final int WINDOW_HEIGHT = 600;

    public static TitleScreen titleScreen;
    public static GameScreen gameScreen;

    public static void main(String[] args) {

        // setup game window
        JFrame window = new JFrame("Snake Game");
        window.setLayout(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        // setup game screens
        gameScreen = new GameScreen(window);
        titleScreen = new TitleScreen(window, event -> {
            startButtonClicked(window);
        });

        // show window
        window.setVisible(true);
    }

    private static void startButtonClicked(JFrame parent) {
        titleScreen.setVisible(false);
        gameScreen.setVisible(true);
    }
}
