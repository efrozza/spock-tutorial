import spock.lang.Specification

class AutorSpec extends Specification{

    // instanciacao e criacao de Mocks
    Autor autor = new Autor();
    Assinante assinante = Mock();
    Assinante assinante2 = Mock();

    // roda antes de cada Feature Method
    def setup(){
        autor.listaAssinantes.add(assinante)
        autor.listaAssinantes.add(assinante2)
    }

    def "verifica se o Autor enviou mensagem para todos os assinantes"(){

        given: "definir mensagem padrao"
        def msgPadrao = "E ai galera"

        when: "autor enviar mensagem"
        autor.enviaMensagem(msgPadrao)

        then: "o metodo recebe de cada assinante deve executar uma vez"
        1 * assinante.recebe(msgPadrao)
        1 * assinante2.recebe(!null)

    }

    def "verifica se o assinante retornou ok para o recebimento damensagem"(){
        given: "dado que o assinante retornou ok"
        assinante.recebe(_) >> "ok"

        when:
        assinante.recebe("E ai galera blz?")

        then:
        assinante.recebe(_) == "ok"
    }

}
