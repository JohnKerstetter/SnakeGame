// Name: 
// Class: CS 240
// Assignment: 
// File: SnakeGame.java

import javax.swing.JFrame;

import Screens.GameScreen;
import Screens.Snake;
import Screens.TitleScreen;
import javax.swing.*;
import Objects.Fruit;

public class SnakeGame extends Thread {
    // window sizes
    public static final int WINDOW_WIDTH = 800;
    public static final int WINDOW_HEIGHT = 800;

    // screens
    public static TitleScreen titleScreen;
    public static GameScreen gameScreen;
    
    // game objects
    public static Snake snake;
    public static Snake checkCollision;
    public static Fruit fruit;

    boolean gameRunning = true;
    Thread thread = new SnakeGame();

    // main method
    public static void main(String[] args) {

        // create window
        JFrame window = new JFrame("Snake Game");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        window.setLayout(null);

        // Initialize titleScreen and gameScreen
        titleScreen = new TitleScreen(window, event -> {
            startButtonClicked(window);
        });// end of titleScreen object
        gameScreen = new GameScreen(window);
        Snake snake = new Snake(10, 10);

        // Set bounds for titleScreen and gameScreen
        titleScreen.setBounds(0, 0, WINDOW_WIDTH, WINDOW_HEIGHT);
        gameScreen.setBounds(0, 0, WINDOW_WIDTH, WINDOW_HEIGHT);
    
        // Add title screen first
        window.add(titleScreen);
        window.add(gameScreen);
        gameScreen.setVisible(false); // Hide game screen initially
        window.setVisible(true); // Show the window after components are added
        System.out.println("end");
    }// end of main method
    
    private static void startButtonClicked(JFrame parent) {
        titleScreen.setVisible(false);
        gameScreen.setVisible(true);
        gameScreen.addSnakeSegment(40, 40);
        gameScreen.addSnakeSegment(40, 40);
    }// end of startButtonClicked method

    private static void gameLoop() {
        // Method for game loop
    }// end of gameLoop

    private static void moveSnake(Thread thread) {
        while(thread != null) {
            snake.addHead(10, 10);
            snake.removeTail();
            // Add your game logic here...
            //gameRunning = false; // Example condition to stop the loop (replace with actual condition)
        }// end of while loop
    }// end of moveSnake method

    private static void updateScreen() {
        // This method will update the screen
    }// end of updateScreen method

    private static void resetMethod() {
    //  Snake.checkCollision();
    //  if(checkCollision) {
    //      Snake.reset();
    //  }
    }// end of resetMethod method
}// end of SnakeGame class
