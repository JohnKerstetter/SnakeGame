// Name: 
// Class: CS 240
// Assignment: 
// File: SnakeGame.java

import javax.swing.JFrame;

import Screens.GameScreen;
import Screens.Snake;
import Screens.TitleScreen;
import javax.swing.*;

public class SnakeGame {

    // window size
    public static final int WINDOW_WIDTH = 800;
    public static final int WINDOW_HEIGHT = 800;

    // screens
    public static TitleScreen titleScreen;
    public static GameScreen gameScreen;
    //public static Snake snake;
    public static Snake snake;
    boolean gameRunning = true;
    public static void main(String[] args) {
        JFrame window = new JFrame("Snake Game");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        window.setLayout(null);

        // Initialize titleScreen and gameScreen
        titleScreen = new TitleScreen(window, event -> {
            startButtonClicked(window);
        });
        gameScreen = new GameScreen(window);
        Snake snake = new Snake();

        // Set bounds for titleScreen and gameScreen
        titleScreen.setBounds(0, 0, WINDOW_WIDTH, WINDOW_HEIGHT);
        gameScreen.setBounds(0, 0, WINDOW_WIDTH, WINDOW_HEIGHT);
    
        // Add title screen first
        window.add(titleScreen);
        window.add(gameScreen);
        gameScreen.setVisible(false); // Hide game screen initially
        window.setVisible(true); // Show the window after components are added

        // Example game loop with a simple condition to break
        
 
        System.out.println("end");
    }

    private static void startButtonClicked(JFrame parent) {
        titleScreen.setVisible(false);
        gameScreen.setVisible(true);
        gameScreen.addSnakeSegment(40, 40);
        gameScreen.addSnakeSegment(40, 40);
    }

    private static void moveSnake(boolean gameRunning) {
        while(gameRunning) {
            snake.addHead(40, 40);
            snake.removeTail();
            // Add your game logic here...
            gameRunning = false; // Example condition to stop the loop (replace with actual condition)
        }// end of while loop
    }// end of moveSnake method
}
