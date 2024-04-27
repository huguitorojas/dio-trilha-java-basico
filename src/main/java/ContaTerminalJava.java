import java.util.Scanner;

public class ContaTerminalJava {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor; digite o numero da agencia");
        agencia = scanner.next();
        System.out.println("Por favor; digite o numero da sua conta");
        numero = scanner.nextInt();
        System.out.println("Por favor; digite o seu nome");
        nomeCliente = scanner.next();
        System.out.println("Por favor; digite o saldo da sua conta");
        saldo = scanner.nextDouble();

        System.out.println("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco. " +
                "Sua agência é "+agencia + ", conta "+numero+ " e seu saldo "+saldo+ " já está disponível para saque");


    }
}


