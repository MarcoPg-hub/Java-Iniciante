package ListaFor;

public class TabuadaDeTres {
	public static void main(String args[]) {
		// Alg 241: criar um algoritmo que imprima a tabuada de multiplicar do número 3.

		int tabuada = 3;

		for (int i = 1; i <= 10; i++) {
			int resultado = tabuada * i;
			System.out.println("A tabuada de " + tabuada + " x " + i + " = " + resultado);
		}
	}

}
