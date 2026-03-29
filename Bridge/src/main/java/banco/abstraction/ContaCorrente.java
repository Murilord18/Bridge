package banco.abstraction;

import banco.implementacao.BancoImplementacao;

public class ContaCorrente extends Conta {

    private double saldo;

    public ContaCorrente(BancoImplementacao banco, double saldoInicial) {
        super(banco);
        this.saldo = saldoInicial;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println(banco.processarOperacao("Deposito", valor));
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
        System.out.println(banco.processarOperacao("Saque", valor));
    }

    @Override
    public void exibirInfo() {
        System.out.println("Tipo  : Conta Corrente");
        System.out.println("Banco : " + banco.getNome());
        System.out.println("Saldo : R$ " + saldo);
        System.out.println("Taxa  : R$ " + banco.calcularTaxa(saldo));
        System.out.println();
    }

    public double getSaldo() { return saldo; }

    public double getTaxa() { return banco.calcularTaxa(saldo); }
}
