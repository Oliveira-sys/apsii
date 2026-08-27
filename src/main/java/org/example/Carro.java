package org.example;

public class Carro extends Veiculo{
    int numPortas;
    public Carro (int numPortas, String modelo, int ano){
        super (modelo, ano);
        this.numPortas = numPortas;

    }
    @Override
    public String imprimirDetalhe() {
        return "\nModelo: " + this.modelo + " \nAno: " + this.ano + "\nPortas: " + this.numPortas;
    }
}
