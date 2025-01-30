public class Carro{
    private double combustivel;

    public Carro(double combustivel){
        this.combustivel = combustivel;
    }

    public Carro(){
        combustivel = 0;
    }

    public double autonomia(){
        return combustivel*12;
    }

    public double autonomia(String tipoCombustivel){
        if(tipoCombustivel.equals("gasolina")){
            return 12*combustivel;
        } else {
            return 8*combustivel;
        }
    }

    public double autonomia(String tipoCombustivel, double abastecimento){
        if(tipoCombustivel.equals("gasolina")){
            combustivel += abastecimento;
            return combustivel*12;
        } else{
            combustivel += abastecimento;
            return combustivel*8;
        }
    }

    public double autonomia(String tipoCombustivel, boolean carga){
        if(tipoCombustivel.equals("gasolina")){
            return (combustivel*12)*0.7;
        } else {
            return (combustivel*8)*0.7;
        }
    }
}