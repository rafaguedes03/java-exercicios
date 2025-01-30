public class Funcionario{
    private String nome;
    private double salarioBase;
    private int tempoDeServico;

    public Funcionario(String nome, double salarioBase, int tempoDeServico){
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.tempoDeServico = tempoDeServico;
    }

    public double mostrarSalario(){
        if(tempoDeServico < 11){
            return (salarioBase*1.12);
        } else{
            return (salarioBase*1.17);
        }
    }

    public double mostrarSalario(double totalDeVendas){
        if(tempoDeServico < 11){
            return (salarioBase*1.05)+(totalDeVendas*0.015);
        } else{
            return (salarioBase*1.1)+(totalDeVendas*0.02);
        }
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getSalarioBase(){
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase){
        this.salarioBase = salarioBase;
    }

    public int getTempoDeServico(){
        return tempoDeServico;
    }

    public void setTempoDeServico(int tempoDeServico){
        this.tempoDeServico = tempoDeServico;
    }
}