import java.util.Scanner;
public class Ex07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Salario: ");
        int num = scan.nextInt();
        System.out.println("Total vendas R$: ");
        int vendas = scan.nextInt();
        if (num > 1500) {
            System.out.println("Salario total: "+(num+vendas*0.05));
        } else {
            System.out.println("Total de compras: "+(num+vendas*0.03));
        }
        
    }
}