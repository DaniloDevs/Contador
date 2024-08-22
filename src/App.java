import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("");

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int primeiroNumero = scanner.nextInt();

        System.out.println("");

        System.out.print("Digite o segundo numero: ");
        int segundoNumero = scanner.nextInt();

        try {
            contar(primeiroNumero, segundoNumero);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm <= parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;
        for (int i = 0; i < contagem; i++) {
            System.out.println("Imprimindo o numero: " + i);
        }
    }

}
