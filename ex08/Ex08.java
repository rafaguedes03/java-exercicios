import java.util.Scanner;
public class Ex08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantidade em estoque: ");
        int estoque = scan.nextInt();
        System.out.println("Quantidade maxima em estoque: ");
        int max = scan.nextInt();
        System.out.println("Quantidade minima em estoque: ");
        int min = scan.nextInt();
        if (estoque < (max+min)/2) {
            System.out.println("Efetuar compra!");
        } else {
            System.out.println("Nao efetuar compra!");
        }
        
    }
}