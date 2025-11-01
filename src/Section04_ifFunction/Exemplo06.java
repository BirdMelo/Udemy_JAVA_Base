package Section04_ifFunction;

import java.util.Scanner;

public class Exemplo06 {
    public static void main(String[] args) {
        Scanner write = new Scanner(System.in);
        String response;
        boolean hasDrivesLicense;
        System.out.println("Você possui cardeira de motorista?");
        response = write.nextLine().toLowerCase();

        hasDrivesLicense = response.equals("sim");

        if(!hasDrivesLicense) {
            System.out.println("Você não pode dirigir!");
        }
    }
}
