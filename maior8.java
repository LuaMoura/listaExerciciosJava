package ListaDeExercicios;
import java.util.Scanner;

//20- Escreva um programa que leia 20 números do usuário e exiba quantos números são maiores do que 8.

public class maior8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        int totalNumeros = 20;

        for (int i = 1; i <= totalNumeros; i++) {
            System.out.print("Informe o número " + i + ": ");
            int numero = scanner.nextInt();
            if (numero > 8) {
                contador++;
            }
        }

        System.out.println("A quantidade de números maiores que 8 é: " + contador);
        
        scanner.close();
	}

}
