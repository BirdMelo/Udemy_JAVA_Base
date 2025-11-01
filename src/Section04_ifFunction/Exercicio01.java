package Section04_ifFunction;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner write = new Scanner(System.in);
        int num;
        System.out.print("Digite um número: ");
        num = write.nextInt();
        write.nextLine();

        if(num > 0) {
            System.out.println("Número positivo");
        } else {
            System.out.println("Número não é positivo");
        }
        write.close();
    }
}
