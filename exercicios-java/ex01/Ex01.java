import java.util.Scanner;
public class Ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a base e a altura do retangulo: ");
        float b = scan.nextFloat();
        float a = scan.nextFloat();
        System.out.println("A área do retangulo é: "+(b*a));
    }
}