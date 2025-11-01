package Section04_ifFunction;

import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        Scanner write = new Scanner(System.in);

        System.out.println("Digite a nota do aluno: ");
        double nota = write.nextDouble();

        if(nota >= 7) {
            System.out.println("Aluno aprovado");
        } else if (nota >= 5.0) {
            System.out.println("Aluno em recuperação");
        } else {
            System.out.println("Aluno reprovado");
        }
        write.close();
    }
}
