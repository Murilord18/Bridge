package banco;

import banco.abstraction.ContaCorrente;
import banco.implementacao.BancoBB;
import banco.implementacao.BancoNubank;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContaCorrenteTest {

    @Test
    void depositoDeveAumentarSaldo() {
        ContaCorrente conta = new ContaCorrente(new BancoBB(), 1000.0);
        conta.depositar(500.0);
        assertEquals(1500.0, conta.getSaldo());
    }

    @Test
    void saqueDeveReduzirSaldo() {
        ContaCorrente conta = new ContaCorrente(new BancoBB(), 1000.0);
        conta.sacar(300.0);
        assertEquals(700.0, conta.getSaldo());
    }

    @Test
    void nubankNaoDeveCobrarTaxa(){
        ContaCorrente conta = new ContaCorrente(new BancoNubank(), 1000.0);
        assertEquals(0.0, conta.getTaxa());
    }

    @Test
    void bbDeveCobrarTaxa(){
        ContaCorrente conta = new ContaCorrente(new BancoBB(), 1000.0);
        assertTrue(conta.getTaxa() > 0);
    }


}