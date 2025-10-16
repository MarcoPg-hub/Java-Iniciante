package listaIfElse;

import java.util.Scanner;

public class Caloria {

	public static void main(String args[]) {

		/*
		 * Alg 147: criar um algoritmo que informe a quantidade total de caloreis de uma
		 * refeição a partir da escolha do usuário que deverá informar o prato, a
		 * sobremesa e bebidas: 
		 * Prato 					Sobremesa 					Bebida 
		 * Vegetariano 180 cal 		Abacaxi 75 cal 				Chá 20 cal 
		 * Peixe 230 cal 			Sorvete diet 110 cal 		Suco de laranja 70 cal 
		 * Frango 250 cal 			Mousse diet 170 cal 		Suco de melão 100 cal 
		 * Carne 350 cal 			Mousse chocolate 200 cal 	Refrigerante diet 65 cal
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual prato gostaria de pedir hoje?");
		System.out.println("Vegetariano - Peixe - Frango - Carne ");
		
		String prato = sc.nextLine().toUpperCase();
		int pratoCaloria = 0;
		
		if(prato.equals("VEGETARIANO")) {
			pratoCaloria = 180;
		}else if(prato.equals("PEIXE")) {
			pratoCaloria = 230;
		}else if(prato.equals("FRANGO")) {
			pratoCaloria = 250;
		}else if(prato.equals("CARNE")) {
			pratoCaloria = 350;
		}
		
		System.out.println("Qual sobremesa?");
		System.out.println("Abacaxi - Sorvete - Mousse diet - Mousse chocolate ");
		
		String sobremesa = sc.nextLine().toUpperCase();
		int sobremesaCal = 0;
		
		if(sobremesa.equals("ABACAXI")) {
			sobremesaCal = 75;
		}else if(sobremesa.equals("SORVETE")) {
			sobremesaCal = 110;
		}else if(sobremesa.equals("MOUSSE DIET")) {
			sobremesaCal = 170;
		}else if(sobremesa.equals("MOUSE CHOCOLATE")) {
			sobremesaCal = 200;
		}
		
		System.out.println("Uma bebida?");
		System.out.println("Chá - Suco de laranja - Suco de melão - Refrigerante diet");
		
		String bebida = sc.nextLine().toUpperCase();
		int bebidaCal = 0;
		
		if(bebida.equals("CHÁ")) {
			bebidaCal = 75;
		}else if(bebida.equals("SUCO DE LARANJA")) {
			bebidaCal = 110;
		}else if(sobremesa.equals("SUCO DE MELÃO")) {
			bebidaCal = 170;
		}else if(sobremesa.equals("REFRIGERANTE DIET")) {
			bebidaCal = 200;
		}
		
		int totalCal = pratoCaloria + sobremesaCal + bebidaCal;
		
		System.out.printf("Prato: %s%nSobremesa: %s%nBebida: %s%nTotal de "
				+ "calorias : %d" , pratoCaloria , sobremesaCal , bebidaCal , totalCal);
		
		sc.close();

	}

}
