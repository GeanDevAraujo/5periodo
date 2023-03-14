
package LP2.Tarefas1;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int A, B, C, a, b, c;
		System.out.println("Digite o primeiro n�mero respectivo ao A ");
		A = scan.nextInt();
		System.out.println("Digite o segundo n�mero respectivo ao B ");
		B = scan.nextInt();
		System.out.println("Digite o terceiro n�mero respectivo ao C ");
		C = scan.nextInt();
		System.out.println(" A recebe C; B recebe A e C recebe B");
		a = A;
		b = B;
		c = C;
		A = c;
		B = a;
		C = b;
		System.out.println("Valor de A" + A);
		System.out.println("Valor de B" + B);
		System.out.println("Valor de C" + C);

	}

}
