import java.util.*;
public class Prova{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        ContaAPagar conta1 = new ContaAPagar(101, 10, 100);
        ContaAPagar conta2 = new ContaAPagar(202, "Fatura do cartao", 20, 200);

        System.out.println("Conta 1");
        System.out.println(conta1.exibir());

        System.out.println("Pagamento em dia");
        System.out.println(conta1.pagar(10));
        conta1 = new ContaAPagar(101, 10, 100);
        System.out.println("Pagamento em atraso");
        System.out.println(conta1.pagar(20));


        System.out.println("Conta 2");
        System.out.println(conta2.exibir());

    
        
    }
}