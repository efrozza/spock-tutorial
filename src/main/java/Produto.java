public class Produto {

    String sistemaOrigem;
    String codidoProdutoSistemaExterno;
    String nomeProduto;
    boolean abertoComercializacao;
    ConfiguracaoProduto configuracaoProduto;

    public String getSistemaOrigem() {
        return sistemaOrigem;
    }

    public void setSistemaOrigem(String sistemaOrigem) {
        this.sistemaOrigem = sistemaOrigem;
    }

    public String getCodidoProdutoSistemaExterno() {
        return codidoProdutoSistemaExterno;
    }

    public void setCodidoProdutoSistemaExterno(String codidoProdutoSistemaExterno) {
        this.codidoProdutoSistemaExterno = codidoProdutoSistemaExterno;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public boolean isAbertoComercializacao() {
        return abertoComercializacao;
    }

    public void setAbertoComercializacao(boolean abertoComercializacao) {
        this.abertoComercializacao = abertoComercializacao;
    }

    public ConfiguracaoProduto getConfiguracaoProduto() {
        return configuracaoProduto;
    }

    public void setConfiguracaoProduto(ConfiguracaoProduto configuracaoProduto) {
        this.configuracaoProduto = configuracaoProduto;
    }
}
