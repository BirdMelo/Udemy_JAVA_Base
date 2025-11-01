package Section04_ifFunction.Exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner write = new Scanner(System.in);
        int num01, num02;
        System.out.print("Digite um número: ");
        num01 = write.nextInt();
        write.nextLine();

        System.out.print("Digite outro número: ");
        num02 = write.nextInt();
        write.nextLine();

        if( num01 > num02) {
            System.out.printf("%d é maior que %d", num01, num02);
        } else if (num02 > num01) {
            System.out.printf("%d é maior que %d", num02, num01);
        } else {
            System.out.println("Os 2 são iguais");
        }
        write.close();

    }
}
