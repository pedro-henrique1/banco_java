import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContaTerminal novaConta = new ContaTerminal();

        System.out.println("Bem vindo a sua conta");
        Scanner contnum = new Scanner(System.in);
        System.out.println("Digite seu nome");
        novaConta.setNomeCliente(contnum.nextLine());
        System.out.println("Digite o numero da agencia 000-8");
        novaConta.setAgencia(contnum.next());
        System.out.println("Digite o numero da conta");
        novaConta.setNumConta(contnum.nextInt());
        System.out.println("Digite o saldo");
        novaConta.setSaldo(contnum.nextDouble());


        System.out.println("Ola " + novaConta.getNomeCliente() + " obrigado por criar uma conta em nosso banco, sua agência é " + novaConta.getAgencia() + ", conta " + novaConta.getNumConta() + " e seu saldo " + novaConta.getSaldo() + " já está disponível para saque");


    }
}