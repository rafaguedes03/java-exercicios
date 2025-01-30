import java.util.*;
public class Prova{
    public static void main(String[] args){
        Pedido p = new Pedido(123, "Rafa");
        Pedido p1 = new Pedido(123);

        System.out.println(p1.getValor());

        System.out.println(p.adiciona(1, 100));
        System.out.println(p.getValor());

    }
}