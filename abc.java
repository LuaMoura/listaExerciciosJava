package ListaDeExercicios;
import java.util.Scanner;
import java.util.Arrays;

//Dados três valores A, B e C, construa um programa em JAVA, que imprima os valores de forma descendente (do maior para o menor).

public class abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int A = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int B = scanner.nextInt();

        System.out.print("Digite o valor de C: ");
        int C = scanner.nextInt();

        int[] valores = {A, B, C};

        Arrays.sort(valores);

        System.out.println("Valores em ordem decrescente:");
        for (int i = valores.length - 1; i >= 0; i--) {
            System.out.println(valores[i]);
        }
	}
	
}




