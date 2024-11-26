import java.util.Scanner;
public class Ex12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe um valor entre 1 e 10");
        int num = scan.nextInt();
        while (num<1 && num>10) {
            System.out.print("Valor inválido, digite outro valor: ");
        }
        for (int i=1;i<10;i++){
            System.out.println(i+" x "+num+" = "+i*num);
        }
    }
}