package LP2.Tarefas1;

import java.util.Scanner;

public class Atividade3 {
	// 3 - Escreva um programa para simular uma pequena conversa do computador com o
	// usu�rio.
	// O programa deve seguir os passos:

	// a) inicialmente escreve "Ol� eu sou o N� 1, como � seu nome?";

	// b) em seguida espera que o usu�rio digite seu nome;

	// c) por fim escreve: "Bem-vindo ao clube (nome)".

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String nome;
		System.out.println("Ol� eu sou o N� 1, como � seu nome?");
		nome = scan.next();
		System.out.println("Bem-vindo ao clube " + nome + ".");

	}

}
