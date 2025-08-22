import java.util.Scanner;

public class GerenciadorEstoque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        Estoque estoque = new Estoque("estoque.csv");

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Excluir Produto");
            System.out.println("3. Exibir Estoque");
            System.out.println("4. Atualizar Quantidade de Produto");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Quantidade: ");
                    int quantidade = scanner.nextInt();
                    System.out.print("Preço: ");
                    double preco = scanner.nextDouble();
                    estoque.adicionarProduto(nome, quantidade, preco);
                    break;
                case 2:
                    System.out.print("ID do produto para excluir: ");
                    int idExcluir = scanner.nextInt();
                    estoque.excluirProduto(idExcluir);
                    break;
                case 3:
                    estoque.exibirEstoque();
                    break;
                case 4:
                    System.out.print("ID do produto: ");
                    int idAtualizar = scanner.nextInt();
                    System.out.print("Nova quantidade: ");
                    int novaQuantidade = scanner.nextInt();
                    estoque.atualizarQuantidade(idAtualizar, novaQuantidade);
                    break;
                case 5:
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}