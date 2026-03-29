package banco;

import banco.abstraction.ContaPoupanca;
import banco.implementacao.BancoBB;
import banco.implementacao.BancoNubank;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContaPoupancaTest {

    @Test
    void depositoDeveAumentarSaldo() {
        ContaPoupanca conta = new ContaPoupanca(new BancoBB(), 1000.0);
        conta.depositar(500.0);
        assertEquals(1500.0, conta.getSaldo());
    }

    @Test
    void rendimentoDeveAumentarSaldo() {
        ContaPoupanca conta = new ContaPoupanca(new BancoNubank(), 1000.0);
        double saldoAntes = conta.getSaldo();
        conta.render();
        assertTrue(conta.getSaldo() > saldoAntes);
    }

    @Test
    void nubankNaoDeveCobraTaxaNaPoupanca() {
        ContaPoupanca conta = new ContaPoupanca(new BancoNubank(), 1000.0);
        assertEquals(0.0, conta.getTaxa());
    }
}