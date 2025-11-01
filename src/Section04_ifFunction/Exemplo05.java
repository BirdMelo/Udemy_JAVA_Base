package Section04_ifFunction;

import java.util.Scanner;

public class Exemplo05 {
    public static void main(String[] args) {
        Scanner write = new Scanner(System.in);
        int age;
        String isStudent;

        System.out.print("Digite sua idade: ");
        age = write.nextInt();
        write.nextLine();

        System.out.println("Você é estudante?");
        isStudent = write.nextLine().toLowerCase();

        if(age < 18 || isStudent.equals("sim")) {
            System.out.println("Possui direita a meia entrada");
        } else {
            System.out.println("Não possui direita a meia entrada");
        }

        write.close();
    }
}
