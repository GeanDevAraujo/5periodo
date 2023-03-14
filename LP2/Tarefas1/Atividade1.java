package LP2.Tarefas1;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int numero1, numero2, numero3;
		System.out.println("Digite o primeiro número");
		numero1 = scan.nextInt();
		System.out.println("Digite o segundo número");
		numero2 = scan.nextInt();
		System.out.println("Digite o terceiro número");
		numero3 = scan.nextInt();
		System.out.println("Sua ordem   : " + numero1 + " | " + numero2 + " | " + numero3);
		System.out.println("Nossa ordem : " + numero3 + " | " + numero2 + " | " + numero1);

	}

}
