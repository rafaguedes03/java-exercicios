import java.util.*;
public class Ex01{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();

        conta.numero = 111;
        conta.saldo = 0;
        System.out.printf("Saldo atual: R$ %.2f \n", conta.verSaldo());
        System.out.print("Informe o valor do deposito: ");
        double deposito = scan.nextDouble();
        conta.depositar(deposito);
        System.out.printf("Saldo atual: R$ %.2f \n", conta.verSaldo());
        System.out.print("Informe o valor do saque: ");
        double saque = scan.nextDouble();
        conta.sacar(saque);
        System.out.printf("Saldo atual: R$ %.2f", conta.verSaldo());

    }
}
