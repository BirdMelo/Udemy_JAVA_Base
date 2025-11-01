package Section04_ifFunction.Exemplos;

import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        Scanner write = new Scanner(System.in);
        int age;
        String isBrazilian;

        System.out.print("Digite sua idade: ");
        age = write.nextInt();
        System.out.println("Você é Brasileiro(a)?");
        write.nextLine();
        isBrazilian = write.nextLine().toLowerCase();

        if(age > 18 && isBrazilian.equals("sim")) {
            System.out.println("Você pode votar");
        } else {
            System.out.println("Não pode votar");
        }
        write.close();
    }
}
