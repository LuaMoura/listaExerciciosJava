package ListaDeExercicios;
import java.util.Scanner;

//13- Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de conversão é: F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.

public class grausCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe a temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (9 * celsius + 160) / 5;

        System.out.printf("A temperatura em graus Fahrenheit é: %.2f%n", fahrenheit);

        scanner.close();
	}

}
