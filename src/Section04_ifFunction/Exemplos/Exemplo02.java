package Section04_ifFunction.Exemplos;

public class Exemplo02 {
    public static void main(String[] args) {
        double nota = 6.0;
        if(nota >= 7) {
            System.out.println("Aluno aprovado");
        } else if (nota >= 5.0) {
            System.out.println("Aluno em recuperação");
        } else {
            System.out.println("Aluno reprovado");
        }
    }
}
