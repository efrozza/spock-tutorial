public class ComparadorDeHash {
    boolean necessitaRecalculo (byte[] hashRecebido, byte[] hashAtual){

        if (hashRecebido == hashAtual){
            return false;
        } else{
            return true;
        }

    }


}
