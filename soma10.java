package ListaDeExercicios;
import java.util.Scanner;

//14- Escreva um algoritmo que leia 10 números do usuário e calcule a soma desses números.

public class soma10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        int soma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Informe o número " + i + ": ");
            int numero = scanner.nextInt();
            soma += numero;
        }

        System.out.println("A soma dos 10 números é: " + soma);

        scanner.close();
	}

}
