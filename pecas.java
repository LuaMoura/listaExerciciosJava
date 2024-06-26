package ListaDeExercicios;
import java.util.Scanner;

//Escrever um programa que leia: - a porcentagem do IPI a ser acrescido no valor das peças - o código da peça 1, valor unitário da peça 1, quantidade de peças 1 - o código da peça 2, valor unitário da peça 2, quantidade de peças 2 O programa deve calcular o valor total a ser pago e apresentar o resultado. Cálculo : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)

public class pecas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a porcentagem do IPI a ser acrescido (%): ");
        double ipi = scanner.nextDouble();

        System.out.println("\nInforme os dados da Peça 1:");
        System.out.print("Código da peça 1: ");
        int codigoPeca1 = scanner.nextInt();
        System.out.print("Valor unitário da peça 1: ");
        double valorUnitarioPeca1 = scanner.nextDouble();
        System.out.print("Quantidade de peças 1: ");
        int quantidadePeca1 = scanner.nextInt();

        System.out.println("\nInforme os dados da Peça 2:");
        System.out.print("Código da peça 2: ");
        int codigoPeca2 = scanner.nextInt();
        System.out.print("Valor unitário da peça 2: ");
        double valorUnitarioPeca2 = scanner.nextDouble();
        System.out.print("Quantidade de peças 2: ");
        int quantidadePeca2 = scanner.nextInt();

        double valorTotal = calcularValorTotal(valorUnitarioPeca1, quantidadePeca1, valorUnitarioPeca2, quantidadePeca2, ipi);

        System.out.printf("\nValor total a ser pago: R$%.2f%n", valorTotal);

        scanner.close();
    }

    public static double calcularValorTotal(double valor1, int quant1, double valor2, int quant2, double ipi) {
        double totalSemIPI = (valor1 * quant1) + (valor2 * quant2);
        double totalComIPI = totalSemIPI * (ipi / 100 + 1);
        return totalComIPI;
	}

}
