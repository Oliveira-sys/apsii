package Exercicio3;
import java.util.Scanner;

public class Cd {

    public String informaçãoCD(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome do CD: ");
        String nomeCd = leitor.nextLine();

        return nomeCd;
    }
}
