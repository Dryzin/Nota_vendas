package model;

public class Product {
    private String name;
    private float preco;

    public Product(String name, float preco) {
        this.name = name;
        this.preco = preco;
    }

    public String getName() {
        return name;
    }

    public float getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", preco=" + preco + "]";
    }

}


