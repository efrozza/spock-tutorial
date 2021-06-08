public class VerificadorHash {

    byte[] verificaHashExiste (int agencia, int conta, int TipoVerificacao){
        if (agencia == 0) {
            throw new IllegalArgumentException("Agencia Invalida");
        }

        if  (conta == 0){
            throw new IllegalArgumentException("Conta invalida");
        }

        if (TipoVerificacao == 1){
            return new byte[ ] {1, 2, 3};
        } else {
            return new byte[ ]{};
        }

    }

}
