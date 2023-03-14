package LP2.Tarefas1;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double raio;
		double pi = 3.14;
		System.out.println("Qual o raio do c�rculo?");
		raio = scan.nextDouble();
		System.out.println("A �rea do c�rculo � " + (pi * raio * raio));
	}

}
