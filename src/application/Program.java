package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Calculator;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Calculator calc = new Calculator();
		Scanner sc = new Scanner(System.in);
		System.out.println("Compras internacionais com Nubank");
		System.out.print("Informe o valor do produto em dolar: $");
		calc.dollar = sc.nextDouble();
		System.out.print("Informe o valor atual do dolar pelo PTAX do Banco Central (https://www.bcb.gov.br/): R$");
		calc.ptax = sc.nextDouble();

		System.out.printf("Valor total da compra = R$%.2f", calc.calcIOF());

		sc.close();

	}

}