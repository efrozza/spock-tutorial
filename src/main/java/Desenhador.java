public class Desenhador {

    PaletaDeCores paletaDeCores;

    public Desenhador () {

    }
    public Desenhador (PaletaDeCores paletaDeCores){
        this.paletaDeCores = paletaDeCores;
    }

    public void drawLine(){

    }

    public Cores obterCorExterna(){
        return paletaDeCores.obterCorPrimaria();
    }

}
