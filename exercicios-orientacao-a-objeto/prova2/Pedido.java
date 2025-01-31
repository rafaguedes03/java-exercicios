public class Pedido{
    private int codigo;
    private String cliente;
    private double valor;

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public int getCodigo(){
        return codigo;
    }

    public void setCliente(String cliente){
        this.cliente = cliente;
    }

    public String getCliente(){
        return cliente;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    public double getValor(){
        return valor;
    }

    public Pedido(int codigo){
        this.codigo = codigo;
        this.cliente = "Nao informado";
        this.valor = 0.0;
    }

    public Pedido(int codigo, String cliente){
        this.codigo = codigo;
        this.cliente = cliente;
        this.valor = 0.0;
    }

    public String adiciona(int produto){
        return produtosAtualizados(produto, 0.0, 0.0, 0);
    }

    public String adiciona(int produto, double batata){
        return produtosAtualizados(produto, batata, 0.0, 0);
    }

    public String adiciona(int produto, double batata, double refrigerante){
        return produtosAtualizados(produto, batata, refrigerante, 0);
    }

    public String adiciona(int produto, double batata, double refrigerante, int cookie){
        return produtosAtualizados(produto, batata, refrigerante, cookie);
    }

    private String produtosAtualizados(int produto, double batata, double refrigerante, int cookie){
        switch (produto) {
            case 1:
                valor += 20.00;
                break;
            case 2:
                valor += 12.00;
                break;
            case 3:
                valor += 15.00;
                break;
            default:
                break;
        }

        if(batata > 0)
            valor += batata * 0.05;

        if (refrigerante > 0)
            valor += refrigerante * 0.02;

        if (cookie > 0)
            valor += cookie * 2;
        
        return "Pedido: "+codigo+"\nCliente: "+cliente+"\nTotal R$ "+valor;
    }
}