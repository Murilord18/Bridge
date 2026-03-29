package banco.implementacao;

public interface BancoImplementacao {
    String getNome();
    double calcularTaxa(double saldo);
    String processarOperacao(String operacao, double valor);
}
