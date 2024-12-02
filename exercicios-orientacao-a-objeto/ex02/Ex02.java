import java.util.*;
public class Ex02{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Retangulo ret = new Retangulo();
        
        System.out.print("Digite o comprimento: ");
        double c = scan.nextDouble();
        ret.comp = c;
        System.out.print("Digite a largura: ");
        double l = scan.nextDouble();
        ret.larg = l;
        System.out.printf("A Area do retangulo é %.2f e o Perimetro é %.2f \n", ret.Are(), ret.Per());
    }
}
