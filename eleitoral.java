package ListaDeExercicios;
import java.util.Scanner;

//Crie um programa em JAVA que leia a idade de uma pessoa e informe a sua classe eleitoral: · não eleitor (abaixo de 16 anos); · eleitor obrigatório (entre a faixa de 18 e menor de 65 anos); · eleitor facultativo (de 16 até 18 anos e maior de 65 anos, inclusive).

public class eleitoral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();

        if (idade < 16) {
            System.out.println("Não eleitor");
        } else if (idade >= 18 && idade < 65) {
            System.out.println("Eleitor obrigatório");
        } else if ((idade >= 16 && idade < 18) || idade >= 65) {
            System.out.println("Eleitor facultativo");
        }
	}
	
}
        

