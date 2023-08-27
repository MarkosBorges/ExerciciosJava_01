package controller;

import org.w3c.dom.ls.LSOutput;

public class ProdutoController {

    public static void main(String[] args) {
        Produto produto1 = new Produto("Arroz", 10.0, 100);//declarei uma variavel do tipo 'produto'
        System.out.println(produto1.nome);
        System.out.println(produto1.valor);
        System.out.println(produto1.estoque);
        System.out.println();

        Produto produto2 = new Produto("Massa", 5.50, 100);//produto2 = instancia da classe produto ou simplesmente um OBJETO
        System.out.println(produto2.nome);
        System.out.println(produto2.valor);
        System.out.println(produto2.estoque);
        System.out.println();

        Produto produto3 = new Produto();
        System.out.println(produto3.nome);
        System.out.println(produto3.valor);
        System.out.println(produto3.estoque);
        System.out.println();

        Produto produto4 = new Produto();
        System.out.println(produto4.nome);
        System.out.println(produto4.valor);
        System.out.println(produto4.estoque);

        //Construtor = chamamos de metodo padrao

        //Introducao ao encapsulamento
        //Metodos acessores
    }
}
class Produto{
    String nome; //tipo classe comeca com letra maiuscula
    double valor;
    int estoque;

    public Produto() {//COntrutor padrao/vazio
    }

    public Produto(String nome, double valor, int estoque) {//Contrutor com todos os atributos
        this.nome = nome;
        this.valor = valor;
        this.estoque = estoque;
    }
}