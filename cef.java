package ListaDeExercicios;
import java.util.Scanner;

//A CEF concederá um crédito especial com juros de 2% aos seus clientes de acordo com o saldo médio no último ano. Fazer um programa em JAVA que leia o saldo médio de um cliente e calcule o valor do crédito de acordo com a tabela a seguir. Imprimir uma mensagem informando o saldo médio e o valor de crédito.

public class cef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o saldo médio do cliente: ");
        double saldoMedio = scanner.nextDouble();

        double valorCredito = calcularCredito(saldoMedio);

        System.out.printf("Saldo médio do cliente: R$", saldoMedio);
        System.out.printf("Valor do crédito: R$", valorCredito);
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


