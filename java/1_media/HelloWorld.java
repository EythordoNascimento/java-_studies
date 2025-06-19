import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        double nota1;
        double nota2;
        double media;

        System.out.println("Digite sua primeira nota: ");
        nota1 = input.nextDouble();

        System.out.println("Digite sua segunda nota: ");
        nota2 = input.nextDouble();

        media = (nota1 + nota2) / 2;

        System.out.println("A média do aluno foi" + media);
    }
}


