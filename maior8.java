package ListaDeExercicios;
import java.util.Scanner;

//20- Escreva um programa que leia 20 n�meros do usu�rio e exiba quantos n�meros s�o maiores do que 8.

public class maior8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        int totalNumeros = 20;

        for (int i = 1; i <= totalNumeros; i++) {
            System.out.print("Informe o n�mero " + i + ": ");
            int numero = scanner.nextInt();
            if (numero > 8) {
                contador++;
            }
        }

        System.out.println("A quantidade de n�meros maiores que 8 �: " + contador);
        
        scanner.close();
	}

}
