package controller;
import model.Produto;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

//Construtor = chamamos de metodo padrao

//1>Introducao ao encapsulamento (public, private, protected ...)
//2>Metodos acessores
//3>MVC (Model View COntrol)
//4>toString (gerar) - (converte o objeto para String)

//5>Aulas Coleções + List

public class ProdutoController {

    public static void main(String[] args) {
        Produto produto1 = new Produto("Arroz", 10.0, 100);//declarei uma variavel do tipo 'produto'
        //System.out.println(produto1.getNome());
        //System.out.println(produto1.getValor());
        //System.out.println(produto1.getEstoque());
        produto1.setEstoque(-100);
        System.out.println("Estoque Atualizado" + produto1.getEstoque());
        //System.out.println();

        Produto produto2 = new Produto("Massa", 5.50, 100);//produto2 = instancia da classe produto ou simplesmente um OBJETO
        //System.out.println(produto2.getNome());
        //System.out.println(produto2.getValor());
        //System.out.println(produto2.getEstoque());
        //System.out.println();

        //toString
        Produto produto3 = new Produto();
        //System.out.println(produto3.toString());
        //System.out.println();

        Produto produto4 = new Produto("Batata KG", 3.80, 1000);
        //System.out.println(produto4.toString());
        //System.out.println();

        Produto produto5 = new Produto("Feijão", 4.50, 80);
        //System.out.println(produto5.toString()); //converter o objeto para string
        //Ele vai até a classe object para converter

        //---------------------------
        // ------ CRIANDO COLECAO E ADD OBJETOS NESSA COLECAO
        List<Produto> produtos = new ArrayList<>();
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        produtos.add(produto5);
        System.out.println(produtos);

        List<Produto> produtos2 = new ArrayList<>();
        produtos2.add(produto1);
        System.out.println(produtos2);

        //List = estrutura de dados
        // <Produto> = Objetos dentro da estrutura da dados
        // produtos = variável
        // new ArrayList<>() = chamando o construtor da classe ArrayList

        // -----------------------------------------------------------------


    }
}
