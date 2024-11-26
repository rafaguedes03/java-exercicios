import java.util.Scanner;
public class Ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Descricao do produto :");
        String nome = scan.nextLine();
        System.out.println("Quantidade adquirida :");
        int qnt = scan.nextInt();
        System.out.println("Preco unitario :");
        float preco = scan.nextFloat();
        float total = qnt*preco;
        System.out.println("Total ="+(total));
        if (qnt<=5) {
            System.out.println(qnt+" "+nome+" 2% de desconto = "+(total*0.02)+". Total a pagar = "+(total*0.98));
        }
        if (qnt>5 && qnt<=10) {
            System.out.println(qnt+" "+nome+" 3% de desconto = "+(total*0.03)+". Total a pagar = "+(total*0.97));
        } else {
            System.out.println(qnt+" "+nome+" 5% de desconto = "+(total*0.05)+". Total a pagar = "+(total*0.95));
        }
        
    }
}