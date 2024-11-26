import java.util.Scanner;
public class Ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Custo de fabrica: ");
        float total = scan.nextFloat();
        System.out.println("O custo do carro novo é: "+(total*1.28 + total*0.45));

    }
}