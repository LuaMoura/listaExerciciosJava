package ListaDeExercicios;
import java.util.Scanner;

//A CEF conceder� um cr�dito especial com juros de 2% aos seus clientes de acordo com o saldo m�dio no �ltimo ano. Fazer um programa em JAVA que leia o saldo m�dio de um cliente e calcule o valor do cr�dito de acordo com a tabela a seguir. Imprimir uma mensagem informando o saldo m�dio e o valor de cr�dito.

public class cef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o saldo m�dio do cliente: ");
        double saldoMedio = scanner.nextDouble();

        double valorCredito = calcularCredito(saldoMedio);

        System.out.printf("Saldo m�dio do cliente: R$", saldoMedio);
        System.out.printf("Valor do cr�dito: R$", valorCredito);
    }

    public static double calcularCredito(double saldoMedio) {
        double credito = 0;

        if (saldoMedio > 0 && saldoMedio <= 500) {
            credito = 0;
        } else if (saldoMedio > 500 && saldoMedio <= 1000) {
            credito = saldoMedio * 0.3;
        } else if (saldoMedio > 1000 && saldoMedio <= 3000) {
            credito = saldoMedio * 0.4;
        } else if (saldoMedio > 3000) {
            credito = saldoMedio * 0.5;
        }

        credito *= 1.02;

        return credito;
		    }
	}


