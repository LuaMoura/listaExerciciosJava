package ListaDeExercicios;
import java.util.Scanner;

//11- Escrever um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o seu nome, o salário fixo e salário no final do mês.

public class vendedor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome do vendedor: ");
        String nome = scanner.nextLine();

        System.out.print("Informe o salário fixo do vendedor: ");
        double salarioFixo = scanner.nextDouble();

        System.out.print("Informe o total de vendas efetuadas pelo vendedor no mês: ");
        double totalVendas = scanner.nextDouble();

        double comissao = totalVendas * 0.15;

        double salarioFinal = salarioFixo + comissao;

        System.out.println("Nome do vendedor: " + nome);
        System.out.printf("Salário fixo: %.2f%n", salarioFixo);
        System.out.printf("Salário final no mês: %.2f%n", salarioFinal);

        scanner.close();
    }
}
