package ListaDeExercicios;
import java.util.Scanner;

//17- Leia a idade de 20 pessoas e exiba quantas pessoas s�o maiores de idade.

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

        System.out.println("O n�mero de pessoas maiores de idade (18 anos ou mais) �: " + contagemMaioresDeIdade);

        scanner.close();
	}

}
