package banco;

import banco.abstraction.Conta;
import banco.abstraction.ContaCorrente;
import banco.abstraction.ContaPoupanca;
import banco.implementacao.BancoBB;
import banco.implementacao.BancoNubank;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BridgeIntegracaoTest {

    @Test
    void contaCorrenteAceitaQualquerBanco() {
        Conta comBB     = new ContaCorrente(new BancoBB(), 500.0);
        Conta comNubank = new ContaCorrente(new BancoNubank(), 500.0);

        assertNotNull(comBB);
        assertNotNull(comNubank);
    }

    @Test
    void contaPoupancaAceitaQualquerBanco() {
        Conta comBB     = new ContaPoupanca(new BancoBB(), 500.0);
        Conta comNubank = new ContaPoupanca(new BancoNubank(), 500.0);

        assertNotNull(comBB);
        assertNotNull(comNubank);
    }

    @Test
    void mesmaContaTrocaDeBancoSemMudarLogica() {
        ContaCorrente comBB     = new ContaCorrente(new BancoBB(), 1000.0);
        ContaCorrente comNubank = new ContaCorrente(new BancoNubank(), 1000.0);

        assertEquals(comBB.getSaldo(), comNubank.getSaldo());
        assertNotEquals(comBB.getTaxa(), comNubank.getTaxa());
    }
}
