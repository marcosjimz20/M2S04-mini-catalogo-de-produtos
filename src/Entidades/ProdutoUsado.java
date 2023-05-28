package Entidades;

public class ProdutoUsado  extends Produto{
    private String dataFabricacao;


// CONSTRUCTOR DA CLASS PRODUTO USADO
    public ProdutoUsado() {
        super();
    }

    public ProdutoUsado(String nome, Double preco, String dataFabricacao) {
        super(nome, preco);
        this.dataFabricacao = dataFabricacao;
    }


// MÉTODOS GET & SET
    public String getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }


//METODOS USADOS
    @Override
    public String dadosProduto() {
        return "Nome: " + super.getNome() +
                ", Preço: R$ " + super.getPreco() +
                ", Data de fabricação (DD/MM/YYYY): " + getDataFabricacao();
    }

    @Override
    public String toString() {
        return super.getNome() + " (usado) R$ " + getPreco() +
                " (Data de fabricação: " + this.dataFabricacao + ")";
    }

/*FIM DO CÓDIGO*/
}
