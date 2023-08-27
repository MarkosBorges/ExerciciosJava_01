package controller;
import model.Produto;

import org.w3c.dom.ls.LSOutput;

//Construtor = chamamos de metodo padrao

//1>Introducao ao encapsulamento (public, private, protected ...)
//2>Metodos acessores
//3>MVC (Model View COntrol)
//4>toString (gerar)
public class ProdutoController {

    public static void main(String[] args) {
        Produto produto1 = new Produto("Arroz", 10.0, 100);//declarei uma variavel do tipo 'produto'
        System.out.println(produto1.getNome());
        System.out.println(produto1.getValor());
        System.out.println(produto1.getEstoque());
        produto1.setEstoque(-100);
        System.out.println("Estoque Atualizado" + produto1.getEstoque());
        System.out.println();

        Produto produto2 = new Produto("Massa", 5.50, 100);//produto2 = instancia da classe produto ou simplesmente um OBJETO
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.getEstoque());
        System.out.println();

        //toString
        Produto produto3 = new Produto();
        System.out.println(produto3.toString());
        System.out.println();

        Produto produto4 = new Produto("Batata KG", 3.80, 1000);
        System.out.println(produto4.toString());
        System.out.println();

        Produto produto5 = new Produto("Feijão", 4.50, 80);
        System.out.println(produto5.toString());
    }
}
