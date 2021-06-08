import spock.lang.Specification

class VerificadorHashSpec extends Specification {

    VerificadorHash verificadorHash;

    def setup() {
        this.verificadorHash = new VerificadorHash()
    }

    def "Verifica se hash existe"() {

        when:
        def bytesDoHash = verificadorHash.verificaHashExiste(1, 2, 1)

        then:
        bytesDoHash.length > 0

    }

    def "Validar agencia invalida"() {
        when:
        verificadorHash.verificaHashExiste(0, 2, 1)
        then:
        thrown(IllegalArgumentException)
    }

    def "Validar conta invalida"() {
        when:
        verificadorHash.verificaHashExiste(2, 0, 1)
        then:
        thrown(IllegalArgumentException)

    }
}