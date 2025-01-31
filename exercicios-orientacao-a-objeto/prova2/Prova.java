import java.util.Scanner;

public class Prova {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opt;
        do {
            System.out.println("O que comprar???\n1. BigMac R$ 20,00\n2. Hamburguer R$ 12,00\n3. CheeseBurguer R$ 15,00\n0. Sair");

            opt = scan.nextInt();

            System.out.println("Adicionais?");
        } while (opt != 0);
    }
}