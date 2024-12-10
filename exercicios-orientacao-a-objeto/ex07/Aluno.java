public class Aluno{
    int matricula;
    String nome;
    String cpf;
    String endereco;
    
    public String toString(){
        return "Matricula: "+matricula+"\nNome: "+nome+"\nCPF: "+cpf+"E\nndereço: "+endereco+"\n";
    }

    public Aluno(int matricula, String nome, String cpf, String endereco){
        this.matricula = matricula;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }
}