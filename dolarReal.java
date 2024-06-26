package ListaDeExercicios;
import java.util.Scanner;

//19- Elaborar um programa que efetue a apresentação do valor da conversão em real (R$) de um valor lido em dólar (US$). O programa deverá solicitar o valor da cotação do dólar e também a quantidade de dólares disponíveis com o usuário.

public class dolarReal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a cotação do dólar (US$ para R$): ");
        double cotacaoDolar = scanner.nextDouble();

        System.out.print("Informe a quantidade de dólares disponíveis (US$): ");
        double quantidadeDolares = scanner.nextDouble();

        double valorEmReais = quantidadeDolares * cotacaoDolar;

        System.out.printf("O valor em reais (R$) é: %.2f%n", valorEmReais);

        scanner.close();
	}

}
