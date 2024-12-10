public class Funcionario{
    private String nome;
    private double horasTrabalhadas;
    private double valorDaHora;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setHorasTrabalhadas(double horas){
        horasTrabalhadas = horas;
    }

    public void setValorDaHora(double horas){
        valorDaHora = horas;
    }
    public double salariofinal(){
        return horasTrabalhadas*valorDaHora*0.89;
    }
    
}