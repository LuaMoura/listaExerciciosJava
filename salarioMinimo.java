package ListaDeExercicios;
import java.util.Scanner;

//Crie um programa que leia o valor do sal�rio m�nimo e o valor do sal�rio de um usu�rio, calcule a quantidade de sal�rios m�nimos esse usu�rio ganha e imprima o resultado. (Sal�rio m�nimo = R$1.212,00).

public class salarioMinimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        double salarioMinimo = 1212.00;

        System.out.print("Digite o valor do sal�rio do usu�rio: ");
        double salarioUsuario = scanner.nextDouble();

        double quantidadeSalariosMinimos = calcularQuantidadeSalariosMinimos(salarioUsuario, salarioMinimo);

        System.out.printf("O usu�rio ganha %.2f sal�rios m�nimos.%n", quantidadeSalariosMinimos);

        scanner.close();
    }

    public static double calcularQuantidadeSalariosMinimos(double salarioUsuario, double salarioMinimo) {
        return salarioUsuario / salarioMinimo;
	}

}
