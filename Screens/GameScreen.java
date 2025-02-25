package Screens;

import java.awt.*;
import javax.swing.*;

public class GameScreen extends JPanel {
    private Snake snake; // Reference to the snake object

    // Constructor for GameScreen
    public GameScreen(JFrame window) {
        this.setBounds(0, 0, 800, 800);
        this.setBackground(Color.WHITE); // Set background color of the JPanel
    }// end of GameScreen method

    public void addSnakeSegment(int x, int y) {
        snake = new Snake(10, 10); // Starting at (10, 10)
        snake.addHead(11, 10); // Adding a second segment for better visualization
        this.snake = snake;
        paintComponent(getGraphics());
    }// end of addSnakeSegment method

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Set background color for better visibility
        Snake current = snake;
        // Draw the snake
        g.setColor(new Color(0, 100, 0)); // Snake color
        while (current != null) {
            g.fillRect(200, 350, 80, 80); // Each segment is a 10x10 pixel square
        } // end of while loop
    }// end of paintComponent
}// end of class
