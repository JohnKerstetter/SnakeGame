// Name: 
// Class: CS 240
// Assignment: 
// File: SnakeGame.java

package Screens;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GameScreen extends JComponent {

    private JLabel gameScore;

    public GameScreen(JFrame parent) {
        setSize(parent.getSize());

        // score text
        {
            gameScore = new JLabel("Score: ");
            gameScore.setBounds(32*18, 200, parent.getWidth(), 200);
            gameScore.setFont(new Font("SansSerif", Font.BOLD, 48));
            gameScore.setForeground(Color.DARK_GRAY);
            gameScore.setHorizontalAlignment(JLabel.CENTER);
            
            add(gameScore);
        }

        setVisible(false);
        parent.add(this);
    }

    public void setScore(int score) {
        gameScore.setText(
            String.format("Score: %d", score)
        );
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // drawing logic
    }
}
