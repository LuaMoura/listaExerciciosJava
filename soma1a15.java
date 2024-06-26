package ListaDeExercicios;

//12- Escreva um programa que calcule a soma dos números de 1 a 15.

public class soma1a15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int soma = 0;
        for (int i = 1; i <= 15; i++) {
            soma += i;
        }
        System.out.println("A soma dos números de 1 a 15 é: " + soma);
	}

}
