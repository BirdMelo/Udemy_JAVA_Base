package Section04_ifFunction.Exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner write = new Scanner(System.in);
        int num;

        System.out.print("Digite um número: ");
        num = write.nextInt();
        write.nextLine();

        if(num >= 10 && num <= 100) {
            System.out.println("Número dentro de um intervalo de [10, 100]");
        } else {
            System.out.println("Fora de um intervalor de [10, 100]");
        }

        write.close();
    }
}
