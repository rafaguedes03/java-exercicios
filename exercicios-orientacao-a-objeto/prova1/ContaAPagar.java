public class ContaAPagar{
    private int codigo;
    private String descricao;
    private int diaDeVencimento;
    private float valor;
    private boolean status;

    public ContaAPagar(int codigo, int diaDeVencimento, float valor){
        this.codigo = codigo;
        this.descricao = "";
        this.diaDeVencimento = diaDeVencimento;
        this.valor = valor;
        this.status = false;
    }

    public ContaAPagar(int codigo, String descricao, int diaDeVencimento, float valor){
        this.codigo = codigo;
        this.descricao = descricao;
        this.diaDeVencimento = diaDeVencimento;
        this.valor = valor;
        this.status = false;
    }

    public String exibir(){
        return "Codigo: "+codigo+"\nDescicao: "+descricao+"\nVencimento: "+diaDeVencimento+"\nValor: R$ "+valor+(status?"\nPago":"\nPendente");
    }

    public String pagar(int dia){
        if(status) return "Conta ja foi paga!";
        String retorno = "Conta paga! Valor R$ "+valor;
        double valorPago = valor;
        if(dia>diaDeVencimento){
            valorPago = valor*1.1;
            retorno += ". Pagamento com atraso. Multa de R$"+valorPago*0.1;
        }
        retorno += ". Valor pago R$ "+valorPago;
        return retorno;
    }

    public String pagar(int dia, float desconto){
        if(status) return "Conta ja foi paga!";
        String retorno = "Conta paga! Valor R$ "+valor;
        double valorPago = valor;
        if(dia>diaDeVencimento){
            valorPago = valor*1.1;
            retorno += ". Pagamento com atraso. Multa de R$"+valorPago*0.1;
        } else {
            valorPago += desconto;
        }
        retorno += ". Valor pago com desconto R$ "+valorPago;
        return retorno;
    }

    

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public void setDiaDeVencimento(int diaDeVencimento){
        this.diaDeVencimento = diaDeVencimento;
    }
    public void setValor(float valor){
        this.valor = valor;
    }
    public void setStatus(boolean status){
        this.status = status;
    }

    public int getCodigo(){
        return codigo;
    }
    public String getDescricao(){
        return descricao;
    }
    public int getDiaDeVencimento(){
        return diaDeVencimento;
    }
    public double getValor(){
        return valor;
    }
    public boolean isStatus(){
        return status;
    }

}
