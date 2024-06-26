package ListaDeExercicios;
import java.util.Scanner;

//Criar um programa em Java, que informe a quantidade total de calorias de uma refeição a partir do usuário que deverá informar o prato, a sobremesa e a bebida

public class calorias {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite seu prato: ");
		String prato;

		System.out.print("Digite sua sobremesa: ");
		String sobremesa;

		System.out.print("Digite sua bebida: ");
		String bebida;

		int totalCalorias = 0;

		switch (prato) {
		case "vegetariano":
			System.out.println("vegetariano 180 cal");
			totalCalorias += 180;
			break;
		case "peixe":
			System.out.println("peixe 230 cal");
			totalCalorias += 230;
			break;
		case "frango":
			System.out.println("frango 250 cal");
			totalCalorias += 250;
			break;
		case "carne":
			System.out.println("carne 350 cal");
			totalCalorias += 350;
			break;
		default:
			System.out.println("Prato não encontrado");
		}

		switch (sobremesa) {
		case "abacaxi":
			System.out.println("abacaxi 75 cal");
			totalCalorias += 75;
			break;
		case "sorvete diet":
			System.out.println("sorvete diet 110 cal");
			totalCalorias += 110;
			break;
		case "mouse diet":
			System.out.println("mouse diet 170 cal");
			totalCalorias += 170;
			break;
		case "mouse de chocolate":
			System.out.println("mouse de chocolate 200 cal");
			totalCalorias += 200;
			break;
		default:
			System.out.println("Sobremesa não encontrada");
		}

		switch (bebida) {
		case "chá":
			System.out.println("chá 20 cal");
			totalCalorias += 20;
			break;
		case "suco de laranja":
			System.out.println("suco de laranja 70 cal");
			totalCalorias += 70;
			break;
		case "suco de melão":
			System.out.println("suco de melão 100 cal");
			totalCalorias += 100;
			break;
		case "refrigerante diet":
			System.out.println("refrigerante diet 65 cal");
			totalCalorias += 65;
			break;
		default:
			System.out.println("Bebida não encontrada");
		}

		System.out.println("Calorias totais: " + totalCalorias + " cal");

		scanner.close();
	}

}
