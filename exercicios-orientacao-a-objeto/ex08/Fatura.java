public class Fatura{
    int numero;
    String descricao;
    int quantidade;
    double preco;

    public double getValorDaFatura(){
        return quantidade*preco;
    }

    public  Fatura(int numero, String descricao, int quantidade, double preco){
        if(quantidade < 0){
            this.quantidade = 0;
        } else {
            this.quantidade = quantidade;
        }
        if(preco < 0){
            this.preco = 0;
        } else {
            this.preco = preco;
        }
        this.descricao = descricao;
        this.numero = numero;
    }
}