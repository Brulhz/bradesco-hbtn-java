package provedores;

public class Sedex implements ProvedorFrete {
    public Frete calcularFrete(double peso, double valor) {
        double frete = peso > 1000 ? valor * 0.10 : valor * 0.05;
        return new Frete(frete, TipoProvedorFrete.SEDEX);
    }

    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.SEDEX;
    }
}