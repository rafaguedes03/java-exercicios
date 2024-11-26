import java.util.Scanner;
public class Ex13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe dois valores: ");
        int num = scan.nextInt();
        int num1 = scan.nextInt();
        if (num>num1){
            int a = num1;
            num1 = num;
            num = a;
        }
        int total = 0;
        for (int i=num1;i>num-1;i--){
            total += i;
        }
        System.out.println("A soma dos inteiros = "+total);
    }
}