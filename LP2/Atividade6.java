package LP2;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		double largura, altura;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite quantos metros de largura:");
		largura = scan.nextDouble();
		System.out.println("Digite quantos metros de altura:");
		altura = scan.nextDouble();

		double metroQuadrado = largura*altura;
		double totalDeLitros = (metroQuadrado*300)/1000;
		System.out.println("Tota de litros para pintar será "+totalDeLitros +" litros.");
	}

}
