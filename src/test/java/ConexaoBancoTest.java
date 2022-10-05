import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ConexaoBancoTest {
    @Test
    public void deveRetornarConexao() {
        ConexaoBanco.getInstance().setUrlConnection("192.168.0.2:5432/user@qwerfvcxzasd");
        Assertions.assertEquals("Conexao: 192.168.0.2:5432/user@qwerfvcxzasd", ConexaoBanco.getInstance().getUrlConnection());
    }
}