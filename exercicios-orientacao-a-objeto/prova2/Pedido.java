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
        cliente = "Nao Informado";
        valor = 0.0;
    }

    public Pedido(int codigo, String cliente){
        this.codigo = codigo;
        this.cliente = cliente;
        valor = 0.0;
    }

    public String adiciona(int produto){
        switch (produto){
            case 1:
                valor += 20;;
                return "Pedido "+codigo+" - Cliente: "+cliente+" - Total R$ "+valor;
            case 2:
                valor += 12;
                return "Pedido "+codigo+" - Cliente: "+cliente+" - Total R$ "+valor;
            case 3:
                valor += 15;
                return "Pedido "+codigo+" - Cliente: "+cliente+" - Total R$ "+valor;
            default:
                return "Codigo do produto inválido!";
        }
    }
    public String adiciona(int produto, double batata){
        switch (produto){
            case 1:
                valor += 20+batata*0.05;
                return "Pedido "+codigo+" - Cliente: "+cliente+" - Total R$ "+valor;
            case 2:
                valor += 12+batata*0.05;
                return "Pedido "+codigo+" - Cliente: "+cliente+" - Total R$ "+valor;
            case 3:
                valor += 15+batata*0.05;
                return "Pedido "+codigo+" - Cliente: "+cliente+" - Total R$ "+valor;
            default:
                return "Codigo do produto inválido!";
        }
    }

}