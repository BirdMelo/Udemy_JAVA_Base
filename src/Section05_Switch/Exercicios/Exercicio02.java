package Section05_Switch.Exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner write = new Scanner(System.in);
        int num1, num2;
        char operator;

        System.out.print("Digite um número: ");
        num1 = write.nextInt();
        write.nextLine();
        System.out.print("Digite outro número: ");
        num2 = write.nextInt();
        write.nextLine();
        System.out.println("Qual operação deseja fazer?");
        operator = write.nextLine().charAt(0);
        switch (operator) {
            case '+':
                System.out.printf("%d %c %d = %d",
                        num1, operator, num2, num1 + num2);
                break;
            case '-':
                System.out.printf("%d %c %d = %d",
                        num1, operator, num2, num1 - num2);
                break;
            case '*':
                System.out.printf("%d %c %d = %d",
                        num1, operator, num2, num1 * num2);
                break;
            case '/':
                System.out.printf("%d %c %d = %.1f",
                        num1, operator, num2, (double) num1 / num2);
                break;
            default:
                System.out.println("Operador escolhido errado");
        }
        write.close();
    }
}
