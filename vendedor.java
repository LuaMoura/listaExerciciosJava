package ListaDeExercicios;
import java.util.Scanner;

//11- Escrever um programa que leia o nome de um vendedor, o seu sal�rio fixo e o total de vendas efetuadas por ele no m�s (em dinheiro). Sabendo que este vendedor ganha 15% de comiss�o sobre suas vendas efetuadas, informar o seu nome, o sal�rio fixo e sal�rio no final do m�s.

public class vendedor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome do vendedor: ");
        String nome = scanner.nextLine();

        System.out.print("Informe o sal�rio fixo do vendedor: ");
        double salarioFixo = scanner.nextDouble();

        System.out.print("Informe o total de vendas efetuadas pelo vendedor no m�s: ");
        double totalVendas = scanner.nextDouble();

        double comissao = totalVendas * 0.15;

        double salarioFinal = salarioFixo + comissao;

        System.out.println("Nome do vendedor: " + nome);
        System.out.printf("Sal�rio fixo: %.2f%n", salarioFixo);
        System.out.printf("Sal�rio final no m�s: %.2f%n", salarioFinal);

        scanner.close();
    }
}
