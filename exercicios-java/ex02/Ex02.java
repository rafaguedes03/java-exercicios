import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Total de eleitores: ");
        int total = scan.nextInt();
        System.out.println("Total de votos brancos: ");
        int brancos = scan.nextInt();
        System.out.println("Total de votos nulos: ");
        int nulos = scan.nextInt();
        System.out.println("Total de votos válidos: ");
        int validos = scan.nextInt();
        System.out.println((brancos*100/total)+"% de votos brancos");
        System.out.println((nulos*100/total)+"% de votos nulos");
        System.out.println((validos*100/total)+"% de votos validos");

    }
}