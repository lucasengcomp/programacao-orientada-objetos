package uni.formas.d1;

import java.awt.Graphics2D;

public class Linha extends FormaD1 {

	private Ponto ponto1;
	private Ponto ponto2;

	public Linha(float x1, float y1, float x2, float y2) {
		ponto1 = new Ponto(x1, y1);
		ponto2 = new Ponto(x2, y2);
	}
	
	@Override
	public float getComprimento() {
		return (float) Math.sqrt(
				Math.pow(ponto1.getX() - ponto2.getX(), 2)
				+
				Math.pow(ponto1.getY() - ponto2.getY(), 2)
				);
	}
	
	@Override
	public void print(Graphics2D g2) {
		g2.drawLine((int)ponto1.getX(), 
				(int)ponto1.getY(), 
				(int)ponto2.getX(), 
				(int)ponto2.getY());
	}

}
