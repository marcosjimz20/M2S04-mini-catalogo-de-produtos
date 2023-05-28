import Entidades.Produto;
import Entidades.ProdutoImportado;
import Entidades.ProdutoUsado;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
/*
 Ex 1 - Crie um novo projeto no intelliJ para uma aplicação java.
 Ex 2 - Crie um Package (pasta / pacote) com nome entidades.
 Ex 3 - Crie classes com o nome Produto, ProdutoUsado e ProdutoImportado no pacote entidades.
 Ex 4 - Crie um novo arquivo (se não houver no projeto inicial) contendo um método main().
 Ex 5 - No método main() crie uma Lista para armazenar os produtos.
 Ex 6 - O Programa vai receber as informações referentes aos tipos de produto.
 Ex 7 - Percorrer a lista de produtos e chamar o método pra mostrar as informações dos produtos.
 Ex 8 - o programa deve ter saída desse modo...
*/
/*
...Entre com o número de produtos: 3
dados Produto#1:
    Comum, usado ou importado(c/u/i)? i
    Nome: Tablet
    Preço: 260.00
    Taxa: 20.00

dados Produto#2:
    Comum, usado ou importado(c/u/i)? c
    Nome: Notebook
    Preço: 1100.00

dados Produto#3:
    Comum, usado ou importado(c/u/i)? u
    Nome: Iphone
    Preço: 400.00
    Data de fabricação (DD/MM/YYYY): 15/03/2017

Amostragem de preço dos produtos:
    Tablet R$ 280.00 (Taxa: R$ 20.00)
    Notebook R$ 1100.00
    Iphone (usado) R$ 400.00 (Data de fabricação: 15/03/2017
 */

public static void main(String[] args) {
// Ex 5 - No método main() crie uma Lista para armazenar os produtos.
        ArrayList<Produto> listaProdutos = new ArrayList<>();

// Ex 6 - O Programa vai receber as informações referentes aos tipos de produto.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digitar o nome do Produto ou Fim para finalizar");
        String agregarPd = scanner.next();


        while (!agregarPd.equalsIgnoreCase("fim")) {
            System.out.println("Que tipo de condição é o Produto: [c]omum; [u]sado; [i]mportado; ?");
            char escolha = scanner.next().toLowerCase().charAt(0);

            switch(escolha){

                case 'i':
                    String i = "i";
                    System.out.println("dados Produto#1:");
                    System.out.println("Comum, usado ou importado(c/u/i)? " + i);
                    listaProdutos.add(new ProdutoImportado("Tablet", 260.00, 20.00));
                    System.out.println(listaProdutos.get(0).dadosProduto());
                    break;

                case 'c':
                    String c = "c";
                    System.out.println("dados Produto#2:");
                    System.out.println("Comum, usado ou importado(c/u/i)? " + c);
                    listaProdutos.add(new Produto("Notebook", 1100.00));
                    System.out.println(listaProdutos.get(1).dadosProduto());
                    break;

                case 'u':
                    String u = "u";
                    System.out.println("dados Produto#3:");
                    System.out.println("Comum, usado ou importado(c/u/i)? " + u);
                    listaProdutos.add(new ProdutoUsado("Iphone", 400.00, "15/03/2017"));
                    System.out.println(listaProdutos.get(2).dadosProduto());
                    break;

                default:
                    System.out.println("Opção errada");
                    break;
            }
            System.out.println("Digitar o nome do Produto ou Fim para finalizar");
            agregarPd = scanner.next();

        }

// Ex 7 - Percorrer a lista de produtos e chamar o método pra mostrar as informações dos produtos.
// Ex 8 - o programa deve ter saída desse modo...
        System.out.println("_________________________________");
        System.out.println("Amostragem de preço dos produtos:");
        listaProdutos.forEach(System.out::println);

        System.out.println("_______F_I_M_______");


/*fim static void main*/
    }

/*FIM DO CÓDIGO*/
}