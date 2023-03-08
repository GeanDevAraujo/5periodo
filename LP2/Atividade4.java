package LP2;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int idade, somaDiasDeVida;
		String nome;
		System.out.println("Qual seu nome?");
		nome = scan.next();
		System.out.println("Qual sua idade?");
		idade = scan.nextInt();
		
		System.out.println(nome+",você tem "+(idade*365)+" dias de vida!");
	}

}
