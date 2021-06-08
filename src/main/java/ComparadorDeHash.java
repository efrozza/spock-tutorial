import java.util.Arrays;

public class ComparadorDeHash {
    boolean necessitaRecalculo(byte[] hashRecebido, byte[] hashAtual) {

        if (Arrays.equals(hashRecebido, hashAtual)) {
            return false;
        }
        return true;
    }


}
