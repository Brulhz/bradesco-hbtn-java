public class Video extends Midia {
    private int duracao;

    public Video(String nome, int duracao) {
        super(nome);
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" - Duracao: %d minutos", duracao);
    }
}