import spock.lang.Specification

class ProdutoSpec extends Specification{

    Categoria categoria = Mock();
    ClasseAtivo classeAtivo = Mock();
    ConfiguracaoProduto configuracaoProduto = new ConfiguracaoProduto()
    Produto produto1 = new Produto();

    // executa antes de todo feature method
    def setup(){
        configuracaoProduto.setCategoria(categoria)
        configuracaoProduto.setClasseAtivo(classeAtivo)
        produto1.setConfiguracaoProduto(configuracaoProduto)
    }

    //feature method
    def "teste inicial"(){
        expect: produto1 != null
    }

    //feature method
    def "verificar se abriu para comercializacao"(){
        given: "dado um produto valido"
        ProcessosProduto processosProduto = new ProcessosProduto(produto1)

        when: "executar o processo para abrir o produto para comercializacao"
        processosProduto.manutencaoComercializacao(true)

        then: "produto aberto para comercializacao"
        produto1.abertoComercializacao

    }

}
