public class Ex09{
    public static void main(String[] args){
        Carro carro = new Carro(30);
        System.out.printf("O carro pode percorrer %.2f quilometros com %.2f litros atuais.\n", carro.autonomia(), carro.getCombustivel());

        carro.percorrerDistancia(100);
        
        System.out.printf("O carro pode percorrer %.2f quilometros com %.2f litros atuais.\n", carro.autonomia(), carro.getCombustivel());

        carro.abastecer(15);

        System.out.printf("O carro pode percorrer %.2f quilometros com %.2f litros atuais.\n", carro.autonomia(), carro.getCombustivel());
    }
    
}