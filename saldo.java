package ListaDeExercicios;
import java.util.Scanner;

//10- Informar um saldo e imprimir o saldo com reajuste de 1.5%.

public class saldo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o saldo: ");
        double saldo = scanner.nextDouble();

        double reajuste = saldo * 0.015;
        double saldoReajustado = saldo + reajuste;

        System.out.printf("O saldo com reajuste de 1.5%% é: %.2f%n", saldoReajustado);

        scanner.close();
	}

}
