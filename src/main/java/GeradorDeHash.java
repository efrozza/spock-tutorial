import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class GeradorDeHash {

    public byte[] gerarHash (int cdAgenciaBancaria, int cdContaBancariaCliente, CarteiraRecomendada carteira, String algoritmo) throws NoSuchAlgorithmException {

        String totalDebyes;
        totalDebyes = carteira.toString() + cdAgenciaBancaria + cdAgenciaBancaria;

        MessageDigest algorithm = MessageDigest.getInstance(algoritmo);
        byte messageDigest[] = algorithm.digest(totalDebyes.getBytes(StandardCharsets.UTF_8));

        return messageDigest;
    }

}
