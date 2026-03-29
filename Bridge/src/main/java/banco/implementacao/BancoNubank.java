package banco.implementacao;

public class BancoNubank implements BancoImplementacao {

    @Override
    public String getNome() {
        return "Nubank";
    }

    @Override
    public double calcularTaxa(double saldo) {
        return 0.0;
    }

    @Override
    public String processarOperacao(String operacao, double valor) {
        return "[Nubank] " + operacao + " de R$ " + valor + " processada pelo app.";
    }
}
