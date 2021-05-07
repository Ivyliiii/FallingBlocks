import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Block {
	private final int WIDTH = 700, HEIGHT = 600;
	int x;
	int y;
	Color c;
	int speed;
	
	public Block(int x, int y, Color c, int speed) {
		this.x = x;
		this.y = y;
		this.c = c;
		this.speed = speed;
	}
	
	public int getY() {
		return y;
	}
	
	public Color getColor() {
		return c;
	}
	
	public void move() {
		y += speed;
	}

	public void paint(Graphics g) {
		g.setColor(c);
		g.fillRect(x, y, 10, 10);
		
	}
}
