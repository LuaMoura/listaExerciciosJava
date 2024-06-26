package ListaDeExercicios;
import java.util.Scanner;

//16- Leia a idade de 20 pessoas e exiba a média das idades.

public class mediaIdade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        int numeroDePessoas = 20;

        for (int i = 1; i <= numeroDePessoas; i++) {
            System.out.print("Informe a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();
            soma += idade;
        }

        double media = (double) soma / numeroDePessoas;

        System.out.printf("A média das idades das 20 pessoas é: %.2f%n", media);

        scanner.close();
	}

}
