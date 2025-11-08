package Section05_Switch.Exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner write = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        char letra = write.nextLine().charAt(0);
        switch (letra) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.printf("Letra %s é uma vogal", letra);
                break;
            default:
                if(Character.isLetter(letra)) {
                    System.out.printf("Letra %s é uma consoante", letra);
                } else {
                    System.out.println("Caracter invalido. Digite uma letra");
                }
        }
        write.close();
    }
}
