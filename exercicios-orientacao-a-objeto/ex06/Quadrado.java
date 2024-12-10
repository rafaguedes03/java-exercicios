public class Quadrado{
    double lado;
    public Quadrado(double lado){
        this.lado = lado;
    }

    public double calculaArea(){
        return (lado*lado);
    }

    public double calculaPerimetro(){
        return (4*lado);
    }
}