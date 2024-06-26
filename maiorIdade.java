package ListaDeExercicios;
import java.util.Scanner;

//17- Leia a idade de 20 pessoas e exiba quantas pessoas são maiores de idade.

public class maiorIdade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        int contagemMaioresDeIdade = 0;
        int numeroDePessoas = 20;

        for (int i = 1; i <= numeroDePessoas; i++) {
            System.out.print("Informe a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();
            if (idade >= 18) {
                contagemMaioresDeIdade++;
            }
        }

        System.out.println("O número de pessoas maiores de idade (18 anos ou mais) é: " + contagemMaioresDeIdade);

        scanner.close();
	}

}
