package ListaDeExercicios;
import java.util.Scanner;

//15- Leia a idade de 20 pessoas e exiba a soma das idades.

public class somaIdade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        int soma = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Informe a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();
            soma += idade;
        }

        System.out.println("A soma das idades das 20 pessoas é: " + soma);

        scanner.close();
	}

}
