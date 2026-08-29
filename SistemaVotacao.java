import java.util.Scanner;

public class SistemaVotacao {
    static Scanner scanner = new Scanner(System.in);

    static final int MAX_CANDIDATOS = 5;
    static final int TOTAL_TURMAS = 3;
    static final int MAX_VOTANTES_POR_TURMA = 10;

    int[] numCandi = new int[MAX_CANDIDATOS];
    String[] nomCandi = new String[MAX_CANDIDATOS];
    int[] votCandi = new int[MAX_CANDIDATOS];
    int[][] votPorTurma = new int[TOTAL_TURMAS][MAX_VOTANTES_POR_TURMA];
    int[] quantiVtTurma = new int[TOTAL_TURMAS];
    int quantiCandi = 0;

    public static void main(String[] args) {
        System.out.println("Sistema de votação iniciado.");
        scanner.close();
    }
}
