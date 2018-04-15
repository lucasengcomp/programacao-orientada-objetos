package uni.formas.d2;

import uni.formas.d1.Ponto;

import java.awt.*;

public class Quadrado extends FormaD2{
    private float lado;
    private Ponto ponto;

    public Quadrado(float x, float y, float lado) {
        ponto = new Ponto(x, y);
        this.lado = lado;
    }

    public float getArea() {
        return lado * lado;
    }

    public void print(Graphics2D g2) {
        g2.drawRect((int) ponto.getX(), (int) ponto.getY(),
                (int) lado, (int) lado);
    }
}
