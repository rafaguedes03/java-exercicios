public class ContaBancaria {
    private Pessoa cliente;
    private int numeroDaConta;
    private double saldo;

    public boolean sacar(float saque){
        if (saque <= saldo){
            saldo -= saque;
            return true;
        } else {
            return false;
        }
    }

    public boolean depositar(float deposito){
        if (deposito > 0){
            saldo += deposito;
            return true;
        } else 
            return false;
    }

    public void setCliente(Pessoa cliente){
        this.cliente = cliente;
    }

    public Pessoa getCliente(){
        return cliente;
    }

    public void setNumeroDaConta(int numeroDaConta){
        this.numeroDaConta = numeroDaConta;
    }

    public int getNumeroDaConta(){
        return numeroDaConta;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo(){
        return saldo;
    }
}