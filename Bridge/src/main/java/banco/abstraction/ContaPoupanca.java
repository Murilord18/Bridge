package banco.abstraction;

import banco.implementacao.BancoImplementacao;

public class ContaPoupanca extends Conta{

    private double saldo;
    private static final double RENDIMENTO = 0.005;

    public ContaPoupanca(BancoImplementacao banco, double saldoInicial) {
        super(banco);
        this.saldo = saldoInicial;
    }

    @Override
    public void depositar(double valor) {
         saldo += valor;
         System.out.println(banco.processarOperacao("Deposito poupanca", valor));
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
        System.out.println(banco.processarOperacao("Saque poupanca", valor));
    }

    public void render() {
        double rendimento = saldo * RENDIMENTO;
        saldo += rendimento;
        System.out.println(banco.processarOperacao("Rendimento", rendimento));
    }

    @Override
    public void exibirInfo(){
        System.out.println("Tipo      : Conta Poupanca");
        System.out.println("Banco     : " + banco.getNome());
        System.out.println("Saldo     : R$ " + saldo);
        System.out.println("Rendimento: 0,5% ao mes");
        System.out.println("Taxa      : R$ " + banco.calcularTaxa(saldo));
        System.out.println();
    }

    public double getSaldo() { return saldo; }

    public double getTaxa() { return banco.calcularTaxa(saldo); }

}
