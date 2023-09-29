import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        try (Scanner terminal = new Scanner(System.in)) {
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();

            try {
                contar(parametroUm, parametroDois);
            } catch (ParametrosInvalidosException exception) {
                System.out.println("o primeiro parâmetro deve ser menor que o segundo");
            }
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm <= parametroDois) {
            for (int i = parametroUm; i <= parametroDois; i++) {
                System.out.println("imprimindo " + i);
            }
        } else {
            throw new ParametrosInvalidosException();
        }
    }
}