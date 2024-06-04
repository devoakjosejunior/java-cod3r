package Classe;

public class Produto {
    //atributos
    String nome;
    double preco;
    static double desconto = 0.25;

    //comportamentos (metódos)
    
    //construtores (metodos especiais)
    Produto(){
        
    }
    Produto(String nomeInicial, double precoInicial){
        nome = nomeInicial;
        preco = precoInicial;
    }

    //metódos
    double precoComDesconto(){
        return preco * (1 - desconto);
    }

    double precoComDesconto(double descontoDoGerente){
        return preco * (1 - desconto + descontoDoGerente);
    }
}
