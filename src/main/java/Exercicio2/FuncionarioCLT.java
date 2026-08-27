package Exercicio2;

import com.sun.org.apache.xpath.internal.objects.XString;

public class FuncionarioCLT extends Funcionario{
    double valeTransporte;
    double valeAlimentação;
    public FuncionarioCLT(String nome, String matricula, String salarioBase, double dataAdmissao, double valeTransporte, double valeAlimentação){
        super(nome,matricula,dataAdmissao,salarioBase);

        this.valeTransporte = valeTransporte;
        this.valeAlimentação = valeAlimentação;

    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + valeAlimentação + valeTransporte;
    }

    @Override
    public double calcularDesconto() {
        return super.calcularDesconto() + 50;
    }
}
