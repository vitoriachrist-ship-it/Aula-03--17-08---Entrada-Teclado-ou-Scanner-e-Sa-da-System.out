import java.util.Scanner;

public class ExemploScanner 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do usuário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        System.out.println("\nUsuário cadastrado com sucesso!");
        System.out.println("Nome: " + nome + " | Idade: " + idade);

        scanner.close(); 
    }
}
