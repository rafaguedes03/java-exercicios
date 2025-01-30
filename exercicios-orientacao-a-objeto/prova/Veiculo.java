public class Veiculo {
    private String placa;
    private String modelo;
    private String tipo;
    private int quilometragem;

    public Veiculo(String modelo, String tipo){
        this.modelo = modelo;
        this.tipo = tipo;
        quilometragem = 0;
    }

    public Veiculo(String modelo, String tipo, int quilometragem){
        this.modelo;
        this.tipo;
        this.quilometragem = quilometragem;
    }

    public {
        switch(tipo){
            case "ECONOMICO":
                    calcularLocacao();
        }
    }

    public double calcularLocacao(int dias){
        quilometragem += 100;
    }

    public void setPlaca(String placa){
        this.placa = placa;
    }

    public String getPlaca(){
        return placa;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getModelo(){
        return modelo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return tipo;
    }

    public void setQuilometragem(int quilometragem){
        this.quilometragem = quilometragem;
    }

    public int getQuilometragem(){
        return quilometragem;
    }
}