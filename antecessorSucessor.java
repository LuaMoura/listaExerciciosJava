package ListaDeExercicios;
import java.util.Scanner;

//Desenvolva um programa em Java que leia um número inteiro e imprima o seu antecessor e seu sucessor.

public class antecessorSucessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int antecessor = numero - 1;
        int sucessor = numero + 1;

        System.out.printf("Antecessor de %d: %d%n", numero, antecessor);
        System.out.printf("Sucessor de %d: %d%n", numero, sucessor);
	}

}
