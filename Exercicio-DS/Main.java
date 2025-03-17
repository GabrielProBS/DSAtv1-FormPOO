import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1 - Cadastrar uma nova pessoa");
        System.out.println("2 - Editar dados de uma pessoa cadastrada");
        System.out.println("3 - Apresentar dados de uma pessoa cadastrada");
        System.out.println("4 - Excluir dados de uma pessoa cadastrada");
        System.out.println("5 - Sair");
        Pessoa pessoa = new Pessoa();
        Scanner scanner = new Scanner (System.in);
        int op = scanner.nextInt();

            switch (op) {
                case 1:
                    System.out.println("1 - Cadastrar uma nova pessoa");

                    System.out.println("Digite o nome da pessoa: ");
                    String nome = scanner.nextLine();

                    System.out.println("Digite a idade da pessoa: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Digite o e-mail da pessoa: ");
                    scanner.nextLine();
                    String email = scanner.nextLine();

                pessoa.setNome(nome);
                pessoa.setIdade(idade);
                pessoa.setEmail(email);
                scanner.close();
                break;

                case 2:
                    System.out.println("2 - Editar dados de uma pessoa cadastrada");

                    System.out.println("Novo nome: ");
                    nome = scanner.nextLine();

                    System.out.println("Nova idade: ");
                    idade = scanner.nextInt();

                    System.out.println("Novo email: ");

                    email = scanner.nextLine();
                    System.out.println("Dados editados com sucesso...");
                break;

                case 3:
                System.out.println("3 - Apresentar dados de uma pessoa cadastrada");
                System.out.println("Nome: ");
                System.out.println("Idade: ");
                System.out.println("Email: ");
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
