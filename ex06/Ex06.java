
import java.util.Scanner;
public class Ex06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num > 12) {
            System.out.println("Total de compras: "+num);
        } else {
            System.out.println("Total de compras: "+num*1.3);
        }
        
    }
}