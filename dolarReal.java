package ListaDeExercicios;
import java.util.Scanner;

//19- Elaborar um programa que efetue a apresenta��o do valor da convers�o em real (R$) de um valor lido em d�lar (US$). O programa dever� solicitar o valor da cota��o do d�lar e tamb�m a quantidade de d�lares dispon�veis com o usu�rio.

public class dolarReal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a cota��o do d�lar (US$ para R$): ");
        double cotacaoDolar = scanner.nextDouble();

        System.out.print("Informe a quantidade de d�lares dispon�veis (US$): ");
        double quantidadeDolares = scanner.nextDouble();

        double valorEmReais = quantidadeDolares * cotacaoDolar;

        System.out.printf("O valor em reais (R$) �: %.2f%n", valorEmReais);

        scanner.close();
	}

}
