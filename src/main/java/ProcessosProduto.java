public class ProcessosProduto {

    Produto produto;

    public ProcessosProduto(Produto produto){
        this.produto = produto;
    }

    private void manutencaoComercializacao(boolean abertoComercializacao){

        if  (produto.sistemaOrigem == "JCOT") {
            throw new IllegalArgumentException("sistema origem não pode comercializar");
        }
        produto.setAbertoComercializacao(abertoComercializacao);
    }


}
