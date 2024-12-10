public class Aluno{
    private String nome;
    private int matricula;
    private double media;
    private String situacao;

    public Aluno(String nome, int matricula, double media){
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public void setMedia(double media){
        this.media = media;
    }

    public String getNome(){
        return nome;
    }

    public int getMatricula(){
        return matricula;
    }

    public double getMedia(){
        return media;
    }

    private void verificarSituacao(){
        if(media >= 6){
            situacao = "APROVADO!";
        } else{
            situacao = "REPROVADO!";
        }
    }

    public String resultadoFinal(){
        verificarSituacao();
        return "Nome: "+nome+"\nMatricula: "+matricula+"\nMedia: "+media+"\nSituacao: "+situacao;
    }
    

    
}