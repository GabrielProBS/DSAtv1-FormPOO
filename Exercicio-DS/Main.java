import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1 - Cadastrar uma nova pessoa");
        System.out.println("2 - Cadastrar uma nova pessoa");
        System.out.println("3 - Apresentar dados de uma pessoa cadastrada");
        System.out.println("4 - Excluir dados de uma pessoa cadastrada");
        System.out.println("5 - Sair");

        Scanner scanner = new Scanner (System.in);
        int op = scanner.nextInt();
        switch (op) {
            case 1:
            System.out.println("1 - Cadastrar uma nova pessoa");
            System.out.println("Digite o nome da pessoa: ");
            String nom = scanner.nextLine();
            String nome = scanner.nextLine();
            System.out.println("Digite a idade da pessoa: ");
            int idade = scanner.nextInt();
            System.out.println("Digite o e-mail da pessoa: ");
            String email = scanner.nextLine();

            Pessoa Pessoa = new Pessoa(nome, idade, email);
            Pessoa.setNome(nome);
            Pessoa.setIdade(idade);
            Pessoa.setEmail(email);
            break;

            case 2:
            System.out.println("2 - Cadastrar uma nova pessoa");
            break;

            case 3:
            System.out.println("3 - Apresentar dados de uma pessoa cadastrada");
            break;

            case 4:
            System.out.println("4 - Excluir dados de uma pessoa cadastrada");
            break;

            case 5:
            System.out.println("5 - Sair");
            break;

            default:
            System.out.println("Erro, nenhuma opção selecionada...");
            break;
        }

    
    }
}