public class EntradaTeclado
{
    public static void main(String[] args) 
    {
        System.out.println("=== CADASTRO PARQUE DE DIVERSÃO ===");
        
        String nome = Teclado.leString("Digite o nome do visitante: ");
        char sexo = Teclado.leChar("Digite o sexo (M/F): ");
        int idade = Teclado.leInt("Digite a idade: ");

        System.out.println("\n--- Dados Registrados ---");
        System.out.printf("Visitante: %s | Sexo: %c | Idade: %d anos\n", nome, sexo, idade);
    }
}