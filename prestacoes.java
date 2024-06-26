package ListaDeExercicios;
import java.util.Scanner;

//21- A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco) prestações sem juros. Faça um programa que receba um valor de uma compra e mostre o valor das prestações.

public class prestacoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor da compra: ");
        double valorCompra = scanner.nextDouble();

        double valorPrestacao = valorCompra / 5;

        System.out.printf("O valor de cada prestação é: R$ %.2f%n", valorPrestacao);

        scanner.close();
	}

}
