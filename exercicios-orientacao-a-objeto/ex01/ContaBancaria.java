/*


*/
public class ContaBancaria {
    public int numero;
    public double saldo;
    public void sacar(Double valor){
        saldo -= valor;
    }
    public void depositar(Double valor){
		saldo += valor;
    }
    public Double verSaldo(){
        return saldo;

    }
}
