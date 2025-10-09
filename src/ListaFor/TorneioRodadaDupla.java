package ListaFor;

public class TorneioRodadaDupla {
	public static void main(String[] args) {
		int totalTimes = 10;

		System.out.println("Tabela do Torneio de Rodada Dupla:\n");

		// Rodada de ida
		System.out.println("=== RODADA DE IDA ===");
		for (int i = 1; i <= totalTimes; i++) {
			for (int j = i + 1; j <= totalTimes; j++) {
				System.out.println("Time " + i + " x Time " + j);
			}
		}

		// Rodada de volta
		System.out.println("\n=== RODADA DE VOLTA ===");
		for (int i = 1; i <= totalTimes; i++) {
			for (int j = i + 1; j <= totalTimes; j++) {
				System.out.println("Time " + j + " x Time " + i);
			}
		}
	}
}