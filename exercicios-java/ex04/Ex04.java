import java.util.Scanner;
public class Ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Salario: ");
        float salario = scan.nextFloat();
        System.out.println("N carros vendidos: ");
        int ncarros = scan.nextInt();
        System.out.println("valor total de vendas: ");
        float totalvendas = scan.nextFloat();
        System.out.println("Valor por cada item vendido: ");
        float item = scan.nextFloat();
        System.out.println("O Salario final = "+(salario+totalvendas*0.05+ncarros*item));

    }
}