import java.util.*;
public class Ex07{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
            System.out.println("Aluno 1");
            System.out.print("Matricula: ");
            int matricula = scan.nextInt();
            scan.nextLine();
            System.out.print("Nome: ");
            String nome = scan.nextLine();
            System.out.print("CPF: ");
            String cpf = scan.nextLine();
            System.out.print("Endereço: ");
            String endereco = scan.nextLine();
            Aluno aluno0 = new Aluno(matricula, nome, cpf, endereco);

            System.out.println("-------------------------------");

            System.out.println("Aluno 2");
            System.out.print("Matricula: ");
            matricula = scan.nextInt();
            scan.nextLine();
            System.out.print("Nome: ");
            nome = scan.nextLine();
            System.out.print("CPF: ");
            cpf = scan.nextLine();
            System.out.print("Endereço: ");
            endereco = scan.nextLine();
            Aluno aluno1 = new Aluno(matricula, nome, cpf, endereco);
            System.out.println("-------------------------------\n"+aluno0.toString());
            System.out.println("-------------------------------\n"+aluno1.toString());
        
    }
}