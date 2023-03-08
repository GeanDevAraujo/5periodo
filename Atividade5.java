package LP2;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double raio;
		double pi = 3.14;
		System.out.println("Qual o raio do círculo?");
		raio = scan.nextDouble();
		System.out.println("A área do círculo é "+(pi*raio*raio));
	}

}
