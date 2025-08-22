import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Produto> produtos;
    private String arquivoCsv;

    public Estoque(String arquivoCsv) {
        this.arquivoCsv = arquivoCsv;
        this.produtos = new ArrayList<>();
        carregarEstoque();
    }

    private void carregarEstoque() {
        produtos.clear();
        try (BufferedReader br = new BufferedReader(new FileReader(arquivoCsv))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                if (linha.trim().isEmpty()) continue;
                String[] dados = linha.split(",");
                int id = Integer.parseInt(dados[0]);
                String nome = dados[1];
                int quantidade = Integer.parseInt(dados[2]);
                double preco = Double.parseDouble(dados[3]);
                produtos.add(new Produto(id, nome, quantidade, preco));
            }
        } catch (FileNotFoundException e) {
            salvarEstoque(); // cria arquivo se não existir
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

    private void salvarEstoque() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoCsv))) {
            for (Produto p : produtos) {
                bw.write(p.toCsv());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar o arquivo: " + e.getMessage());
        }
    }

    public void adicionarProduto(String nome, int quantidade, double preco) {
        int id = produtos.isEmpty() ? 1 : produtos.get(produtos.size() - 1).getId() + 1;
        Produto p = new Produto(id, nome, quantidade, preco);
        produtos.add(p);
        salvarEstoque();
    }

    public void excluirProduto(int id) {
        Produto p = produtos.stream().filter(prod -> prod.getId() == id).findFirst().orElse(null);
        if (p != null) {
            produtos.remove(p);
            salvarEstoque();
            System.out.println("Produto removido: " + p);
        } else {
            System.out.println("Produto com ID " + id + " não encontrado.");
        }
    }

    public void atualizarQuantidade(int id, int novaQuantidade) {
        Produto p = produtos.stream().filter(prod -> prod.getId() == id).findFirst().orElse(null);
        if (p != null) {
            p.setQuantidade(novaQuantidade);
            salvarEstoque();
            System.out.println("Quantidade atualizada: " + p);
        } else {
            System.out.println("Produto com ID " + id + " não encontrado.");
        }
    }

    public void exibirEstoque() {
        if (produtos.isEmpty()) {
            System.out.println("Estoque vazio.");
            return;
        }
        for (Produto p : produtos) {
            System.out.println(p);
        }
    }
}