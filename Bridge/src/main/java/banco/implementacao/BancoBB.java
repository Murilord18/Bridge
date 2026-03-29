package banco.implementacao;

public class BancoBB implements BancoImplementacao {

    @Override
    public String getNome() {
        return "Banco do Brasil";
    }

    @Override
    public double calcularTaxa(double saldo) {
        return 12.90;
    }

    @Override
    public String processarOperacao(String operacao, double valor) {
        return "[BB] " + operacao + " de R$ " + valor + " processada.";
    }
}
