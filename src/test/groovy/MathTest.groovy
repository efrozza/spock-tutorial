

import spock.lang.Specification

// toda classe de teste extends Specification
// public é opcional no groovy
class MathTest extends Specification{

    def "2 ao quadrado deve ser 4"(){

        Double base = null
        expect:
        //Math.pow((1/0),2) == 4
        Math.pow(base.intValue(), 2) == 4


    }
}
