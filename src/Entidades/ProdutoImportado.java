package Entidades;

public class ProdutoImportado extends Produto{
    private Double taxa;

// CONSTRUCTOR DA CLASS PRODUTO IMPORTADO
    public ProdutoImportado() {
        super();
    }

    public ProdutoImportado(String nome, Double preco, Double taxa) {
        super(nome, preco);
        this.taxa = taxa;
    }


// MÉTODOS GET & SET
    public Double getTaxa() {
        return taxa;
    }
    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }


//METODOS USADOS
    public Double precoFinal() {
        Double total = super.getPreco() + this.taxa;
        return total;
    }

    @Override
    public String dadosProduto() {
        return "Nome: " + super.getNome() +
                ", Preço: R$ " + super.getPreco() +
                ", Taxa: R$ " + this.taxa;
    }

    @Override
    public String toString() {
        return super.getNome() + " R$ " + this.precoFinal() +
                " (Taxa: R$ " + this.taxa + ")";
    }

    public String obterEtiquetaNome(){
        String s = "Etiqueta Produto Importado: ";
        s += super.getNome();
        return s;
    }

/*FIM DO CÓDIGO*/
}
