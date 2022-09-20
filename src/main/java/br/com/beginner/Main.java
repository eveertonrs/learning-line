package br.com.beginner;

import java.util.Scanner;

public class Main {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {

			System.out.println("Digite : ");
			int numero;
			numero = input.nextInt();

			if (numero % 2 == 0) {
				System.out.println("Seu numero é Par");
			} 
			else {
				System.out.println("Seu numero é Impar");
			}
		
			switch (numero) {
			case 1:
				System.out.println("Amarelo");
				break;
			case 2:
				System.out.println("Vermelho");
				break;
			case 3:
				System.out.println("Azul");
				break;
			case 4:
				System.out.println("Verde");
				break;
			case 5:
				System.out.println("Laranja");
				break;
			default:
				System.out.println("Preto");
			}
		}

	}
}
