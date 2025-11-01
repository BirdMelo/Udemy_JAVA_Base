package Section04_ifFunction;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner write = new Scanner(System.in);
        int num;

        System.out.print("Digite um número: ");
        num = write.nextInt();
        write.nextLine();

        if( num % 2 == 0) {
            System.out.println("Número é par");
        } else {
            System.out.println("Número é impar");
        }
        write.close();
    }
}
