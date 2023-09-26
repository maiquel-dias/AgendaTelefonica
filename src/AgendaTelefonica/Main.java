package AgendaTelefonica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AgendaTelefonica agenda = new AgendaTelefonica();
        Scanner scanner = new Scanner(System.in);
        int opcao;


        do {
            System.out.println("************* Menu ***************");
            System.out.println("1. Adicionar Contato");
            System.out.println("2. Remover Contato");
            System.out.println("3. Buscar Contato");
            System.out.println("4. Atualizar Contato");
            System.out.println("5. Listar Contatos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: \n");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:

                    Contato contato1 = new Contato("João", "123456789");
                    agenda.adicionarContato(contato1);
                    Contato contato3 = new Contato("Maria", "1234");
                    agenda.adicionarContato(contato3);
                    break;

                case 2:

                    agenda.removerContato("João");
                    break;
                case 3:

                    Contato contato2 = agenda.buscarContato("Maria");
                    if (contato2 != null) {
                        System.out.println("Nome: " + contato2.getNome());
                        System.out.println("Número de telefone: " + contato2.getNumeroTelefone());
                        System.out.println();
                    } else {
                        System.out.println("Contato não encontrado.");
                        System.out.println();
                    }
                    break;
                case 4:

                    Contato novoContato = new Contato("Maria", "987654321");
                    agenda.atualizarContato("Maria", novoContato);
                    break;
                case 5:
                    agenda.listarContatos();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);
    }
}