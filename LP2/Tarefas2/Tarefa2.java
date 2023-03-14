package LP2.Tarefas2;

import java.util.Scanner;

public class Tarefa2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double pressao, volume, temperatura;
        System.out.println("Digite os dados do pneu");
        System.out.println("Digite a pressão:");
        pressao = scan.nextDouble();

        System.out.println("Digite o volume:");
        volume = scan.nextDouble();
        System.out.println("Digite a temperatura:");
        temperatura = scan.nextDouble();
        double massaDeAr = (pressao * volume) / (0.37) * (temperatura + 460);
        System.out.println("A massa de ar desse pneu é de " + massaDeAr);

    }
}
