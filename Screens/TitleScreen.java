//Name: Yosyp Vasyliev
//Date: 01/26/2025
//Lab 2 - Objects - Snake Game
//Description: TitleScreen class for the menu

package Screens;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class TitleScreen extends JPanel {
    public TitleScreen(JFrame window, ActionListener startButtonClicked) {
        try {
            // Use ClassLoader to fetch the font file
            InputStream fontStream = getClass().getResourceAsStream("/resources/CaviarDreams_Bold.ttf");
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, fontStream).deriveFont(70f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(customFont);

            // Use the custom font
            JButton startButton = new JButton("START GAME");
            
            startButton.setFont(customFont);
            startButton.addActionListener(startButtonClicked);

            // Set other button styles
            startButton.setForeground(Color.WHITE);
            startButton.setBackground(new Color(0, 250, 5)); // Initial button color
            startButton.setOpaque(true); // Ensure custom background is visible
            startButton.setBorderPainted(false); // Remove border
            startButton.setHorizontalTextPosition(SwingConstants.CENTER); // Center text horizontally
            startButton.setVerticalTextPosition(SwingConstants.CENTER); // Center text vertically
            startButton.setHorizontalAlignment(SwingConstants.CENTER); // Align text and icon to center

            // Add MouseListener to change color on hover
            startButton.addMouseListener(new MouseAdapter() {
                Color originalColor = startButton.getBackground();
                Color hoverColor = new Color(0, 100, 5); // Hover color

                @Override
                public void mouseEntered(MouseEvent e) {
                    startButton.setBackground(hoverColor);
                }// end of mouseEntered method for hover

                @Override
                public void mouseExited(MouseEvent e) {
                    startButton.setBackground(originalColor);
                }// end of mouseExited method for original
            });

            // Use a proper layout manager
            this.setLayout(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.insets = new Insets(10, 10, 10, 10);
            this.add(startButton, gbc);
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
            System.out.println("Failed to load custom font.");
        }// end of catch
    }// end of TitleScreen method
}//end of TitleScreen class 