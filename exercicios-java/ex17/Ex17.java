import java.util.Scanner;
public class Ex17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int []vetor = new int [11];
        System.out.println("Digite 10 numeros: ");
        for(int i=0;i<10; i++){
            vetor[i] = scan.nextInt();
        }
        int temp, num, k;
        for (int i=0; i<10;i++){
            for (int j=i+1; j<10; j++){
                if(vetor[i] > vetor[j]){
                    temp = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = temp;
                }
            }
        }
        for(int i=0;i<10; i++){
            System.out.print(vetor[i]+" ");
        }
        System.out.print("\nDigite mais um: ");
        num = scan.nextInt();
        for(k = 9; k>=0 && vetor[k] > num; k--){
            vetor[k+1] = vetor[k];
        }
        vetor[k+1] = num;
        for(int i=0;i<11; i++){
            System.out.print(vetor[i]+" ");
        }
        System.out.println();
    }
}