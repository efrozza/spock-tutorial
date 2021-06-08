

import spock.lang.Specification

class StringTest extends Specification{

    def "toUpperCase deveria por tudo em maiusculo"(){
        expect:
        "bom dia".toUpperCase() == "Bom dia"
    }

    def	"substring()	deveria	extrair	a	parte	desejada	do	texto"()	{
        expect:
        "sejam	bem	vindos!".substring(0,5)	==	"sejam"
    }

}
