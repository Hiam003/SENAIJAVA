//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Produto produtos = new Produto();

        produtos.nome = "Placa mãe";
        produtos.quantidade = 37;
        produtos.preco = 780.99;

        produtos.adicionaProduto(10);
        produtos.vendeProduto(37);
        produtos.vendeProduto(57);

    }
}



















