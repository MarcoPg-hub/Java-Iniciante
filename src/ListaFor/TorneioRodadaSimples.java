package ListaFor;

public class TorneioRodadaSimples {
    public static void main(String[] args) {
        int totalTimes = 10;

        System.out.println("Tabela do Torneio de Rodada Simples:\n");

        for (int i = 1; i <= totalTimes; i++) {
            for (int j = i + 1; j <= totalTimes; j++) {
                System.out.println("Time " + i + " x Time " + j);
            }
        }
    }
}