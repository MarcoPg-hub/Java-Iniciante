package listaIfElse;

import java.util.Scanner;

public class CalculoIMC {

	public static void main(String[] args) {
		/*
		 * Alg 151: um endocrinologista deseja controla a saúde de sues pacientes e,
		 * para isso, se utiliza do índice de massa corporal (IMC). Sabendo-se que o IMC
		 * é calculado através da seguinte fórmula: IMC = peso 2 altura peso é dado em
		 * Kg - altura é das em metrosCriar um algoritmo que apresente o nome do
		 * paciente e sua faixa de risco, baseando-se na seguinte tabela: IMC Abaixo de
		 * 20 Valor da venda Abaixo do peso A partir de 20 até 25 Normal A partir de 25
		 * até 30 Excesso de peso A partir de 30 até 35 Obesidade Acima de 35 Obesidade
		 * mórbida
		 */

		  Scanner sc = new Scanner(System.in);

	        System.out.print("Digite o nome do paciente: ");
	        String nome = sc.nextLine();

	        System.out.print("Digite o peso do paciente (kg): ");
	        double peso = sc.nextDouble();

	        System.out.print("Digite a altura do paciente (m): ");
	        double altura = sc.nextDouble();

	        double imc = peso / (altura * altura);

	        String faixa = "";
	        if (imc < 20) {
	            faixa = "Abaixo do peso";
	        } else if (imc >= 20 && imc < 25) {
	            faixa = "Normal";
	        } else if (imc >= 25 && imc < 30) {
	            faixa = "Excesso de peso";
	        } else if (imc >= 30 && imc <= 35) {
	            faixa = "Obesidade";
	        } else { 
	            faixa = "Obesidade mórbida";
	        }

	        System.out.printf("Paciente: %s%n", nome);
	        System.out.printf("IMC: %.2f%n", imc);
	        System.out.printf("Faixa de risco: %s%n", faixa);

	        sc.close();
	    }
	}