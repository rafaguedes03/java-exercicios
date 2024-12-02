import java.util.*;
public class Ex04{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Paciente 1");
        System.out.print("Nome: ");
        String nome = scan.nextLine();
        System.out.print("Sexo: ");
        String sexo = scan.nextLine();
        System.out.print("Peso: ");
        double peso = scan.nextDouble();
        System.out.print("Altura: ");
        double altura = scan.nextDouble();
        Paciente pessoa1 = new Paciente(nome, sexo, peso, altura);
        System.out.println("Paciente 2");
        scan.nextLine();
        System.out.print("Nome: ");
        nome = scan.nextLine();
        System.out.print("Sexo: ");
        sexo = scan.nextLine();
        System.out.print("Peso: ");
        peso = scan.nextDouble();
        System.out.print("Altura: ");
        altura = scan.nextDouble();
        Paciente pessoa2 = new Paciente(nome, sexo, peso, altura);
        System.out.println("------------------------");
        pessoa1.printar();
        System.out.println("------------------------");
        pessoa2.printar();
        System.out.println("------------------------");
    }
}