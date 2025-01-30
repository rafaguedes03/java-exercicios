public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private double renda;

    public String Informacoes(){
        return "Nome: "+nome+"\nCPF: "+cpf+"\nEndereco: "+endereco+"\nTelefone: "+telefone+"\nRenda: "+renda;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getCpf(){
        return cpf;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public String getTelefone(){
        return telefone;
    }

    public void setRenda(double renda){
        this.renda = renda;
    }

    public double getRenda(){
        return renda;
    }


}