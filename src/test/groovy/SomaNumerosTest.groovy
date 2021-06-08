

import spock.lang.Specification

class SomaNumerosTest extends Specification{


    def "Somar dois numeros"(){

        given: "um numero"
        Long primeironumero = 1L

        and: "outro numero"
        Long segundoNumero = 2L

        when: "eu chamo o metodo de soma"
        def result = soma (primeironumero, segundoNumero)

        then: "o resultado deve ser correto"
        result == 3
    }



    def soma (Long um, Long dois) {
        return um + dois
    }

}
