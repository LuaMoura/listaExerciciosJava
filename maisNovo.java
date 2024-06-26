package ListaDeExercicios;
import java.util.Scanner;

//18- Leia o nome e a idade de 10 pessoas e exiba o nome da pessoa mais nova.

public class maisNovo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int menorIdade = Integer.MAX_VALUE;
        String nomePessoaMaisNova = "";

        for (int i = 1; i <= 10; i++) {
            System.out.print("Informe o nome da pessoa " + i + ": ");
            String nome = scanner.nextLine();
            
            System.out.print("Informe a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();
            scanner.nextLine(); 

            if (idade < menorIdade) {
                menorIdade = idade;
                nomePessoaMaisNova = nome;
            }
        }

        System.out.println("A pessoa mais nova é: " + nomePessoaMaisNova);

        scanner.close();
    }
}