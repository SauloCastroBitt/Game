package view;

import java.util.Scanner;

import model.Calcular;

public class Game {

	static Scanner teclado = new Scanner(System.in);
	static int pontos = 0;
	static Calcular calc;

	public static void main(String[] args) {
		Game.jogar();

	}

	public static void jogar() {
		System.out.println("Informe o nivel de dificuldade desejado [1,2,3 ou 4]: ");
		int dificuldade = Game.teclado.nextInt();

		Game.calc = new Calcular(dificuldade);

		System.out.println("Informe o resultado para a seuinte opera��o: ");

		// somar
		if (calc.getOperacao() == 0) {
			System.out.println(calc.getValor1() + " + " + calc.getValor2());
			int resposta = Game.teclado.nextInt();

			if (calc.somar(resposta)) {
				Game.pontos += 1;
				System.out.println("Voce tem " + Game.pontos + " ponto(s). ");
			}
		}
		// diminuir
		else if (calc.getOperacao() == 1) {
			System.out.println(calc.getValor1() + " - " + calc.getValor2());
			int resposta = Game.teclado.nextInt();

			if (calc.diminuir(resposta)) {
				Game.pontos += 1;
				System.out.println("Voce tem " + Game.pontos + " ponto(s). ");
			}
		}
		// multiplicar
		else if (calc.getOperacao() == 2) {
			System.out.println(calc.getValor1() + " * " + calc.getValor2());
			int resposta = Game.teclado.nextInt();

			if (calc.multiplicar(resposta)) {
				Game.pontos += 1;
				System.out.println("Voce tem " + Game.pontos + " ponto(s). ");
			}
		}
		
		else { 
			System.out.println("A opera��o " + calc.getOperacao() + "n�o � reconhecida. ");
		}
		
		System.out.println("Deseja continuar? [1 - sim, 0 - n�o] " );
		int continuar = Game.teclado.nextInt();
		
		if(continuar == 1) {
			Game.jogar();
		}else {
			System.out.println("Voc� fez " + Game.pontos + "ponto(s). ");
			System.out.println("At� a proxima!");
				System.exit(0);
		}
	}
}
