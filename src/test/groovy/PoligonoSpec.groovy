import spock.lang.Specification
import spock.lang.Subject

class PoligonoSpec extends Specification{

    def "demonstrar o uso do given-when-then"(){

        given:
        //dado que criamos um poligono de 4 lados
        def poligono = new Poligono(4)

        when:
        // execução que sera validada
        // estamos acessando metodo private sem problemas
        int ladosDoPoligono = poligono.numeroDeLados

        then:
        //resultado esperado
        ladosDoPoligono == 4

    }
    
    def "deve retornar Excecao IllegalArgumentException"(){
        when:
        new Poligono(0)

        then:
        thrown(IllegalArgumentException.class)
    }

    def "deve gerar excecao para lados errados #lados"(){

        when:
        new Poligono(lados)

        then:
        thrown(IllegalArgumentException.class)

        where:
        lados << [0, 1, 2]

    }

    def "deve retorno poligonos ok"(){
        expect:
        new Poligono(lados).numeroDeLados == lados

        where:
        lados << [3, 4, 5, 8]
    }

    def "usando data tables. Max de #a e #b eh #max"() {

        expect:
        Math.max(a, b) == max

        where:
        a | b || max
        1 | 3 || 3
        7 | 4 || 7
        0 | 0 || 0
    }

    def "usando Mock"(){
        //o block given eh um otimo lugar para colocarmos o Mock
        given:
        Desenhador desenhador = Mock()
        @Subject
        def poligono = new Poligono (4, desenhador)

        when:
        poligono.draw()

        then:
        4 * desenhador.drawLine()
    }

    //Stub:	é	muito	parecido	com	o	Fake.	A	diferença	é	que	podem
    //ser	 configurados	 diferentes	 comportamentos	 para	 os	 métodos
    //conforme	os	argumentos	usados.	Ou	seja,	um	mesmo	objeto	Stub
    //pode	 ter	 diferentes	 comportamentos	 para	 diferentes	 cenários	 de
    //teste.	São	 normalmente	 criados	 com	 auxílio	 de	 alguma	 biblioteca
    //de	Mocks

    def "usando stub"(){
        given: "dado a paleta de cores vermelha"
        PaletaDeCores paletaDeCores = Stub()
        paletaDeCores.obterCorPrimaria() >> Cores.RED
        def desenhador = new Desenhador(paletaDeCores)

        expect: "desenhador tenha cor vermelha"
        desenhador.obterCorExterna()

    }

}
