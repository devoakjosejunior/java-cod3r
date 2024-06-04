package Classe;

// como os arquivos Classe e ClasseTeste estão no mesmo pacote, então não precisa importar.
public class ProdutoTeste {
    public static void main(String[] args) {
       
        Produto p1 = new Produto("Notebook", 4356.89, 0.25);

        var p2 = new Produto();
        p2.nome = "Caneta Preta";
        p2.preco = 12.56;
        p2.desconto = 0.29;

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        // apertando ctrl + clicando no metodo, ele navega até o metodo.
        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto(0.1);
        double mediaCarrinho = (precoFinal1 + precoFinal2) / 2.0;

        System.out.printf("Média do carrinho = R$ %.2f.%n", mediaCarrinho);
    }
}
