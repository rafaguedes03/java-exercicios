import java.util.Scanner;
public class Ex09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe os lados de um triangulo : ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if ((a<b+c) && (b<a+c) && (c<a+b)) {
            System.out.println("Forma um triangulo!");
        } else {
            System.out.println("Nao forma um triangulo!");
        }
        
    }
}