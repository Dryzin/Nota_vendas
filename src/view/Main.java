package view;

import model.ListaDeCompras;
import model.Product;

public class Main {
    public static void main(String[] args) {

        ListaDeCompras lista = new ListaDeCompras();

        lista.adicionarProduto(new Product("Prato", 10.7f), 2);
        lista.adicionarProduto(new Product("Copo", 5.5f), 4);
        lista.adicionarProduto(new Product("Garfo", 3.2f), 3);

        lista.gerarRelatorio();
    }
}
