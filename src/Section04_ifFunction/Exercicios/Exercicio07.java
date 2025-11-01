package Section04_ifFunction.Exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner write = new Scanner(System.in);
        int year;

        System.out.print("Digite um ano: ");
        year = write.nextInt();
        write.nextLine();

        if(year%4 == 0 && (!(year%100 == 0) || year%400 == 0)) {
            System.out.println("Ano é bissexto");
        } else {
            System.out.println("Ano não é bissexto");
        }

        write.close();
    }
}
