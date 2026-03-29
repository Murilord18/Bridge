package banco;

import banco.abstraction.ContaCorrente;
import banco.abstraction.ContaPoupanca;
import banco.implementacao.BancoBB;
import banco.implementacao.BancoNubank;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Conta Corrente no BB ===");
        ContaCorrente cc1 = new ContaCorrente(new BancoBB(), 1000.0);
        cc1.depositar(500.0);
        cc1.sacar(200.0);
        cc1.exibirInfo();

        System.out.println("=== Conta Corrente no Nubank ===");
        ContaCorrente cc2 = new ContaCorrente(new BancoNubank(), 1000.0);
        cc2.depositar(500.0);
        cc2.sacar(200.0);
        cc2.exibirInfo();

        System.out.println("=== Conta Poupanca no BB ===");
        ContaPoupanca cp1 = new ContaPoupanca(new BancoBB(), 2000.0);
        cp1.depositar(300.0);
        cp1.render();
        cp1.exibirInfo();

        System.out.println("=== Conta Poupanca no Nubank ===");
        ContaPoupanca cp2 = new ContaPoupanca(new BancoNubank(), 2000.0);
        cp2.depositar(300.0);
        cp2.render();
        cp2.exibirInfo();
    }
}
