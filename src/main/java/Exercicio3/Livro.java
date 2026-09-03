package Exercicio3;
import java.util.Scanner;

public class Livro {

    public String informaçãoLivro(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome do Livro: ");
        String nomeLivro = leitor.nextLine();

        return nomeLivro;
    }
}
