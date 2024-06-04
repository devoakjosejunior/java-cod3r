package Classe;

public class Produto {
    //atributos
    String nome;
    double preco;
    double desconto;

    //comportamentos (metódos)
    double precoComDesconto(){
        return preco * (1 - desconto);
    }

    double precoComDesconto(double descontoDoGerente){
        return preco * (1 - desconto + descontoDoGerente);
    }
}
