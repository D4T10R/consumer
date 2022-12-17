package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities.Product;
import util.PriceUpdate;

public class Program {

    public static void main(String[] args) {
        
        List<Product> produtos = new ArrayList<>();

        produtos.add(new Product("Tv", 900.0));
        produtos.add(new Product("Mouse", 50.0));
        produtos.add(new Product("Tablet", 350.50));
        produtos.add(new Product("HD Case", 80.90));

        // produtos.forEach(Product::staticPriceUpdate); Metodo estatico criado na classe produto para atualizar o preco dos produtos
        // produtos.forEach(new PriceUpdate()); Classe com apenas um metodo que atualiza o preco dos produtos
        // produtos.forEach(Product::nonStaticPriceUpdate); Metodo NÃO estatico criado na classe produto apra atualizar  o preco dos produtos
        
        // LAMBDA DECLARADA 
        Consumer<Product> cons = p -> p.setPreco(p.getPreco() * 1.1); 

        // LAMDA INLINE
        produtos.forEach(p -> p.setPreco(p.getPreco() * 1.1));


    }


}