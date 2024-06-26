package ListaDeExercicios;
import java.util.Scanner;

//Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos números 4, 5 e 6. A soma das duas médias. A média das médias.

public class mediaAritmetica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] numeros1 = {8, 9, 7};
        int[] numeros2 = {4, 5, 6};

        double media1 = calcularMedia(numeros1);

        double media2 = calcularMedia(numeros2);

        double somaMedias = media1 + media2;

        double mediaDasMedias = somaMedias / 2;

        System.out.printf("Média dos números 8, 9 e 7: %.2f%n", media1);
        System.out.printf("Média dos números 4, 5 e 6: %.2f%n", media2);
        System.out.printf("Soma das duas médias: %.2f%n", somaMedias);
        System.out.printf("Média das médias: %.2f%n", mediaDasMedias);
    }

    public static double calcularMedia(int[] numeros) {
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        return (double) soma / numeros.length;
    }
}
	


