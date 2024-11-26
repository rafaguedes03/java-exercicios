import java.util.Scanner;
public class Ex18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int []vetor = new int [30];
        int cont=0;
        System.out.println("Digite 30 numeros: ");
        for(int i=0; i<30; i++){
            vetor[i] = scan.nextInt();
        }
        System.out.println("Digite mais um numero: ");
        int num = scan.nextInt();
        for(int i=0; i<30; i++){
            if(vetor[i] == num)
                cont++;
        }
        System.out.println("O numero que voce digitou por ultimo apareceu "+cont+" vezes");
    }
}