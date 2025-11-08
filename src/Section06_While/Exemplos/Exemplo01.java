package Section06_While.Exemplos;

public class Exemplo01 {
    public static void main(String[] args) {
        System.out.println("\n1. Contar de 1 até 5 com while\n");
        int contador = 1;
        while (contador <= 5) {
            System.out.printf("Contador: %d\n", contador);
            contador++;
        }
        System.out.println("\n2. Contagem regresiva com while\n");
        while (contador >= 1) {
            System.out.printf("Contador: %d\n", contador);
            contador--;
        }

        System.out.println("\n3. Soma dos números de 1 até 10 com while\n");
        int soma = 0;
        int i = 1;
        while (i <= 10) {
            soma += i;
            i++;
        }
        System.out.printf("A soma de 1 até 10 é: %d", soma);

    }
}
