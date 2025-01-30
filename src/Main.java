import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do saldo inicial
        double saldoInicial = scanner.nextDouble();

        // Entrada das três transações
        double trans1 = scanner.nextDouble();
        double trans2 = scanner.nextDouble();
        double trans3 = scanner.nextDouble();

        // Cálculo do saldo final
        double saldoFinal = saldoInicial + trans1 + trans2 + trans3;

        // Exibir o saldo final formatado para duas casas decimais
        System.out.printf("%.2f\n", saldoFinal);

        scanner.close();
    }
}
