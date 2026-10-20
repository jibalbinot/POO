package POO.ExercPratico;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        int opcao = 0;

        do {
            System.out.println("\n--- MENU CADASTRO DE CLIENTES ---");
            System.out.println("1. Cadastrar cliente");
            System.out.println("2. Listar clientes");
            System.out.println("3. Remover cliente por CPF");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opcao: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer do teclado

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Digite a idade: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine(); // Limpar buffer

                    System.out.print("Digite o CPF: ");
                    String cpf = scanner.nextLine();

                    // Criando novo objeto Cliente e adicionando ao ArrayList
                    Cliente novoCliente = new Cliente(nome, idade, cpf);
                    listaClientes.add(novoCliente);
                    System.out.println("Cliente cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println("\n--- LISTA DE CLIENTES ---");
                    if (listaClientes.isEmpty()) {
                        System.out.println("Nenhum cliente cadastrado.");
                    } else {
                        for (int i = 0; i < listaClientes.size(); i++) {
                            System.out.println((i + 1) + " - " + listaClientes.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Digite o CPF do cliente para remover: ");
                    String cpfRemover = scanner.nextLine();
                    boolean removido = false;

                    for (int i = 0; i < listaClientes.size(); i++) {
                        if (listaClientes.get(i).getCpf().equals(cpfRemover)) {
                            listaClientes.remove(i);
                            removido = true;
                            System.out.println("Cliente removido com sucesso!");
                            break;
                        }
                    }

                    if (!removido) {
                        System.out.println("Cliente com o CPF informado não encontrado.");
                    }
                    break;

                case 4:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opcao invalida!");
            }

        } while (opcao != 4);

        scanner.close();
    }
}

