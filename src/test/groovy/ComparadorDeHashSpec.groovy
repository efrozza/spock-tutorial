import spock.lang.Specification

class ComparadorDeHashSpec extends Specification {

    ComparadorDeHash comparadorDeHash

    def setup(){
        this.comparadorDeHash = new ComparadorDeHash()
    }

    def "Nao deve solicitar recalculo"(){
        given: "dados dois hashs iguais"
        def hash1 = new byte[]{1, 2, 3}
        def hash2 = new byte[]{1, 2, 3}
        when: "quando comparar os hashs"
        def precisaRecalculo = comparadorDeHash.necessitaRecalculo(hash1, hash2)
        then: "nao deve solicitar recalculo"
        precisaRecalculo == false

    }

    def "Deve solicitar recalculo"(){
        given: "dados dois hashs diferentes"
        def hash1 = new byte[]{1, 2, 3}
        def hash2 = new byte[]{1, 2, 4}
        when: "quando comparar os hashs"
        def precisaRecalculo = comparadorDeHash.necessitaRecalculo(hash1, hash2)
        then: "deve solicitar recalculo"
        precisaRecalculo == true

    }

}