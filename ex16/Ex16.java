import java.util.Scanner;
public class Ex16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int []vetor = new int [10];
        for(int i=0;i<10; i++){
            vetor[i] = scan.nextInt();
        }
        int a;
        for (int i=0; i<10;i++){
            for (int j=i+1; j<10; j++){
                if(vetor[i] > vetor[j]){
                    a = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = a;
                }
            }
        }
        for(int i=0;i<10; i++){
            System.out.println(vetor[i]);
        }
    }
}