package LP2.Tarefas2;

import java.util.Scanner;

public class Tarefa3 {
    public static void main(String[] args) {
        int formula;
        int a1, n, r;
        Scanner scan = new Scanner(System.in);
        System.out.println("Fórmula da progressão Aritmética : an = a1 + (n – 1) . r");
        System.out.println("Digite o primeiro número da progressão:");
        a1 = scan.nextInt();
        System.out.println(" Posição do termo na sequência que se deseja:");
        n = scan.nextInt();
        System.out.println("Qaul a razão(neste caso soma) entre os termos envolvidos.");
        r = scan.nextInt();
        formula = a1 + (n - 1) * r;
        System.out.println("O enézimo número se encontra na posição " + formula);
    }
}
