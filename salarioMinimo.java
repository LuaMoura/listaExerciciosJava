package ListaDeExercicios;
import java.util.Scanner;

//Crie um programa que leia o valor do salário mínimo e o valor do salário de um usuário, calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado. (Salário mínimo = R$1.212,00).

public class salarioMinimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        double salarioMinimo = 1212.00;

        System.out.print("Digite o valor do salário do usuário: ");
        double salarioUsuario = scanner.nextDouble();

        double quantidadeSalariosMinimos = calcularQuantidadeSalariosMinimos(salarioUsuario, salarioMinimo);

        System.out.printf("O usuário ganha %.2f salários mínimos.%n", quantidadeSalariosMinimos);

        scanner.close();
    }

    public static double calcularQuantidadeSalariosMinimos(double salarioUsuario, double salarioMinimo) {
        return salarioUsuario / salarioMinimo;
	}

}
