package Section06_While.Exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner write = new Scanner(System.in);
        double num = 0.0, sum = 0.0, count = 0.0, avg = 0.0;
        while(num != -1) {
            System.out.print("Digite um número para a soma: ");
            num = write.nextDouble();
            if(num != -1) {
                sum += num;
                count++;
            }
        }
        avg = sum/count;
        System.out.printf("A média final foi %.1f", avg);
        write.close();
    }
}
