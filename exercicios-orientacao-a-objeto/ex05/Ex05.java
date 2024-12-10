import java.util.*;
public class Ex05{
    public static void main(String[] args){
        Funcionario func0 = new Funcionario(nome);
        Scanner scan = new Scanner(System.in);
        System.out.print("Nome: ");
        func0.nome = scan.nextLine();

        System.out.print("Horas Trab: ");
        func0.horasTrabalhadas = scan.nextDouble();
        System.out.print("Valor da Hora: ");
        func0.valorDaHora = scan.nextDouble();
        System.out.printf("Nome : "+func0.nome+"\nSalario: %.2f\n", func0.salariofinal());
    }
}