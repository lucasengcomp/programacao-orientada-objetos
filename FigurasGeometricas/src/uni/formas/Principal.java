package uni.formas;

import uni.formas.d1.Linha;
import uni.formas.d1.Ponto;
import uni.formas.d2.Circulo;
import uni.formas.frame.JanelaFormas;

public class Principal {

	public static void main(String[] args) {
		Ponto ponto = new Ponto(50, 87);
		
		System.out.println(ponto.getComprimento());
		
		Linha linha = new Linha(200, 5, 70, 150);
		
		System.out.println(linha.getComprimento());
		
		Circulo circulo = new Circulo(45, 12, 60f);
		
		System.out.println(circulo.getArea());
		
		JanelaFormas janelaFormas = new JanelaFormas(500, 500);
		
		janelaFormas.addForma(ponto);
		janelaFormas.addForma(linha);
		janelaFormas.addForma(circulo);
		
		janelaFormas.setVisible(true);
	}
}
