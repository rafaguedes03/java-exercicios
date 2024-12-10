public class Carro{
    private double combustivel;
    private double quilometragem;

    public Carro(double combustivel){
        this.combustivel = combustivel;
        this.quilometragem = 0.0;
    }

    public double autonomia(){
        return (combustivel*12);
    }

    public void percorrerDistancia(int distancia){
        if(distancia <= autonomia()){
            combustivel -= (double)distancia/12;
            quilometragem += distancia;
        }    
    }

    public double getCombustivel(){
        return combustivel;
    }

    public void setCombustivel(double combustivel){
        this.combustivel = combustivel;
    }

    public double getQuilometragem(){
        return quilometragem;
    }

    public void setQuilometragem(double quilometros){
        quilometragem = quilometros;
    }

    public void abastecer(double litros){
        combustivel += litros;
    }
}