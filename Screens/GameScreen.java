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

// 
public class GameScreen extends JComponent {

    // text for the game score
    private JLabel gameScore;

    public GameScreen(JFrame parent) {
        setVisible(false);
        setSize(parent.getSize());

        // create score text
        {
            gameScore = new JLabel("Score: ");
            gameScore.setBounds(32*18, 200, parent.getWidth(), 200);
            gameScore.setFont(new Font("SansSerif", Font.BOLD, 48));
            gameScore.setForeground(Color.DARK_GRAY);
            gameScore.setHorizontalAlignment(JLabel.CENTER);
            
            add(gameScore);
        }

        // add the screen to the parent
        parent.add(this);
    }

    // updates the score label
    public void setScore(int score) {
        gameScore.setText(
            String.format("Score: %d", score)
        );
    }
}
