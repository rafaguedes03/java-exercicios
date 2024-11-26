import java.util.Scanner;
public class Ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe dois valores :");
        float num0 = scan.nextFloat();
        float num1 = scan.nextFloat();
        while (num1 == 0) {
            System.out.print("Numero invalido, informe outro numero: ");
            num1 = scan.nextFloat();
        }
        System.out.println("A divisao de "+num0+" por "+num1+" é igual a "+num0/num1);
    }
}