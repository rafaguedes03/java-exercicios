
import java.util.Scanner;
public class Ex15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float []notas = new float[20];
        float total = 0;
        int cont = 0;
        for (int i=0;i<20;i++){
            System.out.print("Nota "+(i+1)+": ");
            notas[i] = scan.nextFloat();
            total += notas[i];
        }
        for (int i=0;i<20;i++){
            if (notas[i] > (total/20)) {
                cont++;
            }
        }
        System.out.println("Média: "+total/20);
        System.out.println(cont+" alunos tiveram notas acima da media");

    }
}