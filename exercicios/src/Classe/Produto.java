package Classe;

public class Produto {
    //atributos
    String nome;
    double preco;
    double desconto;

    //comportamentos (metódos)
    
    //construtores (metodos especiais)
    Produto(){}
    Produto(String nomeInicial){
        nome = nomeInicial;
    }
    Produto(String nomeInicial, double precoInicial, double descontoInicial){
        nome = nomeInicial;
        preco = precoInicial;
        desconto = descontoInicial;
    }

    //metódos
    double precoComDesconto(){
        return preco * (1 - desconto);
    }

    double precoComDesconto(double descontoDoGerente){
        return preco * (1 - desconto + descontoDoGerente);
    }
}
