package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        Veiculo v1 = new Veiculo("Fusca", 1970);
        Moto m1 = new Moto(300, "Kawasaki", 2025);

        System.out.println(m1.imprimirDetalhe());
        System.out.println(v1.imprimirDetalhe());
    }
}