

import spock.lang.Specification

// toda classe de teste extends Specification
// public é opcional no groovy
class MathTest2 extends Specification{

    def "2 ao quadrado deve ser 4"(){

        expect:
        Math.pow(2,2) == 5

    }
}
