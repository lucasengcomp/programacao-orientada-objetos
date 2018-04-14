package uni.formas.d1;

import java.awt.Graphics2D;

public class Ponto extends FormaD1 {

	private float x;
	private float y;
	
	public Ponto(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public float getX() {
		return this.x;
	}
	
	public float getY() {
		return this.y;
	}
	
	@Override
	public void print(Graphics2D g2) {
		g2.fillOval((int)x, (int)y, 2, 2);
	}
}
