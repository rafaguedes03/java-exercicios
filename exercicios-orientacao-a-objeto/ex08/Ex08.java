import java.util.*;

public class Ex08{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Fatura 1");
        System.out.print("Numero: ");
        int num = scan.nextInt();
        scan.nextLine();
        System.out.print("Descricao: ");
        String desc = scan.nextLine();
        System.out.print("Quantidade: ");
        int quant = scan.nextInt();
        System.out.print("Preco : ");
        double preco = scan.nextDouble();
        Fatura fat0 = new Fatura(num, desc, quant, preco);
        System.out.printf("Valor da fatura = R$ %.2f\n", fat0.getValorDaFatura());
    }
}