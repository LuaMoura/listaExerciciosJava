package ListaDeExercicios;
import java.util.Scanner;

//22- Faça um programa que leia 20 números e, ao final, escreva quantos estão entre 0 e 100.

public class entre0e100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        int totalNumeros = 20;

        for (int i = 1; i <= totalNumeros; i++) {
            System.out.print("Informe o número " + i + ": ");
            int numero = scanner.nextInt();
            if (numero >= 0 && numero <= 100) {
                contador++;
            }
        }

        System.out.println("A quantidade de números entre 0 e 100 é: " + contador);

        scanner.close();
	}

}
