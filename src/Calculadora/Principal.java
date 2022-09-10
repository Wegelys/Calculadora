package Calculadora;

import java.util.Scanner;

public class Principal {

	static void menu() {
		System.out.println("SUUUPER CALCULADORA");
		System.out.println("1 - ADIÇÃO");
		System.out.println("2 - SUBTRAÇÃO");
		System.out.println("3 - MULTIPLICAÇÃO");
		System.out.println("4 - DIVISÃO");
		System.out.println("0 - SAIR");
	}
	public static void main(String[]args) {
		Scanner teclado = new Scanner(System.in);
		double numero1, numero2;
		String opcao;
		
		
		
		System.out.println("Informe o primeiro numero");
		numero1= teclado.nextDouble();
		System.out.println("Informe o segundo numero");
		numero2 = teclado.nextDouble();
		
		
		do {
			menu();
			opcao = teclado.nextLine();
			
			switch (opcao) {
			case "1" :
				calcAdicao somar = new calcAdicao();
				somar.adicao(numero1 , numero2);
				break;
			case "2" :
				calcSubtracao subtrair = new calcSubtracao();
				subtrair.subtracao (numero1 , numero2);
				break;
			case "3" :
				calcMultiplicacao multiplicar = new calcMultiplicacao();
				multiplicar.multiplicacao(numero1 , numero2);
			case "4" :
				calcDivisao dividir = new calcDivisao();
				dividir.divisao(numero1 , numero2);
				break;
			case "0" :
				teclado.close();
				return;
				
			default:
				System.out.println("Opcao Invalida");
			}
			
		}while(true);
	}
}
