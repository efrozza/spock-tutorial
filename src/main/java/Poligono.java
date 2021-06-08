public class Poligono {

    private final int numeroDeLados;
    private Desenhador desenhador;

    public Poligono (int numeroDeLados, Desenhador desenhador){

        if  (numeroDeLados <= 2 ){
            throw new IllegalArgumentException("numero de lados insuficiente");
        }
        this.numeroDeLados = numeroDeLados;
        this.desenhador = desenhador;


    }

    public void draw(){
        for (int i = 0; i < numeroDeLados; i++) {
            desenhador.drawLine();
        }

    }


}
