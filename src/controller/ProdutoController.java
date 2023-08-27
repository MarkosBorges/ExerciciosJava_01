package controller;

import org.w3c.dom.ls.LSOutput;

public class ProdutoController {

    public static void main(String[] args) {
        Produto produto1 = new Produto("Arroz", 10.0, 100);//declarei uma variavel do tipo 'produto'
        System.out.println(produto1.getNome());
        System.out.println(produto1.getValor());
        System.out.println(produto1.getEstoque());
        System.out.println();

        Produto produto2 = new Produto("Massa", 5.50, 100);//produto2 = instancia da classe produto ou simplesmente um OBJETO
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.getEstoque());
        System.out.println();

        Produto produto3 = new Produto();
        System.out.println(produto3.getNome());
        System.out.println(produto3.getValor());
        System.out.println(produto3.getEstoque());
        System.out.println();

        Produto produto4 = new Produto();
        System.out.println(produto4.getNome());
        System.out.println(produto4.getValor());
        System.out.println(produto4.getEstoque());

        //Construtor = chamamos de metodo padrao

        //Introducao ao encapsulamento (public, private, protected ...)
        //Metodos acessores
        //MVC (Model View COntrol)
    }
}
class Produto{
    private String nome; //tipo classe comeca com letra maiuscula
    private double valor;
    private int estoque;

    public Produto() {//COntrutor padrao/vazio
    }

    public Produto(String nome, double valor, int estoque) {//Contrutor com todos os atributos
        this.nome = nome;
        this.valor = valor;
        this.estoque = estoque;
    }
/*    public Produto(String nome){
        this.nome = nome;
    }
*/
    //============ GETTERS (leem valores dos atrib) & SETTERS (altera os valores do atrbt)  ===========
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        int novoEstoque = this.estoque + estoque;
        if(this.estoque > 0){
            this.estoque = estoque;
        }

    }
}// FIM CLASSE PRODUTO