package objects;

import java.util.Random;
import java.awt.Color;
import java.awt.Graphics;

public class Fruit {
    private Random rand;
    private int x;
    private int y;

    public Fruit() {
        rand = new Random();
        randomizePosition(10, 10);
    }

    public void randomizePosition(int gridWidth, int gridHeight) {
        x = Math.abs(rand.nextInt()) % gridWidth;
        y = Math.abs(rand.nextInt()) % gridHeight;
    }

    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(
            x * 32,
            y * 32,
            32,
            32
        );
    }
}
