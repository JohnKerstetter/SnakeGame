package Objects;

import java.util.Random;
import java.awt.Color;
import java.awt.Graphics;

public class Fruit {
    
    // position
    private int x;
    private int y;
    private Random rand;

    // constructor
    public Fruit() {
        rand = new Random();
        randomizePosition(10, 10);
    }

    // move the fruit to a random position on the board
    public void randomizePosition(int gridWidth, int gridHeight) {
        x = Math.abs(rand.nextInt()) % gridWidth;
        y = Math.abs(rand.nextInt()) % gridHeight;
    }

    // draw the fruit
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(
            x * 40,
            y * 40,
            40,
            40
        );
    }
}
