import java.util.Random;
import java.util.Scanner;
public class Ex19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random get = new Random();
        int []vet = new int [50];
        int []pos = new int [50];
        boolean []verif = new boolean [50];
        for(int i=0;i<50; i++){
            vet[i] = get.nextInt(6);
            System.out.print(vet[i]+" ");
        }
        System.out.println("");
        for(int i=0; i<50; i++){
            if(verif[i]) continue;
            int cont = 0;
            for(int j=0; j<50; j++){
                if(vet[i] == vet[j] && i!=j){
                    verif[j] = true;
                    pos[cont] = j;
                    cont++;
                }
            }
            switch (cont){
                case 0:
                    System.out.print("Numero: "+vet[i]+" nao se repete");
                    break;
                default:
                    System.out.print("Numero: "+vet[i]+" repete "+cont+" vezes nas Posicões: ");
                    for(int k=0; k<cont; k++){
                        System.out.print(pos[k]+" ");
                    }
                    break;
            }
                    
                
            System.out.println("\n");
        }
    }
}