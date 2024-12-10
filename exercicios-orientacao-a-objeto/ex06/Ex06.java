import java.util.*;
public class Ex06{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        for (int i=0; i<2; i++){
            System.out.printf("Lado quadrado %d: ", i+1);
            double lado = scan.nextDouble();
            Quadrado quadrado = new Quadrado(lado);
            System.out.println("Area = "+quadrado.calculaArea());
            System.out.println("Perimetro = "+quadrado.calculaPerimetro());

        }
    }
}