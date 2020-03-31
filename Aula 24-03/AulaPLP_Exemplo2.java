import java.util.Scanner;

public class AulaPLP_Exemplo2 {
    public static void main(String [] args) {
      Scanner s = new Scanner(System.in);
      System.out.println("Digite o seu nome: ");
      String nome = s.next();
      System.out.println("Digite a sua idade: ");
      int idade = s.nextInt();
      System.out.printf("Seu nome é %s e você tem %d anos.", nome, idade);
    }
}