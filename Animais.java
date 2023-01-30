import java.util.Scanner;

public class Animais {

    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        String nome, cor, raca;
        double tamanho ;

        System.out.print("Insira o nome do animal:     ");
        nome = scanner.nextLine();

       System.out.print("Insira a cor do animal:   ");
       cor = scanner.nextLine();

       System.out.print("Insira a raça do animal:   ");
       raca = scanner.nextLine();

        System.out.print("Insira o tamanho do Animal:   ");
        tamanho = scanner.nextDouble();

        System.out.println("Seu animal se chama " + nome + ", a cor dele é a cor " + cor + ",  a raça dele é a raça  " + raca + " e o seu tamanho em metros é  " + tamanho + "m");

    }
    
}
