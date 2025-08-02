package produtos;

public abstract class Produto {
    protected String titulo;
    protected int ano;
    protected String pais;
    protected double preco;

    public Produto(String titulo, int ano, String pais, double preco) {
        this.titulo = titulo;
        this.ano = ano;
        this.pais = pais;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public abstract double obterPrecoLiquido();
}