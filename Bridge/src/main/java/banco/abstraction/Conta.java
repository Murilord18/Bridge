package banco.abstraction;

import banco.implementacao.BancoImplementacao;

public abstract class Conta {

    protected BancoImplementacao banco;

    public Conta(BancoImplementacao banco) {
        this.banco = banco;
    }

    public abstract void depositar(double valor);
    public abstract void sacar(double valor);
    public abstract void exibirInfo();
}
