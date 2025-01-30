import java.util.*;
public class Ex11{
    public static void main(String[] args){
        Funcionario vendedor = new Funcionario("Afonso", 1000, 11);
        Funcionario gerente = new Funcionario("Afonso", 2000, 9);

        System.out.printf("Salario de %s é R$ %.2f \n", vendedor.getNome(), vendedor.mostrarSalario(1000));
        System.out.printf("Salario de %s é R$ %.2f \n", gerente.getNome(), gerente.mostrarSalario());


        
    }
}