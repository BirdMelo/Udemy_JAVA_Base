package Section06_While.Exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner write = new Scanner(System.in);
        int num = -1;
        while (num != 0) {
            System.out.print("Digite um número[Número 0 parar o programa]: ");
            num = write.nextInt();
            write.nextLine();
        }
        System.out.println("Programa incerrado");
        write.close();
    }
}
