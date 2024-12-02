import java.util.*;
public class Ex03{
    public static void main(String[] args){
        Calculadora calc = new Calculadora();
            int opt;
        while (true){
            Scanner scan = new Scanner(System.in);
            System.out.print("O que voce deseja fazer?\n1. Somar\n2. Subtrair\n3. Multiplicar\n4. Dividir\n0. Sair\n ");
            opt = scan.nextInt();
            if (opt == 0) break;
            System.out.print("Digite um numero: ");
            double num0 = scan.nextDouble();
            System.out.print("Digite mais um numero: ");
            double num1 = scan.nextDouble();
            switch (opt){
                case 1:
                    System.out.printf("%.2f + %.2f = %.2f\n", num0, num1, calc.Somar(num0, num1));
                    break;
                case 2:
                    System.out.printf("%.2f - %.2f = %.2f\n", num0, num1, calc.Subtrair(num0, num1));
                    break;
                case 3:
                    System.out.printf("%.2f X %.2f = %.2f\n", num0, num1, calc.Multiplicar(num0, num1));
                    break;
                case 4:
                    System.out.printf("%.2f / %.2f = %.2f\n", num0, num1, calc.Dividir(num0, num1));
                    break;
                
            }
        } 
        
        
        
        
    }
}