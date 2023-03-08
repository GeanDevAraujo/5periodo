package LP2;

import java.util.Scanner;

public class Tarefa1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double C;
        double F;
        System.out.println("Digite a temperatura em Farenheit:");
        F = scan.nextDouble();
        C = (5) * (F - 32) / (9);
        System.out.println("A temperatura em graus Celsius é de " + C);
        scan.close();
    }
}