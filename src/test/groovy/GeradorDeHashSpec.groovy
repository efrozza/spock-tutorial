import spock.lang.Specification

import java.nio.charset.StandardCharsets

class GeradorDeHashSpec extends Specification {

    CarteiraRecomendada carteiraRecomendada;
    GeradorDeHash geradorDeHash;

    def setup(){

        this.carteiraRecomendada = Mock(CarteiraRecomendada)
        this.geradorDeHash = new GeradorDeHash()

        //popula a carteira recomendada com os produtos
        List<Produto> produtosDaCarteira = new ArrayList<>()
        Produto produto = new Produto()
        produtosDaCarteira.add(produto)
        carteiraRecomendada.produtosRecomendados = produtosDaCarteira

    }

    def "Verifica se gerou hash corretamente"(){

        given: "dado agencia conta e carteira"
        def agencia = 1
        def conta = 2
        def carteira = carteiraRecomendada

        when: "quando executar a geracao do hash"
        def hashGerado = geradorDeHash.gerarHash(agencia, conta, carteira)

        then: "codigo hash gerado"
        hashGerado.length > 0
    }

}