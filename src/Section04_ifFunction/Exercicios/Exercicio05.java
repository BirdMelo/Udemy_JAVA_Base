package Section04_ifFunction.Exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner write = new Scanner(System.in);
        int num;

        System.out.print("Digite um número: ");
        num = write.nextInt();
        write.nextLine();

        if( num % 3 == 0 && num % 5 == 0 ) {
            System.out.printf("Número %d é divisivel por 3 e 5", num);
        } else {
            System.out.printf("Numero %d não é divisivel por 3 e 5 ao mesmo tempo", num);
        }

        write.close();
    }
}
