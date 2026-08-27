package org.example;

public class Moto extends Veiculo {

    int cilindrada;

    public Moto(int cilindrada, String modelo, int ano){
        super(modelo,ano);
        this.cilindrada = cilindrada;
    }

    @Override
    public String imprimirDetalhe() {
        return super.imprimirDetalhe() + "\nCilindrada: " + this.cilindrada;
    }
}
