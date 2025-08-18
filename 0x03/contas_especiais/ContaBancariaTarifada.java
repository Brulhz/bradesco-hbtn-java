public class ContaBancariaTarifada extends ContaBancariaBasica {
    private int quantidadeTransacoes;

    public ContaBancariaTarifada(String numeracao, double taxaJurosAnual) {
        super(numeracao, taxaJurosAnual);
        this.quantidadeTransacoes = 0;
    }

    @Override
    public void depositar(double valor) throws exceptions.OperacaoInvalidaException {
        super.depositar(valor);
        super.sacar(0.10); // tarifa por transação
        quantidadeTransacoes++;
    }

    @Override
    public void sacar(double valor) throws exceptions.OperacaoInvalidaException {
        super.sacar(valor);
        super.sacar(0.10); // tarifa por transação
        quantidadeTransacoes++;
    }

    public int getQuantidadeTransacoes() {
        return quantidadeTransacoes;
    }
}