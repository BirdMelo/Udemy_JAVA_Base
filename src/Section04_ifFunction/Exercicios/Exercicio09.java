package Section04_ifFunction.Exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner write = new Scanner(System.in);
        ArrayList<Character> vogais = new ArrayList<>();
        vogais.add('a');
        vogais.add('e');
        vogais.add('i');
        vogais.add('o');
        vogais.add('u');

        System.out.print("Digite uma letra: ");
        char lettle = write.nextLine().toLowerCase().charAt(0);

        if(vogais.contains(lettle)) {
            System.out.println("A letra é uma vogal");
        } else {
            System.out.println("A letra é uma consoante");
        }
        write.close();
    }
}
