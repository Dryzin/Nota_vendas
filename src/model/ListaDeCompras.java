package model;

import java.util.ArrayList;
import java.util.List;

public class ListaDeCompras {
    private List<Product> produtos;
    private List<Integer> quantidades;
    private float total;

    public ListaDeCompras() {
        this.produtos = new ArrayList<>();
        this.quantidades = new ArrayList<>();
        this.total = 0;
    }

    public void adicionarProduto(Product produto, int quantidade) {
        produtos.add(produto);
        quantidades.add(quantidade);
        total += produto.getPreco() * quantidade;
        System.out.println("Produto adicionado: " + produto.getName() + " x " + quantidade);
    }

    public float getTotal() {
        return total;
    }


    public void gerarRelatorio() {
        for (int i = 0; i < produtos.size(); i++) {
            Product produto = produtos.get(i);
            int quantidade = quantidades.get(i);
            float subtotal = produto.getPreco() * quantidade;
            System.out.println(produto.getName() + " x " + quantidade + " = R$ " + subtotal);
        }
        System.out.println("total " + total);
    }
}
