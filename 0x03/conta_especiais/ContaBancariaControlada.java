public class ContaBancariaControlada extends ContaBancariaBasica {
    private double saldoMinimo;
    private double valorPenalidade;

    public ContaBancariaControlada(String numeracao, double taxaJurosAnual, double saldoMinimo, double valorPenalidade) {
        super(numeracao, taxaJurosAnual);
        this.saldoMinimo = saldoMinimo;
        this.valorPenalidade = valorPenalidade;
    }

    @Override
    public void aplicarAtualizacaoMensal() {
        super.aplicarAtualizacaoMensal();
        if (getSaldo() < saldoMinimo) {
            try {
                super.sacar(valorPenalidade);
            } catch (Exception e) {
            }
        }
        double saldoArredondado = Math.round(getSaldo() * 100.0) / 100.0;
        try {
            super.sacar(getSaldo() - saldoArredondado);
        } catch (Exception e) {
        }
    }
}