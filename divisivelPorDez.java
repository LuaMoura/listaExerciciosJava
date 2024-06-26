package ListaDeExercicios;
import java.util.Scanner;
//Escreva um programa em Java, que leia um n�mero e informe se ele � divis�vel por 10, por 5 ou por 2 ou se n�o � divis�vel por nenhum deles.

public class divisivelPorDez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um numero inteiro: ");
        int numero = scanner.nextInt();
        
        String resultado = verificarDivisibilidade(numero);
        System.out.println(resultado);
    }
    
    public static String verificarDivisibilidade(int numero) {
        if (numero % 10 == 0) {
            return numero + " � divis�vel por 10.";
        } else if (numero % 5 == 0) {
            return numero + " � divis�vel por 5.";
        } else if (numero % 2 == 0) {
            return numero + " � divis�vel por 2.";
        } else {
            return numero + " n�o � divis�vel por 10, 5 ou 2.";
        }
    }
}
	


