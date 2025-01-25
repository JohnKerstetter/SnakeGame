// Name: 
// Class: CS 240
// Assignment: 
// File: SnakeGame.java

package Screens;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TitleScreen extends JComponent {

    public TitleScreen(JFrame parent, ActionListener actionListener) {
        setSize(parent.getSize());

        // title text
        {
            JLabel text = new JLabel("Snake");
            text.setBounds(0, 100, parent.getWidth(), 100);

            text.setFont(new Font("SansSerif", Font.BOLD, 48));
            text.setBackground(Color.BLACK);
            text.setHorizontalAlignment(JLabel.CENTER);

            add(text);
        }

        // start button
        {
            JButton startButton = new JButton("Start");
            startButton.setBounds(400 - 100, parent.getHeight() - 200, 200, 100);
            startButton.setFont(new Font("SansSerif", Font.PLAIN, 32));

            startButton.addActionListener(actionListener);

            add(startButton);
        }

        parent.add(this);
    }
}
