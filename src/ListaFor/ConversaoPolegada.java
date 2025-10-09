package ListaFor;

public class ConversaoPolegada {

	public static void main(String args[]) {
		/*
		 * Alg 188: criar um algoritmo que imprima uma tabela de conversão de polegadas
		 * para centímetros. Deseja-se que na tabela conste valores desde 1 polegada até
		 * 20 polegadas inteiras.(1 polegada igual 2.54 cm)
		 */
		for (int i = 1; i <= 20; i++) {
			System.out.println(i + " polegada " + " = " + (i * 2.54) + " centímetros");
		}
	}

}
