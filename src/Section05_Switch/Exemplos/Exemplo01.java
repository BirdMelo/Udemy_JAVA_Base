package Section05_Switch.Exemplos;

import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner write = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 3: ");
        int num = write.nextInt();
        write.nextLine();
        switch (num) {
            case 1:
                System.out.println("azul");
                break;
            case 2:
                System.out.println("verde");
                break;
            case 3:
                System.out.println("vermelho");
                break;
            default:
                System.out.println("Escolha um número de 1 a 3");
        }
    }
}
