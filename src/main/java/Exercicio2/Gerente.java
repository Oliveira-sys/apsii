package Exercicio2;

public class Gerente extends FuncionarioCLT{

    int tamanhoEquipe;
    double percentualBonus;


    public Gerente(String nome, String matricula, String salarioBase, double dataAdmissao, double valeTransporte, double valeAlimentação, int tamanhoEquipe, double percentualBonus){
        super(nome, matricula,salarioBase,dataAdmissao,valeTransporte,valeAlimentação);

        this.tamanhoEquipe = tamanhoEquipe;
        this.percentualBonus = percentualBonus;
    }

    @Override
    public double calcularSalario() {
        this.salarioBase = getSalarioBase() * percentualBonus;
        return super.calcularSalario();
    }

    @Override
    public double calcularDesconto() {
        int desconto = 0;
        if (tamanhoEquipe > 10) {
            desconto = 100;
        }
        return super.calcularDesconto() + desconto;
    }
}
