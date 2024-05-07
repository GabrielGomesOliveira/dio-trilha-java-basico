import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nomeCliente;
        int numero;
        String agencia;
        double saldo;
        
    System.out.println("-------CONTA BANCÁRIA-------");
    System.out.println();

        System.out.println("Por favor, me informe seu nome:");
        nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o número da sua conta: (1234)");
        numero = sc.nextInt();

        System.out.println("Agora digite o número de sua agência");
        agencia = sc.next();

        System.out.println("Qual é o seu saldo?");
        saldo = sc.nextDouble();

    System.out.println();
    System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque", nomeCliente, agencia, numero, saldo);

    sc.close();
    }

}
