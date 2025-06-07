public class Produto {

    public String nome;
    public double preco;
    public int quantidade;

    // Método para adicionar ao estoque
    public void adicionaProduto(int novoProduto) {
        quantidade += novoProduto;

    }


    public void vendeProduto( int vendaDeProduto){
        if (vendaDeProduto > quantidade) {
            System.out.println(" Estoque insuficiente! Estoque atual: " + quantidade);
        } else {

            quantidade -= vendaDeProduto;
            System.out.println(vendaDeProduto + "unidades vendidas. Estoque restante: " + quantidade);

        }
    }


}
