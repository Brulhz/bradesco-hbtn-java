import java.util.Scanner;

public class GerenciadorEstoque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        Estoque estoque = new Estoque("estoque.csv");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Excluir Produto");
            System.out.println("3. Exibir Estoque");
            System.out.println("4. Atualizar Quantidade de Produto");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.hasNextInt() ? scanner.nextInt() : 0;
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a quantidade: ");
                    int quantidade = scanner.nextInt();
                    System.out.print("Digite o preço: ");
                    double preco = scanner.nextDouble();
                    scanner.nextLine();
                    estoque.adicionarProduto(nome, quantidade, preco);
                    break;
                case 2:
                    System.out.print("Digite o ID do produto a ser excluído: ");
                    int idExcluir = scanner.nextInt();
                    scanner.nextLine();
                    estoque.excluirProduto(idExcluir);
                    break;
                case 3:
                    System.out.println("Estoque atual:");
                    estoque.exibirEstoque();
                    break;
                case 4:
                    System.out.print("Digite o ID do produto: ");
                    int idAtualizar = scanner.nextInt();
                    System.out.print("Digite a nova quantidade: ");
                    int novaQtd = scanner.nextInt();
                    scanner.nextLine();
                    estoque.atualizarQuantidade(idAtualizar, novaQtd);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}