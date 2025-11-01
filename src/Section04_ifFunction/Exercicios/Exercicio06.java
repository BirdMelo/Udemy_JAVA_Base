package Section04_ifFunction.Exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner write = new Scanner(System.in);
        int num;

        System.out.print("Digite um número: ");
        num = write.nextInt();
        write.nextLine();

        if(num > 0) {
            System.out.println("O número é positivo");
        } else if (num < 0) {
            System.out.println("O número é negativo");
        } else {
            System.out.println("O número é zero");
        }

        write.close();
    }
}
