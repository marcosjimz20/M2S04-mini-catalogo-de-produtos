package Entidades;

public class Produto {
    private String nome;
    private Double preco;

// CONSTRUCTOR DA CLASS PRODUTO USADO
    public Produto() {
    }

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }


// MÉTODOS GET & SET
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }


//METODOS USADOS
    public String dadosProduto() {
        return "Nome: " + this.nome +
                ", Preço: R$ " + this.preco;
    }

    @Override
    public String toString() {
        return nome + " R$ " + preco;
    }

/* FIM DO CODIGO*/
}
