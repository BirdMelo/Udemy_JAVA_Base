package Section04_ifFunction.Exercicios;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner write = new Scanner(System.in);
        double nota01, nota02, avg;

        System.out.print("Digite a 1° nota: ");
        nota01 = write.nextDouble();
        System.out.print("Digite a 2° nota: ");
        nota02 = write.nextDouble();

        avg = (nota01 + nota02) /2;

        if( avg >= 7.0) {
            System.out.printf("Média: %.1f | Aprovado", avg);
        } else if( avg < 5.0) {
            System.out.printf("Média: %.1f | Reprovado", avg);
        } else {
            System.out.printf("Média: %.1f | Recuperação", avg);
        }
        write.close();
    }
}
