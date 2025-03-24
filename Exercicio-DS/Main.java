import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Scanner scanner = new Scanner (System.in);
        int op;
        do {
            System.out.println("1 - Cadastrar uma nova pessoa");
            System.out.println("2 - Editar dados de uma pessoa cadastrada");
            System.out.println("3 - Apresentar dados de uma pessoa cadastrada");
            System.out.println("4 - Excluir dados de uma pessoa cadastrada");
            System.out.println("5 - Sair");

        op = scanner.nextInt();
        scanner.nextLine();

            switch (op) {
                case 1:
                    System.out.println("1 - Cadastrar uma nova pessoa");
                    System.out.println("Digite o nome da pessoa: ");
                    String nome = scanner.nextLine();
                    System.out.println("Digite a idade da pessoa: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Digite o e-mail da pessoa: ");
                    String email = scanner.nextLine();

                    pessoa.setNome(nome);
                    pessoa.setIdade(idade);
                    pessoa.setEmail(email);
                break;

                case 2:
                    System.out.println("2 - Editar dados de uma pessoa cadastrada");
                    System.out.println("Novo nome: ");
                    nome = scanner.nextLine();
                    System.out.println("Nova idade: ");
                    idade = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Novo email: ");
                    email = scanner.nextLine();

                    pessoa.setNome(nome);
                    pessoa.setIdade(idade);
                    pessoa.setEmail(email);
                    System.out.println("Dados editados com sucesso...");
                break;

                case 3:
                    System.out.println("3 - Apresentar dados de uma pessoa cadastrada");
                    System.out.println("Nome: "+pessoa.getNome());
                    System.out.println("Idade: "+pessoa.getIdade());
                    System.out.println("Email: "+pessoa.getemail());
                break;

                case 4:
                    pessoa = null;
                    System.out.println("Pessoa excluída com sucesso...");
                break;

                case 5:
                    System.out.println("5 - Sair");
                    System.out.println("Saindo...");
                break;

                default:
                    System.out.println("Opção inválida...");
                break;
            }
        } while (op != 5);
        scanner.close();
    
    }
}
