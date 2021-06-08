

import spock.lang.Specification

class ExampleSpecification extends Specification {

    def "testando se 100 eh igual a 100"(){
        expect:
        100 == 100

    }

    def "testando se 5 eh igual a 100"(){
        expect:
        5 == 100

    }
}
