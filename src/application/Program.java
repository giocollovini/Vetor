package application;

import java.util.Locale;
import java.util.Scanner;

import general.Estudantes;
import general.VetTipoClass;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = 0;
		int aux = 0;
		String name, email;
		double price;
		int quarto = 0;
		
		System.out.println("Programa para criar um vetor");
		System.out.println("Pergunta quantidade de linhas, informa��es a serem incluidas e mostra os dados. ");
		System.out.println();
		System.out.print("Entre com a quantidade de linhas do Vetor: ");
		n = sc.nextInt();

		VetTipoClass[] vect = new VetTipoClass[n];

		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			aux++;
			System.out.print("Entre com o " + aux + "� nome do Vetor: ");
			name = sc.nextLine();
			System.out.print("Entre com o " + aux + "� pre�o do Vetor: ");
			price = sc.nextDouble();
			vect[i] = new VetTipoClass(name, price);
		}

		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}

		double avg = sum / vect.length;
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);

		// ------------------------------------------------------------------------------------
		
		System.out.println();
		System.out.println("=====================================================================");
		System.out.println("Programa para aluguel de Quantos");
		System.out.println("Pergunta quantos quartos a serem alugados e mostra informa��es do aluguel. ");
		// Criado o vetor com todas as posi��es vazias
		Estudantes[] vectEstudantes = new Estudantes[10];
		
		System.out.println();
		System.out.print("Quantos quartos ser�o alugados? ");
		n = sc.nextInt();
		sc.nextLine();
		
		aux = 0;
		for (int i = 0; i < n; i++) {
			aux++;
			System.out.println();
			System.out.println("Aluguel #" + aux + ":");
			System.out.print("Nome: ");
			name = sc.nextLine();
			System.out.print("Email: ");
			email = sc.nextLine();
			System.out.print("Quarto[1 - 9]: ");
			quarto = sc.nextInt();
			sc.nextLine();
			vectEstudantes[quarto] = new Estudantes(name, email, quarto);
		}

		System.out.println();
		System.out.println("Quartos Ocupados:");
		for (int i = 0; i < 10; i++) {
			if (vectEstudantes[i] != null) {
				System.out.println(vectEstudantes[i]);
			}
		}

		sc.close();
	}

}
