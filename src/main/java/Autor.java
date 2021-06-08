import java.util.ArrayList;
import java.util.List;

public class Autor {

    List<Assinante> listaAssinantes = new ArrayList<>();
    int mensagensEnviadas = 0;

    void enviaMensagem(String mensagem){
        for (Assinante assinante: listaAssinantes) {
            assinante.recebe(mensagem);
            mensagensEnviadas++;
        }
    }

}
