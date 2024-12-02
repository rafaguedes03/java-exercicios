public class Paciente{
    String nome;
    String sexo;
    double peso;
    double altura;
    public Paciente(String nome, String sexo, double peso, double altura){
        this.nome = nome;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;

    }

    public void printar(){
        System.out.printf("Nome: %s\nSexo: %s\nPeso: %.2f\nAltura: %.2f\nIMC: %.2f\n", this.nome, this.sexo, this.peso, this.altura, calcularIMC());
    }
    public double calcularIMC(){
        return (peso/(altura*altura));
    }
    
}