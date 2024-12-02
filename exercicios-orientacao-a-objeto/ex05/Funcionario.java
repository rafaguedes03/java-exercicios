public class Funcionario{
    String nome;
    double horasTrabalhadas;
    double valorDaHora;
    public double salariofinal(){
        return horasTrabalhadas*valorDaHora;
    }
}